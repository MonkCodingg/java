package kr.ac.kopo.ctc.java.kopo00.service;

import java.util.ArrayList;
import java.util.List;

import kr.ac.kopo.ctc.java.kopo00.domain.AccountItem;
import kr.ac.kopo.ctc.java.kopo00.dto.ConsumingItem;

public class ConsumeAnalyzeServiceImpl implements ConsumeAnalyzeService{
	private AccountItemService accountItemService = new AccountItemServiceImpl();
	
	@Override
	public List<ConsumingItem> consumingAnalyze(int year, int month) {
		// 사용자로 부터 입력 받은 년도와 월로 월별 목록가져오기
		List<AccountItem> items = accountItemService.selectAllByMonth(year, month);
//		식비, 300000, 0.2 => ConsumingItem
//		의류, 200000, 0.13 => ConsumingItem
//		교육, 500000, 0.33 => ConsumingItem
//		월세, 500000, 0.33 => ConsumingItem

		List<ConsumingItem> result = new ArrayList<ConsumingItem>();
		//각각 타입의 종류별로 저장할 컨슈밍 아이템 저장소 객체 생성
		ConsumingItem item1 = new ConsumingItem(); // 식비
		item1.setName("식비");
		ConsumingItem item2 = new ConsumingItem(); // 의류
		item2.setName("의류");
		ConsumingItem item3 = new ConsumingItem(); // 교육
		item3.setName("교육");
		ConsumingItem item4 = new ConsumingItem(); // 주거
		item4.setName("주거");
		
		// 가져온 월별 목록 중 타입 값에 따라 나누고
		//컨슈밍 아이템 합계량에 개별 게시물의 카드사용료, 현금 사용를 추출하여 
		//컨슈밍 아이템 합계 항목에 더한다.
		//item1.getAmount()를 가져 와서 더하는 이유는 for each 문
		//반복할때 저장한 값에 다시 더해야 하기 때문
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
