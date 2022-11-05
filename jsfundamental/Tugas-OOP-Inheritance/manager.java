package BelajarJava.com;

public class manager extends Pegawai {

    double tunjangan ;

    public void setTunjangan(double tunjangan){ 
        this.tunjangan = tunjangan;
    }

    public double getTunjangan(){
        return this.tunjangan;
    }

    public void cetakInfo(){
        System.out.println("======MANAGER======");
        System.out.println("Nama            : "+ getNama());
        System.out.println("Gaji Pokok      : "+ getgajiPokok());
    }

    public void cetakTunjangan(){
        System.out.println("Tunjangan       : " + getTunjangan());
    }
}
