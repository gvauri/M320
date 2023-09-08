package ch.css;

public class Politiker implements Person, Verdiener{
    //Membervariablen
    private PersonDaten personDaten;

    private double m_Lohn;
    private String m_Partei = null;
    private String m_Rat = null;
    //Konstruktoren
    public Politiker(String Name, String Vorname, double l, String p, String r) {
        personDaten = new PersonDaten(Name,Vorname);
        setLohn(l);
        setPartei(p);
        setRat(r);
    }
    public Politiker(String Name, String Vorname) {
        personDaten = new PersonDaten(Name,Vorname);

    }
    public String getName() {
        return personDaten.getM_Name();
    }
    public void setName(String value) {
        personDaten.setM_Name(value);
    }
    public String getVorname()  {
        return personDaten.getM_Vorname();
    }
    public void setVorname(String value) {
        personDaten.setM_Vorname(value);
    }
    public double getLohn() {
        return m_Lohn;
    }
    public void setLohn(double value) {
        m_Lohn = value;
    }
    public String getPartei() {
        return m_Partei;
    }
    public void setPartei(String value) {
        m_Partei = value;
    }
    public String getRat() {
        return m_Rat;
    }
    public void setRat(String value) {
        m_Rat = value;
    }
    public void Datenausgabe() {
        System.out.print("Name und Vorname: " + getName() + " " + getVorname());
        System.out.println(", Lohn:" + getLohn() + ", Rat: " + getRat());
    }
}