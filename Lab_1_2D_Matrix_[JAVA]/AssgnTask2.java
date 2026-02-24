//Assignment Task 02: Matrix Compression
class AssgnTask2 {

    public static Integer[][] compressMatrix(Integer[][] matrix) {

        int length = matrix.length;
        int matrix_size = length / 2;
        int row = 0;

        Integer[][] result = new Integer[matrix_size][matrix_size];
        for (int i=0;i<length;i = i + 2) {
            int column=0;
            for (int j=0;j<length;j=j+2) {
                int total = 0;
                total =total + matrix[i][j];
                total=total +matrix[i][j+1];
                total= total +matrix[i+1][j];
                total=total +matrix[i+1][j+1];

                result[row][column] = total;
                column++;
            }
            row++;
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
