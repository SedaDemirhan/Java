package day42_exceptions03;

public class InvalidEmailIdCheckedException extends Exception{

	
	
	private static final long serialVersionUID = 1L;
	//java exceptionlar�n tekrars�z olmas�n� sa�lamak i�in her exception'a unique bir kod verir.
	
	InvalidEmailIdCheckedException(String message){
		super(message);
		
	}
	public static void main(String[] args) {
	
	}

}
