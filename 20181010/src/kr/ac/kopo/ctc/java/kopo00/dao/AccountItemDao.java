package kr.ac.kopo.ctc.java.kopo00.dao;


import java.util.List;

import kr.ac.kopo.ctc.java.kopo00.domain.AccountItem;

public interface AccountItemDao {
	void create(AccountItem item);

	AccountItem selectOne(int id);
	List<AccountItem> selectAll();
	List<AccountItem> selectAllByMonth(int year, int month);
	
	void update(int id, AccountItem item);
	
	void delete(int id);
	void deleteAll();
}
