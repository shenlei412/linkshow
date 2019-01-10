package com.easylinkin.linkshow.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * SessionInterceptor
 * <p>
 * 功能:拦截器定义
 *
 * <pre>
 * ver     修订日              作者           修订内容
 * 1.0     2019/1/10           沈磊           新规做成
 * </pre>
 */
public class SessionInterceptor implements HandlerInterceptor {

    @Override public boolean preHandle(HttpServletRequest httpServletRequest,
            HttpServletResponse httpServletResponse, Object o) throws Exception {
        return false;
    }

    @Override public void postHandle(HttpServletRequest httpServletRequest,
            HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView)
            throws Exception {

    }

    @Override public void afterCompletion(HttpServletRequest httpServletRequest,
            HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }
}
