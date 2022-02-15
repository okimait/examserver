package com.examiner.examserver.helper;

public class UserNotFoundExceptionException extends  Exception {
    public UserNotFoundExceptionException()
    {
        super("User with given details does not exist !!");
    }
    public UserNotFoundExceptionException(String msg){super(msg);}
}
