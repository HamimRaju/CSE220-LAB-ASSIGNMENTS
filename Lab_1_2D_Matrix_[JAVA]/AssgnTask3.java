//Assignment Task 03: Game Arena
class AssgnTask3 {

    public static void playGame(Integer[][] arena) {
        int row =arena.length;
        int column =arena[0].length;
        int points =0;
        for(int i =0; i<row;i++) {
            for(int j=0; j<column;j++) {
                int value=arena[i][j];
                if(value != 0) {
                    if(value % 50 == 0) {
                        int twoCount = 0;
                        if (i>0) {
                            if(arena[i - 1][j]==2) {
                                twoCount++;
                            }
                        }
                        if(i <row -1) {
                            if (arena[i + 1][j] == 2) {
                                twoCount++;
                            }
                        }
                        if (j > 0) {
                            if(arena[i][j - 1] == 2) {
                                twoCount++;
                            }
                        }
                        if (j < column - 1) {
                            if (arena[i][j + 1] == 2) {
                                twoCount++;
                            }
                        }
                        points = points + (twoCount * 2);
                    }
                }
            }
        }

        if (points>=10) {
            System.out.println("Points Gained: "+points+ ". Your team has survived the game.");
        } 
        else {
            System.out.println("Points Gained: "+points +". Your team is out.");
        }
    }

    // DO NOT CHANGE ANY DRIVER CODE BELOW THIS LINE
    public static void main(String[] args) {
        Integer[][] arena = {
                { 0, 2, 2, 0 },
                { 50, 1, 2, 0 },
                { 2, 2, 2, 0 },
                { 1, 100, 2, 0 }
        };
        System.out.println("Given Arena: ");
        Arr.print2D(arena);

        System.out.println("\nExpected Output:");
        System.out.print("Points Gained: 6. Your team is out.\n");

        System.out.print("\nYour Output:\n");
        playGame(arena);

        System.out.print("\n======================\n");

        Integer[][] arena1 = {
                { 0, 2, 2, 0, 2 },
                { 1, 50, 2, 1, 100 },
                { 2, 2, 2, 0, 2 },
                { 0, 200, 2, 0, 0 }
        };
        System.out.println("\nGiven Arena: ");
        Arr.print2D(arena1);

        System.out.println("\nExpected Output:");
        System.out.print("Points Gained: 14. Your team has survived the game.\n");

        System.out.print("\nYour Output:\n");
        playGame(arena1);
    }
}
