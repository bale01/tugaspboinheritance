package BelajarJava.com;

public class Pegawai {
    private String nama;
    private double GajiPokok;

    public void setNama(String nama){
        this.nama = nama;
    }
    public void setgajiPokok(double GajiPokok){
        this.GajiPokok = GajiPokok;
    }

    public String getNama(){
        return this.nama;
    }
    public double getgajiPokok(){
        return this.GajiPokok;
    }

    public void cetakInfo(){
        System.out.println("=====PEGAWAI=====");
        System.out.println("Nama            : "+ getNama());
        System.out.println("Gaji Pokok      : " + getgajiPokok());
    }

}
