package kr.ac.kopo.ctc.java.kopo00.dao;

import java.util.ArrayList;
import java.util.List;

import kr.ac.kopo.ctc.java.kopo00.db.Database;
import kr.ac.kopo.ctc.java.kopo00.domain.AccountItem;

public class AccountItemDaoImpl implements AccountItemDao {

	@Override
	public void create(AccountItem item) {
// accountItems �� ��������(or Ŭ��������)�̹Ƿ� "Ŭ������.������"���� ����
// accountItems �� List�� Ÿ����
// List.add() �Լ��� ���ǵǾ� �ִ� �Լ�
// ����Ʈ �׸� ���� �߰��ϴ� �Լ�, ���� �� true

		/*
		 * boolean add(E e)
		 * 
		 * ������ ��Ҹ� �� ����Ʈ�� �������� �߰��մϴ�
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
	 * ���ϰ� List �迭, �迭 �� Ÿ��(���� Ÿ��)�� AccountItem���� �ϴ� �޼���
	 */
	public List<AccountItem> selectAll() {
	// accountItems �� ��������(or Ŭ��������)�̹Ƿ� "Ŭ������.������"���� ����
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
	//id ������ �ش� ��ü �Ҿ�ͼ�
	//�Է¹��� data�� ���� data�� �����Ѵ�.
	//�̶� set() �̿�. ���� ���ҵ� ��� private.
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
		
		// AccountItem ������ Ÿ�� �������� item 
		// �Է¹��� id ���� ��ġ�ϴ� AccountItem ��ü�� List<accountItem>���� ã�Ƽ�
		// ���� ������ ����. null -> ��ȿ��
		
		for (AccountItem item : Database.accountItems) {
			if (item.getId() == id) {
				accountItem = item;
			}
		}
		// ������ accountItem ��ü�� ��ġ�ϴ� Database.accountItems ���� data ����. 
		if (accountItem != null) {
			/* boolean remove(Object  o)
			 * 
			 * ������ ��Ұ� �� ����Ʈ�� ������, 
			 * �� ������ ���� ����Ʈ�κ��� �����մϴ�(�ɼ��� ����). 
			 * �� ����Ʈ�� �� ��Ұ� ���� ����, ������� �ʽ��ϴ�. 
			 * ��,(o==null ?  get(i) ==null : o.equals(get(i)))�� �Ǵ�, 
			 * �ּ��� �ε���ġi�� ������ ��Ҹ� �����մϴ�(�׷��� ��Ұ� �����ϴ� ���).
			 *  ������ ��Ұ� �� ����Ʈ�� ���ԵǾ� �־��� ���
			 *  (��, ��ȯ�� ����μ� �� ����Ʈ�� ����Ǿ��� ���)��true�� �����ݴϴ�.
			*/
			Database.accountItems.remove(accountItem);
		}
	}

	@Override
	public void deleteAll() {
		/*
		 * void clear()
		 * 
		 * ��� ��Ҹ� �� ����Ʈ�κ��� �����մϴ�(�ɼ��� ����). �� ��ȯ�� ���ƿ���(��), �� ����Ʈ�� ���ϴ�. ����:clear , �������̽�
		 * :Collection <E > ����:UnsupportedOperationException - clear���۷��̼��� �� ����Ʈ�� ����Ʈ����
		 * �ʴ� ���
		 */
		Database.accountItems.clear();
	}

}
