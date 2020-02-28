package Problem_02;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;



public class CarService implements CarMethod {

	Scanner sc = new Scanner(System.in);

	// CarBasics 클래스를 사용하기위해 객체 생성
	CarBasics carbasics = new CarBasics();

	// CarBasics 객체만 담을 수 있는 ArrayList 생성
	ArrayList<CarBasics> csarr = new ArrayList<CarBasics>();

	// 카운터
	int cnt1 = 0;
	int cnt2 = 0;

	// 자동차정보입력
	@Override
	public void carInformationInput() {

		// carInformationInput 메서드 안에 새로 생성해주지 않으면 ArrayList에 넣어 줄때
		// 모든 값이 마지막에 입력한 값으로 일괄변경 되기 때문에 생성해준다
		CarBasics carbasics = new CarBasics();

		try {
			System.out.println("[ 자동차 정보 입력  ]");
			System.out.print("자동차 이름 입력 : ");
			String carName = sc.next();
			carbasics.setCarName(carName);
			
			
			
			System.out.print("자동차 번호판 : ");
			String licensePlate = sc.next();
			if(carbasics.getLicensePlate() == licensePlate) {
				
//				System.out.println(carbasics.getLicensePlate());
//				System.out.println(licensePlate);
				return;
				
			}
			else {
				System.out.println(carbasics.getLicensePlate());
				System.out.println(licensePlate);
				carbasics.setLicensePlate(licensePlate);
				
			}

			System.out.print("엔진 가격 : ");
			int enginePrice = sc.nextInt();
			carbasics.setEnginePrice(enginePrice);

			System.out.print("타이어 가격 : ");
			int tirePrice = sc.nextInt();
			carbasics.setTirePrice(tirePrice);

			boolean f = false;
			boolean t = true;
			int i = 0;
			boolean bb;

			System.out.println("자동차 옵션  (1번 있다) / (2번 없다)");
			System.out.print(">>>>");
			i = sc.nextInt();

			if (i == 1) {
				bb = t;
				System.out.print("<< 자동차 옵션 있다  >>");

				System.out.print("\n옵션 이름 : ");
				String optionName = sc.next();
				carbasics.setOptionName(optionName);

			} else if (i == 2) {

				bb = f;
				System.out.print("<< 자동차 옵션 없다  >>\n");

			} else {

				System.out.println("잘못입력했습니다");
				return;

			}

			System.out.print("최고속도 : ");
			int maxSpeed = sc.nextInt();
			carbasics.setMaxSpeed(maxSpeed);

			System.out.print("구매 가격 : ");
			int buyPrice = sc.nextInt();
			carbasics.setBuyPrice(buyPrice);

			++cnt1;
			++cnt2;
			csarr.add(carbasics);

		} catch (InputMismatchException e) {
			System.out.println("입력하세요");
			// 잘못입력된 값 비워주기
			sc.nextLine();

		}

	}

//	차량 목록 보기
	@Override
	public void savedList() {
		int count = 1;
		try {
			if (csarr.size() == 0) {
				throw new IndexOutOfBoundsException("저장된 정보가 없습니다.");
			}
			for (int i = 0; i < csarr.size(); i++) {
				System.out.print("[ "+count + " 번째 정보 ] = ");

				// ArrayList에 저장된 모든 객체 출력해서 보여주기
				System.out.println(csarr.get(i));
				count += 1;
			}
		} catch (IndexOutOfBoundsException e) {

			System.out.println(e.getMessage());
		}

	}

//	자동차 구매 가격 조회
	@Override
	public void carBuyPriceInquiry() {
		try {
			if (csarr.size() == 0) {
				throw new IndexOutOfBoundsException("저장된 정보가 없습니다.");
			}
			try {

				System.out.println("차량 번호 조회 : ");
				// 조회하는 차량 이름 입력받고 licensePlate2 에 저장
				String licensePlate2 = sc.next();

				for (int i = 0; i < csarr.size(); i++) {

					// ArrayList 에 저장되있는 값을의 carName을 불러오기
					carbasics = csarr.get(i);
					carbasics.getLicensePlate();

					// ArrayList 의 carName 과 입력한 carName2 가 같으면
					// 그 carName 의 정보를 모두 출력한다
					if (licensePlate2.equals(carbasics.getLicensePlate())) {

						outputTitle();
						System.out.println(csarr.get(i));
					}
				}
			} catch (InputMismatchException e) {
				sc.nextLine();
				System.out.println("입력하세요");
			}

		} catch (IndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}

	}

//	번호판 조회 후 출력
	@Override
	public void outputTitle() {
		System.out.println();
	}

//	옵션 확인 (있다 / 없다)
	@Override
	public void checkOption() {
		try {
			if (csarr.size() == 0) {
				throw new IndexOutOfBoundsException("저장된 정보가 없습니다.");
			}
			try {
				System.out.println("옵션있는 차량 목록");

				for (int i = 0; i < csarr.size(); i++) {
					carbasics = csarr.get(i);
					carbasics.getOptionName();

					// 옵션차량 이름 = null 값으로 구분 한다
					if (carbasics.getOptionName() == null) {
						break;
					} else {
						System.out.println(csarr.get(i));
					}

				}

			} catch (InputMismatchException e) {
				sc.nextLine();
				System.out.println("입력하세요");
			}

		} catch (IndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}

	}

//	자동차 속도 별로 구분
	@Override
	public void fastCarSlowCar() {

		try {
			if (csarr.size() == 0) {
				throw new IndexOutOfBoundsException("저장된 정보가 없습니다.");
			}
			try {
				System.out.println("======= MaxSpeed 자동차 속도기준(200 km/h) =======\n");

				System.out.println("[ fast 자동차 200km/h 이상 목록 ]");

				for (int j = 0; j < cnt1; j++) {
					carbasics = csarr.get(j);
					carbasics.getMaxSpeed();

					// 옵션차량 이름 = null 값으로 구분 한다
					if (carbasics.getMaxSpeed() >= 200) {
						System.out.println(csarr.get(j));

					}
				}
				System.out.println("[ slow 자동차 200km/h 미만 목록 ]");
				for (int i = 0; i < cnt2; i++) {
					carbasics = csarr.get(i);
					carbasics.getMaxSpeed();

					// 옵션차량 이름 = null 값으로 구분 한다
					if (carbasics.getMaxSpeed() < 200) {
						System.out.println(csarr.get(i));

					}
				}

			} catch (InputMismatchException e) {
				sc.nextLine();
				System.out.println("입력하세요");
			}

		} catch (IndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}

	}

}
