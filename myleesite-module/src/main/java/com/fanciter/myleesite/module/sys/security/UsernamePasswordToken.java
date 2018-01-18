package com.fanciter.myleesite.module.sys.security;
/**
 * 用户密码令牌(含验证码)
 * <p>Title:UsernamePasswordToken</p>
 * <p>Description: </p>
 *
 * @author  fanciter
 * @version 1.0.0
 * @create  2018/1/18 0018 下午 5:54
 **/
public class UsernamePasswordToken extends org.apache.shiro.authc.UsernamePasswordToken{
    /**
     * 验证码
     */
    private String validateCode;

    /**
     * 调用父类无参构造函数
     */
    public UsernamePasswordToken() {
        super();
    }

    /**
     * 扩展父类无参构造函数，增加需要的属性
     * @param username
     * @param password
     * @param rememberMe
     * @param host
     * @param validateCode
     */
    public UsernamePasswordToken(String username, String password, boolean rememberMe, String host, String validateCode) {
        super(username, password, rememberMe, host);
        this.validateCode = validateCode;
    }

    public String getValidateCode() {
        return validateCode;
    }

    public void setValidateCode(String validateCode) {
        this.validateCode = validateCode;
    }
}
