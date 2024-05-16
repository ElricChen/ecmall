package com.ecmall4j.cloud.ecmall4cloudadmin.modules.sys.jwt;


import org.apache.shiro.authc.AuthenticationToken;

/**
 * token
 *
 * @author Mark sunlightcs@gmail.com
 */
public class JWTToken implements AuthenticationToken {
    private String token;

    public JWTToken(String token){
        this.token = token;
    }

    @Override
    public String getPrincipal() {
        return token;
    }

    @Override
    public Object getCredentials() {
        return token;
    }
}
