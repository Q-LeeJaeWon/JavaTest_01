package Problem_02;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {

		// Scanner기능을 사용하기 위해 객체 생성
		Scanner sc = new Scanner(System.in);

		// CarService 클래스를 사용하기 위해 객체 생성
		CarService carservice = new CarService();

		int i = 0;

		// 차관리 프로그램 반복 동작

		while (i != 6) {
			System.out.println("==========================");
			System.out.println("번호를 선택하시오.\n"
		+ "1. 자동차 정보 입력 \n" 
					
		+ "2. 자동차 목록 보기 \n"
		
		+ "3. 자동차 구매 가격 조회 \n"
					
		+ "4. 옵션이 있는 자동차 정보 조회 \n"
		
		+ "5. 자동차 속도 별로 구분 \n"
		
		+ "6. 프로그램 이용 종료");
			System.out.println("==========================");
			System.out.print(">>>>");

			i = sc.nextInt();
			switch (i) {
			case 1:

				carservice.carInformationInput();
				Scanner scan = new Scanner(System.in);
				System.out.println("==========================");
				System.out.println("다른 업무를 보시겠습니까? 1.예   2.아니요");
				System.out.print(">>>>");
				int otw = scan.nextInt();

				if (otw == 2) {
					System.out.println("안녕히계십시오");
					return;
				}

				break;

			case 2:
				System.out.println("<<<<< 차량 목록 보기  >>>>>");
				carservice.savedList();

				Scanner sc2 = new Scanner(System.in);
				System.out.println("==========================");
				System.out.println("다른 업무를 보시겠습니까? 1.예   2.아니요");
				System.out.print(">>>>");
				int otw2 = sc2.nextInt();

				if (otw2 == 2) {
					System.out.println("안녕히계십시오");
					return;
				}

				break;

			case 3:
				System.out.println("<<<<<  자동차 구매 가격 조회  >>>>>");
				carservice.carBuyPriceInquiry();
				Scanner sc3 = new Scanner(System.in);
				System.out.println("==========================");
				System.out.println("다른 업무를 보시겠습니까? 1.예   2.아니요");
				System.out.print(">>>>");
				int otw3 = sc3.nextInt();

				if (otw3 == 2) {
					System.out.println("안녕히계십시오");
					return;
				}

				break;
				
				
			case 4:
				System.out.println("<<<<<  옵션이 있는 자동차 정보 조회  >>>>>");
				carservice.checkOption();
				Scanner sc4 = new Scanner(System.in);
				System.out.println("==========================");
				System.out.println("다른 업무를 보시겠습니까? 1.예   2.아니요");
				System.out.print(">>>>");
				int otw4 = sc4.nextInt();

				if (otw4 == 2) {
					System.out.println("안녕히계십시오");
					return;
				}

				break;

			case 5:

				System.out.println("<<<<<  자동차 속도 별로 구분  >>>>>");
				carservice.fastCarSlowCar();
				Scanner sc5 = new Scanner(System.in);
				System.out.println("==========================");
				System.out.println("다른 업무를 보시겠습니까? 1.예   2.아니요");
				System.out.print(">>>>");
				int otw5 = sc5.nextInt();

				if (otw5 == 2) {
					System.out.println("안녕히계십시오");
					return;
				}

				break;

			case 6:

				System.out.println("프로그램 종료");
				break;
			}

		}
	}

}
