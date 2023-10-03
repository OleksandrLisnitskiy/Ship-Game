/**
 *
 * This creates a 10 x 10 sized grid for the game. It also labels each axis,
 * x and y respectively and labels each row and column 1 through 10.
 *
 * Public methods:
 * initializeOceanArray
 * printOceanArray
 *
 *
 **/

/**
 *
 * @author Kenneth Joseph
 * 2 Oct, 2023
 */
public class Ocean {

  public static void main(String[] args) {
        char [][] oceanArray = initializeOceanArray (10,10);
        printOceanArray(oceanArray);
   
    }
    public static char[][] initializeOceanArray(int rowLength , int colLength){
        char[][] oceanArray = new char[rowLength][colLength];
        char oceanChar = '~';
        for (int row = 0; row < rowLength; row++){
            for (int col = 0; col< colLength; col++){
                oceanArray[row][col] = oceanChar;
            }//for row
        }//for col
        return oceanArray;
    }//intializeOceanArray
    public static void printOceanArray(char[][] oceanArray){
        System.out.println("  "+ "x →");
        System.out.print("y");
        System.out.println("↓");
        System.out.print(" ");
        for (int col = 1; col <= oceanArray[0].length; col++){
            System.out.print("  " + col);
        }
        System.out.println();
         
        for(int row = 0; row < oceanArray.length; row++){
            System.out.print((row + 1 < 10 ? " " : "") + (row + 1)  );
            for (int col = 0; col < oceanArray.length; col++) {
                System.out.print(" " + oceanArray[row][col]+ " ");
               
            } //for col
                System.out.println();//Move to new line after printing row.
        } //for row
       
    }
        }