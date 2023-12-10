package me.elammouri.examdpelammouri.entities;

import me.elammouri.examdpelammouri.aspects.Log;
import me.elammouri.examdpelammouri.design_patterns.Observable;
import me.elammouri.examdpelammouri.design_patterns.Observer;

import java.util.List;

public class ObservableImpl1 implements Observable {

    private List<Observer> observers;

    @Log
    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Log
    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Log
    @Override
    public void notifyObservers() {
        for(Observer o:observers){
            o.update(this);
        }
    }
}
