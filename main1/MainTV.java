/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main1;

import java.util.Scanner;
public class MainTV {
 public static void main(String[] args) {
 Scanner input=new Scanner(System.in);
 Televisi t=new Televisi("SHARP");
 System.out.println("---Selamat Datang di TV"+t.getMerk()+"---");
 System.out.print("Apakah anda ingin menyalakan TV :");
 String a=input.next();
 if(a.equalsIgnoreCase("ya")){
 t.on();
 if(t.on()==true){
 System.out.println("TV sudah nyala");
 } else {
 System.out.println("TV sudah mati");
 }
 System.out.print("Mau masuk channel berapa :");
 int b=input.nextInt();
 System.out.println("Masuk ke channel"+t.gantichannel(b));
 System.out.println("Selamat menonton");
 } else if(a.equalsIgnoreCase("tidak")){
 t.off();
 if(t.off()==true){
 System.out.println("TV sudah nyala");
 } else{
 System.out.println("TV sudah mati");
 }
 } else {
 System.out.println("Pilihannya ya atau tidak");
 }
 }
}
