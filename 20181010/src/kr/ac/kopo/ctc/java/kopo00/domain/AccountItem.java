package kr.ac.kopo.ctc.java.kopo00.domain;

import java.text.SimpleDateFormat;
import java.util.Date;

public class AccountItem {
	private int id; 
	private Date dt;
	private String desc;
	private int cash;
	private int card;
	private String type;
	private String tag;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getDt() {
		return dt;
	}
	public void setDt(Date dt) {
		this.dt = dt;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public int getCash() {
		return cash;
	}
	public void setCash(int cash) {
		this.cash = cash;
	}
	public int getCard() {
		return card;
	}
	public void setCard(int card) {
		this.card = card;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getTag() {
		return tag;
	}
	public void setTag(String tag) {
		this.tag = tag;
	}
	public String toString() {
		SimpleDateFormat tf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return this.getId() + "," +
				tf.format(this.getDt()) + "," +
				this.getDesc() + "," +
				this.getCash() + "," +
				this.getCard() + "," +
				this.getType() + "," +
				this.getTag();
	}

}
