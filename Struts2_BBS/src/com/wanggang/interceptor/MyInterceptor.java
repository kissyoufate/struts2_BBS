package com.wanggang.interceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

//自定义拦截器
public class MyInterceptor implements Interceptor {

	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}

	@Override
	public void init() {
		// TODO Auto-generated method stub

	}

	@Override  //并在struts.xml中配置拦截器
	public String intercept(ActionInvocation invocation) throws Exception {
		//记录请求时间时间
		long startTime = System.currentTimeMillis();
		String r = invocation.invoke();
		long endTime = System.currentTimeMillis();
		System.out.println("执行时间:" + (endTime - startTime));
		return r;
	}

}
