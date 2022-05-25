/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bangun3D;
import bangun2D.Bangun2D;
import bangun2D.Persegi;
import bangun2D.PersegiPanjang;
import bangun2D.Segitiga;
import bangun2D.SegitigaSiku;
import bangun2D.SegitigaSamaKaki;
import bangun2D.SegitigaSamaSisi;
import bangun2D.Lingkaran;

/**
 *
 * @author Lenovo
 */
public class Limas {
    private Bangun2D alas;
    private double tinggi;

    public Limas(Bangun2D alas, double tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
        
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }
    
    public String getVolume(){
        if (alas instanceof Persegi){
            return "Volume Limas: " + alas.getLuas() * tinggi * 1/3;
        }
        else if(alas instanceof PersegiPanjang){
            return "Volume Limas: " + alas.getLuas() * tinggi * 1/3;
        }
        else if(alas instanceof Lingkaran){
            return "Volume Limas: " + alas.getLuas() * tinggi * 1/3;
        } 
        else if(alas instanceof SegitigaSiku){
            return "Volume Limas: " + alas.getLuas() * tinggi * 1/3;
        }
        else if(alas instanceof SegitigaSamaSisi){
            return "Volume Limas: " + alas.getLuas() * tinggi * 1/3;
        }
        else if(alas instanceof SegitigaSamaSisi){
            return "Volume Limas: " + alas.getLuas() * tinggi * 1/3;
        }
        else if(alas instanceof Segitiga){
            return "Volume Limas: " + alas.getLuas() * tinggi * 1/3;
        }
        return null;
    }
    
    public String getDetailAlas(){
        if (alas instanceof Persegi){
            return "Alas: Persegi";
        }
        else if (alas instanceof PersegiPanjang){
            return "Alas: Persegi Panjang";
        }
        else if (alas instanceof Lingkaran){
            return "Alas: Lingkaran";
        }
        else if (alas instanceof SegitigaSiku){
            return "Alas: Segitiga Siku-Siku";
        }
        else if (alas instanceof SegitigaSamaSisi){
            return "Alas: Segitiga Sama Sisi";
        }
        else if (alas instanceof SegitigaSamaKaki){
            return "Alas: Segitiga Sama Kaki";
        }
        else{
            return "Alas: Segitiga";
        }
    }

    @Override
    public String toString() {
        return "Informasi Limas:" +"\n"+ 
                "alas = " + alas + ", tinggi = " + tinggi;
    }

    
    
    
   
}
