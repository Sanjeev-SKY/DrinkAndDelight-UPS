package com.cg.drinkanddelight.dao;

import com.cg.drinkanddelight.model.ProductStock;

public interface ProductDAO {

public String trackProductOrder(ProductStock productStock);
	
	public boolean processDateCheck(ProductStock productStock);
	
	public String updateExitDateinStock(ProductStock productStock);
	
	public String updateProductStock(ProductStock productStock);
	
	public boolean doesProductOrderIdExistinStock(String orderId);
	
	public boolean doesProductOrderIdExist(String orderId);
	
	public boolean exitDateCheck(ProductStock productStock);
	
}
