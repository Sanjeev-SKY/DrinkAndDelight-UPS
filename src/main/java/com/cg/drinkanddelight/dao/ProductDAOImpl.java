package com.cg.drinkanddelight.dao;

import java.time.LocalDate;

import com.cg.drinkanddelight.model.ProductStock;

public class ProductDAOImpl implements ProductDAO{

	@Override
	public String trackProductOrder(ProductStock productStock) {

		return null;
	}

	@Override
	public boolean processDateCheck(ProductStock productStock) {

		return false;
	}

	@Override
	public String updateExitDateinStock(ProductStock productStock) {

		return null;
	}

	@Override
	public String updateProductStock(ProductStock productStock) {
		ProductStock ps=DAO.findById(productStock.getOrderId());
		if(ps!=null && this.validateManufacturingDate(productStock.getManufacturingDate()) && this.validateExpiryDate(productStock.getExpiryDate())) {
			ps.setManufacturingDate(productStock.getManufacturingDate());
			ps.setExpiryDate(productStock.getExpiryDate());
			ps.setQualityCheck(productStock.getQualityCheck());
			return "Product Stock Updated";
		}
		
		
		return "Product Stock Not Updated";
	}

	@Override
	public boolean doesProductOrderIdExistinStock(String orderId) {
		/*
		 * if(Database.mMap.containsKey(orderId)) {
		 * return true;
		 * }
		 */
		
		if(Database.getmMap().containsKey(orderId)) {
			return true;
		}
		
		return false;
	}

	@Override
	public boolean doesProductOrderIdExist(String orderId) {

		return false;
	}
	
	@Override
	public boolean exitDateCheck(ProductStock productStock) {
		if(productStock.getExitDate().compareTo(LocalDate.now())<0) {
			return true;
		}
		return false;
	}
	
	public boolean validateManufacturingDate(LocalDate manufacturingDate) {
		if(manufacturingDate.compareTo(LocalDate.now())<0) {
			return true;
		}
		return false;
	}
	
	public boolean validateExpiryDate(LocalDate expiryDate) {
		if(expiryDate.compareTo(LocalDate.now())>4) {
			return true;
		}
		return false;
	}

}
