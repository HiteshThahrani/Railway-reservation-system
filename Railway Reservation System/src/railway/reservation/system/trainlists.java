/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package railway.reservation.system;
import java.util.Scanner;
import java.io.*;

public class trainlists {
    String train1,train2,train3,train4,train5,train6;
    
    public trainlists(String train1,String train2,String train3,String train4,String train5,String train6){
        
        this.train1=train1;
        this.train2=train2;
        this.train3=train3;
        this.train4=train4;
        this.train5=train5;
        this.train6=train6;
    }
    
    void settrain1(String train1){
        this.train1=train1;
    }
    
    void settrain2(String train2){
        this.train2=train2;
    }
     
    void settrain3(String train3){
        this.train3=train3;
    }
    
    void settrain4(String train4){
        this.train4=train4;
    }
    
     void settrain5(String train5){
        this.train5=train5;
    }
   
    void settrain6(String train6){
        this.train6=train6;
    }
    
    String gettrain1(){
        return train1;
    }
    
    String gettrain2(){
        return train2;
    }
   
    String gettrain3(){
        return train3;
    }
  
    String gettrain4(){
        return train4;
    }
    
    String gettrain5(){
        return train5;
    }
    
    String gettrain6(){
        return train6;
    }
  
   String name,lastname,cnic,dateoftravel;
   
   
   int bp,dp;
   
    void lists()throws Exception{
        
        Scanner obj=new Scanner(System.in);
        System.out.println("------------------------RAILWAY RESERVATION SYSTEM--------------------");
        System.out.println();
        System.out.println("Welcome to our Railway Reservation System");
        System.out.println();
        
        try{
        System.out.println("Enter 1 for booking of ticket: ");
        System.out.println();
        int x=obj.nextInt();
        if(x==1){
            System.out.println();
        }
        else{
           
            System.out.println("Please enter only 1 for booking of ticket");
            x=obj.nextInt();
        }
        
        }catch(Exception a){
            a.printStackTrace();
            System.out.println(a);
            System.out.println("Please enter only 1 for booking of ticket");
            int x=obj.nextInt();
        }
        
        System.out.println();
        
        try{
        System.out.println("Enter Name: ");
        System.out.println();
        name=obj.next();
        System.out.println();
        System.out.println("Enter Last Name: ");
        System.out.println();
        lastname=obj.next();
        
        } catch(Exception b){
            b.printStackTrace();
            System.out.println(b);
            System.out.println("Please use only english alphabets for entering your name and last name ");
            System.out.println("Enter Name: ");
            System.out.println();
            name=obj.next();
            System.out.println();
            System.out.println("Enter Last Name: ");
            System.out.println();
            lastname=obj.next();
        }
        
        System.out.println();
        
        try{
        System.out.println("Enter CNIC: ");
        System.out.println();
        cnic=obj.next();
        
        if(cnic.matches("[0-9-]+")){
            System.out.println();
        }
        else{
            System.out.println("Please enter CNIC again in numbers format and with underscore ");
             cnic=obj.next();
        }
        
        }catch(Exception c){
            c.printStackTrace();
            System.out.println(c);
            System.out.println("Please enter CNIC again in numbers format and with underscore ");
             cnic=obj.next();
        }
        
        System.out.println();
        
        try{
        System.out.println("Enter Date of Travel(Dont give space while entering date of travel): ");
        System.out.println();
        dateoftravel=obj.next();
        }catch(Exception d){
            d.printStackTrace();
            System.out.println(d);
            System.out.println("Please enter date in numbers format without giving space");
            dateoftravel=obj.next();
        }
        
        System.out.println();
        System.out.println("Select Boarding pont and Destination point ");
        System.out.println();
        System.out.println("1.Karachi");
        System.out.println("2.Lahore");
        System.out.println("3.Rawalpindi");
        System.out.println("4.Hyderabad");
        System.out.println();
        
        try{
        System.out.println("Enter Boarding point (Select number): ");
        System.out.println();
        bp=obj.nextInt();
        if(bp==1||bp==2||bp==3||bp==4){
            System.out.println();
        }
        else{
           System.out.println("Please select number from 1 to 4 for Boarding point"); 
            bp=obj.nextInt();
        }
        }catch(Exception e){
            e.printStackTrace();
            System.out.println();
            System.out.println(e);
            System.out.println("Please select number from 1 to 4 for Boarding point"); 
            bp=obj.nextInt();
        }
        System.out.println();
        
        try{
        System.out.println("Enter Destination point (Select number): ");
        System.out.println();
        dp=obj.nextInt();
        if(dp==1||dp==2||dp==3||dp==4){
            System.out.println();
            
        }
        else{
           System.out.println("Please select number from 1 to 4 for Destination point"); 
           dp=obj.nextInt();
        }
        }catch(Exception f){
            f.printStackTrace();
            System.out.println(f);
            System.out.println();
            System.out.println("Please select number from 1 to 4 for Destination point"); 
            dp=obj.nextInt();
        }
        
        System.out.println();
        if((bp==1&&dp==2) ||(bp==2&&dp==1)){
        System.out.println("Trains Found: ");
        System.out.println();
        System.out.println("Train name: "+train1);
        System.out.println("Departure time: 8am Arrival time: 11 30pm Price: RS: 5000");
        System.out.println();
        System.out.println("Train name: "+train2);
        System.out.println("Departure time: 9am Arrival time: 12 30am Price: RS: 2500");
        System.out.println();
        System.out.println("Train name: "+train3);
        System.out.println("Departure time: 10am Arrival time: 1am Price: RS: 3000");
        System.out.println();
        System.out.println("Train name: "+train4);
        System.out.println("Departure time: 8pm Arrival time: 11 30am Price: RS: 3500");
        System.out.println();
        System.out.println("Train name: "+train5);
        System.out.println("Departure time: 9pm Arrival time: 12 30pm Price: RS: 4000");
        System.out.println();
        System.out.println("Train name: "+train6);
        System.out.println("Departure time: 10pm Arrival time: 1pm Price: RS: 4500");
        System.out.println();
        }
        
        else if((bp==1&&dp==3)||(bp==3&&dp==1)){
        System.out.println("Trains Found: ");
        System.out.println();
        System.out.println("Train name: "+train1);
        System.out.println("Departure time: 8am Arrival time: 11 30pm Price: RS: 5000");
        System.out.println();
        System.out.println("Train name: "+train2);
        System.out.println("Departure time: 9am Arrival time: 12 30am Price: RS: 2500");
        System.out.println();
        System.out.println("Train name: "+train3);
        System.out.println("Departure time: 10am Arrival time: 1am Price: RS: 3000");
        System.out.println();
        System.out.println("Train name: "+train4);
        System.out.println("Departure time: 8pm Arrival time: 11 30am Price: RS: 3500");
        System.out.println();
        System.out.println("Train name: "+train5);
        System.out.println("Departure time: 9pm Arrival time: 12 30pm Price: RS: 4000");
        System.out.println();
        System.out.println("Train name: "+train6);
        System.out.println("Departure time: 10pm Arrival time: 1pm Price: RS: 4500");
        System.out.println();
        }
        
         else if((bp==1&&dp==4)||(bp==4&&dp==1)){
        System.out.println("Trains Found: ");
        System.out.println();
        System.out.println("Train name: "+train1);
        System.out.println("Departure time: 8am Arrival time: 11 30pm Price: RS: 5000");
        System.out.println();
        System.out.println("Train name: "+train2);
        System.out.println("Departure time: 9am Arrival time: 12 30am Price: RS: 2500");
        System.out.println();
        System.out.println("Train name: "+train3);
        System.out.println("Departure time: 10am Arrival time: 1am Price: RS: 3000");
        System.out.println();
        System.out.println("Train name: "+train4);
        System.out.println("Departure time: 8pm Arrival time: 11 30am Price: RS: 3500");
        System.out.println();
        System.out.println("Train name: "+train5);
        System.out.println("Departure time: 9pm Arrival time: 12 30pm Price: RS: 4000");
        System.out.println();
        System.out.println("Train name: "+train6);
        System.out.println("Departure time: 10pm Arrival time: 1pm Price: RS: 4500");
        System.out.println();
        }
        
         else if((bp==2&&dp==3)||(bp==3&&dp==2)){
        System.out.println("Trains Found: ");
        System.out.println();
        System.out.println("Train name: "+train1);
        System.out.println("Departure time: 8am Arrival time: 11 30pm Price: RS: 5000");
        System.out.println();
        System.out.println("Train name: "+train2);
        System.out.println("Departure time: 9am Arrival time: 12 30am Price: RS: 2500");
        System.out.println();
        System.out.println("Train name: "+train3);
        System.out.println("Departure time: 10am Arrival time: 1am Price: RS: 3000");
        System.out.println();
        System.out.println("Train name: "+train4);
        System.out.println("Departure time: 8pm Arrival time: 11 30am Price: RS: 3500");
        System.out.println();
        System.out.println("Train name: "+train5);
        System.out.println("Departure time: 9pm Arrival time: 12 30pm Price: RS: 4000");
        System.out.println();
        System.out.println("Train name: "+train6);
        System.out.println("Departure time: 10pm Arrival time: 1pm Price: RS: 4500");
        System.out.println();
        }
        
         else if((bp==2&&dp==4)||(bp==4&&dp==2)){
        System.out.println("Trains Found: ");
        System.out.println();
        System.out.println("Train name: "+train1);
        System.out.println("Departure time: 8am Arrival time: 11 30pm Price: RS: 5000");
        System.out.println();
        System.out.println("Train name: "+train2);
        System.out.println("Departure time: 9am Arrival time: 12 30am Price: RS: 2500");
        System.out.println();
        System.out.println("Train name: "+train3);
        System.out.println("Departure time: 10am Arrival time: 1am Price: RS: 3000");
        System.out.println();
        System.out.println("Train name: "+train4);
        System.out.println("Departure time: 8pm Arrival time: 11 30am Price: RS: 3500");
        System.out.println();
        System.out.println("Train name: "+train5);
        System.out.println("Departure time: 9pm Arrival time: 12 30pm Price: RS: 4000");
        System.out.println();
        System.out.println("Train name: "+train6);
        System.out.println("Departure time: 10pm Arrival time: 1pm Price: RS: 4500");
        System.out.println();
        }
        
         else if((bp==3&&dp==4)||(bp==4&&dp==3)){
        System.out.println("Trains Found: ");
        System.out.println();
        System.out.println("Train name: "+train1);
        System.out.println("Departure time: 8am Arrival time: 11 30pm Price: RS: 5000");
        System.out.println();
        System.out.println("Train name: "+train2);
        System.out.println("Departure time: 9am Arrival time: 12 30am Price: RS: 2500");
        System.out.println();
        System.out.println("Train name: "+train3);
        System.out.println("Departure time: 10am Arrival time: 1am Price: RS: 3000");
        System.out.println();
        System.out.println("Train name: "+train4);
        System.out.println("Departure time: 8pm Arrival time: 11 30am Price: RS: 3500");
        System.out.println();
        System.out.println("Train name: "+train5);
        System.out.println("Departure time: 9pm Arrival time: 12 30pm Price: RS: 4000");
        System.out.println();
        System.out.println("Train name: "+train6);
        System.out.println("Departure time: 10pm Arrival time: 1pm Price: RS: 4500");
        System.out.println();
        }
        
         else if(bp==dp){
        System.out.println("Boarding point and Destination point cannot be the same. ");
        System.out.println();
         }
        
    } 
   public void receipt1()throws Exception{
       
       System.out.println();
       System.out.println("-------------------TICKET DETAILS------------------------"); 
       System.out.println();
       System.out.println("Name: "+name);
       System.out.println();
       System.out.println("Last Name: "+lastname);
       System.out.println();
       System.out.println("CNIC: "+cnic);
       System.out.println();  
       System.out.println("Date of travel: "+dateoftravel);
       System.out.println();  
       System.out.println("Boarding Point: "+bp); 
       System.out.println();  
       System.out.println("Destination Point: "+dp);
       System.out.println();
       }  
   
   int ct;
   Scanner obj=new Scanner(System.in);
   void cancelticket(){
       
       System.out.println("Tell do you want to cancel the ticket 1.Yes 2.No"); 
       ct=obj.nextInt();
       System.out.println(); 
       if(ct==1){
       System.out.println("Name: "+name);
       System.out.println();
       System.out.println("Last Name: "+lastname);
       System.out.println();
       System.out.println("CNIC: "+cnic);
       System.out.println();  
       System.out.println("Date of travel: "+dateoftravel);
       System.out.println();  
       System.out.println("Boarding Point: "+bp); 
       System.out.println();  
       System.out.println("Destination Point: "+dp);
       System.out.println();   
       }
       else if(ct==2){
       System.out.println("Okay No ticket cancelled! "); 
       System.out.println();  
       }
       
   }
  
}
