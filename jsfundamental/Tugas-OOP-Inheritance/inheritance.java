package BelajarJava.com;

public class inheritance {
    private String Nama;
    private String JenisKelamin;
    private int Umur;
    private String Alamat;

    public void setnama(String Nama){
        this.Nama = Nama;
    }
    public void setjenisKelamin(String JenisKelamin){
        this.JenisKelamin = JenisKelamin;
    }
    public void setumur(int Umur){
        this.Umur = Umur;
    }
    public void setalamat(String Alamat){
        this.Alamat = Alamat;  
    }

    public String getnama(){
        return this.Nama;
    }
    public String getjenisKelamin(){
        return this.JenisKelamin;
    }
    public int getumur(){
        return this.Umur;
    }
    public String getalamat(){
        return this.Alamat;
    }

    public void cetakInfo(){
        System.out.println("Nama          : " + getnama());
        System.out.println("Jenis Kelamin : " + getjenisKelamin());
        System.out.println("Umur          : " + getumur());
        System.out.println("Alamat        : "  + getalamat());

    }

    
}
