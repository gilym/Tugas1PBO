/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main3;

/**
 *
 * @author gilym
 */
public class MainKendaraan {
 public static void main(String[] args) {
 MobilPribadi a = new MobilPribadi();
 Bus b = new Bus();
 Ambulance c = new Ambulance();
 MobilPolisi d = new MobilPolisi();

 System.out.println("---Mobil Pribadi---");
 a.nyalakanmesin();
 a.nyalakanac();
 a.nyalakantape();
 a.nyalakantv();
 a.tambahkangerigi();
 a.tambahkangerigi();
 a.tekangas();
 System.out.println("Gerigi mobil pribadi :"+a.getgerigi());
 System.out.println("kecepatan mobil pribadi :"+a.getkecepatan());

 System.out.println();

 System.out.println("---Bus---");
 b.nyalakanmesin();
 b.nyalakanac();
 b.nyalakantape();
 b.nyalakantv();
 b.tambahkangerigi();
 b.tekangas();
 System.out.println("Gerigi mobil bus :"+b.getgerigi());
 System.out.println("kecepatan mobil bus :"+b.getkecepatan());

 System.out.println();

 System.out.println("---Ambulance---");
c.nyalakanmesin();
 c.nyalakanac();
 c.nyalakantape();
 c.nyalakantv();
 c.tambahkangerigi();
 c.tambahkangerigi();
 c.tambahkangerigi();
 c.tekangas();
 c.tekangas();
 c.tekangas();
 c.gantisuarasirine(0);
 System.out.println("Gerigi mobil ambulance :"+c.getgerigi());
 System.out.println("kecepatan mobil ambulance :"+c.getkecepatan());

 System.out.println();

 System.out.println("---Mobil Polisi---");
 d.nyalakanmesin();
 d.nyalakanac();
 d.nyalakantape();
 d.nyalakantv();
 d.tambahkangerigi();
 d.tambahkangerigi();
 d.tekangas();
 d.tekangas();
 d.gantisuarasirine(1);
 d.nyalakanradioht();
 System.out.println("Gerigi mobil polisi :"+d.getgerigi());
 System.out.println("kecepatan mobil pribadi :"+d.getkecepatan());
 }
}