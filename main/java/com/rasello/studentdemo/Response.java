package com.rasello.studentdemo;



public class Response<V> {
    private boolean success;
    private String message;
    private V data;

    public Response(boolean success, String message, V data) {
        this.success = success;
        this.message = message;
        this.data = data;
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

    public V getData() {
        return data;
    }

    public void setDate(V data) {
        this.data = data;
    }
}

