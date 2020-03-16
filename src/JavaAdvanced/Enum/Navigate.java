package JavaAdvanced.Enum;


public class Navigate {
    public static void main(String[] args) {
        int coordinate1 = 0;
        int coordinate2 = 0;
        NavigateType east = NavigateType.EAST;
        NavigateType west = NavigateType.WEST;
        NavigateType south = NavigateType.SOUTH;
        NavigateType north = NavigateType.NORTH;
        NavigateType[] moves = new NavigateType[]{east,north,east,north,north,west,north,north,east,south,east,north,north,north,west};
        System.out.println("You start in point 0,0");

        for (int i = 0; i < moves.length; i++) {

            System.out.println(moves[i].toString());
            coordinate1 += moves[i].getCoordinate1();
            coordinate2 += moves[i].getCoordinate2();
            System.out.println("Your current coordinates (" + coordinate1 + "," + coordinate2 + ")");

        }
    }
}
