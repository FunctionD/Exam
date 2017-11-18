package com.lanqiao.exam.filter;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


public class Error404Filter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest req, ServletResponse rep, FilterChain chain)
            throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) req;
        HttpServletResponse response = (HttpServletResponse) rep;
        Error404ResponseWrapper responseWrapper = new Error404ResponseWrapper(this, response);
        chain.doFilter(request, responseWrapper);
        if (responseWrapper.isFound()) {
            return;
        }
        //String uri = request.getRequestURI();
        //System.out.println(uri);
        String shangxiawen = request.getContextPath() + "/";

        response.sendRedirect(shangxiawen + "views/error/404.jsp");
    }

    @Override
    public void destroy() {

    }

}
