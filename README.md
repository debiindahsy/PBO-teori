#Pemograman berorientasi objek
###Wrapper Class
Di dalam bahasa pemrograman Java, Wrapper Class (Kelas Pembungkus) adalah suatu mekanisme yang digunakan untuk mengconvert atau mengubah suatu nilai yang di definisikan, dari tipe data primitif menjadi sebuah nilai dengan tipe data referensi (Objek). Selain itu, Wrapper Class mendukung method dari tipe data primitif, contohnya seperti Boolean, Character, Integer, Long, Float, dsb.
Pada bahasa pemrograman Java, terdapat 2 jenis tipe data, yaitu primitif dan referensi (objek), Tipe Data Primitif adalah tipe data yang tidak memiliki method, hanya memiliki data saja. Tipe data ini bukanlah sebuah object, sedangkan Tipe Data Referensi adalah tipe data yang digunakan untuk memegang referensi dari sebuah object ( instance dari class).

Dan berikut ini merupakan table yang menjelaskan macam-macam tipe data primitif dan referensi pada Java:

|Tipe Data Primitif|	Tipe Data Referensi|
|--|--|
|char|	Character|
|byte|	Byte|
|short|	Short|
|int|	Integer|
|long|	Long|
|boolean|	Boolean
|float|	Float|
|double|	Double|



Wrapper Class
Wrapper Class merupakan tipe data bawaan Java yg berupa objek. Wrapper class ini menyediakan mekanisme untuk membungkus (wrap) tipe data primitive menjadi sebuah objek sehingga bisa digunakan dalam kegiatan yg berhubungan dengan objek, Wrapper Class bersifat immutable yaitu apabila ada 2 buah variabel yg memegang nilai yg sama, maka satu variable diganti nilainya maka yg lain pun tidak ikut berubah nilainya.

###WrapperClass.java
 
Penjelasan : Pada contoh diatas kita melihat bahwa terdapat dua buah tipe data pada input, yaitu Integer dan int.
a. Integer merupakan wrapper di dalam java yaitu kata primitif dari tipe data int. Dan variabel a diatas merupakan sebuah objek baru dari tipe data integer dan yang langsung diberi nilai 10.
b. int merupakan bilangan bulat yang sering dipakai dalam pemrograman. Pada program diatas tipe data int juga membuat sebuah objek baru dengan nama i yang kemudian memanggil tipe data integer dengan objeknya yaitu a dan kemudian memanggil nilai nya.
c. Selanjutnya System.out.println (SOP) mencetak nilai dari tipe data diatas dengan memanggil objek i.
d. Dan pada output kita dapat melihat bahwa nilai yang dicetak adalah 10 yaitu nilai dari primitif diatas yaitu integer.


Kelas-Kelas Tipe Data Wrapper
Sembilan tipe data dasar (boolean, byte, char, double, float, int, long, short, void) di java tidak diimplementasikan sebagai kelas. Kelas wrapper bertindak sebagai versi kelas dari tipe data dasar, yang namanya serupa namun diawali huruf kapital.
Jadi kelas tipe data wrapper di java ada sepuluh yaitu Boolean, Byte, Character, Double, Float, Integer, Long, Number, Short, Void.
Penting untuk diperhatikan bahwa tipe data wrapper dan tipe data dasar tidak saling menggantikan.
Tipe data dasar diperoleh dari tipe data wrapper dengan cara memanggil method di tipe data wrapper.
Tipe data dasar dilewatkan ke method dengan pass by value, jadi jika membutuhkan pass by reference harus memanfaatkan kelas tipe data wrapper.
Kelas-kelas tipe data wrapper menyediakan versi objek dari tipe data dasar, maka dimungkinkan menambah method-method untuk masing-masing tipe.
Ada enam subkelas kongkret yang menyimpan nilai-nilai secara eksplisit masing-masing tipe data dasar yaitu double, float, byte, short, integer, dan long.
 

Final, Finally, Finalize
<>Final adalah keyword untuk mendeklarasikan bahwa sebuah variabel/atribut tidak dapat diubah lagi isinya (konstan), jika final disebutkan di method, artinya method tersebut tidak dapat di override oleh subclassnya, jika final disebutkan di class, artinya class tersebut tidak dapat diturunkan lagi

Contoh Program :

ExFinal.java

<>Finally merupakan tag dalam try-finally yang digunakan untuk memastikan bahwa kode didalam finally akan dieksekusi walaupun dalam try sukses / gagal.

Contoh Program :

ExFinally.java

<>Finalize merupakan methode kelas Object yang dieksekusi saat garbace collection menghapus sebuah object yang sudah tidak terpakai.

Contoh Program :

ExFinalize.java
