package com.examiner.examserver.helper;

public class UserFoundException extends Exception {
    public UserFoundException()
    {
        super("User with given details already exists");
    }
    public UserFoundException(String msg){super(msg);}
}
