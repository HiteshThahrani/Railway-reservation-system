/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package railway.reservation.system;
import java.util.Scanner;
import java.io.*;

public abstract class selectionoftrain extends trainlists {
    String d1,d2,d3,d4,d5,d6,a1,a2,a3,a4,a5,a6;
    int p1,p2,p3,p4,p5,p6;
    
    public selectionoftrain(String train1,String train2,String train3,String train4,String train5,String train6,String d1,String d2,String d3,String d4,String d5,String d6,String a1,String a2,String a3,String a4,String a5,String a6,int p1,int p2,int p3,int p4,int p5,int p6){
       super(train1,train2,train3,train4,train5,train6);
       this.d1=d1;
       this.d2=d2;
       this.d3=d3;
       this.d4=d4;
       this.d5=d5;
       this.d6=d6;
       this.a1=a1;
       this.a2=a2;
       this.a3=a3;
       this.a4=a4;
       this.a5=a5;
       this.a6=a6;
       this.p1=p1;
       this.p2=p2;
       this.p3=p3;
       this.p4=p4;
       this.p5=p5;
       this.p6=p6;
    }
    
    
    void setd1(String d1){
        this.d1=d1;
    }
    
    void setd2(String d2){
        this.d2=d2;
    }
    
    void setd3(String d3){
        this.d3=d3;
    }
    
    void setd4(String d4){
        this.d4=d4;
    }
    
    void setd5(String d5){
        this.d5=d5;
    }
    
    void setd6(String d6){
        this.d6=d6;
    }
    
    String getd1(){
        return d1;
    }
    
     String getd2(){
        return d2;
    }
     
    String getd3(){
        return d3;
    }
    
    String getd4(){
        return d4;
    }
    
    String getd5(){
        return d5;
    }
    
    String getd6(){
        return d6;
    }
    
    void seta1(String a1){
        this.a1=a1;
    }
    
    void seta2(String a2){
        this.a2=a2;
    }
    
    void seta3(String a3){
        this.a3=a3;
    }
    
    void seta4(String a4){
        this.a4=a4;
    }
    
    void seta5(String a5){
        this.a5=a5;
    }
    
    void seta6(String a6){
        this.a6=a6;
    }
    
    String geta1(){
        return a1;
    }
    
    String geta2(){
        return a2;
    }
    
    String geta3(){
        return a3;
    }
    
    String geta4(){
        return a4;
    }
    
    String geta5(){
        return a5;
    }
    
    String geta6(){
        return a6;
    }
    
    void setp1(int p1){
        this.p1=p1;
    }
    
    void setp2(int p2){
        this.p2=p2;
    }
    
    void setp3(int p3){
        this.p3=p3;
    }
    
    void setp4(int p4){
        this.p4=p4;
    }
    
    void setp5(int p5){
        this.p5=p5;
    }
    
    void setp6(int p6){
        this.p6=p6;
    }
    
    int getp1(){
        return p1;
    }
    
    int getp2(){
        return p2;
    }
    
    int getp3(){
        return p3;
    }
    
    int getp4(){
        return p4;
    }
    
     int getp5(){
        return p5;
    }
    
    int getp6(){
        return p6;
    }
   abstract void selectionoftrain();
       
   abstract void receipt2();
      
   abstract void cancel2();
    }

