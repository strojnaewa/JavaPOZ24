package JavaAdvanced.Enum;

public enum PetType {
    DOG("woof woof"), //
    CAT("meow"), //
    FISH("blop"), //
    RABBIT("wiii");

    private String sound;

    PetType(String sound) {
        this.sound=sound;
    }

    public void giveSound() {
        System.out.println(sound);
    }

    public static PetType find(String input){   //na podstawie dzwięku wróci zwierzę
        for(PetType s:PetType.values()){
            if (s.sound.equals(input)){
                return s;
            }
        }
        return null;
    }
}
