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
//		createInput();
		update();
	
		databaseService.save();
//		showListAll();
//		showListMonth();
//		Scanner in = new Scanner(System.in);
//
//		boolean isExit = false;
//		
//		while (!isExit) {
//			showMainMenu();
//			
//			System.out.print("���Ͻô� ȭ���ȣ �Է����ּ���: ");
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
	
	private static void update() {
		
	}

	private static void showErrorPage() {
		System.out.println("�ٽ� �Է��� �ּ���!");
	}
	
	private static void createInput() throws Exception{
		AccountItem accountItem = new AccountItem();
		SimpleDateFormat tf = new SimpleDateFormat("yyyy-MM-dd");
		Scanner in = new Scanner(System.in);
		System.out.println("");
		System.out.println("<����� �� �Է�>");
		System.out.println("����� �Է°� ���� : Desc, Date, Cash, Card, Type, Tag");
		System.out.println("���γ��� �Է� : ");
		accountItem.setDesc(in.next());
		System.out.println("��¥ : ");
		accountItem.setDt(new Date());
		System.out.println("ī�� ��� : ");
		accountItem.setCash(in.nextInt());
		System.out.println("���� ��� : ");
		accountItem.setCard(in.nextInt());
		System.out.println("Ÿ�� : ");
		accountItem.setType(in.next());
		System.out.println("�±� : ");
		accountItem.setTag(in.next());	
		accountItemService.create(accountItem);
	}
	// ��ü���� �޼���
	private static void showListAll() throws Exception {
		for(AccountItem item : accountItemService.selectAll()) {
			System.out.println(item);
			
		}
	}
	// �������� �޼���
	private static void showListMonth() throws Exception{
		Scanner in = new Scanner(System.in);
		System.out.println("�� �Է�: ");
		int year = in.nextInt();
		System.out.println("�� �Է�: ");		
		int month = in.nextInt();
		for(AccountItem item : accountItemService.selectAllByMonth(year, month)) {
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
		System.out.println("1.�Ϻ�");
		System.out.println("2.����");
		System.out.println("3.��ü���");
		int n = in.nextInt();
	}

	private static void showMainMenu() {
		Scanner in = new Scanner(System.in);
		System.out.println("***********����ȭ��***********");
		System.out.println("1. ���");
		System.out.println("2. ����");
		System.out.println("3. ����");
		System.out.println("4. ����");
		int n = in.nextInt();
	}	

}
