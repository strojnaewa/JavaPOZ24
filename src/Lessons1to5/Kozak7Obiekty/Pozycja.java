package Kozak7Obiekty;

public class Pozycja {
    private String nazwaTowaru;
    private int ileSztuk;
    private double cena;

    public Pozycja (String nazwaTowaru, int ileSztuk, double cena){
        this.nazwaTowaru=nazwaTowaru;
        this.ileSztuk=ileSztuk;
        this.cena=cena;

    }

    public double obliczWartosc(){
        return ileSztuk*cena;
    }
    public String toString(){
        String spacja=" ";
        return nazwaTowaru +spacja.repeat(20-nazwaTowaru.length())+cena+" zł"+spacja.repeat(5)+ileSztuk+" szt"+spacja.repeat(5)+obliczWartosc()+" zł"+spacja.repeat(5);     }

    public String getNazwaTowaru() {
        return nazwaTowaru;
    }

    public void setNazwaTowaru(String nazwaTowaru) {
        this.nazwaTowaru = nazwaTowaru;
    }

    public int getIleSztuk() {
        return ileSztuk;
    }

    public void setIleSztuk(int ileSztuk) {
        this.ileSztuk = ileSztuk;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }
}
