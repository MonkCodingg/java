package kr.ac.kopo.ctc.java.kopo00.dao.test;

import java.util.Date;
import java.util.List;
import kr.ac.kopo.ctc.java.kopo00.dao.AccountItemDaoImpl;
import kr.ac.kopo.ctc.java.kopo00.domain.AccountItem;

// dao�� CRUD ��ɸ� ����� �۵��ϴ��� �׽�Ʈ
public interface AccountItemDaoTest {
	/*
	 * �ڹٴ� static Ű����� Ŭ������ �ʵ带 ������ �� �ֵ��� ���� ���� ���� Ȥ�� Ŭ���� ���� static Ű����� �����Ͽ� ���
	 * �ν��Ͻ��� �����ϴ� �ʵ� ���� ���� Ŭ���� �δ��� Ŭ������ �޼��� ������ ������ �� �����ϹǷ� ��ü ���� ������ ���� ���� ��ü�� ���� ��
	 * �����ص� ���� ������ �ϳ��� ���� �޼���� ��ü�� �����ϱ� ������ ȣ�� ����. ���� �޼��带 Ŭ���� �޼����� �θ�. ���� �޼��� ����
	 * ���� ��ü �ڽ��� ����Ű�� this Ű���带 ����� �� ����.
	 */

// AccountItemDaoImple ��ü�� �޼��忡�� �ߺ��ؼ� ����Ѵ�.
// �ߺ� �ڵ� ���� ���� ���� ����(or Ŭ���� ����) ����.
	static AccountItemDaoImpl dao = new AccountItemDaoImpl();

	public static void main(String[] args) {
//		testCreate();
//		testSlectOne();
//		testSelectAll();
		testSelectByMonth();
//		testUpdate();
//		testDelete();
	}

	public static AccountItem getAccountItem(int id, int year, int month, int day) {
		AccountItem item = new AccountItem();
		// �������ҵ� �� ����
		item.setId(id);
		item.setDt(new Date(year, month, day));
		item.setDesc("desc" + id);
		item.setCash(100 * id);
		item.setCard(100 * id);
		item.setType("�Ĵ�" + id);
		item.setTag("tag" + id);
		return item;
	}

	// ����
	// test �� ������ 5�� ����

	public static void setUp() {
		AccountItem item1 = getAccountItem(1, 2018, 8, 10);
		AccountItem item2 = getAccountItem(2, 2018, 9, 10);
		AccountItem item3 = getAccountItem(3, 2018, 9, 10);
		AccountItem item4 = getAccountItem(4, 2018, 10, 10);
		AccountItem item5 = getAccountItem(5, 2018, 10, 10);

		// AccountItemDaoImpl.create(AccountItem ��ü)
		// �������� dao
		dao.create(item1);
		dao.create(item2);
		dao.create(item3);
		dao.create(item4);
		dao.create(item5);
	}

	// ����
	public static void tearDown() {
		// �������� dao

		dao.deleteAll();
	}

	public static void testCreate() {
		/*
		 * AccountItem item = new AccountItem(); item.setId(1); item.setDt(new Date());
		 * item.setDesc("����"); item.setCash(5000); item.setCard(0); item.setType("����");
		 * item.setTag("");
		 */
		// dao ����
		/* AccountItemDaoImpl dao = new AccountItemDaoImpl(); */
		// AccountItemDaoImpl.create �޼��� ���
		// ���� ���� accountItem�� Database Ŭ������
		// ����Ʈ Ÿ�� ��������(Ŭ��������) accountItems�� ����.
		/* dao.create(item); */

		// ����
		// ������ 5�� ����
		setUp();

		// selectAll() �Լ��� ���� �� List
		// ����Ÿ�� : AccountItem
		// List ��ü ���� �ʱ�ȭ
		// AccountItem ����Ÿ������ �� �迭.
		// dao ���� db�� ����� �� ������
		// dao�� ���� ����
		List<AccountItem> list = dao.selectAll();

		/*
		 * int size() �� ����Ʈ���� �ִ� ����� ���� �����ݴϴ�. �� ����Ʈ��Integer.MAX_VALUE���� ���� ��Ұ� �ִ� ����,
		 * Integer.MAX_VALUE�� �����ݴϴ�.
		 */
//		System.out.println(list.size());
		for (AccountItem accountItem : list) {
			System.out.println(accountItem.getId());
			System.out.println(accountItem.getDesc());
		}
	}
	
	public static void testSlectOne() {
		/*
		 * AccountItem item = new AccountItem(); item.setId(1); item.setDt(new Date());
		 * item.setDesc("Ŀ��"); item.setCash(5000); item.setCard(0); item.setType("����");
		 * item.setTag("");
		 * 
		 * AccountItemDaoImpl dao = new AccountItemDaoImpl();
		 * 
		 * dao.create(item);
		 */
		setUp();
		// ���� ���� dao
		// ��� �޼��忡�� ����ϹǷ�
		// �������� (Ŭ���� ����) static ���
		AccountItem accountItem = dao.selectOne(1);
		System.out.println(accountItem.getId());
		System.out.println(accountItem.getDesc());
//		List<AccountItem> list = dao.selectAll();
//		
//		System.out.println(list.size());
//		for (AccountItem accountItem: list) {
//			System.out.println(accountItem.getId());
//			System.out.println(accountItem.getDesc());
//		}
	}
	
	public static void testSelectAll() {
		/*
		 * AccountItem item1 = new AccountItem(); item1.setId(1); item1.setDt(new
		 * Date()); item1.setDesc("Ŀ��"); item1.setCash(100); item1.setCard(100);
		 * item1.setType("����"); item1.setTag("");
		 * 
		 * AccountItem item2 = new AccountItem(); item2.setId(2); item2.setDt(new
		 * Date()); item2.setDesc("���ݸ�"); item2.setCash(200); item2.setCard(200);
		 * item2.setType("����"); item2.setTag("");
		 */
		// ������ 5�� ���� db�� ����
		setUp();
		/*
		 * AccountItemDaoImpl dao = new AccountItemDaoImpl();
		 * 
		 * dao.create(item1); dao.create(item2);
		 */
		// ���� ���� dao �� �޼��� ���
		List<AccountItem> accountItems = dao.selectAll();
		System.out.println(accountItems.size() == 2);
	}

	public static void testSelectByMonth() {
		/*AccountItem item1 = new AccountItem();
		item1.setId(1);
		item1.setDt(new Date(2018, 10, 10));
		item1.setDesc("Ŀ��");
		item1.setCash(100);
		item1.setCard(100);
		item1.setType("����");
		item1.setTag("");

		AccountItem item2 = new AccountItem();
		item2.setId(2);
		item2.setDt(new Date(2018, 10, 10));
		item2.setDesc("Ŀ��");
		item2.setCash(200);
		item2.setCard(200);
		item2.setType("����");
		item2.setTag("");
		AccountItemDaoImpl dao = new AccountItemDaoImpl();
		dao.create(item1);
		dao.create(item2);*/
		
		// ���� ����(Ŭ���� ����) dao ���.
		List<AccountItem> accountItems = dao.selectAllByMonth(2018, 10);
		
		//to do
		System.out.println(accountItems.size());
	}

	public static void testUpdate() {
		// accountItem 5�� ����
		setUp();

		// ������Ʈ �� accountItem ��ü �ϳ� ���� �� �Ű����� ���� �ʱ�ȭ
		// getAccountItem�� ���� �� : AcountItem ��ü
		AccountItem item = getAccountItem(6, 2018, 10, 10);

//		item.setDesc("update");

		// id ������ �ش� ��ü �Ҿ�ͼ�
		// �Է¹��� data�� ���� data�� �����Ѵ�.
		// �̶� set() �̿�. ���� ���ҵ� ��� private.
		dao.update(1, item);
		// id ���� �ش��ϴ� db�� ����� AccountItem ��������
		AccountItem accountItem = dao.selectOne(1);
		System.out.println(accountItem.getDesc().equals("desc6"));
		tearDown();
	}
	
	public static void testDelete() {
		setUp();
		dao.delete(1);
		System.out.println(dao.selectAll().size() == 4);
		tearDown();
//		System.out.println(dao.selectAll().size());
	}

}
