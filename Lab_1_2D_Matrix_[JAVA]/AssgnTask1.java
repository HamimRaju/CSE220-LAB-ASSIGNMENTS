//Assignment Task 01: Row Rotation Policy
class AssgnTask1 {
    
    public static Integer rowRotation(Integer examWeek, String[][] matrix) {

        int row_number = matrix.length;
        int column_number=matrix[0].length;
        int shift = examWeek - 1;

        while (shift>=row_number) {
            shift = shift-row_number;
        }
        for (int s = 0; s <shift; s++) {
            String[] lastRow = new String[column_number];
            for (int j= 0;j<column_number; j++) {
                lastRow[j]= matrix[row_number - 1][j];
            }
            for (int i = row_number-1;i > 0; i--) {
                for (int j = 0; j < column_number; j++) {
                    matrix[i][j]=matrix[i - 1][j];
                }
            }
            for (int j = 0;j<column_number; j++) {
                matrix[0][j]=lastRow[j];
            }
        }
        for (int i = 0; i <row_number; i++) {
            for (int j=0;j<column_number; j++) {
                System.out.print(" | " + matrix[i][j] + "");
            }
            System.out.println(" | ");
        }
        for (int i =0; i<row_number;i++) {
            for (int j = 0; j<column_number;j++) {
                if (matrix[i][j].equals("AA")) {
                    return i+1;
                }
            }
        }
        return -1;
    }



    // DO NOT CHANGE ANY DRIVER CODE BELOW THIS LINE
    public static void main(String[] args) {
        String[][] seatStatus = {
                { "A", "B", "C", "D", "E" },
                { "F", "G", "H", "I", "J" },
                { "K", "L", "M", "N", "O" },
                { "P", "Q", "R", "S", "T" },
                { "U", "V", "W", "X", "Y" },
                { "Z", "AA", "BB", "CC", "DD" }
        };
        System.out.println("Given Seat Status: ");
        Arr.print2D(seatStatus);

        System.out.println("\nExpected Output:");
        System.out.println("| U  | V  | W  | X  | Y  | ");
        System.out.println("| Z  | AA | BB | CC | DD | ");
        System.out.println("| A  | B  | C  | D  | E  | ");
        System.out.println("| F  | G  | H  | I  | J  | ");
        System.out.println("| K  | L  | M  | N  | O  | ");
        System.out.println("| P  | Q  | R  | S  | T  | ");
        System.out.println("Your friend AA will be on row 2");

        System.out.print("\nYour Output:\n");
        Integer examWeek = 3;
        // This following should print modified seat status after rotation and return
        // the current exam week
        Integer rowNumber = rowRotation(examWeek, seatStatus);
        // The following should print Your friend AA will be on row 2
        System.out.println("Your friend AA will be on row " + rowNumber);
    }
}
