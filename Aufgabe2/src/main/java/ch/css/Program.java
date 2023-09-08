package ch.css;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<Person> allePersonen = new ArrayList<Person>();
        //Mitarbeiter
        Mitarbeiter m1 = new Mitarbeiter("Kunigunde", "Hugentobler", 4800.00, "Roche");
        allePersonen.add(m1);
        allePersonen.add( new Mitarbeiter("Adelheit", "Joggenmoser", 6200.00, "Siemens") );
        Mitarbeiter m3 =  new Mitarbeiter("Melchior", "Käser");
        m3.setLohn(5900.00);
        m3.setFirma("Roche");
        allePersonen.add(  m3 );
        //Parteimitglieder
        allePersonen.add(  new Parteimitglied("Blocher", "Christoph", "SVP") );
        allePersonen.add(  new Parteimitglied("Brunner", "Heidi", "FDP") );
        //Politiker
        allePersonen.add(  new Politiker("Maurer", "Ueli", 33000, "SVP", "Bundesrat")  );
        allePersonen.add(  new Politiker("Cassis", "Ignazio", 33000, "FDP", "Bundesrat") );
        allePersonen.add(  new Politiker("Schneider-Ammann", "Johann", 33000, "FDP", "Bundesrat") );
        allePersonen.add(  new Politiker("Sommaruga", "Simmonetta", 33000, "SP", "Bundesrat") );
        allePersonen.add(  new Politiker("Parmelat", "Guy", 33000, "SVP", "Bundesrat") );
        allePersonen.add(  new Politiker("Berset", "Alain", 33000, "SP", "Bundesrat") );
        allePersonen.add(  new Politiker("Leuthard", "Doris", 33000, "CVP", "Bundesrat") );
        allePersonen.add(  new Politiker("Levrat", "Christian", 100000, "SP", "Nationalrat") );
        allePersonen.add(  new Politiker("Schelbert", "Louis", 100000, "Grüne", "Nationalrat") );
        allePersonen.add(  new Politiker("Darbellay", "Christoph", 100000, "CVP", "Nationalrat") );
        allePersonen.add(  new Politiker("Brunner", "Toni", 100000, "SVP", "Nationalrat") );
        Politiker po12 = new Politiker("Höltschi", "Pius", 6000, "SVP", "Kantonsrat");
        allePersonen.add(  po12 );
        Funktionen.Lohnerhoehung(m1, 1.20);
        Funktionen.Lohnerhoehung(po12, 2.50);
        //
        for (Person p: allePersonen) {
            p.Datenausgabe();
        }
    }

}