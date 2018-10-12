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
	 * ���ο����� ���񽺸� ����� �ش�. service�� �����Ѵ�. dao�δ� �������� �ʴ´�. ���ٷ� �����ϰ� �����ǵ���
	 */
	static ConsumeAnalyzeService consumeAnalyzeService = new ConsumeAnalyzeServiceImpl();
	static DatabaseService databaseService = new DatabaseServiceImpl();
	static AccountItemService accountItemService = new AccountItemServiceImpl();

	public static void main(String[] args) throws Exception {
		System.out.println("AccountUiHome");
		databaseService.load();
		Scanner in = new Scanner(System.in);

		List<AccountItem> accountItems = Database.accountItems;
		// ����
//		createInput();

//		������Ʈ
//		update();

//		��ü���
//	showListAll();

//		�������
//		showListMonth();

		boolean isExit = false;

		while (!isExit) {
			showMainMenu();

			System.out.printf("���Ͻô� ȭ���ȣ �Է����ٷ�: ");

			int n = in.nextInt();
			
			switch (n) {
			case 1:
				createInput();
				break;
			case 2:
				// �������
				showListMonth();
				break;
			case 3:
				// ��ü���
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
		System.out.println("�Һ����� AccountUiHome-main-consumingAnalyze()");

		System.out.println("�Һ����� ���� ���ϴ� �⵵ �Է����� : ");
		int year = in.nextInt();
		System.out.println("�Һ����� ���� ���ϴ� �� �Է����� : ");
		int month = in.nextInt();
		List<ConsumingItem> consumingItems = consumeAnalyzeService.consumingAnalyze(year, month);
		for (ConsumingItem consumingItem : consumingItems) {

			System.out.println(
					consumingItem.getName() + ", " + consumingItem.getAmount() + ", " + consumingItem.getRate() * 100);
		}
	}

	private static void update() throws Exception {
		// ��ü ��� �����ֱ�
		showListAll();
		AccountItem accountItem = new AccountItem();

		Scanner in = new Scanner(System.in);
		// ������ �Խñ� id�� �Է¹ޱ�.
		System.out.println("");
		System.out.println("<����>");
		System.out.println("������ �Խñ� id�� �Է� : ");
		int id = in.nextInt();
		accountItem.setId(id);

		// ������ ���� �Է� �ޱ�
		System.out.println("<�����ϱ�>");
		System.out.println("������ ���γ��� �Է� : ");
		accountItem.setDesc(in.next());
		System.out.println("������ ��¥ : ");
		accountItem.setDt(new Date());
		System.out.println("������ ī�� ��� : ");
		accountItem.setCash(in.nextInt());
		System.out.println("������ ���� ��� : ");
		accountItem.setCard(in.nextInt());
		System.out.println("������ Ÿ�� : ");
		accountItem.setType(in.next());
		System.out.println("������ �±� : ");
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
		System.out.println("<����� �� �Է�>");
		System.out.println("����� �Է°� ���� : Desc, Date, Cash, Card, Type, Tag");
		System.out.println("���γ��� : ");
		accountItem.setDesc(in.next());
		System.out.println("��¥ : ");
//		��¥ �Է� �޴� Ÿ���� "20181012 123000";
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

		System.out.print("ī�� ��� : ");
		accountItem.setCash(in.nextInt());
		System.out.print("���� ��� : ");
		accountItem.setCard(in.nextInt());
		System.out.print("Ÿ�� : ");
		accountItem.setType(in.next());
		System.out.print("�±� : ");
		accountItem.setTag(in.next());
		accountItemService.create(accountItem);
	}

	// ��ü���� �޼���
	private static void showListAll() throws Exception {
		for (AccountItem item : accountItemService.selectAll()) {
			System.out.println(item);
		}
	}

	// �������� �޼���
	private static void showListMonth() throws Exception {
		Scanner in = new Scanner(System.in);
		System.out.printf("���� ��� ���� ���ϴ� �⵵: ");
		int year = in.nextInt();
		System.out.printf("���� ��� ���� ���ϴ� ��: ");
		int month = in.nextInt();
		for (AccountItem item : accountItemService.selectAllByMonth(year, month)) {
			System.out.println(item);
		}
	}

	private static void showCreateMenu() {
		// TODO Auto-generated method stub
		System.out.println("showCreateMenu()");
		System.out.print("������ �Է��ϼ���. ");
		System.out.println("��¥�Է� : ");
		System.out.println("��������: ");
		System.out.println("�����Է�:");
	}

	private static void showSecondMenu() {
		System.out.println("****showSecondMenu()****");
		System.out.println();
		System.out.println();
		System.out.println();
	}

	private static void showMainMenu() {
		System.out.println("*****ksw15 �����*********");
		System.out.println("[1] ��� ");
		System.out.println("[2] �������");
		System.out.println("[3] ��ü���");
		System.out.println("[4] ����");
		System.out.println("[5] ");

		System.out.println("[6] �Һ� ����");
		System.out.println("[7] ");
		System.out.println("[8] ����");
		System.out.println("**************************");
	}

	private static void showErrorPage() {
		System.out.print("showErrorPage");
		System.out.println("�ٽ� �Է��� �ּ���!");
	}

}
