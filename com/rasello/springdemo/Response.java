package com.rasello.springdemo;

public class Response<T> {
    private boolean success;
    private String message;
    private T date;

    public Response(boolean success, String message, T date) {
        this.success = success;
        this.message = message;
        this.date = date;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getDate() {
        return date;
    }

    public void setDate(T date) {
        this.date = date;
    }
}
