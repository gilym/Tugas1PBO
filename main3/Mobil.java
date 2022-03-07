/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main3;

public class Mobil implements InterfaceMobil {
 private int gerigi = 0;
 private boolean mesin = false;
 private int kecepatan=0;
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
 if (mesin)
 gerigi++;
 if(6==gerigi)
 gerigi = 1;
 System.out.println("Gerigi : "+gerigi);
 }
 @Override
 public void turunkangerigi(){
 if (mesin)
 gerigi--;
 if(-1==gerigi)
 gerigi=5;
 }
 @Override
 public void tekangas() {
 if (mesin)
 kecepatan++;
 }
 @Override
 public void tekanrem() {
 if (mesin)
 kecepatan--;
 }
}
