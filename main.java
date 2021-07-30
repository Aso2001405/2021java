public static void main(String[]args){
    System.out.println("戦艦ゲーム");
    int gameboardlength = 5;
    char water = '-';
    char ship = 's';
    char hit ='x';
    char miss = 'O';
    int shipnumber = 3;

    char[][] gameboard = gameboard(gameboardlength, water, ship, shipnumber);
}

public static char[][] gameboard(int gameboardlength, char water, char ship, char hit, char miss, int shipnumber){
    char[][]gameboard = new char[gameboardlength][gameboardlength];
    for(char[]row : gameboard){
        Arrays.fill(row, water);
    }
    return placeships(gameboard,shipnumber,water,ship);
}

