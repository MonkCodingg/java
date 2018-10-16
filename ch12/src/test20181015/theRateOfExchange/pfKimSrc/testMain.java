package test20181015.theRateOfExchange.pfKimSrc;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class testMain {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		double rate;
		String nation;
		List<NationItem> data = new ArrayList<NationItem>();
		BufferedReader br = new BufferedReader(new FileReader("c:\\test\\input.csv"));
		while(true) {
			String line = br.readLine();
			if(line == null) break;
			String[] splitString;
			splitString = line.split(",");
			nation = splitString[0];
			rate = Double.parseDouble(splitString[1]);
			
			NationItem item = new NationItem();
			item.nation = nation;
			item.rate = rate;
			data.add(item);			
		}
		String inputCode;
		double won = 0;
		System.out.println("국가코드를 입력하세요 : ");
		Scanner in = new Scanner(System.in);
		inputCode = in.nextLine();
		System.out.println("원화를 입력하세요. : ");
		won = in.nextDouble();
		
		double result = 0;
		for(NationItem tempNation : data) {
			if(inputCode.equals(tempNation.nation)) {
				// 계산
				result = won * tempNation.rate;
			}
		}
		System.out.println("결과 : " + result);

		br.close();
	}

}
