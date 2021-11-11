package day31_varargs;

public class C04_Varargs04 {

	public static void main(String[] args) {
		
		
		int[]arr= {1,3,5,7,9};
		arrTopla(arr);
		varargsTopla(1,3,5,7,9);
		
		System.out.println("varargs toplami :"+varargsTopla(1,3,5,7,9));
		System.out.println("array toplami :"+arrTopla(arr));
		System.out.println("varargsýn array parametreli toplami :"+varargsTopla(arr));

		//varargs array gibi davrandigi icin  herhangi bir arryi parametre olarak alabilir.
	
	}
	// varrargs ile toplama
private static int varargsTopla(int... i ) {
		int toplam=0;
		for (int a: i) {
			toplam+=a;
			
		}
		return toplam;
	}
// array elemanlarýný toplayan method
	private static int arrTopla(int[] arr) {
		
		int topla=0;
		for (int a : arr) {
			topla+=a;
			
		}
		return topla;
		
		
	}

}
