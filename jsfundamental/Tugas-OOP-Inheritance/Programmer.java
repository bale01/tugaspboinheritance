package BelajarJava.com;

public class Programmer extends Pegawai{
    private double bonus;

    public void setBonus(double bonus){
        this.bonus = bonus;
    }

    public double getBonus(){
        return this.bonus;
    }

    public void cetakInfo(){
        System.out.println("======PROGRAMER======");
        System.out.println("Nama            : "+ getNama());
        System.out.println("Gaji Pokok      : "+ getgajiPokok());
    }

    public void cetakBonus(){
        
        System.out.println("Bonus           : " + getBonus());
    }
}