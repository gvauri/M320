package ch.css;

public class Main {
    public static void main(String[] args) {
        Pyramide pyramide = new Pyramide(4,3,6,5,5);
        System.out.println("Mantel: "+pyramide.getMantel());
        System.out.println("Oberfläche: "+pyramide.getOberFlaeche());
        System.out.println("Volumen: "+pyramide.getVol());
    }
}
