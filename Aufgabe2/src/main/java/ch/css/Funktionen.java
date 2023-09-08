package ch.css;

public class Funktionen {

    public static void Lohnerhoehung(Verdiener p, double d) {
        double dAlterLohn = p.getLohn();
        double dNeuerLohn = dAlterLohn / 100 * (100 + d);
        p.setLohn(dNeuerLohn);
    }

}
