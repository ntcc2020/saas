package com.ntcc.zuulservice.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * LoginFilter
 * 登录过滤器
 *
 * @author zhongwenhao
 * @date 2020/3/2
 */

@Component
public class LoginFilter extends ZuulFilter {
    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        RequestContext currentContext = RequestContext.getCurrentContext();
        HttpServletRequest request = currentContext.getRequest();
        String servletPath = request.getServletPath();
        String token = request.getParameter("token");
//        if (!servletPath.startsWith("/api/account/register") && token == null) {
//            currentContext.setSendZuulResponse(false);
//            currentContext.setResponseStatusCode(401);
//            try {
//                currentContext.getResponse().setContentType("text/html;charset=UTF-8");
//                currentContext.getResponse().getWriter().write("非法请求");
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }

        return null;
    }
}
