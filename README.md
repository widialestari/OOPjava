# OOPjava
                                                        WRAPPER CLASS PADA JAVA
                                                        
Wrapper Class merupakan tipe data bawaan Java yg berupa objek. Wrapper Class di dalam bahasa pemrograman Java,  adalah suatu  mekanisme  yang digunakan untuk mengubah suatu  nilai dengan tipe data primitif ,menjadi sebuah nilai dengan tipe data objek (referensi).

Tipe Data Primitif	Wrapper Class
-------------------     --------------------
int	                Integer
char	                Character
byte	                Byte
double	                Double
boolean	                Boolean
short	                Short
long	                Long
float	                Float

Membuat Object Wrapper
•	Semua class wrapper kecuali Character menyediakan dua constructor. Argument berupa String dan nilai primitive
Contoh :
	Integer i1 = new Integer(1);
	Integer i2 = new Integer(“1”);
	Float f1 = new Float(1.33);
	Float f2 = new Float(“1.33”);
	Character c1 = new Character(‘c’);

•	Pada Java 5 object Boolean dapat digunakan pada kondisi, karena kompiler secara otomatis “un-box” (membuka) Boolean menjadi boolean.
Contoh :
	Boolean b = new Boolean(“false”)
Autoboxing dan Inbonxing
•	Autoboxing merupakan proses konversi dari tipe primitif menjadi objek.
•	Unboxing merupakan proses konversi dari tipe data objek menjadi tipe data primitif.
