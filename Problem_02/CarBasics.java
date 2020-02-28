package Problem_02;

public class CarBasics {
	
	
	private String carName;		//차이름
	private int enginePrice;	//엔진가격
	private int tirePrice;		//타이어 가격
	private boolean option;		//옵션 있다 / 없다
	private String optionName;	//옵션 이름
	private int maxSpeed;		//최고스피드
	private int buyPrice;		//구매 가격
	private String licensePlate;	// 번호판
	


	
	

	public String getLicensePlate() {
		return licensePlate;
	}


	public void setLicensePlate(String licensePlate) {
		this.licensePlate = licensePlate;
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
	
	
	@Override
	public String toString() {
		return "차량이름:" + this.getCarName() +
				", 차량 번호:" + this.getLicensePlate() +
				", 엔진가격:" + this.getEnginePrice() + "만원" +
				", 타이어가격:" + this.getTirePrice() +  "만원" +
				", 옵션 이름:" + this.getOptionName() +
				", 최고스피트:" + this.getMaxSpeed() +
				", 구매가격: " + this.getBuyPrice() + "만원"; 
		
				
				
	}
	
	
	

}
