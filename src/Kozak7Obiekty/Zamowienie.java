package Kozak7Obiekty;

public class Zamowienie {
    private int maksRozmiar;
    private int ileDodanych;
    private Pozycja[] wszystkiePozycje;

    public Zamowienie() {
        maksRozmiar = 10;
        this.wszystkiePozycje = new Pozycja[maksRozmiar];
    }

    public Zamowienie(int maksRozmiar) {
        this.maksRozmiar = maksRozmiar;
        this.wszystkiePozycje = new Pozycja[maksRozmiar];

    }

    public void dodajPozycje(Pozycja p) {

        wszystkiePozycje[ileDodanych++] = p;

    }

    public double obliczWartosc() {
        double suma = 0;
        for (int i = 1; i <= ileDodanych; i++) {
            suma += wszystkiePozycje[i].obliczWartosc();
        }
        return suma;
    }

    public String toString() {
        for (int i = 1; i <= ileDodanych; i++) {

            System.out.println(wszystkiePozycje[i].toString());

        }
        return " ";
    }


}
