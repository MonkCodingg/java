package kr.ac.kopo.ctc.java.kopo00.service;

import java.util.ArrayList;
import java.util.List;

import kr.ac.kopo.ctc.java.kopo00.domain.AccountItem;
import kr.ac.kopo.ctc.java.kopo00.dto.ConsumingItem;

public class ConsumeAnalyzeServiceImpl implements ConsumeAnalyzeService{
	private AccountItemService accountItemService = new AccountItemServiceImpl();
	
	@Override
	public List<ConsumingItem> consumingAnalyze(int year, int month) {
		List<AccountItem> items = accountItemService.selectAllByMonth(year, month);
//		식비, 300000, 0.2 => ConsumingItem
//		의류, 200000, 0.13 => ConsumingItem
//		교육비, 500000, 0.33 => ConsumingItem
//		월세, 500000, 0.33 => ConsumingItem
		List<ConsumingItem> result = new ArrayList<ConsumingItem>();
		ConsumingItem item1 = new ConsumingItem(); // 식비
		item1.setName("식비");
		ConsumingItem item2 = new ConsumingItem(); // 의류
		item2.setName("의류");
		ConsumingItem item3 = new ConsumingItem(); // 교육
		item3.setName("교육");
		ConsumingItem item4 = new ConsumingItem(); // 주거
		item4.setName("주거");
		
		for (AccountItem item : items) {
			if (item.getType().equals("식비")) {
				item1.setAmount(item1.getAmount() + item.getCard() + item.getCash());
			}else if(item.getType().equals("의류")) {
				item2.setAmount(item2.getAmount() + item.getCard() + item.getCash());
			}else if(item.getType().equals("교육")) {
				item3.setAmount(item3.getAmount() + item.getCard() + item.getCash());
			}else if(item.getType().equals("주거")) {
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
		
//		return "저축비율은 얼마고, 소비비율은 얼마입니다.";
		return result;
	}
	
}
