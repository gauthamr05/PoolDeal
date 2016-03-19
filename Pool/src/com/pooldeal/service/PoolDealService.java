package com.pooldeal.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.springframework.stereotype.Service;

import com.pooldeal.dao.PoolDealDAO;
import com.pooldeal.domain.Category;
import com.pooldeal.domain.CategoryDto;
import com.pooldeal.domain.Location;
import com.pooldeal.domain.SubCategoryDto;
import com.pooldeal.domain.User;

@Service
public class PoolDealService {

	PoolDealDAO dao = new PoolDealDAO();
	
	public void createUser(User user) {
		dao.createUser(user);
	}

	public boolean authUser(User user) {
		return dao.authUser(user);
	}
	
	public List<Location> fetchAllLocations() {
		return dao.fetchAllLocations();
	}
	
	public List<CategoryDto> fetchAllCategories() {
		List<Category> categories = dao.fetchAllCategories();
		List<CategoryDto> categoryList = new ArrayList<CategoryDto>();
		Map<String, List<SubCategoryDto>> map = new HashMap<String, List<SubCategoryDto>>();
		for (Category category : categories) {
			if(!map.containsKey(category.getCategory())){
				map.put(category.getCategory(), new ArrayList<SubCategoryDto>());
			}
			map.get(category.getCategory()).add(new SubCategoryDto(Integer.valueOf(category.getId()), category.getSubCategory()));
		}
		for(Entry<String, List<SubCategoryDto>> entry : map.entrySet()) {
		    String key = entry.getKey();
		    List<SubCategoryDto> value = entry.getValue();
		    CategoryDto categoryDto = new CategoryDto();
		    categoryDto.setName(key);
		    categoryDto.setSubCategoryList(value);
		    categoryList.add(categoryDto);
		}
		return categoryList;
	}

}
