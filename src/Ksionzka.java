public class Ksionzka extends Publikacja{

    private int liczba_stron = 0;

    public Ksionzka(int cena, String nazwa, int liczba_stron) {
        super(cena, nazwa);
        this.liczba_stron = liczba_stron;
    }

    public int getLiczba_stron() {
        return liczba_stron;
    }

    public void setLiczba_stron(int liczba_stron) {
        this.liczba_stron = liczba_stron;
    }

    @Override
    public String toString() {
        return "Ksionzka{" +
                "liczba_stron=" + liczba_stron +
                '}';
    }

}
