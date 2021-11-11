package day21_MultiDimensionalArrays;

import java.util.Arrays;

public class C04_MDArrays04 {

	public static void main(String[] args) {
/* Soru 4) Asagidaki multi dimensional array�in ic array�lerindeki
 *  tum elemanlarin toplamini  birer birer bulan 
 *  ve herbir sonucu yeni bir array�in elemani yapan 
 *  ve yeni array�i  ekrana  yazdiran bir program yaziniz 
 *  { {1,2,3}, {4,5}, {6,7} }
   Ornek; { {1,2,3}, {4,5}, {6,7} } ==> 1+2+3=6 4+5=9 6+7=13 ==> output: {6, 9, 13}
 */
 
		int arr[][]={ {1,2,3}, {4,5}, {6,7},{6,5,4} };
		
		//her bir inner array'in elemanlar�n�n toplam�n� yeni array'e element olarak yaz�caz
		
		int toplamlarArrayi[]=new int[arr.length];// inner array say�s�nz uygun bir array olu�turacak
		
		
		for (int i = 0; i < arr.length; i++) {
			int elementlerToplami=0;
			
			for (int j = 0; j < arr[i].length; j++) {
				elementlerToplami+=arr[i][j];
				
			}
		toplamlarArrayi[i]=elementlerToplami;
			
		}

		System.out.println(Arrays.toString(toplamlarArrayi));
	}

}
