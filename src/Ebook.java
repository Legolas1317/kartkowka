public class Ebook extends Publikacja{



    private int liczba_miejsc = 0;

    public Ebook(int cena, String nazwa, int liczba_miejsc) {
        super(cena, nazwa);
        this.liczba_miejsc = liczba_miejsc;
    }

    public int getLiczba_miejsc() {
        return liczba_miejsc;
    }

    public void setLiczba_miejsc(int liczba_miejsc) {
        this.liczba_miejsc = liczba_miejsc;
    }

    @Override
    public String toString() {
        return "Ebook{" +
                "liczba_miejsc=" + liczba_miejsc +
                '}';
    }
}
