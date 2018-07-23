package com.forezp;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
/**
 * Created by forezp on 2017/4/8.
 */
@Component
public class MyFilter extends ZuulFilter{

    private static Logger log = LoggerFactory.getLogger(MyFilter.class);

    //前置过滤器
    @Override
    public String filterType() {
        return "pre";
    }
/*    -re：路由之前
    routing：路由之时
    post： 路由之后
    error：发送错误调用
    filterOrder：过滤的顺序
    shouldFilter：这里可以写逻辑判断，是否要过滤，本文true,永远过滤。
    run：过滤器的具体逻辑。可用很复杂，包括查sql，nosql去判断该请求到底有没有权限访问。*/


    //优先级，数字越大，优先级越低
    @Override
    public int filterOrder() {
        return 0;
    }

    //是否执行该过滤器，true代表需要过滤
    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() {
        RequestContext ctx = RequestContext.getCurrentContext();
        HttpServletRequest request = ctx.getRequest();
        log.info(String.format("%s >>> %s", request.getMethod(), request.getRequestURL().toString()));
        //获取传来的参数accessToken
        //Object accessToken = request.getParameter("token");
        /*if(accessToken == null) {
            log.warn("token is empty");
            //过滤该请求，不往下级服务去转发请求，到此结束
            ctx.setSendZuulResponse(false);
            ctx.setResponseStatusCode(401);
            try {
                ctx.getResponse().getWriter().write("token is empty");
            }catch (Exception e){}

            return null;
        }*/
        //如果有token，则进行路由转发
        log.info("ok");
        //这里return的值没有意义，zuul框架没有使用该返回值
        return null;
    }
}
