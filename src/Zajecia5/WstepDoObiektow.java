package Zajecia5;

import javax.swing.*;

public class WstepDoObiektow {

    //pierwszy przykład tworzenia obiektów
    public static void main(String[] args) {
        //tworzę klasę
        Osoba student = new Osoba();
        student.imie = "Ewa";
        student.nazwisko = "Strojna";
        student.waga = 70;
        student.wiek = 27;
        student.wzrost = 171;
// "Student" jest obiektem typu osoba
// "uczen" jest obiektem typu osoba

        Osoba uczen = new Osoba();
        uczen.imie = "Jan";
        uczen.nazwisko = "Kowalski";
        uczen.wzrost = 180;

        //odczytanie pola
        String a=student.imie;
        System.out.println(a);
//lub
        System.out.println(student.nazwisko);

        //wartości drugiego obbiektu

        System.out.println(uczen.imie);
        System.out.println(uczen.wzrost);
        System.out.println(uczen.wiek);

//zmiana nazwiska studenta
        student.nazwisko="weryho";
        System.out.println(student.nazwisko);
        System.out.println(uczen.nazwisko);


        Osoba pracownik = new Osoba("Ola", "Kowalska", 22);

        System.out.println(pracownik.nazwisko);
        System.out.println(pracownik.wiek);

        //metoda
        System.out.println(pracownik.przedstawsie());
    }
}
