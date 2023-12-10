package me.elammouri.examdpelammouri.entities;

import java.util.ArrayList;
import java.util.List;

public class EntiteDestination extends Entite {
    private List<Cardinalite> cardinalites = new ArrayList<>();

    public EntiteDestination(String nom) {
        super(nom);
    }
}
