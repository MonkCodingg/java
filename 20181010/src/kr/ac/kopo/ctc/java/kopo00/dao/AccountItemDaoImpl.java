package kr.ac.kopo.ctc.java.kopo00.dao;

import java.util.ArrayList;
import java.util.List;

import kr.ac.kopo.ctc.java.kopo00.db.Database;
import kr.ac.kopo.ctc.java.kopo00.domain.AccountItem;

public class AccountItemDaoImpl implements AccountItemDao {

	@Override
	public void create(AccountItem item) {
// accountItems 는 정적변수(or 클래스변수)이므로 "클래스명.변수명"으로 접근
// accountItems 는 List형 타입임
// List.add() 함수는 정의되어 있는 함수
// 리스트 항목에 끝에 추가하는 함수, 리턴 값 true

		/*
		 * boolean add(E e)
		 * 
		 * 지정된 요소를 이 리스트의 마지막에 추가합니다
		 */
		
		item.setId(++Database.accountItems_last_id);
		Database.accountItems.add(item);
	}

	@Override
	public AccountItem selectOne(int id) {
//		return Database.accountItems.get(id);
		for (AccountItem item : Database.accountItems) {
			if (item.getId() == id) {
				return item;
			}
		}
		return null;
	}

	@Override
	/*
	 * 리턴값 List 배열, 배열 안 타입(참조 타입)은 AccountItem으로 하는 메서드
	 */
	public List<AccountItem> selectAll() {
	// accountItems 는 정적변수(or 클래스변수)이므로 "클래스명.변수명"으로 접근
		return Database.accountItems;
	}

//	@Override
//	public List<AccountItem> selectAllByMonth(int year, int month) {
//		List<AccountItem> result = new ArrayList<AccountItem>();
//
//		for (AccountItem item : Database.accountItems) {
//			if (item.getDt().getYear() == year && item.getDt().getMonth() == month) {
//				
//				result.add(item);
//			}
//		}
//
//		return Database.accountItems;
//	}

	@Override
	//id 값으로 해당 객체 불어와서
	//입력받은 data로 이전 data를 수정한다.
	//이때 set() 이용. 구성 원소들 모두 private.
	public void update(int id, AccountItem item) {
		AccountItem accountItem = selectOne(id);
		accountItem.setDt(item.getDt());
		accountItem.setDesc(item.getDesc());
		accountItem.setCash(item.getCash());
		accountItem.setCard(item.getCard());
		accountItem.setType(item.getType());
		accountItem.setTag(item.getTag());

	}

	@Override
	public void delete(int id) {
		AccountItem accountItem = null;
		
		// AccountItem 데이터 타입 참조변수 item 
		// 입력받은 id 값과 일치하는 AccountItem 객체를 List<accountItem>에서 찾아서
		// 지역 변수에 저장. null -> 유효값
		
		for (AccountItem item : Database.accountItems) {
			if (item.getId() == id) {
				accountItem = item;
			}
		}
		// 삭제할 accountItem 객체와 일치하는 Database.accountItems 안의 data 삭제. 
		if (accountItem != null) {
			/* boolean remove(Object  o)
			 * 
			 * 지정된 요소가 이 리스트에 있으면, 
			 * 그 최초의 것을 리스트로부터 삭제합니다(옵션의 조작). 
			 * 이 리스트에 그 요소가 없는 경우는, 변경되지 않습니다. 
			 * 즉,(o==null ?  get(i) ==null : o.equals(get(i)))가 되는, 
			 * 최소의 인덱스치i를 가지는 요소를 삭제합니다(그러한 요소가 존재하는 경우).
			 *  지정된 요소가 이 리스트에 포함되어 있었을 경우
			 *  (즉, 소환의 결과로서 이 리스트가 변경되었을 경우)는true를 돌려줍니다.
			*/
			Database.accountItems.remove(accountItem);
		}
	}

	@Override
	public void deleteAll() {
		/*
		 * void clear()
		 * 
		 * 모든 요소를 이 리스트로부터 삭제합니다(옵션의 조작). 이 소환이 돌아오면(자), 이 리스트는 비웁니다. 정의:clear , 인터페이스
		 * :Collection <E > 예외:UnsupportedOperationException - clear오퍼레이션이 이 리스트로 서포트되지
		 * 않는 경우
		 */
		Database.accountItems.clear();
	}

}
