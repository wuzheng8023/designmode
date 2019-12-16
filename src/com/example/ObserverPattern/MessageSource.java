package com.example.ObserverPattern;

import com.example.ObserverPattern.Observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class MessageSource {

    private int state; //反应观察者状态，不同数字代表不同的事件的发生。
    private List<Observer> observers = new ArrayList<>();

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyAllObserver();
    }

    public void attach(Observer observer) {
        observers.add(observer);
    }

    private void notifyAllObserver() {
        //通知的方法
        for (Observer observer : observers) {
            observer.reaction();
        }


    }
}
