package kr.ac.kopo.ctc.java.kopo00.ui;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import kr.ac.kopo.ctc.java.kopo00.db.Database;
import kr.ac.kopo.ctc.java.kopo00.domain.AccountItem;
import kr.ac.kopo.ctc.java.kopo00.dto.ConsumingItem;
import kr.ac.kopo.ctc.java.kopo00.service.AccountItemService;
import kr.ac.kopo.ctc.java.kopo00.service.AccountItemServiceImpl;
import kr.ac.kopo.ctc.java.kopo00.service.ConsumeAnalyzeService;
import kr.ac.kopo.ctc.java.kopo00.service.ConsumeAnalyzeServiceImpl;
import kr.ac.kopo.ctc.java.kopo00.service.DatabaseService;
import kr.ac.kopo.ctc.java.kopo00.service.DatabaseServiceImpl;

public class AccountUiHome {
	/*
	 * 메인에서는 서비스를 만들어 준다. service로 접근한다. dao로는 접근하지 않는다. 한줄로 심플하게 정리되도록
	 */
	static ConsumeAnalyzeService consumeAnalyzeService = new ConsumeAnalyzeServiceImpl();
	static DatabaseService databaseService = new DatabaseServiceImpl();
	static AccountItemService accountItemService = new AccountItemServiceImpl();

	public static void main(String[] args) throws Exception {
		System.out.println("AccountUiHome");
		databaseService.load();
		Scanner in = new Scanner(System.in);

		List<AccountItem> accountItems = Database.accountItems;
		// 생성
//		createInput();

//		업데이트
//		update();

//		전체목록
//	showListAll();

//		월별목록
//		showListMonth();

		boolean isExit = false;

		while (!isExit) {
			showMainMenu();

			System.out.printf("원하시는 화면번호 입력해줄래: ");

			int n = in.nextInt();
			
			switch (n) {
			case 1:
				createInput();
				break;
			case 2:
				// 월별목록
				showListMonth();
				break;
			case 3:
				// 전체목록
				showListAll();
				break;
			case 4:
//				show4rdMenu();
				break;
			case 5:
//				show4rdMenu();
				break;
			case 6:
				consumingAnalyze();
				break;
			case 8:
				isExit = true;
				break;
			default:
				showErrorPage();
				break;
			}
			databaseService.save();
		}
		in.close();
	}

	static void showListMenu() throws Exception {

		showListMonth();

	}

	private static void consumingAnalyze() {
		Scanner in = new Scanner(System.in);
		System.out.println("소비지출 AccountUiHome-main-consumingAnalyze()");

		System.out.println("소비지출 서비스 원하는 년도 입력해줘 : ");
		int year = in.nextInt();
		System.out.println("소비지출 서비스 원하는 월 입력해줘 : ");
		int month = in.nextInt();
		List<ConsumingItem> consumingItems = consumeAnalyzeService.consumingAnalyze(year, month);
		for (ConsumingItem consumingItem : consumingItems) {

			System.out.println(
					consumingItem.getName() + ", " + consumingItem.getAmount() + ", " + consumingItem.getRate() * 100);
		}
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

	private static void createInput() throws Exception {
		AccountItem accountItem = new AccountItem();
		SimpleDateFormat tf = new SimpleDateFormat("yyyyMMdd");
		Scanner in = new Scanner(System.in);
		System.out.println("-------------------------------------------------------");
		System.out.println("<가계부 값 입력>");
		System.out.println("가계부 입력값 정보 : Desc, Date, Cash, Card, Type, Tag");
		System.out.println("세부내용 : ");
		accountItem.setDesc(in.next());
		System.out.println("날짜 : ");
//		날짜 입력 받는 타입은 "20181012 123000";
		String d = in.next();
		Date date = tf.parse(d);
//		
//		int year = Integer.parseInt(d.substring(0, 4)); // 2018
//		int month = Integer.parseInt(d.substring(4, 6)); // 10
//
//		int day = Integer.parseInt(d.substring(6, 8)); // 12
//
//		int h = Integer.parseInt(d.substring(9, 11)); // 12
//
//		int m = Integer.parseInt(d.substring(11, 13)); // 30
//
//		int s = 0;
//		
		accountItem.setDt(date);

		System.out.print("카드 사용 : ");
		accountItem.setCash(in.nextInt());
		System.out.print("현금 사용 : ");
		accountItem.setCard(in.nextInt());
		System.out.print("타입 : ");
		accountItem.setType(in.next());
		System.out.print("태그 : ");
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
		System.out.printf("월별 목록 보기 원하는 년도: ");
		int year = in.nextInt();
		System.out.printf("월별 목록 보기 원하는 월: ");
		int month = in.nextInt();
		for (AccountItem item : accountItemService.selectAllByMonth(year, month)) {
			System.out.println(item);
		}
	}

	private static void showCreateMenu() {
		// TODO Auto-generated method stub
		System.out.println("showCreateMenu()");
		System.out.print("수입을 입력하세요. ");
		System.out.println("날짜입력 : ");
		System.out.println("수업내용: ");
		System.out.println("수입입력:");
	}

	private static void showSecondMenu() {
		System.out.println("****showSecondMenu()****");
		System.out.println();
		System.out.println();
		System.out.println();
	}

	private static void showMainMenu() {
		System.out.println("*****ksw15 가계부*********");
		System.out.println("[1] 등록 ");
		System.out.println("[2] 월별목록");
		System.out.println("[3] 전체목록");
		System.out.println("[4] 수정");
		System.out.println("[5] ");

		System.out.println("[6] 소비 지출");
		System.out.println("[7] ");
		System.out.println("[8] 종료");
		System.out.println("**************************");
	}

	private static void showErrorPage() {
		System.out.print("showErrorPage");
		System.out.println("다시 입력해 주세요!");
	}

}
