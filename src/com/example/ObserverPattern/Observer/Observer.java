package com.example.ObserverPattern.Observer;

import com.example.ObserverPattern.MessageSource;

public abstract class Observer {

//    当生产线生产出问题部件时，发送消息通知所有关注部件质量的人，例如质管员，工人等。
//
//    思路：设计一个抽象的观察者，包含当收到消息时的行为；任何具体观察者决定收到消息后的行为实现。
//    设计消息源，维护一个监听此消息源的观察者集合，
//    提供将观察者加入/移除集合的方法，提供通知所有此消息观察者消息产生的方法。
//    设计一个消息源工厂，封装各种消息源。即，当需要发送任何消息或订阅任何消息源监听时，通过工厂实现。
//    当部件生产出现问题(调用一个方法模拟即可 )，通知部件质量消息源错误信息，
//    消息源通知注册在此消息源上的全部观察者事件的发生，
//    各观察者产生不同的消息消费行为，例如质管员记录，工人核查等(均为模拟的方法)。

    /**
     * 个人理解：
     * 一个消息源，负责发送消息，维护观察者集合；
     * 一个消息源工厂，负责生产消息源，
     */


    protected MessageSource messageSource;
    public abstract void reaction();

}
