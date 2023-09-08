package ch.css;

public class Mitarbeiter implements Person, Verdiener {
    //Membervariablen
    private PersonDaten personDaten;
    private double m_Lohn;
    private String m_Firma;
    //Konstruktoren
    public Mitarbeiter(String Name, String Vorname) {
        personDaten = new PersonDaten(Name,Vorname);
    }
    public Mitarbeiter(String Name, String Vorname, double Lohn, String firma) {
        personDaten = new PersonDaten(Name,Vorname);
        setLohn(Lohn);
        setFirma(firma);
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
    public double getLohn()  {
        return m_Lohn;
    }
    public void setLohn(double value) {
        m_Lohn = value;
    }
    public String getFirma() {
        return m_Firma;
    }
    public void setFirma(String value) {
        m_Firma = value;
    }
    public void Datenausgabe()
    {
        System.out.print("Name und Vorname: " + getName() + ", " + getVorname());
        System.out.println(" Lohn:" +getLohn()+ ", Firma:" +getFirma());
    }
}
