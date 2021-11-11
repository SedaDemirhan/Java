package day35_Encapsulation02;
/*Burada iki adet class vardýr. Biri Main diðeri ise rentApartments
    rentApartments'ýn içinde;
    Bu variable'larý private olarak oluþturun;
    String name
    int roomCount
    boolean balconyOrNo

   Bütün variable'lar için getter ve setter oluþturunuz.

    4 farklý Apartment(apartman dairesi) vardýr. 0, 1, 2, 3 rooms(odalý)
    -----------------------------------------------------------------
    Bir method oluþturun;
    Eðer room sayýsý 0 ise,
    rent(kira) 1400
    Eðer oda sayýsý 1 ise,
    rent  1700
    Eðer oda sayýsý 2 ise,
    rent 2200
    Eðer oda sayýsý 3 ise,
    rent 2700
    rent'i return'leyin.
    ----------------------------------------------------------------
    Bir method oluþturun.
    Eðer balconyOrNo  true ise,
    rent'e 200 dollar ekleyin.

    Main class'ýn içinde;
    userName rent is amountOfRent
    */
public class C01_RentApartments {
	
		private String name;
		private int roomCount;
		private boolean balconyOrNo;
		private int kira=0;
	public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getRoomCount() {
			return roomCount;
		}

		public void setRoomCount(int roomCount) {
			this.roomCount = roomCount;
		}

		public boolean isBalconyOrNo() {
			return balconyOrNo;
		}

		public void setBalconyOrNo(boolean balconyOrNo) {
			this.balconyOrNo = balconyOrNo;
		}

	public int kiraHesapla(int roomCount) {
		if (roomCount==0) {
			this.kira=1400;
		}else if (roomCount==1) {
			this.kira=1700;
			
		}else if (roomCount==2) {
			this.kira=2200;
		}else if (roomCount==3) {
			this.kira=2700;
		}else {
			System.out.println("hatali veri girdiniz.");
			
		}
		return this.kira;

	}
	public int balkonSor (boolean balconyOrNo ) {
		if (balconyOrNo==true) {
			this.kira+=200;
			
		}
		return this.kira;
	}

}
