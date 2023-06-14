package com.applemango.SteveJobda.interceptor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginInterceptor extends HandlerInterceptorAdapter {
    private static final String LOGIN = "login";
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        logger.info("LOGIN INTERCEPTOR PRE_HANDLE");
        HttpSession httpSession = request.getSession();
        if (httpSession.getAttribute(LOGIN) == null) {
            logger.info("NOT LOGGED IN, ATTEMPTING TO LOGIN.");
        } else {
            logger.info("LOGGED IN ALREADY, CLEARING LOGIN DATA.");
            httpSession.removeAttribute(LOGIN);
        }
        return true;
    }

}
