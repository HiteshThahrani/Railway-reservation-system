/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package railway.reservation.system;
import java.util.Scanner;
import java.io.*;
public class main {
    public static void main(String[] args) {
        trainlists e1=new trainlists("Green Line","Shalimar","Tezgam","Awam Express","Akbar Express","Khyber Mail");
        selectionoftrain s1=new viewdetailsandreceipt("Green Line","Shalimar","Tezgam","Awam Express","Akbar Express","Khyber Mail","8am","9am","10am","8pm","9pm","10pm","11 30pm","12 30am","1am","11 30am","12 30pm","1pm",5000,2500,3000,3500,4000,4500);
        booking b1=new booking();
        paymentmethod p1=new paymentmethod();
        viewdetailsandreceipt v1=new viewdetailsandreceipt("Green Line","Shalimar","Tezgam","Awam Express","Akbar Express","Khyber Mail","8am","9am","10am","8pm","9pm","10pm","11 30pm","12 30am","1am","11 30am","12 30pm","1pm",5000,2500,3000,3500,4000,4500);
        reivewandratings r1=new reivewandratings();
        
        Scanner obj=new Scanner(System.in);
        
        try{
        e1.lists();
        } catch(Exception e){
            System.out.println(e);
            e.printStackTrace();
            System.out.println("Please write correct information while giving details! ");
        }
        
        v1.selectionoftrain();
        
        try{
        p1.setVisible(true);
        }catch(Exception e){
            e.printStackTrace();
            System.out.println("Please write correct information while giving details! ");
        }
        
        try{
        b1.setVisible(true); 
        }catch(Exception e){
            e.printStackTrace();
            System.out.println("Please write correct information while giving details! ");
        }
        
        try{
        e1.receipt1();
        } catch(Exception e){
            e.printStackTrace();
            System.out.println("Please write correct information while giving details! ");
        }
        
        v1.receipt2();
       
        try{
        
        e1.cancelticket();
        }catch(Exception e){
            e.printStackTrace();
            System.out.println("Please write correct information while giving details! ");
        }
        
        v1.cancel2();
        
       try{
        r1.setVisible(true);
        } catch(Exception e){
            e.printStackTrace();
            System.out.println("Please write correct information while giving details! ");
        }
        
    }
}
