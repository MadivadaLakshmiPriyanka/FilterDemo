package com.filters;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

public class LogFilter implements Filter {
  private FilterConfig config = null;
	
	public void doFilter(ServletRequest request, ServletResponse response, 
			FilterChain chain) throws IOException, ServletException {
		
		System.out.println("Logging the request details");
		chain.doFilter(request, response);
		System.out.println("Logging the response details");
	}

	public void init(FilterConfig fConfig) throws ServletException {
		this.config = fConfig;
	}
	
	public void destroy() {
		config = null;
	}
}
