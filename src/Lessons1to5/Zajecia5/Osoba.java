package Zajecia5;

public class Osoba {
    //u góry klasy definiujemy pola od razu

    public String imie;

    //obiekt typu osoba posiada pole imię i poniższe

    public String nazwisko;
    public int wiek;
    public double wzrost;
    public double waga;

    //konstruktor bezparametrowy
    public Osoba() {
        System.out.println("Tworze obieekt typu osoba");
    }

    //konstruktor parametrowy
    public Osoba(String imie, String nazwisko, int wiek) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;

    }

    //definicja metody do opisu Osoby
    //pomijamy static we własnych klasach
    public String przedstawsie() {
        return "Na imię mam  " + imie + " na nazwisko "
                + nazwisko + ". Mam " + wiek + " lat.";

    }


}
