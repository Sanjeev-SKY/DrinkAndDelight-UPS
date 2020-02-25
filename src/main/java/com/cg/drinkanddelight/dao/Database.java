package com.cg.drinkanddelight.dao;

import java.util.HashMap;

import com.cg.drinkanddelight.model.ProductStock;

public class Database {
	public static HashMap<String, ProductStock> mMap=new HashMap<String, ProductStock>();
	
	
	public static void data() {
		mMap.put("91",new ProductStock("91","RedWine","Wid_1", 20.0));
	}
	public static HashMap<String, ProductStock> getmMap() {
		return mMap;
	}
	public static void setmMap(HashMap<String, ProductStock> mMap) {
		Database.mMap = mMap;
	}
	
	
}
