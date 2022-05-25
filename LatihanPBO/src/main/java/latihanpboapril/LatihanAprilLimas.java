/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package latihanpboapril;
import bangun2D.Bangun2D;
import bangun2D.Persegi;
import bangun2D.PersegiPanjang;
import bangun2D.Segitiga;
import bangun2D.SegitigaSiku;
import bangun2D.SegitigaSamaKaki;
import bangun2D.SegitigaSamaSisi;
import bangun2D.Lingkaran;
import bangun3D.Limas;

/**
 *
 * @author Lenovo
 */
public class LatihanAprilLimas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Bangun2D persegi = new Persegi(4);
        Bangun2D pp = new PersegiPanjang(4, 8);
        Bangun2D lingkaran = new Lingkaran(10);
        Bangun2D siku = new SegitigaSiku(3, 4);
        Bangun2D kaki = new SegitigaSamaKaki(3, 4);
        Limas limas1 = new Limas(persegi, 5);
        Limas limas2 = new Limas(pp, 5);
        Limas limas3 = new Limas(lingkaran,5);
        Limas limas4 = new Limas(siku,5);
        Limas limas5 = new Limas(kaki,5);
        System.out.println(limas1);
        System.out.println(limas1.getVolume());
        System.out.println(limas1.getDetailAlas());
        System.out.println("-------------------------");
        System.out.println(limas2);
        System.out.println(limas2.getVolume());
        System.out.println(limas2.getDetailAlas());
        System.out.println("-------------------------");
        System.out.println(limas3);
        System.out.println(limas3.getVolume());
        System.out.println(limas3.getDetailAlas());
        System.out.println("-------------------------");
        System.out.println(limas4);
        System.out.println(limas4.getVolume());
        System.out.println(limas4.getDetailAlas());
        System.out.println("-------------------------");
        System.out.println(limas5);
        System.out.println(limas5.getVolume());
        System.out.println(limas5.getDetailAlas());
        System.out.println("-------------------------");
    }
    
}
