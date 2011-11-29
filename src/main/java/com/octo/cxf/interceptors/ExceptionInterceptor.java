package com.octo.cxf.interceptors;

import javax.xml.namespace.QName;

import org.apache.cxf.binding.soap.SoapMessage;
import org.apache.cxf.binding.soap.interceptor.AbstractSoapInterceptor;
import org.apache.cxf.binding.soap.interceptor.Soap12FaultInInterceptor;
import org.apache.cxf.common.injection.NoJSR250Annotations;
import org.apache.cxf.interceptor.Fault;
import org.apache.cxf.phase.Phase;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.octo.cxf.services.exceptions.BusinessException;
import com.octo.cxf.services.exceptions.TechnicalException;

/**
 * This interceptor is intended to transform and handle all exception to allow a good information to WS Client. It
 * transform Exception to human usable soap fault with the information level adapted to give enough information to
 * client without security compromise.
 */
@NoJSR250Annotations
public class ExceptionInterceptor extends AbstractSoapInterceptor {
	
	private Logger logger = LoggerFactory.getLogger(ExceptionInterceptor.class);

	public ExceptionInterceptor() {
		super(Phase.PRE_LOGICAL);
	}

	/**
	 * This method used by cxf make the interceptor business work.
	 */
	public void handleMessage(SoapMessage message) throws Fault {
		Fault fault = (Fault) message.getContent(Exception.class);
		Throwable ex = fault.getCause();
		logger.error("CAUGHT A FAULT");
		if (ex instanceof BusinessException) {
			BusinessException e = (BusinessException) ex;
			generateSoapFault(fault, e);
		} else if (ex instanceof TechnicalException) {
			TechnicalException e = (TechnicalException) ex;
			generateSoapFault(fault, e);
		} else {
			generateSoapFault(fault, null);
		}
	}

	/**
	 * Transforme a CXF Fault to add it the ING Exception Error Code.
	 * 
	 * @param fault
	 * @param e
	 */
	private void generateSoapFault(Fault fault, Exception e) {
			fault.setFaultCode(createQName(200));
	}

	private static QName createQName(int errorCode) {
		return new QName("octo.com", String.valueOf(errorCode));
	}
}
