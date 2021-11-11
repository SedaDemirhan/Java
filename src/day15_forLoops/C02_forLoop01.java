package day15_forLoops;



public class C02_forLoop01 {

	public static void main(String[] args) {
		// 10'dan 20'ye kadar olan sayýlarý yazdýran bir loop oluþturalým

		for (int i = 10; i <= 20; i++) {
			System.out.print(i + " ");

		}

		// 100 ile 200 dahil aralarýndaki 10 ile bölünebilen sayýlarý yazdýrýn
		System.out.println(" ");

		for (int i = 100; i <= 200; i += 10) {
			System.out.print(i + " ");

		}
// 50'den 20'ye kadar (sýnýrlar dahil) 3'er 3'er geri sayarak yazdýralým
		System.out.println("");
		for (int i = 50; i >= 20; i -= 3) {
			System.out.print(i + " ");

		}
		// 50 ile 100 arasýnda üç ile bölünebilen sayýlarý yazdýrýn
		System.out.println("");
		for ( int i=50; i<=100; i++) {
			if (i%3==0) {
				System.out.print(i+ " ");
				
			}
			
		}
		
		// eger degiskenimiz verilen artis veya azalisla bitis kosuluna ulasamiyorsa 
        // sonsuz loop olusur ve sistem cokene kadar loop calismaya devam eder
        /*
        for (int i = 10; i < 20 ; i--) {
            System.out.print(i + " ");
        }
        */
        
        // eger baslangic degeri kosulu saglamiyorsa
        // loop body hic calismadan, loop'un sonuna gider
        // yani loop islevsiz olur
        
        for (int i = 10; i < 0; i++) {
            System.out.println(i + " ");
        }
        
        System.out.println("son for loop'un sonrasi");
        
        
	}

}
