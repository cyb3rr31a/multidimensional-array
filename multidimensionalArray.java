public class multidimensionalArray {
    public static void main(String[] args){
        int rows = 3;
        int columns = 3;

        int myArray[][] = new int[rows][columns];
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                myArray[i][j] = i + j;
            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(myArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}