package com.iztao.pkuse.rbac.exception;

public class ArgumentException extends RuntimeException {


	private static final long serialVersionUID = -3669580821369781361L;
	protected int exceptionCode = -1;

	public int getExceptionCode() {
		return this.exceptionCode;
	}

	public ArgumentException(int exceptionCode, String message) {
		super(message);
		this.exceptionCode = exceptionCode;
	}
	
	public ArgumentException(int exceptionCode, String message, Throwable cause) {
		super(message, cause);
		this.exceptionCode = exceptionCode;
	}
}