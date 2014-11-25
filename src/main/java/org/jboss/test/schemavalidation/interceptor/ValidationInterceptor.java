package org.jboss.test.schemavalidation.interceptor;

import org.apache.cxf.interceptor.Fault;
import org.apache.cxf.message.Message;
import org.apache.cxf.phase.AbstractPhaseInterceptor;
import org.apache.cxf.phase.Phase;
import org.jboss.test.schemavalidation.handler.MyValidationEventHandler;

public class ValidationInterceptor extends AbstractPhaseInterceptor<Message> {
	

    public ValidationInterceptor() {
        super(Phase.READ);
    }

	public void handleMessage(Message message) throws Fault {
		message.setContextualProperty("jaxb-validation-event-handler", new MyValidationEventHandler());
		
	}

}
