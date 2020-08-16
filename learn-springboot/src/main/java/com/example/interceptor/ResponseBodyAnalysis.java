package com.example.interceptor;

import org.springframework.core.MethodParameter;
import org.springframework.http.MediaType;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

/**
 * 注解,拦截返回值（特殊处理后再返回）
 * @author chenws
 *
 */
@ControllerAdvice
public class ResponseBodyAnalysis implements ResponseBodyAdvice {

    @Override
    public Object beforeBodyWrite(Object body, MethodParameter arg1,
                                  MediaType arg2, Class arg3, ServerHttpRequest arg4,
                                  ServerHttpResponse arg5) {
        System.out.println(body+"获取了++++++++++++++++++++++++++");
        return body;
    }

    @Override
    public boolean supports(MethodParameter arg0, Class arg1) {
        return true;
    }

}
