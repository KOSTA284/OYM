package com.oym.exception;

public class NothingException extends Exception {
	public NothingException() {
		this("아무것도 없습니다.");
	}
	public NothingException(String message) {
		super(message);
	}
}