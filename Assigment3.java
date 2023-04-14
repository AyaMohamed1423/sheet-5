/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package assigment.pkg3;
import java.util.Scanner;
 
/**
 *
 * @author ahmed
 */
public class Assigment3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner input=new Scanner(System.in);
        System.out.println("Enter your balance");
      int x=input.nextInt();
        System.out.println("Enter your id");
        int y=input.nextInt();
      
        System.out.println("Enter 1 you want to withdraw");
        System.out.println("Enter 2 you want to deposite");
        System.out.println("Enter 3 you want to exit");
        
        int n=input.nextInt();
        
        switch(n){
            case 1:
                System.out.println("How much you want to wihhdraw");
                int z=input.nextInt();
                Account A1=new Account(y,x);
                 System.out.println("Date created : " +A1.getdatecreated());
        System.out.println("Account Id :"+ A1.getid());
        System.out.println("Balance :"+A1.getbalance());
        System.out.println("Balance after withdraw of :"+A1.withdraw(z));
        break;
        
                
                 
            case 2:
                System.out.println("How much you want to deposite");
                int w=input.nextInt();
                 Account A2=new Account(y,x);
                 System.out.println("Date created : " +A2.getdatecreated());
        System.out.println("Account Id :"+ A2.getid());
        System.out.println("Balance :"+A2.getbalance());
        System.out.println("Balance after deposite of :"+A2.deposite(w));
       break;
            case 3:
                System.out.println("Exit");
                
        
        }
        
   
       
       // System.out.println("Date created : " +A1.getdatecreated());
       // System.out.println("Account Id :"+ A1.getid());
        //System.out.println("Balance :"+A1.getbalance());
        //System.out.println("Balance after deposite of :"+A1.deposite(w));
        //System.out.println("Balance after withdraw of :"+A1.withdraw(z));//
        
    }
        
}    
    

        // TODO code application logic here
    
    

