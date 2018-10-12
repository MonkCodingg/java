package kr.ac.kopo.ctc.java.kopo00.service;

import java.util.ArrayList;
import java.util.List;

import kr.ac.kopo.ctc.java.kopo00.dao.AccountItemDao;
import kr.ac.kopo.ctc.java.kopo00.dao.AccountItemDaoImpl;
import kr.ac.kopo.ctc.java.kopo00.db.Database;
import kr.ac.kopo.ctc.java.kopo00.domain.AccountItem;

public class AccountItemServiceImpl implements AccountItemService {
	
	private AccountItemDao accountItemDao = new AccountItemDaoImpl();
	
	
	@Override
	public void create(AccountItem item) {
		accountItemDao.create(item);
	}

	@Override
	public AccountItem selectOne(int id) {
		return accountItemDao.selectOne(id);
	}

	@Override
	public List<AccountItem> selectAll() {
		return accountItemDao.selectAll();
	}

	@Override
	public List<AccountItem> selectAllByMonth(int year, int month) {
		List<AccountItem> result = new ArrayList<>();
		for (AccountItem item : Database.accountItems) {
			
			if (item.getDt().getYear() + 1900 == year && item.getDt().getMonth() + 1 == month) {
				
				result.add(item);
			}
		}
		
		return result;
	}

	@Override
	public void update(int id, AccountItem item) {
		accountItemDao.update(id, item);
	}

	@Override
	public void delete(int id) {
		accountItemDao.delete(id);
	}

	@Override
	public void deleteAll() {
		accountItemDao.deleteAll();
	}
	
}
