package com.xxx.exception;

public class NullTaskException extends Exception {
    public NullTaskException(String message) {
        super(message + "\n");
    }
}
