package day41_exception02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class MehmetHoca_Exception {

	public static void main(String[] args) {
	// javaya bir dosyaya okumas�n� veya yazmaz�n� s�yledi�inizde
	//java "ya dosyay� bulamazssam" der ve bizden ��z�m �retmemizi bekler.
	//dosya bulma ile ilgili exception t�r�"FileNotFoundException"
	//Java kodu yazar yazmaz buradaki olas� problemi g�r�r ve CTE verir
	//Kodumuzu yazd���m�z anda ortaya ��kan bu t�r exceptionlara Checked EXception diyoruz
try {
	FileInputStream fis=new FileInputStream("C:\\Users\\Serdar\\eclipse-workspace\\sampleproject\\java2021SummerTr\\src\\day41_exception02\\File");

} catch (FileNotFoundException e) {
	
	e.printStackTrace();
}


	}

}
