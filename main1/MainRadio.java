
package main1;


import java.util.Scanner;
public class MainRadio{
 public static void main(String[] args) {
 Scanner input=new Scanner(System.in);
 Radio r=new Radio();
 Televisi t =new Televisi("SHARP");
 System.out.print("Apakah anda ingin menyalakanRadio : ");
 String a=input.next();
 if(a.equalsIgnoreCase("ya")){
 r.on();
 if(r.on()==true){
 System.out.println("Radio sudah nyala");
 } else {
 System.out.println("Radio sudah mati");
 }
 System.out.print("Mau masuk channel nomorberapa : ");
 int b=input.nextInt();
 System.out.println("Masuk ke channel"+r.gantichannel(b));
 System.out.print("Volume 0, ingin dinaikkan menjadi berapa : ");
 int c=input.nextInt();
 System.out.println("Volume menjadi"+r.perbesarvolume(c));
 System.out.print("Ingin dikecilkan : ");
 String d=input.next();
 if(d.equalsIgnoreCase("ya")){
 System.out.print("Ingin dikecilkan berapa :");
 int e=input.nextInt();
 System.out.println("Volume menjadi"+r.perkecilvolume(e));
 System.out.println("Selamat menikmati radio");
 } else {
 System.out.println("Selamat menikmatiradio");
 }
 }else if(a.equalsIgnoreCase("tidak")){
 r.off();
 if(r.off()==true){
 System.out.println("Radio sudah nyala");
 } 
else {
System.out.println("Radio sudah mati");
 }
 } else {
 System.out.println("Pilihannya ya atau tidak");
 }
}
}