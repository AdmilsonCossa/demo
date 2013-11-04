package com.keep.demo;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class HelloworldActivator implements BundleActivator {

	@Override
	public void start(BundleContext context) throws Exception {
		System.out.println("Hello World!");
	}

	@Override
	public void stop(BundleContext context) throws Exception {
		System.out.println("Bye World!");
	}

}
