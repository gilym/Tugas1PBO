/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main3;

public class MobilPolisi extends MobilNegara {
 private boolean mesin, tape, tv, ac, sirine, HT;
 private int gerigi = 0;
 private int kecepatan = 0;
 private String jenisSirine;
 public void nyalakantape() {
 if(mesin== true)
 tape = true;
 System.out.println("Tape menyala");
 }
 @Override
 public void nyalakantv() {
 if(mesin== true)
 tv = true;
 System.out.println("TV menyala");
 }
  @Override
 public void nyalakanac() {
 if(mesin== true)
 ac = true;
 System.out.println("AC menyala");
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
 if(mesin== true)
 gerigi++;
 }
  @Override
 public void turunkangerigi(){
 if(mesin== true)
 gerigi--;
 }
  @Override
 public void tekangas(){
 if(mesin== true)
 kecepatan++;
 }
  @Override
 public void tekanrem(){
 if(mesin== true)
 kecepatan--;
 }
  @Override
 public void nyalakansirine() {
 if(mesin== true)
 sirine = true;
 System.out.println("Sirine menyala");
 }
  @Override
 public void matikansirine() {
 if(mesin== true)
 sirine = false;
 System.out.println("Sirine mati");
 }
  @Override
 public void gantisuarasirine(int Jenis) {
 switch(Jenis){
 case 0 : System.out.println("tetot");;break;
 case 1 : System.out.println("dindin");;break;
 }
 }
 public void nyalakanradioht(){
 if(mesin== true)
 HT= true;
 System.out.println("HT menyala");
 }
 public void matikanRadioht(){
 if(mesin== true)
 HT = false;
 System.out.println("HT mati");
 }
  public int getkecepatan(){
 return kecepatan;
 }
 public int getgerigi(){
 return gerigi;
 }
}
