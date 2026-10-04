
public class MultiDimensionalArray {

    public static void main(String[] args) {
        // Multidimensional Array in java

        // int [][] marks = new int[3][3]; // 3 row 3 column
        // marks[0][0] = 11;
        // marks[0][1] = 20;
        // marks[0][2] = 39;
        // marks[1][0] = 40;
        // marks[1][1] = 15;
        // marks[1][2] = 60;
        // marks[2][0] = 17;
        // marks[2][1] = 80;
        // marks[2][2] = 98;
        // printing 2D array
        // for(int row = 0; row < 3; row++){
        //     for(int col = 0; col < 3; col++){
        //         System.out.print( marks[row][col] + " ");
        //     }
        //     System.out.println();
        // }
        // for(int row = 0; row < marks.length; row++){
        //     for(int col = 0; col < marks[row].length; col++){
        //         System.out.print( marks[row][col] + " ");
        //     }
        //     System.out.println();
        // }
        // MultiDimensional Array declaration, instantiation and initialization with different length
        int[][] marks = new int[3][];
        // rows =  3 and column is decided
        // int [0][] marks = new [][]; 
        marks[0] = new int[1];
        marks[1] = new int[2];
        marks[2] = new int[3];

        marks[0][0] = 23;
        marks[1][0] = 34;
        marks[1][1] = 45;
        marks[2][0] = 56;
        marks[2][1] = 33;
        marks[2][2] = 67;

        for (int row = 0; row < marks.length; row++) {

            for (int col = 0; col < marks[row].length; col++) {

                System.out.print(marks[row][col] + " ");
            }

            System.out.println();
        }

        /*
        []
        [] []
        [] [] []
        
         */
        System.out.println("Enhanced for loop");
        // 2D matrix
        int[][] arr = {{1, 2, 3},
        {4, 5, 6},
        {7, 8, 9}
        };

        for (int row = 0; row < arr.length; row++) {

            for (int col = 0; col < arr[row].length; col++) {

                System.out.print(arr[row][col] + " ");
            }

            System.out.println();
        }

    }
}
