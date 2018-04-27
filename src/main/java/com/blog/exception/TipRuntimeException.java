package com.blog.exception;
/**
 * 
 * Created by CY on 26.April.2018
 *
 */
public class TipRuntimeException extends RuntimeException {

	private static final long serialVersionUID = -6637184144209043209L;

	public TipRuntimeException() {
		super();
	}

	public TipRuntimeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public TipRuntimeException(String message, Throwable cause) {
		super(message, cause);
	}

	public TipRuntimeException(String message) {
		super(message);
	}

	public TipRuntimeException(Throwable cause) {
		super(cause);
	}

	
}
