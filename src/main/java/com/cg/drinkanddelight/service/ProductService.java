package com.cg.drinkanddelight.service;

import java.time.LocalDate;
import java.util.HashMap;

import com.cg.drinkanddelight.dao.DAO;
import com.cg.drinkanddelight.dao.Database;
import com.cg.drinkanddelight.dao.ProductDAO;
import com.cg.drinkanddelight.dao.ProductDAOImpl;
import com.cg.drinkanddelight.model.ProductStock;

public class ProductService{
	ProductDAO pd=new ProductDAOImpl();
	public String exitDateCheck(String id, LocalDate date) {
		
		 ProductStock ps=DAO.findById(id);

		 if(ps!=null) {
			 ps.setExitDate(date);
			 if(pd.exitDateCheck(ps)) {
				 ps.setExitDate(date);
				 return "Exit Date Set";
			 }
		 }
		 return "Exit Date not Set";
	}
	
	public String updateProductStock(String orderId, LocalDate manufacturingDate, LocalDate expiryDate, String qualityAnalysis) {
		
		ProductStock ps=new ProductStock();
		ps.setOrderId(orderId);
		ps.setManufacturingDate(manufacturingDate);
		ps.setExpiryDate(expiryDate);
		ps.setQualityCheck(qualityAnalysis);
		return pd.updateProductStock(ps);
		
		}
	
	public void getKeys() {
		HashMap<String,ProductStock> mMap=Database.getmMap();
		pd.getAllKeys(mMap);
	}
	
}
