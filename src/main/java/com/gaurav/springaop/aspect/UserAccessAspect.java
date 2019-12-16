package com.gaurav.springaop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.Configuration;

import lombok.extern.slf4j.Slf4j;

@Slf4j
// This is Configuration
@Configuration
// And this is aspect
@Aspect
public class UserAccessAspect {
	/*
	 * This aspect will allow us to check user access before we execute
	 * any method is the business classes. 
	 */

	public UserAccessAspect() {
	}
	
	/*
	 *  Execute this before any method. 
	 *  Filter criteria for method is in brackets.
	 *  Format of filter:
	 *  execution(<return_type> <full_package_name>.<class>.<method_name>(<arguments>))
	 *  '*' can be used as a wildcard
	 *  '..' is wildcard for arguments
	 */
	@Before("execution(* com.gaurav.springaop.business.*.*(..))")
	// Everything in the given package
	public void checkUserAccess(JoinPoint joinPoint) {
		// JoinPoint argument is optional. Add it if you need more info.
		log.info("Check for UserAccess here.");
		log.info("User Access successful in UserAccessAspect. Now allow execution.\n{}", joinPoint);
	}

}
