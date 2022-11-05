package BelajarJava.com;

public class MAhasiswa extends manusisa {
    String NIM;
    String Jurusan;

    public void setnim(String NIM){
        this.NIM = NIM;
    }
    public void setjurusan(String Jurusan){
        this.Jurusan = Jurusan;
    }

    public String getnim(){
        return this.NIM;
    }
    public String getjurusan(){
        return this.Jurusan;
    }

    public void cetakInfo(){
        super.cetakInfo();

        System.out.println("NIM           : " + getnim());
        System.out.println("Jurusan       : " + getjurusan());
    }
    
}
