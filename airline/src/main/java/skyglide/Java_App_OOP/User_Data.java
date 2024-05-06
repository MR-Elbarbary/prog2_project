package skyglide.Java_App_OOP;

import java.util.Scanner;
public class User_Data {

    Scanner input = new Scanner(System.in);
    
    // Attributes for User's Data :

    private String Name ;
    private String Address ;
    private String email ;
    private double PassportNumber ;
    private double Phone ;

    // Constructors According to User's Fields :

    public User_Data() {
    }    

    public User_Data(String name, double passportNumber, double phone) {
        this.Name = name;
        this.PassportNumber = passportNumber;
        this.Phone = phone;
    }

    public User_Data(String name, String address, String email, double passportNumber, double phone) {
        this.Name = name;
        this.Address = address;
        this.email = email;
        this.PassportNumber = passportNumber;
        this.Phone = phone;
    }

    // Setters And Getters For User's Data :

    public String getName() { return Name; }

    public void setName(String name) {Name = name;}

    public String getAddress() {return Address;}

    public void setAddress(String address) {Address = address;}

    public String getEmail() {return email;}

    public void setEmail(String email) {this.email = email;}

    public double getPassportNumber() {return PassportNumber;}

    public void setPassportNumber(double passportNumber) {PassportNumber = passportNumber;}

    public double getPhone() {return Phone;}

    public void setPhone(double phone) {Phone = phone;}

    // --------------------------------------------------------------------------------------------------------
    // Asking User his Data  :

    public void Data_Request () {

        System.out.println("Enter Your Name :");
        String x1 = input.next(); // Passing (x1) Value For DataBase
        setName(x1);

        System.out.println("Enter Your Phone :");
        int x2 = input.nextInt(); // Passing (x2) Value For DataBase
        setPhone(x2);
         
        System.out.println("Enter Your Email :");
        String x3 = input.next(); // Passing (x3) Value For DataBase
        setEmail(x3);

        System.out.println("Enter Your Address :");
        String x4 = input.next(); // Passing (x4) Value For DataBase
        setAddress(x4);

    }

    // Showing Data For User :

    public void Show_Data () {

        System.out.println("Data :");
        System.out.println("________________");
        
        System.out.println("Username :" + getName());
        System.out.println("Phone :" + getPhone());
        System.out.println("Email :" + getEmail());
        System.out.println("Address :" + getAddress());

        System.out.println("________________");
    }    
    
}
