/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ruang;
import Bidang.persegi;
/**
 *
 * @author hp
 */
public class balok extends persegi implements menghitungRuang{
    private double tinggi;

    public balok(double panjang, double lebar, double tinggi) {
        super(panjang, lebar);
        this.tinggi = tinggi;
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    @Override
    public double volume() {
        return super.luas()*tinggi;
    }

    @Override
    public double luasPermukaan() {
        return 2*super.luas() + 2*super.getLebar()*tinggi + 2*super.getPanjang()*tinggi;
    }
    
    
}
