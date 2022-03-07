
package main1;


public class Televisi implements interfaceElektronik, interfaceChannelTV {
    private boolean mesin;
 private String merk;
 private boolean listrik;
 public Televisi(String merk){
 this.merk=merk;
 }
 public void setMerk(String merk){
 this.merk=merk;
 }
 public String getMerk(){
 return merk;
 }
 
    @Override
 public boolean on(){
 listrik=true; mesin=true;
 return listrik;
 }
    @Override
 public boolean off(){
 listrik=false; mesin=false;
 return listrik;
 }
    @Override
 public int gantichannel(int c){
 return c;
 }

}
