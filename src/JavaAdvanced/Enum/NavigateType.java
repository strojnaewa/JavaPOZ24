package JavaAdvanced.Enum;

public enum NavigateType {
    NORTH(0,1),
    SOUTH(0,-1),
    EAST(1,0),
    WEST(-1,0);

    private int coordinate1;
    private int coordinate2;

    NavigateType  (int coordinate1, int coordinate2){
        this.coordinate1=coordinate1;
        this.coordinate2=coordinate2;
    }
    public int getCoordinate1() {
        return coordinate1;
    }
    public int getCoordinate2() {
        return coordinate2;
    }
}
