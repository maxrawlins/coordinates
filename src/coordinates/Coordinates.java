
package coordinates;
import java.util.*;

public class Coordinates {

  
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        System.out.println(" enter how many rows");
        int rows = input.nextInt();
        System.out.println("enter how many columns");
        int col = input.nextInt();
        char rowc='a';
      
        String[][] board = new String[rows][col];
        
        for (int i=0;i<rows;i++){
            System.out.print(rowc+" ");
            for(int j=0;j<col;j++){
                board[i][j]=rowc+""+j;
                //System.out.print(board[i][j]);
                System.out.print("[ ]");
            }
            rowc++;
            System.out.println("");
        }
        boolean carryOn=true;
        while(carryOn==true){
                System.out.println("\nplease write in your coordinate");
              String myCoordinate = input2.nextLine();
              char myLetter;
              String myNum;
             int myNum2;


             int q=0;
             for (int i=0;i<rows;i++){

                 for(int j=0;j<col;j++){
                     if (board[i][j].equals(myCoordinate)){
                         board[i][j]="x";
                         q=1;
                     }else{

                     }

                 }

             }

             if (q==1){
                 System.out.println("\n\n so far you have picked");
                   for (int i=0;i<rows;i++){           
                 for(int j=0;j<col;j++){
                     if (board[i][j]!="x"){
                         System.out.print(" . ");
                     }else{
                     System.out.print(" X ");
                     }
                 }
                       System.out.println("");            
             }
             }else{
                 System.out.println("sorry this coordinate was not found");
             }
                 System.out.println("\nwould you like to pick another?\nYES\nNO\n");
                 String again=input2.nextLine();
                 if (again.equals("no") || again.equals("No") ||again.equals("NO")){
                     carryOn=false;
                 }


        }
        System.out.println("Ok bye!");
        
    }
    
}
