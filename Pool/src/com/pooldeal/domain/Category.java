package com.pooldeal.domain;

import java.util.List;

public class Category {

	private int id;
	private String name;
	private List<SubCategory> subCategoryList;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<SubCategory> getSubCategoryList() {
		return subCategoryList;
	}
	public void setSubCategoryList(List<SubCategory> subCategoryList) {
		this.subCategoryList = subCategoryList;
	}


}
