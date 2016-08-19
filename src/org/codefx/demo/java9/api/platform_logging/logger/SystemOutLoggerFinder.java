package org.codefx.demo.java9.api.platform_logging.logger;

import java.lang.System.Logger;
import java.lang.System.LoggerFinder;
import java.lang.reflect.Module;

public class SystemOutLoggerFinder extends LoggerFinder {

	public SystemOutLoggerFinder() {
		System.out.println("SystemOut logger finder instantiated...");
	}

	@Override
	public Logger getLogger(String name, Module module) {
		return new SystemOutLogger();
	}

}