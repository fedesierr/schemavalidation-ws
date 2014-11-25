package org.jboss.test.schemavalidation;

import javax.jws.WebService;

import org.apache.cxf.interceptor.InInterceptors;
import org.jboss.test.schemavalidation.interceptor.ValidationInterceptor;

@WebService(endpointInterface="org.jboss.test.schemavalidation.TestWS")
@InInterceptors(classes = {ValidationInterceptor.class})
public class TestWSImpl implements TestWS{

	public Integer sum(Integer a, Integer b) {
		return a + b;
	}

}
