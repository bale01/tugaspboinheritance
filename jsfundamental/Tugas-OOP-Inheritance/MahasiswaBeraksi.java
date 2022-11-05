package BelajarJava.com;

public class MahasiswaBeraksi {
    public static void main(String[] args) {

        MAhasiswa anton = new MAhasiswa();

        anton.setnama("Asep saepudin");
        anton.setjenisKelamin("Laki-laki");
        anton.setumur(22);
        anton.setalamat("Kp pasir konci");
        anton.setnim("312110235");
        anton.setjurusan("Informatika");

        anton.cetakInfo();
        
    }
}
