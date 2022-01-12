package model.dao;

import model.dao.impl.SellerDaoJDBC;

public class DaoFactory {
	//Operacoes estáticas para implementar 
	public static SellerDao createSellerDao() {
		return new SellerDaoJDBC();
	}
}
