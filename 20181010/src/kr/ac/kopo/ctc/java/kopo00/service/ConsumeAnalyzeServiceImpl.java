package kr.ac.kopo.ctc.java.kopo00.service;

import java.util.List;

import kr.ac.kopo.ctc.java.kopo00.domain.AccountItem;

public class ConsumeAnalyzeServiceImpl implements ConsumeAnalyzeService{
	private AccountItemService accountItemService = new AccountItemServiceImpl();
	
	@Override
	public String analyze() {
		List<AccountItem> items = accountItemService.selectAllByMonth(2018, 10);
		
		int sum1 = 0;
		int sum2 = 0;
		for (AccountItem item : items) {
			
			
		}
		return "저축비율은 얼마고, 소비비율은 얼마입니다.";
	}
	
}
