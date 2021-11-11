package day27_staticKeyword;

public class Counter02 {
	
	int count=0;
	
	 Counter02(){
		 count++;
		 System.out.println(count);
	 }
	

	public static void main(String[] args) {
		 Counter02 c1=new  Counter02();
		 Counter02 c2=new  Counter02();
		 Counter02 c3=new  Counter02();
		 
	}

}
