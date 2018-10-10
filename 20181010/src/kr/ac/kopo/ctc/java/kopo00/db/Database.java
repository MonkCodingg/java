package kr.ac.kopo.ctc.java.kopo00.db;

import java.util.ArrayList;
import java.util.List;

import kr.ac.kopo.ctc.java.kopo00.domain.AccountItem;

public class Database {
	/*자바는 static 키워드로 클래스의 필드를 공유할 수 있도록 지원
	 *정적 변수 혹은 클래스 변수
	 *	static 키워드로 지정하여 모든 인스턴스가 공유하는 필드
	 *정직 변수
	 *	클래스 로더가 클래스를 메서드 영역에 적재할 때 생성하므로 
	 *  객체 생성 전에도 접근 가능
	 *  객체를 여러 개 생성해도 정적 변수는 하나뿐
	 * 정적 메서드는 객체를 생성하기 전에도 호출 가능.
	 * 정적 메서드를 클래스 메서드라고도 부름.
	 * 정적 메서드 유의 사항
	 * 	객체 자신을 가리키는 this 키워드를 사용할 수 없다.
	*/
	// ch05 배열 sec02
	// 동적 배열
	// 	처리할 데이터가 개수가 고정된 경우가 아니라면 정적 배열은 자원을 
	// 	낭비하거나 프로그램을 다시 컴파일
	// 자바는 크기가 유동적인 배열을 지원하기 위해 ArrayList클래스 제공
	// ArrayList 참조변수 -> 동적배열 -> 인덱스 번호
	//ArrayList 객체 생성
	//	ArrayList<참조타입> 참조변수 = new ArrayList<>();
	//		참조타입 : 숫자라면 Integer, Long, Short, Float, Double 등을 사용.
	// 참조타입 : AccountItem
	// ArrayList 원소 접근
	//		참조변수.add(데이터)
	//		참조변수.remove(인덱스번호)
	//		참조변수.get(인덱스번호)
	//		참조변수.size()
	public static List<AccountItem> accountItems = new ArrayList<>();
	public static int accountItems_last_id; 
}
