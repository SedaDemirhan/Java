package day34_encapsulation;

public class C04_Araba {
   String model;//1.step
   String renk;
  private int motor;
  private int yil;
   
   public C04_Araba() {};//2.step parametresiz cons creat ettik

   public C04_Araba(String model, String renk, int motor, int yil) {
	super();
	/*this.model = model;
	this.renk = renk;
	this.motor = motor;
	this.yil = yil;
	*/
	setModel(model);
	setMotor(motor);
	setRenk(renk);
	setYil(yil);
}


public String getModel() {
	return model;
}

public void setModel(String model) {
	this.model = model;
}

public String getRenk() {
	return renk;
}

public void setRenk(String renk) {
	this.renk = renk;
}

public int getMotor() {
	return motor;
}

public void setMotor(int motor) {
	if (motor>0) {
		this.motor = motor;
	}else this.motor=-motor;
	
}

public int getYil() {
	return yil;
}

public void setYil(int yil) {
	if (yil>0) {
		this.yil = yil;
		
	}else this.yil=-yil;
	
}

	

	public static void main(String[] args) {
		
	}

}
