package skyglide.Java_App_OOP;

import java.util.Scanner;

public class Java_OOP {
public static void main(String[] args) {

    /*

    Special main method for Taking From User's Data or Check it :
    OBJECTS : NEED FOR AHCIEVING (METHODS - DATA - OTHER CLASSES)
    GUI : THIS CODES MUST APPEAR IN BUTTON (Profile ==> Homepage ):
    DATABASE : NEEDE AT LEAST EACH VARIABLE IS INSERTED INTO TABLE BY MOHAMED

    */

   Scanner input = new Scanner(System.in);

   User_Data C = new User_Data();

   System.out.println("Welcome To Our Airlne System !");

   try {

    System.out.println("Do You Want To Register for Only 1 profile or more ? \n (1==>Only one Profile) (Any NO.==>More Profiles)");
    int y = input.nextInt();

    if ( y == 1 ) {
        System.out.println("Do You Want To Register with us ? (1=>Yes) (2=>No)");
        int x = input.nextInt();

    switch (x) {
        case 1:

        C.Data_Request(); // Method ==> Class : User_Data 
        
        break;
    
        default:
            break;
    }

    System.out.println("Do You Want To Check Your Data with us ? (1=>Yes) (2=>No)");
    int x1 = input.nextInt();

    
    switch (x1) {
        case 1:

        C.Show_Data(); // Method ==> Class : User_Data 
        
        break;
    
        default:
            break;
    }
        
    } else {
        System.out.println("Enter How Many Accounts ?");
        int y1 = input.nextInt();
        
        User_Data c1 [] = new User_Data[y1];

        for (int i = 0; i < c1.length; i++) {

        System.out.println("Enter Your Name : " + "for no :" + (i+1) );
        String z1 = input.next(); // Passing (z1) Value For DataBase
        c1[i] = new User_Data();
        c1[i].setName(z1);

        System.out.println("Enter Your Phone : " + "for no :" + (i+1) );
        Double z2 = input.nextDouble(); // Passing (z2) Value For DataBase
        c1[i] = new User_Data();
        c1[i].setPhone(z2);

        System.out.println("Enter Your Email : " + "for no :" + (i+1) );
        String z3 = input.next(); // Passing (z3) Value For DataBase
        c1[i] = new User_Data();
        c1[i].setEmail(z3);

        System.out.println("Enter Your Address : " + "for no :" + (i+1) );
        String z4 = input.next(); // Passing (z4) Value For DataBase
        c1[i] = new User_Data();
        c1[i].setAddress(z4);

        System.out.println("______________________________");

            
        }

    }
 
   } catch (Exception e) {

    System.out.println("Something went wrong !");
   }
    finally {input.close();}    
    }   
}