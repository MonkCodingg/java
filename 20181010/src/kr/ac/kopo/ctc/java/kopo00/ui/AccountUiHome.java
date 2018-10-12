package kr.ac.kopo.ctc.java.kopo00.ui;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import kr.ac.kopo.ctc.java.kopo00.domain.AccountItem;
import kr.ac.kopo.ctc.java.kopo00.service.AccountItemService;
import kr.ac.kopo.ctc.java.kopo00.service.AccountItemServiceImpl;
import kr.ac.kopo.ctc.java.kopo00.service.DatabaseService;
import kr.ac.kopo.ctc.java.kopo00.service.DatabaseServiceImpl;

public class AccountUiHome {
	static DatabaseService databaseService = new DatabaseServiceImpl();
	static AccountItemService accountItemService = new AccountItemServiceImpl();

	public static void main(String[] args) throws Exception {
		System.out.println("AccountUiHome");
		databaseService.load();
//		생성
		createInput();

//		업데이트
//		update();

//		전체목록
//	showListAll();

//		월별목록
//		showListMonth();
		databaseService.save();

//		Scanner in = new Scanner(System.in);
//
//		boolean isExit = false;
//		
//		while (!isExit) {
//			showMainMenu();
//			
//			System.out.print("원하시는 화면번호 입력해주세요: ");
//			
//			int n = in.nextInt();
//			switch (n) {
//			case 1:
//				showFirstMenu();
//				break;
//			case 2:
//				showSecondMenu();
//				break;
//			case 3:
//				showThirdMenu();
//				break;		
//			case 4:
//				isExit = true;
//				break;
//			default:
//				showErrorPage();
//			}
////			databaseService.save();
//			
//		}

	}

	private static void update() throws Exception {
		// 전체 목록 보여주기
		showListAll();
		AccountItem accountItem = new AccountItem();

		Scanner in = new Scanner(System.in);
		// 수정할 게시글 id값 입력받기.
		System.out.println("");
		System.out.println("<수정>");
		System.out.println("수정할 게시글 id값 입력 : ");
		int id = in.nextInt();
		accountItem.setId(id);

		// 수정할 내용 입력 받기
		System.out.println("<수정하기>");
		System.out.println("수정할 세부내용 입력 : ");
		accountItem.setDesc(in.next());
		System.out.println("수정할 날짜 : ");
		accountItem.setDt(new Date());
		System.out.println("수정할 카드 사용 : ");
		accountItem.setCash(in.nextInt());
		System.out.println("수정할 현금 사용 : ");
		accountItem.setCard(in.nextInt());
		System.out.println("수정할 타입 : ");
		accountItem.setType(in.next());
		System.out.println("수정할 태그 : ");
		accountItem.setTag(in.next());

		accountItemService.update(id, accountItem);

	}

	private static void showOneAccountItem() {

		AccountItem accountItem = new AccountItem();
		Scanner in = new Scanner(System.in);
		int id = in.nextInt();
		System.out.println("showOneAccountItem()95");
		accountItem = accountItemService.selectOne(id);
		System.out.println(accountItem.getId());
		System.out.println(accountItem.getDt());
		System.out.println(accountItem.getDesc());
		System.out.println(accountItem.getCash());
		System.out.println(accountItem.getCard());
		System.out.println(accountItem.getType());
		System.out.println(accountItem.getTag());

	}

	private static void showErrorPage() {
		System.out.println("다시 입력해 주세요!");

	}

	private static void createInput() throws Exception {
		AccountItem accountItem = new AccountItem();
		SimpleDateFormat tf = new SimpleDateFormat("yyyy-MM-dd");
		Scanner in = new Scanner(System.in);
		System.out.println("");
		System.out.println("<가계부 값 입력>");
		System.out.println("가계부 입력값 정보 : Desc, Date, Cash, Card, Type, Tag");
		System.out.println("세부내용 입력 : ");
		accountItem.setDesc(in.next());
		System.out.println("날짜 : ");
//		날짜 입력 받는 타입은 "20181012 123000";
		String d = in.next();
		int year = Integer.parseInt(d.substring(0, 4)); // 2018
		int month = Integer.parseInt(d.substring(4, 6)); // 10
		int day = Integer.parseInt(d.substring(6, 8)); // 12
		int h = Integer.parseInt(d.substring(9, 11)); // 12
		int m = Integer.parseInt(d.substring(11, 13)); // 30
		int s = 0;

		accountItem.setDt(new Date(year, month, day, h, m, s));
		System.out.println("카드 사용 : ");
		accountItem.setCash(in.nextInt());
		System.out.println("현금 사용 : ");
		accountItem.setCard(in.nextInt());
		System.out.println("타입 : ");
		accountItem.setType(in.next());
		System.out.println("태그 : ");
		accountItem.setTag(in.next());
		accountItemService.create(accountItem);
	}

	// 전체보기 메서드
	private static void showListAll() throws Exception {
		for (AccountItem item : accountItemService.selectAll()) {
			System.out.println(item);

		}
	}

	// 월별보기 메서드
	private static void showListMonth() throws Exception {
		Scanner in = new Scanner(System.in);
		System.out.println("년 입력: ");
		int year = in.nextInt();
		System.out.println("월 입력: ");
		int month = in.nextInt();
		for (AccountItem item : accountItemService.selectAllByMonth(year, month)) {
			System.out.println(item);
		}
	}

	private static void showFirstMenu() {
		// TODO Auto-generated method stub
		System.out.println("showFirstMenu()");
	}

	private static void showSecondMenu() {
		// TODO Auto-generated method stub
		System.out.println("****showSecondMenu()****");
		System.out.println();
		System.out.println();
		System.out.println();
	}

	private static void showThirdMenu() {

		Scanner in = new Scanner(System.in);
		System.out.println("showThirdMenu()");
		System.out.println("1.일별");
		System.out.println("2.월별");
		System.out.println("3.전체목록");
		int n = in.nextInt();
	}

	private static void showMainMenu() {
		Scanner in = new Scanner(System.in);
		System.out.println("***********메인화면***********");
		System.out.println("1. 등록");
		System.out.println("2. 보기");
		System.out.println("3. 서비스");
		System.out.println("4. 종료");
		int n = in.nextInt();
	}

}
