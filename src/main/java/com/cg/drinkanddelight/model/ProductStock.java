package com.cg.drinkanddelight.model;

import java.time.LocalDate;

public class ProductStock {

	private String orderId, name, warehouseID, qualityCheck;
	private double price_per_unit, quantityValue, quantityUnit, price;
	private LocalDate deliveryDate, manufacturingDate, expiryDate, exitDate, processDate;
	
	public ProductStock() {
		super();
	}
	
	public ProductStock(String orderId, String name,String warehouseID, double quantityValue) {
		
		setOrderId(orderId);
		setName(name);
		setWarehouseID(warehouseID);
		setQuantityValue(quantityValue);
		
	}
	

	@Override
	public String toString() {
		return "ProductStock [orderId=" + orderId + ", name=" + name + ", warehouseID=" + warehouseID
				+ ", qualityCheck=" + qualityCheck + ", price_per_unit=" + price_per_unit + ", quantityValue="
				+ quantityValue + ", quantityUnit=" + quantityUnit + ", price=" + price + ", deliveryDate="
				+ deliveryDate + ", manufacturingDate=" + manufacturingDate + ", expiryDate=" + expiryDate
				+ ", exitDate=" + exitDate + ", processDate=" + processDate + "]";
	}

	public ProductStock(String orderId, String name, String warehouseID, String qualityCheck, double price_per_unit,
			double quantityValue, double quantityUnit, double price, LocalDate deliveryDate, LocalDate manufacturingDate,
			LocalDate expiryDate, LocalDate exitDate, LocalDate processDate) {
		

		super();
		setOrderId(orderId);
		setName(name);
		setWarehouseID(warehouseID);
		setQualityCheck(qualityCheck);
		setPrice_per_unit(price_per_unit);
		setQuantityValue(quantityValue);
		setQuantityUnit(quantityUnit);
		setPrice(price);
		setDeliveryDate(deliveryDate);
		setManufacturingDate(manufacturingDate);
		setExpiryDate(expiryDate);
		setExitDate(exitDate);
		setProcessDate(processDate);

		
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getWarehouseID() {
		return warehouseID;
	}

	public void setWarehouseID(String warehouseID) {
		this.warehouseID = warehouseID;
	}

	public String getQualityCheck() {
		return qualityCheck;
	}

	public void setQualityCheck(String qualityCheck) {
		this.qualityCheck = qualityCheck;
	}

	public double getPrice_per_unit() {
		return price_per_unit;
	}

	public void setPrice_per_unit(double price_per_unit) {
		this.price_per_unit = price_per_unit;
	}

	public double getQuantityValue() {
		return quantityValue;
	}

	public void setQuantityValue(double quantityValue) {
		this.quantityValue = quantityValue;
	}

	public double getQuantityUnit() {
		return quantityUnit;
	}

	public void setQuantityUnit(double quantityUnit) {
		this.quantityUnit = quantityUnit;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public LocalDate getDeliveryDate() {
		return deliveryDate;
	}

	public void setDeliveryDate(LocalDate deliveryDate) {
		this.deliveryDate = deliveryDate;
	}

	public LocalDate getManufacturingDate() {
		return manufacturingDate;
	}

	public void setManufacturingDate(LocalDate manufacturingDate) {
		this.manufacturingDate = manufacturingDate;
	}

	public LocalDate getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(LocalDate expiryDate) {
		this.expiryDate = expiryDate;
	}

	public LocalDate getExitDate() {
		return exitDate;
	}

	public void setExitDate(LocalDate exitDate) {
		this.exitDate = exitDate;
	}

	public LocalDate getProcessDate() {
		return processDate;
	}

	public void setProcessDate(LocalDate processDate) {
		this.processDate = processDate;
	}
	
	
	
}
