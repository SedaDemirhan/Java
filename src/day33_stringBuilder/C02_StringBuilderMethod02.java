package day33_stringBuilder;

public class C02_StringBuilderMethod02 {

	public static void main(String[] args) {
/*Bir c�mleyi parametre olarak kabul eden, StringBuilder kullanarak c�mleyi ters �eviren ve c�mlenin palindrom
       olup olmad���n� kontrol eden (b�y�k/k���k harf duyarl�l��� olmadan) bir Java program� yaz�n.
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
			System.out.println("girdi�iniz ifade polindrome d�r."+ tersString);
			
		}else {
			System.out.println("girdi�iniz ifade polindrome de�ildir.");
		}

	}

}
