/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main1;

/**
 *
 * @author gilym
 */
public class Radio implements interfaceChannelRadio,interfaceElektronik {
    private boolean mesin;
 private int volume;
    @Override
 public boolean on(){
 mesin=true;
 return mesin;
 }
    @Override
    public boolean off(){
    mesin=false;
 return mesin;
 }
    @Override
 public int gantichannel(int c){
 return c;
 }
 public int perbesarvolume(int tambah){
 volume+=tambah;
 return volume;
 }
 public int perkecilvolume(int kurang){
 volume-=kurang;
 return volume;
 }
}

