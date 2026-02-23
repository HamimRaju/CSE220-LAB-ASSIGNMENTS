//Assignment Task 02: Matrix Compression
class AssgnTask2 {

    // Complete this method so that it gives the Expected Output
    // YOU ONLY HAVE TO SUBMIT THIS METHOD, NO OTHER DRIVER CODE
    public static Integer[][] compressMatrix(Integer[][] matrix) {

        // For this task you'll need to create new 2D array

        // TO DO

        // remove the line below and return the newly created Compressed 2D matrix

        int size = matrix.length;
        int newSize = size / 2;

        Integer[][] result = new Integer[newSize][newSize];

        int r = 0;

        for (int i = 0; i < size; i = i + 2) {

            int c = 0;

            for (int j = 0; j < size; j = j + 2) {

                int total = 0;

                total = total + matrix[i][j];
                total = total + matrix[i][j + 1];
                total = total + matrix[i + 1][j];
                total = total + matrix[i + 1][j + 1];

                result[r][c] = total;

                c++;
            }

            r++;
        }

        return result;

    }

    // DO NOT CHANGE ANY DRIVER CODE BELOW THIS LINE
    public static void main(String[] args) {
        Integer[][] matrix = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 1, 3, 5, 2 },
                { -2, 0, 6, -3 }
        };
        System.out.println("Given Matrix: ");
        Arr.print2D(matrix);

        System.out.println("\nExpected Output:");
        System.out.print("| 14 | 22 |\n| 2  | 10 |\n");

        System.out.print("\nYour Output:\n");
        Integer[][] returnedArray = compressMatrix(matrix);
        Arr.print2D(returnedArray);
    }
}
