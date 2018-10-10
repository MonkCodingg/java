package kr.ac.kopo.ctc.java.kopo00.dao.test;

import java.util.Date;
import java.util.List;
import kr.ac.kopo.ctc.java.kopo00.dao.AccountItemDaoImpl;
import kr.ac.kopo.ctc.java.kopo00.domain.AccountItem;

// dao의 CRUD 기능만 제대로 작동하는지 테스트
public interface AccountItemDaoTest {
	/*
	 * 자바는 static 키워드로 클래스의 필드를 공유할 수 있도록 지원 정적 변수 혹은 클래스 변수 static 키워드로 지정하여 모든
	 * 인스턴스가 공유하는 필드 정직 변수 클래스 로더가 클래스를 메서드 영역에 적재할 때 생성하므로 객체 생성 전에도 접근 가능 객체를 여러 개
	 * 생성해도 정적 변수는 하나뿐 정적 메서드는 객체를 생성하기 전에도 호출 가능. 정적 메서드를 클래스 메서드라고도 부름. 정적 메서드 유의
	 * 사항 객체 자신을 가리키는 this 키워드를 사용할 수 없다.
	 */

// AccountItemDaoImple 객체는 메서드에서 중복해서 사용한다.
// 중복 코드 제거 위해 정적 변수(or 클래스 변수) 선언.
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
		// 구성원소들 값 설정
		item.setId(id);
		item.setDt(new Date(year, month, day));
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
		// 정적변수 dao
		dao.create(item1);
		dao.create(item2);
		dao.create(item3);
		dao.create(item4);
		dao.create(item5);
	}

	// 종료
	public static void tearDown() {
		// 정적변수 dao

		dao.deleteAll();
	}

	public static void testCreate() {
		/*
		 * AccountItem item = new AccountItem(); item.setId(1); item.setDt(new Date());
		 * item.setDesc("녹차"); item.setCash(5000); item.setCard(0); item.setType("음료");
		 * item.setTag("");
		 */
		// dao 생성
		/* AccountItemDaoImpl dao = new AccountItemDaoImpl(); */
		// AccountItemDaoImpl.create 메서드 사용
		// 전달 받은 accountItem을 Database 클래스의
		// 리스트 타입 정적변수(클래스변수) accountItems에 저장.
		/* dao.create(item); */

		// 시작
		// 데이터 5개 생성
		setUp();

		// selectAll() 함수의 리턴 값 List
		// 참조타입 : AccountItem
		// List 객체 생성 초기화
		// AccountItem 참조타입으로 된 배열.
		// dao 통해 db에 저장된 것 가져옴
		// dao는 정적 변수
		List<AccountItem> list = dao.selectAll();

		/*
		 * int size() 이 리스트내에 있는 요소의 수를 돌려줍니다. 이 리스트에Integer.MAX_VALUE보다 많은 요소가 있는 경우는,
		 * Integer.MAX_VALUE를 돌려줍니다.
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
		 * item.setDesc("커피"); item.setCash(5000); item.setCard(0); item.setType("음료");
		 * item.setTag("");
		 * 
		 * AccountItemDaoImpl dao = new AccountItemDaoImpl();
		 * 
		 * dao.create(item);
		 */
		setUp();
		// 정적 변수 dao
		// 모든 메서드에서 사용하므로
		// 정적변수 (클래스 변수) static 사용
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
		 * Date()); item1.setDesc("커피"); item1.setCash(100); item1.setCard(100);
		 * item1.setType("음료"); item1.setTag("");
		 * 
		 * AccountItem item2 = new AccountItem(); item2.setId(2); item2.setDt(new
		 * Date()); item2.setDesc("초콜릿"); item2.setCash(200); item2.setCard(200);
		 * item2.setType("과자"); item2.setTag("");
		 */
		// 데이터 5개 생성 db에 저장
		setUp();
		/*
		 * AccountItemDaoImpl dao = new AccountItemDaoImpl();
		 * 
		 * dao.create(item1); dao.create(item2);
		 */
		// 정적 변수 dao 속 메서드 사용
		List<AccountItem> accountItems = dao.selectAll();
		System.out.println(accountItems.size() == 2);
	}

	public static void testSelectByMonth() {
		/*AccountItem item1 = new AccountItem();
		item1.setId(1);
		item1.setDt(new Date(2018, 10, 10));
		item1.setDesc("커피");
		item1.setCash(100);
		item1.setCard(100);
		item1.setType("음료");
		item1.setTag("");

		AccountItem item2 = new AccountItem();
		item2.setId(2);
		item2.setDt(new Date(2018, 10, 10));
		item2.setDesc("커피");
		item2.setCash(200);
		item2.setCard(200);
		item2.setType("음료");
		item2.setTag("");
		AccountItemDaoImpl dao = new AccountItemDaoImpl();
		dao.create(item1);
		dao.create(item2);*/
		
		// 정적 변수(클래스 변수) dao 사용.
		List<AccountItem> accountItems = dao.selectAllByMonth(2018, 10);
		
		//to do
		System.out.println(accountItems.size());
	}

	public static void testUpdate() {
		// accountItem 5개 생성
		setUp();

		// 업데이트 할 accountItem 객체 하나 생성 및 매개변수 통한 초기화
		// getAccountItem의 리턴 값 : AcountItem 객체
		AccountItem item = getAccountItem(6, 2018, 10, 10);

//		item.setDesc("update");

		// id 값으로 해당 객체 불어와서
		// 입력받은 data로 이전 data를 수정한다.
		// 이때 set() 이용. 구성 원소들 모두 private.
		dao.update(1, item);
		// id 값에 해당하는 db에 저장된 AccountItem 가져오기
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
