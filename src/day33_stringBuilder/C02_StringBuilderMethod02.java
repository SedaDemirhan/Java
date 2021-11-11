package day33_stringBuilder;

public class C02_StringBuilderMethod02 {

	public static void main(String[] args) {
/*Bir cümleyi parametre olarak kabul eden, StringBuilder kullanarak cümleyi ters çeviren ve cümlenin palindrom
       olup olmadýðýný kontrol eden (büyük/küçük harf duyarlýlýðý olmadan) bir Java programý yazýn.
    (without case sensitivity)
    Eg : input : I love Java
    Output: "Reversed sentence : avaJ evol I .
       It is not a palindrome"
  */
	
		String str="tras neden sart";
		StringBuilder sb=new StringBuilder();
		
		sb.append(str);
		String tersString=sb.reverse().toString();
		if (str.equalsIgnoreCase(tersString)) {
			System.out.println("girdiðiniz ifade polindrome dýr."+ tersString);
			
		}else {
			System.out.println("girdiðiniz ifade polindrome deðildir.");
		}

	}

}
