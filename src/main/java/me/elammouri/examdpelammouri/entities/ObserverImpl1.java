package me.elammouri.examdpelammouri.entities;


import me.elammouri.examdpelammouri.aspects.Log;
import me.elammouri.examdpelammouri.design_patterns.Observable;
import me.elammouri.examdpelammouri.design_patterns.Observer;

public class ObserverImpl1 implements Observer {

    @Log
    @Override
    public void update(Observable o) {
        //int nouvelEtat = ((ObservableImpl1)o).getEtat();
        //System.out.println("observers.Observer 1 etat:"+nouvelEtat);
    }
}
