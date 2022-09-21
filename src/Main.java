public class Main {
    public static void main(String[] args) {



        Ksionzka ksionzka = new Ksionzka(12,"Hobbit",189);
        Ebook ebook = new Ebook(15,"Taktyki podrywu i flirtu",15);

        //ksionzka.toString();  ta NIE robimy
        //ebook.toString();
        System.out.println(ksionzka.toString()); // wypisujemy wynik metody
        System.out.println(ebook.toString());

    }
}