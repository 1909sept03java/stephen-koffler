package com.revature.dao;

import java.util.List;

import com.revature.beans.Cave;

public interface CaveDAO {

	public List<Cave> getCaves();
	public Cave getCaveById(int id);
	public void createCave(String Cave_Name);
	public void updateCave(Cave cave);
	public void deleteCave(Cave cave);


}