package Problem_01;

import java.util.Scanner;

public class CarInformation {

	static final int MAX = 100;

	static String[] carNameList = new String[MAX]; // 차이름
	static int[] enginePriceList = new int[MAX]; // 엔진가격
	static int[] tirePriceList = new int[MAX]; // 타이어 가격
	static boolean optionList = true; // 옵션 있다 / 없다
	static String[] optionNameList = new String[MAX]; // 옵션 이름
	static int[] maxSpeedList = new int[MAX]; // 최고스피드
	static int[] buyPriceList = new int[MAX]; // 구매 가격
	static String[] licensePlateList = new String[MAX];

	static int count = 0; // 카운터
	static int index = 0;

	public static void main(String[] args) {

		CarInformation carinformation = new CarInformation();

		int i = 0;

		while (i != 6) {
			System.out.println("선택하시오.\n" 
					+ "1. 자동차 정보 입력 \n" 
					+ "2. 저장된 목록 보기 \n" 
					+ "3. 각 자동차의 구매 가격 조회 \n"
					+ "4. 옵션이 있는 자동차 정보 조회 \n"
					+ "5. 빠른 자동차와 느린 자동차의 속도차 조회 \n" 
					+ "6. 프로그램 이용 종료");

			Scanner sc = new Scanner(System.in);
			i = sc.nextInt();
			switch (i) {
			case 1:

				if (count >= 100)
					System.out.println("고객 정원 초과");
				else
					carInformationInput();

				Scanner scan = new Scanner(System.in);
				System.out.println("다른 업무를 보시겠습니까? 1.예   2.아니요");
				int otw = scan.nextInt();

				if (otw == 2) {
					System.out.println("안녕히계십시오");
					return;
				}

				break;

			case 2:
				System.out.println("차량 목록 보기");
				carinformation.savedList();

				Scanner sc2 = new Scanner(System.in);
				System.out.println("다른 업무를 보시겠습니까? 1.예   2.아니요");
				int otw2 = sc2.nextInt();

				if (otw2 == 2) {
					System.out.println("안녕히계십시오");
					return;
				}

				break;

			case 3:
				System.out.println("차량 구매 가격");
				carBuyPriceInquiry();
				Scanner sc3 = new Scanner(System.in);
				System.out.println("다른 업무를 보시겠습니까? 1.예   2.아니요");
				int otw3 = sc3.nextInt();

				if (otw3 == 2) {
					System.out.println("안녕히계십시오");
					return;
				}

				break;

			case 4:
				optionCarSearch();

				break;

			case 5:
				fastCarSlowCar();

				break;

			case 6:

				System.out.println("프로그램 종료");
				break;
			}

		}

	}

//	자동차정보입력
	public static void carInformationInput() {
		Scanner sc = new Scanner(System.in);
		Car car = new Car();

		System.out.print("자동차 이름 입력 : \n");
//		Scanner n = new Scanner(System.in);
		String carName = sc.next();
//		car.setCarName(carName);

		System.out.print("엔진 가격 : ");
//		Scanner e = new Scanner(System.in);
		int enginePrice = sc.nextInt();
//		car.setEnginePrice(enginePrice);

		System.out.print("타이어 가격 : ");
//		Scanner t = new Scanner(System.in);
		int tirePrice = sc.nextInt();
//		car.setTirePrice(tirePrice);

//		System.out.print("옵션  : ");
//		Scanner o = new Scanner(System.in);
//		option = o.nextBoolean();

		System.out.print("옵션 이름 : ");
//		Scanner on = new Scanner(System.in);
		String optionName = sc.next();
//		car.setOptionName(optionName);

		System.out.print("최고속도 : ");
//		Scanner s = new Scanner(System.in);
		int maxSpeed = sc.nextInt();
//		car.setMaxSpeed(maxSpeed);

		System.out.print("구매 가격 : ");
//		Scanner b = new Scanner(System.in);
		int buyPrice = sc.nextInt();
//		car.setBuyPrice(buyPrice);

		System.out.print("자동차 번호판 : ");
		String licensePlate = sc.next();

		carNameList[count] = carName;
		enginePriceList[count] = enginePrice;
		tirePriceList[count] = tirePrice;
//		optionList[count] = option
		optionNameList[count] = optionName;
		maxSpeedList[count] = maxSpeed;
		buyPriceList[count] = buyPrice;
		licensePlateList[count] = licensePlate;

		count++;
		index++;

	}

//	저장된 목록 보기
	public static void savedList() {
		System.out.println("\n========= 차량 목록 =========");

		for (int i = 0; i < count; i++) {

			System.out.println("차량 이름 : " + carNameList[i] + "\t차량 번호 : " + licensePlateList[i]);
			System.out.println();
		}

	}

//	각 자동차의 구매 가격 조회 
	public static void carBuyPriceInquiry() {
		System.out.println("\n========= 차량 구매 가격 =========");
		for (int i = 0; i < count; i++) {

			System.out.println("차량 이름 : " + carNameList[i] 
									+ "\t차량 번호 : " + licensePlateList[i] 
									+ "\t구매 가격 : " + buyPriceList[i]);
			System.out.println();
		}

	}

//	옵션이 있는 자동차 정보 조회
	public static void optionCarSearch() {

	}

//	빠른 자동차와 느린 자동차의 속도차 조회
	public static void fastCarSlowCar() {

	}

}
