package com.example.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MyInterceptor implements HandlerInterceptor {
	
	//private static final Logger logger = LoggerFactory.getLogger(MyInterceptor.class);
	
	
	/*
	 * 调用时间：Controller方法处理之前
	 * 
	 * 执行顺序：链式Intercepter情况下，Intercepter按照声明的顺序一个接一个执行
	 * 
	 * 若返回false，则中断执行，注意：不会进入afterCompletion
	 */
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		log.info("preHandle method is running");
		
		//System.out.println(">>>>token="+request.getHeader("token"));
		//System.out.println(">>>>"+response.getWriter());
        
       return true;
		//return HandlerInterceptor.super.preHandle(request, response, handler);
	}
	
	
	/*
	 * 调用前提：preHandle返回true
	 * 
	 * 调用时间：Controller方法处理完之后，DispatcherServlet进行视图的渲染之前，
	 * 也就是说在这个方法中你可以对ModelAndView进行操作
	 * 
	 * 执行顺序：链式Intercepter情况下，Intercepter按照声明的顺序倒着执行。
	 * 
	 * 备注：postHandle虽然post打头，但post、get方法都能处理
	 */
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		log.info("postHandle method is running");
		System.out.println(">>>>>>"+request.getParameter("limit"));
		System.out.println(">>>>==="+modelAndView);
		HandlerInterceptor.super.postHandle(request, response, handler, modelAndView);
	}
	
	
	/*
	 * 调用前提：preHandle返回true
	 * 
	 * 调用时间：DispatcherServlet进行视图的渲染之后
	 * 
	 * 多用于清理资源
	 */
	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		log.info("afterCompletion method is running");
		
		HandlerInterceptor.super.afterCompletion(request, response, handler, ex);
	}

}
