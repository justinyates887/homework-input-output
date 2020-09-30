import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

public class RecipieProgram{
    static Scanner in = new Scanner(System.in);
    
    double batches;
    double tspBakingSoda;
    double tspBakingPowder;
    double cupsButter;
    double cupsSugar;
    double amountEggs;
    
    public RecipieProgram(){
    }
    
    public static void main(String[] args){
        RecipieProgram newRecipie = new RecipieProgram();
        
        System.out.println("Cookie Recipie Program");
        
        newRecipie.numberOfBatches();
        newRecipie.math();
        newRecipie.displayRecipie();

    }
    
    public double numberOfBatches(){
        System.out.println("How many batches of cookies would you like to make?");
        batches = in.nextInt();
        return batches;
    }
    
    public void math(){
        tspBakingSoda = 1.0 * batches;
        tspBakingPowder = 0.5 * batches;
        cupsButter = 1.0 * batches;
        cupsSugar = 1.5 * batches;
        amountEggs = 1.0 * batches;
    }
    
    public void displayRecipie(){
        System.out.println("Baking soda (tsps): " + tspBakingSoda);
        System.out.println("Baking powder (tsps): " + tspBakingPowder);
        System.out.println("Butter (cups): " + cupsButter);
        System.out.println("Sugar (cups): " + cupsSugar);
        System.out.println("Eggs: " + amountEggs);
    }
}
