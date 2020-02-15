package Kozak7Obiekty;

public class ProgramK7 {
    public static void main(String[] args) {
        Pozycja pozycja = new Pozycja("Towar1", 2, 15);
        Pozycja p2 = new Pozycja("Towar2", 25, 135);
        Zamowienie zamowienie = new Zamowienie();
        zamowienie.dodajPozycje(pozycja);
        zamowienie.dodajPozycje(p2);
        zamowienie.toString();
        System.out.println();
        System.out.println(zamowienie.obliczWartosc());
    }
}
