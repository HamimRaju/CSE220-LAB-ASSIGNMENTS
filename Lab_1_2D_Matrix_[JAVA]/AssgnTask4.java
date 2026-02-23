//Assignment Task 04: Rotate Secret
class AssgnTask4 {

    // Complete this method so that it gives the Expected Output
    // YOU ONLY HAVE TO SUBMIT THIS METHOD, NO OTHER DRIVER CODE
    // If needed you can create extra helper static methods
    // if extra helper methods are used then you must submit those as well
public static void rotateSecret(Character[][] board) {

    int n = board.length;
    int totalLayers = n / 2;

    // layer 0 = outermost
    // layer totalLayers-1 = innermost
    for (int layer = 0; layer < totalLayers; layer++) {

        int rotations = totalLayers - layer;

        for (int r = 0; r < rotations; r++) {

            int first = layer;
            int last = n - 1 - layer;

            for (int i = 0; i < last - first; i++) {

                char temp = board[first][first + i];

                // left -> top
                board[first][first + i] = board[last - i][first];

                // bottom -> left
                board[last - i][first] = board[last][last - i];

                // right -> bottom
                board[last][last - i] = board[first + i][last];

                // top -> right
                board[first + i][last] = temp;
            }
        }
    }

    // print recovered message
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            System.out.print(board[i][j]);
        }
    }
    System.out.println();
}

    // DO NOT CHANGE ANY DRIVER CODE BELOW THIS LINE
    public static void main(String[] args) {
        System.out.print("===========Test#1===========\n");
        Character[][] board = {
                { 'T', 'A', 'U', 'S' },
                { 'A', 'R', 'I', '.' },
                { 'D', 'T', 'T', 'N' },
                { 'S', 'C', 'F', 'U' }
        };
        System.out.println("Given Board: ");
        Arr.print2D(board);

        System.out.println("\nExpected Output:");
        Character[][] outputBoard = {
                { 'D', 'A', 'T', 'A' },
                { 'S', 'T', 'R', 'U' },
                { 'C', 'T', 'I', 'S' },
                { 'F', 'U', 'N', '.' }
        };
        System.out.print("DATASTRUCTISFUN.\n");
        Arr.print2D(outputBoard);

        System.out.print("\nYour Output:\n");
        rotateSecret(board);
        Arr.print2D(board);

        if (Arr.compare2D(outputBoard, board))
            System.out.print("Test 1 Success");
        else
            System.out.println("Test 1 FAILED");

        System.out.print("\n===========Test#2===========\n");

        board = new Character[][] {
                { 'O', 'R', 'I', 'R', 'N', 'P' },
                { 'G', 'S', 'A', 'A', 'L', 'R' },
                { 'L', 'M', 'N', 'O', 'N', 'Y' },
                { 'A', 'H', 'U', 'O', 'O', 'P' },
                { 'T', 'F', 'C', 'T', 'H', 'S' },
                { 'E', 'D', 'Y', 'O', 'C', 'K' }
        };
        System.out.println("Given Board: ");
        Arr.print2D(board);

        System.out.println("\nExpected Output:");
        outputBoard = new Character[][] {
                { 'A', 'L', 'G', 'O', 'R', 'I' },
                { 'T', 'H', 'M', 'S', 'A', 'R' },
                { 'E', 'F', 'U', 'N', 'A', 'N' },
                { 'D', 'C', 'O', 'O', 'L', 'P' },
                { 'Y', 'T', 'H', 'O', 'N', 'R' },
                { 'O', 'C', 'K', 'S', 'P', 'Y' }
        };
        System.out.print("ALGORITHMSAREFUNANDCOOLPYTHONROCKSPY\n");
        Arr.print2D(outputBoard);

        System.out.print("\nYour Output:\n");
        rotateSecret(board);
        Arr.print2D(board);

        if (Arr.compare2D(outputBoard, board))
            System.out.print("Test 2 Success");
        else
            System.out.println("Test 2 FAILED");
    }
}
