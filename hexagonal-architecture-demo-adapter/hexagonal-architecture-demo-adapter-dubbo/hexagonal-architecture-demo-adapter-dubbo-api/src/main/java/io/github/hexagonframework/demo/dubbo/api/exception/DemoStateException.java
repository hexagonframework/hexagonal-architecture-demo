package io.github.hexagonframework.demo.dubbo.api.exception;

public class DemoStateException extends RuntimeException {

    public DemoStateException() { }

    public DemoStateException(String message) {
        super(message);
    }
}
