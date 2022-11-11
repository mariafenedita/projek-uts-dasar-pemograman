/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.projekbmi;

/**
 *
 * @author HP
 */import java.util.Scanner;
public class ProjekBmi {
    
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Berat Badan (kg) = ");
       double bb = sc.nextDouble();
       System.out.println("Tinggi Badan (cm) = ");
       double tb = sc.nextDouble();
       System.out.println("Jenis Kelamin (L/P) = ");
       String jk = sc.next();
       tb /= 100;
       double bmi = bb/(tb*tb);
       //Laki Laki
       double ob = 27;
       double gem = 23;
       double norm = 17;
       //Perempuan
       if(jk.equals("P")){
           gem = 25;
           norm = 18;
       }
        System.out.println("BMI = " + bmi);
       if(bmi>ob){
           System.out.println("Obesitas");
        } else if(bmi>gem){
            System.out.println("Kegemukan");
        } else if(bmi>norm){
            System.out.println("Normal");
        } else {
            System.out.println("Kurus");
            
        }
       
       

       }
}
