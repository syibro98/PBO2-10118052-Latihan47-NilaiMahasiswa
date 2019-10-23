/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118052.latihan47.nilaimahasiswa;

/**
 *
 * @author
 * NAMA     : Bagus Syibro Malisi
 * KELAS    : IF-2
 * NIM      : 10118052
 * Deskripsi Program : Membuat program berbasis object untuk menghitung nilai
 * akhir mahasiswa
 */
public class NilaiAkhir {
    private double quiz, uts, uas, na;
    
    public NilaiAkhir(double quiz, double uts, double uas) {
        this.quiz = quiz;
        this.uts = uts;
        this.uas = uas;
    }
    
    private double hitungNilaiAkhir() {
       return (quiz*0.2) + (uts*0.3) + (uas*0.5);
    }
        
    private String getIndex(double na) {
        if (na >= 80 && na <= 100) return "A";
        else if (na >= 68 && na < 80) return "B";
        else if (na >= 56 && na < 68) return "C";
        else if (na >= 45 && na < 56) return "D";
        else return "B";
    }
    
    private String getKeterangan(String index) {
        String keterangan;
        switch(index) {
            case "A": keterangan = "Sangat Baik"; break;
            case "B": keterangan = "Baik"; break;
            case "C": keterangan = "Cukup"; break;
            case "D": keterangan = "Kurang"; break;
            default: keterangan = "Sangat Kurang"; break;
        }
        return keterangan;
    }
    
    public void tampilNilai() {
        na = hitungNilaiAkhir();
        
        System.out.println("QUIZ\t\t= " + quiz);
        System.out.println("UTS\t\t= " + uts);
        System.out.println("UAS\t\t= " + uas);
        
        System.out.println("\nNilai Akhir\t= " + na);
        
        System.out.println("\nIndex = " + getIndex(na));
        System.out.println("Keterangan = " + getKeterangan(getIndex(na)));
        System.out.println("");
    }
    
}
