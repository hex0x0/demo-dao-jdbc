package application;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.dao.impl.SellerDaoJDBC;
import model.entities.Department;
import model.entities.Seller;

public class Program {
	public static void main(String[] args) {
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		
		Department dp = new Department(3, null);
		
		List<Seller> sellers = sellerDao.findByDepartment(dp);
		
		for(Seller obj: sellers) {
			System.out.println(obj);
			System.out.println();
		}
		
	
		
	}
}
