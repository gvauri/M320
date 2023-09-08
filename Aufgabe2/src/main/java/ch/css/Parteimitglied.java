package ch.css;

public class Parteimitglied implements Person{
    //Membervariablen
    private PersonDaten personDaten;

    private String m_Partei = null;
    //Konstruktoren
    public Parteimitglied(String Name, String Vorname, String partei) {
        personDaten = new PersonDaten(Name,Vorname);
        setPartei(partei);
    }
    public Parteimitglied(String Name, String Vorname) {
        personDaten = new PersonDaten(Name,Vorname);

    }
    //Methoden
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
    public String getPartei() {
        return m_Partei;
    }
    public void setPartei(String value) {
        m_Partei = value;
    }
    public void Datenausgabe()  {
        System.out.print("Name und Vorname: " + getName() + " " + getVorname());
        System.out.println(", Partei:" + getPartei());
    }
}