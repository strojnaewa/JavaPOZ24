package Zajecia5;

public class Prostokat {
    private int bokA;
    private int bokB;

    public Prostokat(int bokA, int bokB) {
        this.bokA = bokA;
        this.bokB = bokB;
    }

    public int pole() {
        return bokA * bokB;
    }

    public int obwod() {
        return 2 * bokA + 2 * bokB;
    }

    public int getBokA(){
        return this.bokA;
    }

    public void setBokA(int bokA){
        this.bokA=bokA;
    }

}
