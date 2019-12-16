package com.example.ObserverPattern;

import com.example.ObserverPattern.Observer.entity.QualityOfficer;
import com.example.ObserverPattern.Observer.entity.Worker;

public class Test {
    public static void main(String[] args) {

        MessageSource messageSource = new MessageSource();

        new QualityOfficer(messageSource);
        new Worker(messageSource);

        System.out.println("第一个状态来临时，状态1：");
        messageSource.setState(1);

        System.out.println("第二个状态来临时，状态2：");
        messageSource.setState(1);

        System.out.println("第三个状态来临时，状态3：");
        messageSource.setState(3);

    }

}
