package com.projeto.spring.pessoa.exception;

public class ObjectNotFoundException extends RuntimeException{

    public ObjectNotFoundException( String message){
        super (message);
    }

}
