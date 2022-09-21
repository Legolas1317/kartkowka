public class Publikacja {
    //prywatna
    //cena
    //nazwa
    //klasy dzidziczące
    //klasa książki ilośc stron
    //klasa eboki ilośc miejsca
    //geterry settery i toStringi
    private int cena;
    private String nazwa;

    public Publikacja(int cena, String nazwa) {
        this.cena = cena;
        this.nazwa = nazwa;
    }

    public int getCena() {
        return cena;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setCena(int cena) {
        this.cena = cena;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    @Override
    public String toString() {
        return "Publikacja{" +
                "cena=" + cena +
                ", nazwa='" + nazwa + '\'' +
                '}';
    }

}
