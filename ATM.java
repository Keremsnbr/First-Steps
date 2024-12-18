public class ATM {
	
	private String hesapNo;
	private double bakiye;
	private String parola;
	
	
	public ATM(String hesapNo,String parola,double bakiye) {
		this.hesapNo = hesapNo;
		this.parola = parola;
		this.bakiye = bakiye;
	}
	
	
	public String getParola() { 
		return parola;
	}
	public void setParola(String parola) {
		this.parola = parola;
	}
	public double getBakiye() {
		return bakiye;
	}
	public void setBakiye(double bakiye) {
		this.bakiye = bakiye;
	}
	public String getHesapNo() {
		return hesapNo;
	}
	public void setHesapNo(String hesapNo) {
		this.hesapNo = hesapNo;
	}

	public void paraCekme(double miktar) {
		
		if(miktar > 5000) {
			System.out.println("Bir günde 5000 tlden fazla para çekemezsiniz!");
		}
		if(getBakiye()- miktar < 0 ) {
			System.out.println("Yeterli bakiye yok. Bakiye = " + getBakiye());
		}
		else {
			setBakiye(getBakiye() - miktar);
			System.out.println("Yeni Bakiye = " + getBakiye());	
		}	
	}
	
	public void paraYatir(int tutar) {
		
		bakiye += tutar;
		System.out.println("Yeni Bakiyeniz: " + bakiye);
		
	}	
	
	
	}
	
	
	
	

