package com.applemango.SteveJobda.interceptor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class AuthInterceptor extends HandlerInterceptorAdapter {

    private static final String LOGIN = "login";
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        logger.info("auth-interceptor preHandle called");
        HttpSession httpSession = request.getSession();
        String admin_id = (String) httpSession.getAttribute(LOGIN);
        if (admin_id == null) { /* 실제로 db에 find 해서 조회되는지 & deletedYn 까지 확인해야 할까? */
            logger.info("not logged in");
            response.sendRedirect(request.getContextPath() + "/index"); /* index.jsp에서 로그인하도록 redirect */
            return false;
        }
        logger.info("you are logged in, welcome");
        return true;
    }
}
