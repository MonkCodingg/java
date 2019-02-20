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
		// 구성원소들 값 설정
		item.setId(id);
		item.setDt(new Date(year - 1900, month - 1, day));
		item.setDesc("desc" + id);
		item.setCash(100 * id);
		item.setCard(100 * id);
		item.setType("식대" + id);
		item.setTag("tag" + id);
		return item;
	}

	// 시작
	// test 할 데이터 5개 생성

	public static void setUp() {
		AccountItem item1 = getAccountItem(1, 2018, 8, 10);
		AccountItem item2 = getAccountItem(2, 2018, 9, 10);
		AccountItem item3 = getAccountItem(3, 2018, 9, 10);
		AccountItem item4 = getAccountItem(4, 2018, 10, 10);
		AccountItem item5 = getAccountItem(5, 2018, 10, 10);

		// AccountItemDaoImpl.create(AccountItem 객체)
		// 정적변수 accountItemDao
		accountItemDao.create(item1);
		accountItemDao.create(item2);
		accountItemDao.create(item3);
		accountItemDao.create(item4);
		accountItemDao.create(item5);
	}

	public static void tearDown() {
		// 정적변수 accountItemDao

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
