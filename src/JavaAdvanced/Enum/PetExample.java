package JavaAdvanced.Enum;

public class PetExample {

    public static void main(String[] args) {
        PetType type1 = PetType.DOG;
        PetType type2 = PetType.CAT;
        PetType type3 = PetType.DOG;

        type1.giveSound();
        type2.giveSound();

        PetType[] petTypes = PetType.values();
        for (PetType s : petTypes) {
            s.giveSound();
        }

        PetType pet = PetType.valueOf("FISH");  //niby wpisujemy string, ale po drugiej stronie jest cała klasa
        pet.giveSound();

        PetType animal = PetType.find("meow");
        System.out.println(animal);

    }
}
