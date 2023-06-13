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
        logger.info("login-interceptor preHandle called");
        HttpSession httpSession = request.getSession();
        if (httpSession.getAttribute(LOGIN) == null) {
            logger.info("not logged in");
//            response.sendRedirect(request.getContextPath() + "/login");
        } else {
            logger.info("logged in already, clear login data before");
            httpSession.removeAttribute(LOGIN);
        }
        return true;
    }

    public void postHandle() {

    }

}
