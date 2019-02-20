package kr.ac.kopo.ctc.java.kopo00.service.test;

import java.util.Date;

import kr.ac.kopo.ctc.java.kopo00.dao.AccountItemDao;
import kr.ac.kopo.ctc.java.kopo00.dao.AccountItemDaoImpl;
import kr.ac.kopo.ctc.java.kopo00.domain.AccountItem;
import kr.ac.kopo.ctc.java.kopo00.service.DatabaseService;
import kr.ac.kopo.ctc.java.kopo00.service.DatabaseServiceImpl;

public class DatabaseServiceTest {
	static DatabaseService databaseService = new DatabaseServiceImpl();
	static AccountItemDao accountItemDao = new AccountItemDaoImpl();

	public static AccountItem getAccountItem(int id, int year, int month, int day) {
		AccountItem item = new AccountItem();
		// �������ҵ� �� ����
		item.setId(id);
		item.setDt(new Date(year - 1900, month - 1, day));
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
		// �������� accountItemDao
		accountItemDao.create(item1);
		accountItemDao.create(item2);
		accountItemDao.create(item3);
		accountItemDao.create(item4);
		accountItemDao.create(item5);
	}

	public static void tearDown() {
		// �������� accountItemDao

		accountItemDao.deleteAll();
	}

	public static void testLoad() throws Exception {
		databaseService.load();
		System.out.println(accountItemDao.selectAll().size());
	}

	public static void testSave() throws Exception {
		setUp();
		databaseService.save();
	}

	public static void main(String[] args) throws Exception {
		System.out.println("DatabaseServiceTest");
//		testLoad();
		testSave();

	}
}
