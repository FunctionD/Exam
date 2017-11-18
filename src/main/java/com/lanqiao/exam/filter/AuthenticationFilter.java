package com.lanqiao.exam.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebFilter(value = "*.do",
        initParams = {@WebInitParam(name = "firstName", value = "di"), @WebInitParam(name = "lastName", value = "fan")})
public class AuthenticationFilter implements Filter { // 如果不采用注解@WebFilter，则要在web.xml里配置filter

    @Override
    public void init(FilterConfig config) throws ServletException {
        String firstName = config.getInitParameter("firstName");
        String lastName = config.getInitParameter("lastName");
        System.out.println(lastName + firstName);
    }

    @Override
    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain)
            throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) req;
        HttpServletResponse response = (HttpServletResponse) resp;
        HttpSession session = request.getSession();

        System.out.println("Filter:" + request.getRequestURI());

//        if (!StringUtils.endsWithAny(request.getRequestURI(), "admin/login.do") && session.getAttribute("adminUser") == null) {
//            response.sendRedirect(request.getContextPath() + "/login.jsp");
//            return;
//        } else {
        // 将请求和响应转交给后面的Web组件继续处理
        chain.doFilter(req, resp);
//        }
    }

    @Override
    public void destroy() {

    }

}
