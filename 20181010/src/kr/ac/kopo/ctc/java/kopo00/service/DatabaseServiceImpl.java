package kr.ac.kopo.ctc.java.kopo00.service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;

import kr.ac.kopo.ctc.java.kopo00.dao.AccountItemDao;
import kr.ac.kopo.ctc.java.kopo00.dao.AccountItemDaoImpl;
import kr.ac.kopo.ctc.java.kopo00.db.Database;
import kr.ac.kopo.ctc.java.kopo00.domain.AccountItem;

public class DatabaseServiceImpl implements DatabaseService {

	@Override
	public void load() throws Exception {
		AccountItemDao dao = new AccountItemDaoImpl();
		// ch03 sec03 FileReaderTest1
		BufferedReader br = new BufferedReader(new FileReader("db.txt"));
		SimpleDateFormat tf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		while (true) {
			String line = br.readLine();
			if (line != null) {
				AccountItem item = new AccountItem();
				String[] arr = line.split(",");

				item.setId(Integer.parseInt(arr[0]));
				// 스트링-> 데이트 타입 변환
				item.setDt(tf.parse(arr[1]));
				item.setDesc(arr[2]);
				item.setCash(Integer.parseInt(arr[3]));
				item.setCard(Integer.parseInt(arr[4]));
				item.setType(arr[5]);
				
				// 배열 갯수
				if (arr.length > 6) {
					item.setTag(arr[6]);
				}
				dao.create(item);
				if (Database.accountItems_last_id < item.getId()) {
					Database.accountItems_last_id = item.getId();
				}
			}
			if (line == null)
				break;
		}
		System.out.println("DatabaseServiceImpl > load() 끝");
		br.close();
	}

	@Override
	public void save() throws Exception {
		AccountItemDao dao = new AccountItemDaoImpl();
		PrintWriter pw = new PrintWriter(new FileWriter("db.txt"));
		for (AccountItem item : dao.selectAll()) {
			pw.println(item.toString());
		}
		System.out.println("DatabaseServiceImpl > save() 끝");
		pw.close();
	}

}
