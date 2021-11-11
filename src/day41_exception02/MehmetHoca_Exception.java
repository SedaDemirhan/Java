package day41_exception02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class MehmetHoca_Exception {

	public static void main(String[] args) {
	// javaya bir dosyaya okumasýný veya yazmazýný söylediðinizde
	//java "ya dosyayý bulamazssam" der ve bizden çözüm üretmemizi bekler.
	//dosya bulma ile ilgili exception türü"FileNotFoundException"
	//Java kodu yazar yazmaz buradaki olasý problemi görür ve CTE verir
	//Kodumuzu yazdýðýmýz anda ortaya çýkan bu tür exceptionlara Checked EXception diyoruz
try {
	FileInputStream fis=new FileInputStream("C:\\Users\\Serdar\\eclipse-workspace\\sampleproject\\java2021SummerTr\\src\\day41_exception02\\File");

} catch (FileNotFoundException e) {
	
	e.printStackTrace();
}


	}

}
