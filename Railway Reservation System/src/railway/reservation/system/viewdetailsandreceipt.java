/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package railway.reservation.system;
import java.util.Scanner;
import java.io.*;
public class viewdetailsandreceipt extends selectionoftrain{
    int r;
     viewdetailsandreceipt(String train1,String train2,String train3,String train4,String train5,String train6,String d1,String d2,String d3,String d4,String d5,String d6,String a1,String a2,String a3,String a4,String a5,String a6,int p1,int p2,int p3,int p4,int p5,int p6){
     super(train1,train2,train3, train4, train5, train6, d1, d2, d3, d4, d5, d6, a1, a2, a3, a4, a5, a6, p1, p2, p3, p4, p5, p6);
     
     }
     
     int y,quantity;
     
      void selectionoftrain(){
        Scanner obj=new Scanner(System.in);
        System.out.println("SELECTION OF TRAIN");
        System.out.println();
        System.out.println("Select the train after viewing the list of train according to your boarding point and destination point.");
        System.out.println();
        System.out.println("1.Green Line");
        System.out.println("2.Shalimar");
        System.out.println("3.Tezgam");
        System.out.println("4.Awam Express"); 
        System.out.println("5.Akbar Express");
        System.out.println("6.Khyber mail");
        System.out.println();
        
        try{
        System.out.println("Select train (Select number): ");
        System.out.println();
        y=obj.nextInt();
        
        if(y==1||y==2||y==3||y==4||y==5||y==6){
            System.out.println();
        }
        else{
          System.out.println("Please select train number from 1 to 6 ");
          y=obj.nextInt();
        }
        }catch(Exception g){
            g.printStackTrace();
            System.out.println(g);
            System.out.println("Please select train number from 1 to 6 ");
            y=obj.nextInt();
        }
        
        System.out.println();
        
        try{
        System.out.println("Enter Quantity of tickets: ");
        System.out.println();
        quantity=obj.nextInt();
        } catch(Exception h){
            h.printStackTrace();
            System.out.println(h);
            System.out.println("Please enter quantity of tickets in only numbers");
            System.out.println();
        }
        
        
        System.out.println();
        
        if(y==1){
        System.out.println("Train name: "+super.train1);
        System.out.println();
        System.out.println("Departure time: "+d1);
        System.out.println();
        System.out.println("Arrival time: "+a1);
        System.out.println();
        System.out.println("Price: "+p1*quantity);
        System.out.println();
        }
        
        else if(y==2){
        System.out.println("Train name: "+super.train2);
        System.out.println();
        System.out.println("Departure time: "+d2);
        System.out.println();
        System.out.println("Arrival time: "+a2);
        System.out.println();
        System.out.println("Price: "+p2*quantity);
        System.out.println();
        }
        
        else if(y==3){
        System.out.println("Train name: "+super.train3);
        System.out.println();
        System.out.println("Departure time: "+d3);
        System.out.println();
        System.out.println("Arrival time: "+a3);
        System.out.println();
        System.out.println("Price: "+p3*quantity);
        System.out.println();
        }
        
        else if(y==4){
        System.out.println("Train name: "+super.train4);
        System.out.println();
        System.out.println("Departure time: "+d4);
        System.out.println();
        System.out.println("Arrival time: "+a4);
        System.out.println();
        System.out.println("Price: "+p4*quantity);
        System.out.println();
        }
        
        else if(y==5){
        System.out.println("Train name: "+super.train5);
        System.out.println();
        System.out.println("Departure time: "+d5);
        System.out.println();
        System.out.println("Arrival time: "+a5);
        System.out.println();
        System.out.println("Price: "+p5*quantity);
        System.out.println();
        }
        
        else if(y==6){
        System.out.println("Train name: "+super.train6);
        System.out.println();
        System.out.println("Departure time: "+d6);
        System.out.println();
        System.out.println("Arrival time: "+a6);
        System.out.println();
        System.out.println("Price: "+p6*quantity);
        System.out.println();
        }
        
        else{
            System.out.println("You entered the wrong number of choice ");
        }
       
    }
    
    void receipt2(){
      if(y==1){
       System.out.println("Train name: "+super.train1);
       System.out.println();
       System.out.println("Departure time: "+d1);
       System.out.println();
       System.out.println("Arrival time: "+a1);
       System.out.println();
       System.out.println("Price: "+p1*quantity);
       System.out.println();
        }
        
        else if(y==2){
       System.out.println("Train name: "+super.train2);
       System.out.println();
       System.out.println("Departure time: "+d2);
       System.out.println();
       System.out.println("Arrival time: "+a2);
       System.out.println();
       System.out.println("Price: "+p2*quantity);
       System.out.println();
        }
      else if(y==3){
        System.out.println("Train name: "+super.train3);
        System.out.println();
        System.out.println("Departure time: "+d3);
        System.out.println();
        System.out.println("Arrival time: "+a3);
        System.out.println();
        System.out.println("Price: "+p3*quantity);
        System.out.println();
        }
        
        else if(y==4){
        System.out.println("Train name: "+super.train4);
        System.out.println();
        System.out.println("Departure time: "+d4);
        System.out.println();
        System.out.println("Arrival time: "+a4);
        System.out.println();
        System.out.println("Price: "+p4*quantity);
        System.out.println();
        }
      else if(y==5){
        System.out.println("Train name: "+super.train5);
        System.out.println();
        System.out.println("Departure time: "+d5);
        System.out.println();
        System.out.println("Arrival time: "+a5);
        System.out.println();
        System.out.println("Price: "+p5*quantity);
        System.out.println();
        }
        
        else if(y==6){
        System.out.println("Train name: "+super.train6);
        System.out.println();
        System.out.println("Departure time: "+d6);
        System.out.println();
        System.out.println("Arrival time: "+a6);
        System.out.println();
        System.out.println("Price: "+p6*quantity);
        System.out.println();
        }}
    
    int n;
    
    
    void cancel2(){
       Scanner obj=new Scanner(System.in);
       System.out.println("Last  asking are you sure you want to cancel the ticket if yes then press 1 for Yes otherwise 2 for No "); 
       System.out.println(); 
       n=obj.nextInt();
       System.out.println(); 
       if(n==1){
          if(y==1){
       System.out.println("Train name: "+super.train1);
       System.out.println();
       System.out.println("Departure time: "+d1);
       System.out.println();
       System.out.println("Arrival time: "+a1);
       System.out.println();
       System.out.println("Price: "+p1*quantity);
       System.out.println();
        }
        
        else if(y==2){
       System.out.println("Train name: "+super.train2);
       System.out.println();
       System.out.println("Departure time: "+d2);
       System.out.println();
       System.out.println("Arrival time: "+a2);
       System.out.println();
       System.out.println("Price: "+p2*quantity);
       System.out.println();
        }
      else if(y==3){
        System.out.println("Train name: "+super.train3);
        System.out.println();
        System.out.println("Departure time: "+d3);
        System.out.println();
        System.out.println("Arrival time: "+a3);
        System.out.println();
        System.out.println("Price: "+p3*quantity);
        System.out.println();
        }
        
        else if(y==4){
        System.out.println("Train name: "+super.train4);
        System.out.println();
        System.out.println("Departure time: "+d4);
        System.out.println();
        System.out.println("Arrival time: "+a4);
        System.out.println();
        System.out.println("Price: "+p4*quantity);
        System.out.println();
        }
      else if(y==5){
        System.out.println("Train name: "+super.train5);
        System.out.println();
        System.out.println("Departure time: "+d5);
        System.out.println();
        System.out.println("Arrival time: "+a5);
        System.out.println();
        System.out.println("Price: "+p5*quantity);
        System.out.println();
        }
        
        else if(y==6){
        System.out.println("Train name: "+super.train6);
        System.out.println();
        System.out.println("Departure time: "+d6);
        System.out.println();
        System.out.println("Arrival time: "+a6);
        System.out.println();
        System.out.println("Price: "+p6*quantity);
        System.out.println();
        }
        System.out.println("Ticket cancelled! ");}
       else if(n==2){
       System.out.println("Okay No ticket cancelled! "); 
       }
       }
}
