package org.tns.assignmentthreee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Products {

	private List<String> ListProd = new ArrayList<String>();
	
	// add product method
	public void addProductToList(String Product) {
		ListProd.add(Product);
	}
	
	// sort product method
	public void sortProductList() {
		Collections.sort(ListProd);
	}

	// getter setter methods
	public List<String> getListProd() {
		return ListProd;
	}

	public void setListProd(List<String> listProd) {
		ListProd = listProd;
	}
	



}
