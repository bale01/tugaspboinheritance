# Tugas-OOP-Inheritance

Soal 1
terdapat kelas utama yang disebut superclas yaitu kelas yang mewarisi atribut ke kelas lain yang biasa disebut subclass
di class pertama terdapat beberapa atribut diantaranya adalah atribut nama dengan type data String, jeniskelamin(String), Umur(int), dan alamat(String). 
setelah itu membuat setter dan getter dimasing-masing atribut untuk mempermudah mengambil atribut kesebuah object. lalu membuat fungsi yang bernama cetakInfo() yang berisikan setter dan getter
untuk mencetak object dimenu utama.
didalam subclass tedapat dua atribut untuk diwarisi oleh superclass yaitu atribut NIM(String), dan Jurusan(String). lalu membuat setter dan getter untuk memanggil atribut tersebut yang sudah berisikan object
dan membuat fungsi superclass agar dapat dapat menggabungkan atribut di class pertama atau superclass dengan subclass.
lalu membuat class mahasiswaBeraksi untuk menjalankan programnya. dengan membuat object dari class mahasiswa dengan object nya yaitu anton yang berisikan atribut atribut yang ada
di superclass dan di subclass. lalu memanggil fungsi yang telah dibuat di disubclass dengan nama cetakinfo() maka anton.cetakinfo() akan mencetak data dengan onbject yang telah dibuat.

soal 2
membuat superclass dengan nama pegawai dengan antribut Nama(string) dan gajiPokok(double) yang bersifat privete
lalu membuat setter dan getter agar dapat digunakan untuk mengambil dan mengubah atribut yang ada di superclass.
membuat fungsi dengan nama cetakinfo() untuk dapat mencetak dari atribut dengan nama dan gajiPokok dengan memanggilnya dari getter.

membuat subclass pertama yang diwarisi oleh superclass pegawai dengan nama manager dengan atribut tunjangan(double) untuk dapat warisan dari superclas kita harus mengextends subclass kepada superclass agar dapat menggungkan atribut yang ada disuperclas dan subclass.
seperti halnya superclass yang menggunakan setter getter untuk mengambil atribut subclass pun sama membuat setter getter pada atribut tunjangan(double). 
lalu menbuat fungsi cetakInfo() dan cetaktunjangan() untuk ditampilakan dimenu utama.

membuat subclass yang kedua yang bernama programer untuk diwarisi dari superclass dengan atribut bonus(double) dan mengextendskan kepada superclass agar mewarisi atribut yang ada pada superclass. 
membuat setter getter dari atribut bonus(double) untuk mempermudah mengambil sebuah atribut pada sebuah object.
membuat fungsi cetakInfo() dan cetakBonus() dapat dicetak dimenu utama.

membuat class utama dengan nama class ProgramBeraksi untuk menjalankan superclass dan kedua subclass.
membuat object dengan nama anton1 sebagai manager dan anton2 sebagai programer yang sudah dimasukan data atribut yang ada diclass masing-masing.
untuk memanggil data tersebut yaitu dengan memangggil anton1.cetakInfo(), anton1.cetaktunjangan() dan anton2.cetakinfo(), anton2.cetakBonus() 



MAHASISWA BERAKSI
![mahasiswaBeraksi](https://user-images.githubusercontent.com/115930300/199978062-85c5a35c-e122-4092-8767-4f6c024578bc.png)

PROGRAM BERAKSI
![ProgramBeraksi](https://user-images.githubusercontent.com/115930300/199978433-8ad9fca1-1423-4f06-a8b1-4079143c1957.png)
