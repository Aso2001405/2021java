public static char[][] placeships(char[][] gameboard, int shipnumber,char water, char ship){
    int placedships = 0;
    int gameboardlength= gameboard.lenght;
    while (placesships < shipnumber){
        int []location = generateshipcoordinates(gameboardlength)
    }
}

public static int[] generateshipcoordinates(int gameboardlength){
    int [] coordinates = new int[2];
    for (int i = 0; i < coordinates.length; i++){
        coordinates[i] = new Random().nextInt(gameboardlength);
    }
    return coordinates;
}