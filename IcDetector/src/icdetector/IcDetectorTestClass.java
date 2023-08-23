
package icdetector;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class IcDetectorTestClass {

    public static void main(String[] args) {
        //Declare variable
        String userName;
        String userIC;
        
        //Take input from user (IC) using Scanner
        Scanner input = new Scanner(System.in);
        
        //Ask user to put fullname
        System.out.print("Enter Your Full Name : ");
        userName = input.nextLine();
        
        //Ask user to put Ic number
        System.out.print("Enter Identity Card Number without (-) : ");
        userIC = input.next();
        
        //Create object of userState and userBirthdate to pass the data
        //userState object
        userState uState1 = new userState(userIC);
        
        //userBirthdate object
        userBirthdate uBirthdate1 = new userBirthdate(userIC);
        
        //userGender object
        userGender uGender1 = new userGender(userIC);
        
        //Display all the output/information of the user
        System.out.println("\n---------Afiq's Ic Information Program---------\n");
        System.out.println("Your Name : "+userName+"\nYour Ic Number --> "+userIC );
        System.out.println("\nGender : "+uGender1.genderSpecify());
        System.out.println("Birth Date : " + uBirthdate1.displayBirthDate());
        System.out.print("State Born : ");
        uState1.stateBorn();
        System.out.println("\n\n---------THANKYOU FOR USING AFIQ's PROGRAM---------");
        
    }
    
}
