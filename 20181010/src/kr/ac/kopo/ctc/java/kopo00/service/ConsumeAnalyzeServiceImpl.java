package kr.ac.kopo.ctc.java.kopo00.service;

import java.util.ArrayList;
import java.util.List;

import kr.ac.kopo.ctc.java.kopo00.domain.AccountItem;
import kr.ac.kopo.ctc.java.kopo00.dto.ConsumingItem;

public class ConsumeAnalyzeServiceImpl implements ConsumeAnalyzeService{
	private AccountItemService accountItemService = new AccountItemServiceImpl();
	
	@Override
	public List<ConsumingItem> consumingAnalyze(int year, int month) {
		// ����ڷ� ���� �Է� ���� �⵵�� ���� ���� ��ϰ�������
		List<AccountItem> items = accountItemService.selectAllByMonth(year, month);
//		�ĺ�, 300000, 0.2 => ConsumingItem
//		�Ƿ�, 200000, 0.13 => ConsumingItem
//		����, 500000, 0.33 => ConsumingItem
//		����, 500000, 0.33 => ConsumingItem

		List<ConsumingItem> result = new ArrayList<ConsumingItem>();
		//���� Ÿ���� �������� ������ ������ ������ ����� ��ü ����
		ConsumingItem item1 = new ConsumingItem(); // �ĺ�
		item1.setName("�ĺ�");
		ConsumingItem item2 = new ConsumingItem(); // �Ƿ�
		item2.setName("�Ƿ�");
		ConsumingItem item3 = new ConsumingItem(); // ����
		item3.setName("����");
		ConsumingItem item4 = new ConsumingItem(); // �ְ�
		item4.setName("�ְ�");
		
		// ������ ���� ��� �� Ÿ�� ���� ���� ������
		//������ ������ �հ跮�� ���� �Խù��� ī�����, ���� ��븦 �����Ͽ� 
		//������ ������ �հ� �׸� ���Ѵ�.
		//item1.getAmount()�� ���� �ͼ� ���ϴ� ������ for each ��
		//�ݺ��Ҷ� ������ ���� �ٽ� ���ؾ� �ϱ� ����
		for (AccountItem item : items) {
			if (item.getType().equals("�ĺ�")) {
				item1.setAmount(item1.getAmount() + item.getCard() + item.getCash());
			}else if(item.getType().equals("�Ƿ�")) {
				item2.setAmount(item2.getAmount() + item.getCard() + item.getCash());
			}else if(item.getType().equals("����")) {
				item3.setAmount(item3.getAmount() + item.getCard() + item.getCash());
			}else if(item.getType().equals("�ְ�")) {
				item4.setAmount(item4.getAmount() + item.getCard() + item.getCash());
			}
			
		}
		
		double total = item1.getAmount() 
					+ item2.getAmount() 
					+ item3.getAmount() 
					+ item4.getAmount();
		
		item1.setRate(item1.getAmount()/total);
		item2.setRate(item2.getAmount()/total);
		item3.setRate(item3.getAmount()/total);
		item4.setRate(item4.getAmount()/total);
		
		result.add(item1);
		result.add(item2);
		result.add(item3);
		result.add(item4);
		
//		return "��������� �󸶰�, �Һ������ ���Դϴ�.";
		return result;
	}
	
}
