/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgif.pkg01.pkg10118043.latihan26.waktusaatini;
import java.util.*;

/**
 *
 * @author user
 */
public class Main {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int detik, menit, jam, hari, bulan, tahun,tanggal;
    GregorianCalendar date = new GregorianCalendar();
    String namabulan[] = {"Januari", "Februari", "Maret", "April", "Mei", "Juni", "Juli", "Agustus", "September", "Oktober", "November", "Desember"};
    String namahari[] = {"Senin", "Selasa", "Rabu ", "Kamis", "Jumat", "Sabtu", "Minggu"};
    detik = date.get(Calendar.SECOND);
    menit = date.get(Calendar.MINUTE);
    jam =  date.get(Calendar.HOUR_OF_DAY);
    hari = date.get(Calendar.DAY_OF_MONTH);
    tanggal = date.get(Calendar.DATE);
    bulan = date.get(Calendar.MONTH);
    
    tahun = date.get(Calendar.YEAR);

    System.out.println("Hari ini adalah : "+namahari[hari]+", "+tanggal+" "+namabulan[bulan]+" " +tahun+ " "+jam+":"+menit+":"+detik);
    
  }
    }
  
