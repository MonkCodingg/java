package kr.ac.kopo.ctc.java.kopo00.service;

import java.util.List;

import kr.ac.kopo.ctc.java.kopo00.dto.ConsumingItem;

public interface ConsumeAnalyzeService {
	List<ConsumingItem> consumingAnalyze(int year, int month);
}
