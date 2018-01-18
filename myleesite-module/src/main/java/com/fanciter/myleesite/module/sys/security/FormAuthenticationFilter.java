package com.fanciter.myleesite.module.sys.security;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationToken;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * 表单验证过滤器
 * <p>Title:FormAuthenticationFilter</p>
 * <p>Description: </p>
 *
 * @author  fanciter
 * @version 1.0.0
 * @create  2018/1/18 0018 下午 6:04
 **/
public class FormAuthenticationFilter extends org.apache.shiro.web.filter.authc.FormAuthenticationFilter {
    /**
     * 创建令牌
     *
     * @param request
     * @param response
     * @return
     */
    @Override
    protected AuthenticationToken createToken(ServletRequest request, ServletResponse response) {
        return null;
    }

    /**
     * 登录成功后跳转
     * @param request
     * @param response
     * @throws Exception
     */
    @Override
    protected void issueSuccessRedirect(ServletRequest request, ServletResponse response) throws Exception {

    }

    /**
     * 登录失败调用事件
     * @param token
     * @param e
     * @param request
     * @param response
     * @return
     */
    @Override
    protected boolean onLoginFailure(AuthenticationToken token, AuthenticationException e, ServletRequest request, ServletResponse response) {
        return true;
    }
}
