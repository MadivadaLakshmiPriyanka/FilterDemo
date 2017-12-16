package com.filters;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class EncryptFilter implements Filter{

	@Override
	public void destroy() {
	}

	
	@Override
	public void doFilter(ServletRequest arg0, ServletResponse arg1,
			FilterChain chain) throws IOException, ServletException {
		System.out.println("Encrypting Request");
		chain.doFilter(arg0, arg1);
		System.out.println("Encrypting Response");
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
	}

}
