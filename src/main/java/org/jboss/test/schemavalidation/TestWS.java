package org.jboss.test.schemavalidation;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface TestWS {
	
	@WebMethod
	public Integer sum(Integer a, Integer b);
}
