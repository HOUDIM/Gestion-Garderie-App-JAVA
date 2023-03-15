package gestion.garderie.impl;

import java.util.ArrayList;

import gestion.garderie.dao.IGarderie;

import gestion.garderie.model.Garderie;


public class GarderieImpl implements IGarderie {

	
	
	ArrayList<Garderie> garderies = new ArrayList<Garderie>();

	
	
	

	//*************** Garderie ********
	
	@Override
	public void addGarderie(Garderie garderie) {
		// TODO Auto-generated method stub
		garderies.add(garderie);
	}

	@Override
	public void updateGarderie(Garderie garderie) {
		// TODO Auto-generated method stub
		for (Garderie garderie1:garderies)
		{
			
			garderie1.setNomGarderie(garderie.getNomGarderie());
			garderie1.setNumRueDesignationGarderie(garderie.getNumRueDesignationGarderie());
			garderie1.setVilleCodePostalGarderie(garderie.getVilleCodePostalGarderie());
			garderie1.setGouverneratGarderie(garderie.getGouverneratGarderie());
		
	}


}}
