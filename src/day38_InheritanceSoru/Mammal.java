package day38_InheritanceSoru;

public class Mammal extends Animal {
	
	public void mA() {//parenti ile ayný
		System.out.println("mammal");
	}
	public void mC() {
		System.out.println("cat"+"mammal");
	}	
		
	    public int c=7;
		public int m=4;//parenti ile ayný
		
		public Mammal() {
            this('A');
           System.out.println("p'siz mammal cons.");
       }
       public Mammal(char c) {
           super(34);//parentten p'li cons call.
           System.out.println("char p'li mammal cons.");
           

}
}