package com.cg.drinkanddelight.dao;

import java.util.HashMap;

import com.cg.drinkanddelight.model.ProductStock;

public class Database {
	public static HashMap<String, ProductStock> mMap=new HashMap<String, ProductStock>();
	
	
	public static void data() {
		mMap.put("ID_1",new ProductStock("ID_1","Calsberg","Wid_1", 20.0));
		mMap.put("ID_2",new ProductStock("ID_2","Budweiser","Wid_3", 46.0));
		mMap.put("ID_3",new ProductStock("ID_3","Brocode","Wid_8", 12.0));
		mMap.put("ID_4",new ProductStock("ID_4","Kingfisher","Wid_7", 25.0));
		mMap.put("ID_5",new ProductStock("ID_5","Tuborg","Wid_12", 30.0));
	}
	public static HashMap<String, ProductStock> getmMap() {
		return mMap;
	}
	public static void setmMap(HashMap<String, ProductStock> mMap) {
		Database.mMap = mMap;
	}
	
	
}
