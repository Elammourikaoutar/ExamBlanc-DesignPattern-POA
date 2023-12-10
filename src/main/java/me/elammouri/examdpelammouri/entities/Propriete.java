package me.elammouri.examdpelammouri.entities;

import me.elammouri.examdpelammouri.aspects.Log;

public class Propriete extends Entite {

    private String type;
    private String valeur;

    @Log
    public String getType() {
        return type;
    }

    @Log
    public void setType(String type) {
        this.type = type;
    }

    @Log
    public String getValeur() {
        return valeur;
    }

    @Log
    public void setValeur(String valeur) {
        this.valeur = valeur;
    }

    public Propriete(String nom) {
        super(nom);
    }

    public Propriete(String nom, String type, String valeur) {
        super(nom);
        this.type = type;
        this.valeur = valeur;
    }
}
