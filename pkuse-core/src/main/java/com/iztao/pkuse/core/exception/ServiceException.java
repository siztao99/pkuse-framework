package com.iztao.pkuse.core.exception;

/**
 *  业务级别异常
 */
public class ServiceException   extends RuntimeException {
    private static final long serialVersionUID = -5005408055652524425L;
    protected int exceptionCode = -1;

    public int getExceptionCode() {
        return this.exceptionCode;
    }

    public ServiceException(int exceptionCode,String message) {
        super(message);
        this.exceptionCode = exceptionCode;
    }

    public ServiceException(int exceptionCode,String message,Throwable cause) {
        super(message, cause);
        this.exceptionCode = exceptionCode;
    }
}
