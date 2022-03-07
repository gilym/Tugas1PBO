/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main3;


public class Bus extends MobilTransportasi {
 private boolean mesin, tape, tv, ac;
 private int gerigi = 0;
 private int kecepatan = 0;
 public void nyalakantape(){
 if (mesin==true){
 tape = true;
 System.out.println("Tape menyala");
 }
 }
 public void nyalakantv(){
 if(mesin==true)
     tape = true;
 System.out.println("TV menyala");
 }
 public void nyalakanac(){
 if (mesin==true){
 ac = true;
 System.out.println("AC menyala");
 }
 }
 @Override
 public void nyalakanmesin(){
 mesin = true;
 System.out.println("Mesin menyala");
 }
 @Override
 public void matikanmesin(){
 mesin = false;
 System.out.println("Mesin mati");
 }
 @Override
 public void tambahkangerigi(){
 if (mesin==true)
 gerigi++;
 }
 @Override
 public void turunkangerigi(){
 if(mesin==true)
 gerigi--;
 }
 @Override
 public void tekangas(){
 if(mesin==true)
 kecepatan+=10;
 }
 @Override
 public void tekanrem(){
 if (mesin==true)
 kecepatan-=10;
 }
 @Override
 public void tambahpenumpang() {
 int penumpang = 0;
 if(penumpang<jmlkursi )
 penumpang--;
 }
 public int getkecepatan(){
 return kecepatan;
 }
 public int getgerigi(){
 return gerigi;
 }}

