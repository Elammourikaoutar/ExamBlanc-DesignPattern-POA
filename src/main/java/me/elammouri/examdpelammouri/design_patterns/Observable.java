package me.elammouri.examdpelammouri.design_patterns;

public interface Observable {
    public void addObserver(Observer observer);
    public void removeObserver(Observer observer);
    public void notifyObservers();

}
