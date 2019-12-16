package com.example.ObserverPattern.Observer.entity;

import com.example.ObserverPattern.MessageSource;
import com.example.ObserverPattern.Observer.Observer;

public class QualityOfficer extends Observer {

    public QualityOfficer(MessageSource messageSource){
        this.messageSource = messageSource;
        this.messageSource.attach(this);

    }

    @Override
    public void reaction() {
        System.out.println("QualityOfficer says this problem " + messageSource.getState());
    }
}
