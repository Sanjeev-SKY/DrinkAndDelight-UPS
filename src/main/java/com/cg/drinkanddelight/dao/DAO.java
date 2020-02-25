package com.cg.drinkanddelight.dao;

import com.cg.drinkanddelight.model.ProductStock;
public class DAO {
	public static ProductDAOImpl psi=new ProductDAOImpl();
	
	public static ProductStock findById(String id) {
		
		if(psi.doesProductOrderIdExistinStock(id)) {
	
			return Database.getmMap().get(id);
		}
		return null;
	}
	
}
