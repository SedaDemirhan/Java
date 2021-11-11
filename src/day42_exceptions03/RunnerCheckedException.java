package day42_exceptions03;

public class RunnerCheckedException {

	public static void main(String[] args) throws InvalidEmailIdCheckedException {
 
		String email="rasit@gomail.com";
		
		
		mailDogrula(email);

	}

	public static void mailDogrula(String email) throws InvalidEmailIdCheckedException {
		
		if (email.contains("@gmail.com") || email.contains("@hotmail.com")) {
		System.out.println("mailiniz baþarýyla kaydedildi");	
		}else {
			throw new InvalidEmailIdCheckedException("email uygun deðil");
		}
		
	}

}
