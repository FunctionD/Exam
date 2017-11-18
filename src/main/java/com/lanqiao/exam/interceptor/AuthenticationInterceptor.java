package com.lanqiao.exam.interceptor;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class AuthenticationInterceptor extends HandlerInterceptorAdapter {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("handler: " + handler);
        HttpSession session = request.getSession();
        //检查是否已登录
//        if (session.getAttribute("logUser") != null
//                && session.getAttribute("logUser") instanceof UsersInfo) {
//            return true;
//        }
        response.sendRedirect(request.getContextPath() + "/login_form.jsp");
        return false;
    }
}
