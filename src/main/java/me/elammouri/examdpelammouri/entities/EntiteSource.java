package me.elammouri.examdpelammouri.entities;

import me.elammouri.examdpelammouri.design_patterns.Observer;

import java.util.ArrayList;
import java.util.List;

public class EntiteSource extends Classe{

    private List<Cardinalite> cardinalites = new ArrayList<>();

    public EntiteSource(String nom) {
        super(nom);
    }

    public EntiteSource(String nom, List<Attribut> attributs, List<Methode> methodes, List<Constructeur> constructeurs, List<Observer> observers) {
        super(nom, attributs, methodes, constructeurs, observers);
    }
}
