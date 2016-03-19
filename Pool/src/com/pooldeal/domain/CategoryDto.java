package com.pooldeal.domain;

import java.util.List;

public class CategoryDto {

	private String name;
	private List<SubCategoryDto> subCategoryList;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<SubCategoryDto> getSubCategoryList() {
		return subCategoryList;
	}
	public void setSubCategoryList(List<SubCategoryDto> subCategoryList) {
		this.subCategoryList = subCategoryList;
	}


}
