package cn.rookie.exception;

/**
 * Created by Rookie on 2016/4/25.
 * Description:自定义一个异常抽象类。
 * Project_name: Java-base
 * Copyright (c) All Rights Reserved.
 */
public abstract class NestedRuntimeException extends RuntimeException{


}


/**
 * Helper class for implementing exception classes which are capable of
 * holding nested exceptions. Necessary because we can't share a base
 * class among different exception types.
 */
class NestedExceptionUtils{

    /**
     * Build a message for the given base message and root cause.
     * @param message the base message
     * @param cause the root cause
     * @return the full exception message
     */
    public static String buildMessage(String message, Throwable cause) {
        if (cause != null) {
            StringBuilder sb = new StringBuilder();
            if (message != null) {
                sb.append(message).append("; ");
            }
            sb.append("nested exception is ").append(cause);
            return sb.toString();
        }
        else {
            return message;
        }
    }
}