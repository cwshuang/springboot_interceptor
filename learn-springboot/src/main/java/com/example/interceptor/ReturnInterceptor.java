package com.example.interceptor;


import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.example.annotation.ReturnResult;
import com.example.annotation.StringResult;

 


public class ReturnInterceptor implements HandlerInterceptor {
	private boolean returnResult = true;
	
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception {
		//首先判断是否是Debug模式(全局)，如果否则使拦截器失效
		if(!this.returnResult) return true;
		
		if(handler instanceof HandlerMethod){
			HandlerMethod method = (HandlerMethod)handler;
			ReturnResult isDebug = method.getMethodAnnotation(ReturnResult.class);
			StringResult stringResult = method.getMethodAnnotation(StringResult.class);
			//如果没有@StringResult注解则跳过拦截
			//判断方法上注解的Debug值，如果否则不拦截
			if(stringResult==null||(isDebug !=null && isDebug.value() == false)){
				return true;
			}else{
				//拦截方法，并将stringResult中的内容返回给前台
				PrintWriter out = response.getWriter();
				out.print(stringResult.value());
			}
		}
		
		return false;
	}
	
	public void postHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		// TODO Auto-generated method stub
 
	}
 
	public void afterCompletion(HttpServletRequest request,
			HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		// TODO Auto-generated method stub
 
	}
 
	public boolean isDebug() {
		return returnResult;
	}
 
	public void setDebug(boolean returnResult) {
		this.returnResult = returnResult;
	}
	
	
 
}