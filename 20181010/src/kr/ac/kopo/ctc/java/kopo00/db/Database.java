package kr.ac.kopo.ctc.java.kopo00.db;

import java.util.ArrayList;
import java.util.List;

import kr.ac.kopo.ctc.java.kopo00.domain.AccountItem;

public class Database {
	/*�ڹٴ� static Ű����� Ŭ������ �ʵ带 ������ �� �ֵ��� ����
	 *���� ���� Ȥ�� Ŭ���� ����
	 *	static Ű����� �����Ͽ� ��� �ν��Ͻ��� �����ϴ� �ʵ�
	 *���� ����
	 *	Ŭ���� �δ��� Ŭ������ �޼��� ������ ������ �� �����ϹǷ� 
	 *  ��ü ���� ������ ���� ����
	 *  ��ü�� ���� �� �����ص� ���� ������ �ϳ���
	 * ���� �޼���� ��ü�� �����ϱ� ������ ȣ�� ����.
	 * ���� �޼��带 Ŭ���� �޼����� �θ�.
	 * ���� �޼��� ���� ����
	 * 	��ü �ڽ��� ����Ű�� this Ű���带 ����� �� ����.
	*/
	// ch05 �迭 sec02
	// ���� �迭
	// 	ó���� �����Ͱ� ������ ������ ��찡 �ƴ϶�� ���� �迭�� �ڿ��� 
	// 	�����ϰų� ���α׷��� �ٽ� ������
	// �ڹٴ� ũ�Ⱑ �������� �迭�� �����ϱ� ���� ArrayListŬ���� ����
	// ArrayList �������� -> �����迭 -> �ε��� ��ȣ
	//ArrayList ��ü ����
	//	ArrayList<����Ÿ��> �������� = new ArrayList<>();
	//		����Ÿ�� : ���ڶ�� Integer, Long, Short, Float, Double ���� ���.
	// ����Ÿ�� : AccountItem
	// ArrayList ���� ����
	//		��������.add(������)
	//		��������.remove(�ε�����ȣ)
	//		��������.get(�ε�����ȣ)
	//		��������.size()
	public static List<AccountItem> accountItems = new ArrayList<>();
	public static int accountItems_last_id; 
}
