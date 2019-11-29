package com.kerwin.apps.cms.config;

import com.kerwin.apps.cms.bean.Privilege;
import com.kerwin.apps.cms.service.IPrivilegeService;
import com.kerwin.apps.cms.utils.JwtTokenUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * @author kerwin
 * @title: JwtInterceptor
 * @projectName cms
 * @date 2019/11/19 - 9:25
 */
public class JwtInterceptor extends HandlerInterceptorAdapter {

    @Autowired
    private IPrivilegeService iPrivilegeService;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        // 如果是options请求，直接返回true，不进行拦截
        if (request.getMethod().equals("OPTIONS")){
            response.setStatus(HttpServletResponse.SC_OK);
            return true;
        }

        //获取请求头中authorization的信息
        String token = request.getHeader(JwtTokenUtil.AUTH_HEADER_KEY);

        if(StringUtils.isEmpty(token)){
            throw new MyException("用户还未登录");
        }
        // 验证token是否有效--无效已做异常抛出，由全局异常处理后返回对应信息
        JwtTokenUtil.parseJWT(token, JwtTokenUtil.base64Secret);
        // 验证权限，通过token获取用户id，通过用户id获取权限，这里可以使用redis将用户信息维护在缓存中，减少与数据库交互次数
        long id = Long.parseLong(JwtTokenUtil.getUserId(token,JwtTokenUtil.base64Secret));
        this.auth(id,request.getServletPath());

        return true;
    }

    // 判断权限
    private void auth(long userId,String path){
        List<Privilege> privileges = iPrivilegeService.findByParentId(userId);
        for(Privilege p : privileges){
            System.out.println(p.getRoute());
        }
    }
}
