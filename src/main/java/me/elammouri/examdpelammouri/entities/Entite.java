package me.elammouri.examdpelammouri.entities;


import me.elammouri.examdpelammouri.aspects.Log;
import me.elammouri.examdpelammouri.design_patterns.Observable;
import me.elammouri.examdpelammouri.design_patterns.Observer;
import org.springframework.stereotype.Component;

@Component
public class Entite  implements Observer {
    protected String nom;
    protected int level;

    public Entite(String nom) {
        this.nom = nom;
    }

    @Log
    @Override
    public void update(Observable o) {

    }
}
