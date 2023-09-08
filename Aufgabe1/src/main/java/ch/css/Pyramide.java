package ch.css;


import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Pyramide {
    private double deckSeiteA;
    private double deckSeiteB;
    private double basisSeiteA;
    private double basisSeiteB;
    private double hohe;


    public double getVol(){
        return ((3*(deckSeiteA*deckSeiteB+basisSeiteA*basisSeiteB))*hohe)/6 ;
    }
    public double getMantel(){
        return (double) 1 / 2 * (deckSeiteA + deckSeiteB + basisSeiteA + basisSeiteB) * hohe;
    }
    public double getOberFlaeche(){
        return getMantel()+ deckSeiteA*deckSeiteB + basisSeiteA*basisSeiteB;
    }


}
