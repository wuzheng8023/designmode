package com.example.ObserverPattern.Observer.entity;

import com.example.ObserverPattern.MessageSource;
import com.example.ObserverPattern.Observer.Observer;

public class Worker extends Observer {

public Worker(MessageSource messageSource){

    this.messageSource = messageSource;
    this.messageSource.attach(this);

}

    @Override
    public void reaction() {
        System.out.println("Worker says this problem " + messageSource.getState());
    }
}
