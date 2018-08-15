package com.lilith.mybatis.entity;

public class CodeLibrary {
	String codeNo;
	String itemNo;
	String itemName;
	public String getCodeNo() {
		return codeNo;
	}
	public void setCodeNo(String codeNo) {
		this.codeNo = codeNo;
	}
	public String getItemNo() {
		return itemNo;
	}
	public void setItemNo(String itemNo) {
		this.itemNo = itemNo;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	@Override
	public String toString() {
		return "CodeNo:"+codeNo+", ItemNo:"+itemNo+", ItemName:"+itemName;
	}
}
