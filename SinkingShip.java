/**
 *
 * */
/**
 *
 * @author kmf.joseph
 */
import java.util.Scanner;
import java.util.*;

public class SinkingShip {
   
    public static void main(String[] args) {
        printWelcomeBoard();
        Ocean ocean = new Ocean();
        RandomPositionOrientation inst = new RandomPositionOrientation();
        int expectedX = inst.getRow();
        int expectedY = inst.getColumn();
        int orientation = inst.getOrientation();
        char[][] oceanArray = ocean.initializeOceanArray(10, 10);
        ocean.printOceanArray(oceanArray);
        System.out.println(inst.toString());
       
        int shotCount = 0;
        ;
        int sCount = 0;
        while(sCount <= 3){
        int[] userVar = getUserInput();
        if(userVar.length < 2){
            continue;
        }
       
   
        Point instance = new Point(userVar[0], userVar[1]);
        int userRow = instance.getRow();
        int userColumn = instance.getColumn();
       
     
       
       
        if(checkUserInput(userColumn, userRow, expectedX, expectedY, orientation, ocean
                , oceanArray)){
            sCount++;
           
           
        }
       
   
        ocean.printOceanArray(oceanArray);
       
       
       
       
       
     
        }

    }

    //Prints out the welcome Board for the game.
    public static void printWelcomeBoard() {
        System.out.println("====================================");
        System.out.println("     " + "Welcome to Sinking Ship!");
        System.out.println("====================================");
        System.out.println();
    }//PrintWelcomeBoard

    public static boolean checkUserInput(int userX, int userY, int expectedX,
            int expectedY, int orientation, Ocean ocean, char[][] oceanArray) {
       
        switch (orientation) {
           
            case 0:
                if ((userX == expectedX || expectedX - 1 == userX  || expectedX
                        + 1 == userX) && userY == expectedY) {
                     
                    ocean.setOceanChar(oceanArray, userX, userY, 'S');
                    return true;
                   
                } else {
                    ocean.setOceanChar(oceanArray, userX, userY, 'X');
                    return false;
                }
               

            case 1:
                if ((userY == expectedY || expectedY - 1 == userY  || expectedY
                        + 1 == userY) && userX == expectedX) {                    
                    ocean.setOceanChar(oceanArray, userX, userY, 'S');
                    return true;
                } else {
                    ocean.setOceanChar(oceanArray, userX, userY, 'X');
                    return false;
                }

               

            case 2:
                if (userX == expectedX  && userY == expectedY) {
                   
                    ocean.setOceanChar(oceanArray, userX, userY, 'S');
                    return true;
                }
                else if(userX == expectedX - 1 && userY == expectedY - 1 ){
                    ocean.setOceanChar(oceanArray, userX, userY, 'S');
                    return true;
                }
                 else if(userX == expectedX + 1 && userY == expectedY +1 ){
                    ocean.setOceanChar(oceanArray, userX, userY, 'S');
                    return true;
                }
                else {
                    ocean.setOceanChar(oceanArray, userX, userY, 'X');
                    return false;
                }
               
            case 3:
                if (userX == expectedX && userY == expectedY) {
                    ocean.setOceanChar(oceanArray, userX, userY, 'S');
                    return true;
                }
                else if(userX == expectedX + 1 && userY == expectedY - 1 ){
                    ocean.setOceanChar(oceanArray, userX, userY, 'S');
                    return true;
                }
                else if(userX == expectedX - 1 && userY == expectedY + 1 ){
                    ocean.setOceanChar(oceanArray, userX, userY, 'S');
                    return true;
                }
                else {
                    ocean.setOceanChar(oceanArray, userX, userY, 'X');
                    return false;
                }

               

        }
        return true;
    }

   


    //Takes in user input as a string nad converts to integers.
    public static int[] getUserInput() {
        int[] intCoord;
        intCoord = new int[2];
        while (true) {
            System.out.print("Please enter and x and y coordinates of shot:");

            Scanner scanner = new Scanner(System.in);

            String userInput = scanner.nextLine();
            String[] coordinates = userInput.split(" ");

            for (int i = 0; i < 2; i++) {

                if (Character.isDigit(coordinates[i].charAt(0))) {
                       
                    int temp = Integer.parseInt(coordinates[i]);
                       
                  if(temp <= 10 && temp > 0){
                    intCoord[i] = temp;
                }
                  else{
                      System.out.println("Please enter an integer within "
                              + "the valid range.");
                  }
                } else{
                    System.out.println("Enter a valid integer only!");
                   
                }
               
               
//                try {
//                    intCoord[0] = Integer.parseInt(coordinates[0]);
//                    intCoord[1] = Integer.parseInt(coordinates[1]);
//            
//                } catch (NumberFormatException e) {
//                    System.out.println("Enter only integers please!");
//                }
                       

            }//for
            break;
        }//while
       
        return intCoord;

    }//getUserInput
}

//Finish integer validation
//write while loop for game
//Check if Ocean instance works
//Shot counter
//Debug 
