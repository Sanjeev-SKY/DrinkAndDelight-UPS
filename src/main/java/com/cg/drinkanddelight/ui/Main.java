package com.cg.drinkanddelight.ui;

import java.time.LocalDate;
import java.util.Scanner;
import java.util.TreeMap;

import com.cg.drinkanddelight.dao.Database;
import com.cg.drinkanddelight.model.ProductStock;
import com.cg.drinkanddelight.service.ProductService;

public class Main {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		Main mObj = new Main();
		Database.data();

		mObj.selectOperation();

		mObj.sc.close();

	}

	public void call() {

		try {

			System.out.println("Enter Order Id: ");
			String id = sc.next();
			System.out.println("Enter Exit Date:- in (YYYYMMDD)");
			String date = sc.next();

			System.out.println(Main.setExitDate(id, splitDate(date)));

			System.out.println("Enter Manufacturing Date:- in (YYYYMMDD)");
			String mDate = sc.next();
			System.out.println("Enter Expiry Date:- in (YYYYMMDD)");
			String eDate = sc.next();
			System.out.println("Enter quality status: ");
			String qs = sc.next();

			System.out.println(Main.updateProductStock(id, splitDate(mDate), splitDate(eDate), qs) + "\n");

		} catch (Exception e) {

			System.out.println(e);

		}
	}

	public LocalDate splitDate(String date) {
		int y, m, d;
		y = Integer.parseInt(date.substring(0, 4));
		m = Integer.parseInt(date.substring(4, 6));
		d = Integer.parseInt(date.substring(6, 8));
		LocalDate dt = LocalDate.of(y, m, d);
		return dt;
	}

	public static String setExitDate(String id, LocalDate date) {
		ProductService ps = new ProductService();
		return ps.exitDateCheck(id, date);
	}

	public static String updateProductStock(String orderId, LocalDate manufacturingDate, LocalDate expiryDate,
			String qualityAnalysis) {
		ProductService ps = new ProductService();
		return ps.updateProductStock(orderId, manufacturingDate, expiryDate, qualityAnalysis);
	}
	
	public void getKeys() {
		ProductService ps = new ProductService();
		ps.getKeys();
	}
	
	public void selectOperation() {
		do {
			System.out.println(
					"Select Operation:\n 1-Get All Keys\n 2-Update Product Stock\n 3-Show Stock Details\n 4-Show All Stock Details\n");
			String so = sc.next();
			switch (so) {
			case "1":
				getKeys();
				break;
			case "2":
				call();
				break;
			case "3":
				showStockDetails();
				break;
			case "4":
				showAllStockDetails();
				break;
			default:
				System.out.println("Invalid Choice...");
				System.exit(0);
			}
		} while (true);
	}

	public void showStockDetails() {
		System.out.println("Enter order Id: ");
		String orderId = sc.next();
		if (Database.getmMap().containsKey(orderId)) {
			ProductStock V = Database.getmMap().get(orderId);
			System.out.println("Order Id - " + V.getOrderId() + "\n" + "Name - " + V.getName() + "\n"
					+ "Quantity value - " + V.getQuantityValue() + "\n" + "Manufacturing Date - "
					+ V.getManufacturingDate() + "\n" + "Expiry Date - " + V.getExpiryDate() + "\n" + "Exit Date - "
					+ V.getExitDate() + "\n" + "Quality - " + V.getQualityCheck() + "\n");
		} else {
			System.out.println("ID not exists...");
		}
	}

	public void showAllStockDetails() {
		TreeMap<String, ProductStock> sort = new TreeMap<>();
		sort.putAll(Database.getmMap());
		sort.forEach((K, V) -> {
			System.out.println("Order Id - " + V.getOrderId() + "\n" + "Name - " + V.getName() + "\n"
					+ "Quantity value - " + V.getQuantityValue() + "\n" + "Manufacturing Date - "
					+ V.getManufacturingDate() + "\n" + "Expiry Date - " + V.getExpiryDate() + "\n" + "Exit Date - "
					+ V.getExitDate() + "\n" + "Quality - " + V.getQualityCheck() + "\n");
		});
	}
}
