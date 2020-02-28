package Problem_01;



public class Car {
	
	
	private String carName;		//차이름
	private int enginePrice;	//엔진가격
	private int tirePrice;		//타이어 가격
	private boolean option;		//옵션 있다 / 없다
	private String optionName;	//옵션 이름
	private int maxSpeed;		//최고스피드
	private int buyPrice;		//구매 가격
	
	
	public Car(String carName, int enginePrice, int tirePrice,
				boolean option, String optionName, int maxSpeed,
				int buyPrice) {
		
		this.carName = carName;
		this.enginePrice = enginePrice;
		this.tirePrice = tirePrice;
		this.option = option;
		this.optionName = optionName;
		this.maxSpeed = maxSpeed;
		this.buyPrice = buyPrice;
	}



	public Car() {
		
	}



	public String getCarName() {
		return carName;
	}


	public void setCarName(String carName) {
		this.carName = carName;
	}


	public int getEnginePrice() {
		return enginePrice;
	}


	public void setEnginePrice(int enginePrice) {
		this.enginePrice = enginePrice;
	}


	public int getTirePrice() {
		return tirePrice;
	}


	public void setTirePrice(int tirePrice) {
		this.tirePrice = tirePrice;
	}


	public boolean isOption() {
		return option;
	}


	public void setOption(boolean option) {
		this.option = option;
	}


	public String getOptionName() {
		return optionName;
	}


	public void setOptionName(String optionName) {
		this.optionName = optionName;
	}


	public int getMaxSpeed() {
		return maxSpeed;
	}


	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}


	public int getBuyPrice() {
		return buyPrice;
	}


	public void setBuyPrice(int buyPrice) {
		this.buyPrice = buyPrice;
	}
	 
	
	public static void main(String[] args) {
		
	}
	
	
	public void savedList() {
		
	}
	

}
