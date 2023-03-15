package gestion.garderie.impl;

import java.util.ArrayList;
import java.util.List;

import gestion.garderie.dao.IGestion;
import gestion.garderie.model.Elève;

public class ElèveImpl implements IGestion<Elève> {

	ArrayList<Elève> élèves = new ArrayList<Elève>();
	

	//***************Gestion élève*******************

	@Override
	public void add(Elève élève) {
		// TODO Auto-generated method stub
		
		élèves.add(élève);
	}

	@Override
	public void remove(Elève élève) {
		// TODO Auto-generated method stub

		élèves.remove(élève);
	}

	@Override
	public void update(Elève élève) {
		// TODO Auto-generated method stub

		for (Elève élève1:élèves)
		{
			if (élève1.getId()==élève.getId())
			{
				
				élève1.setNom(élève.getNom());
				élève1.setPrenom(élève.getPrenom());
				élève1.setDateNaissance(élève.getDateNaissance());
				élève1.setNumDesignationRue(élève.getNumDesignationRue());
				élève1.setVilleCodePostal(élève.getVilleCodePostal());
				élève1.setGouvernerat(élève.getGouvernerat());
				élève1.setPrenomPere(élève.getPrenomPere());
				élève1.setPrenomGP(élève.getPrenomGP());
				élève1.setPrenomMere(élève.getPrenomMere());
				élève1.setNomMere(élève.getNomMere());
				élève1.setCinPere(élève.getCinPere());
				élève1.setTelPere(élève.getTelPere());
				élève1.setNivScolaire(élève.getNivScolaire());
				élève1.setNbrCours(élève.getNbrCours());
			}
		}
		
	}

	@Override
	public Elève getById(int i) {
		// TODO Auto-generated method stub

		for (Elève élève:élèves)
		{
			if (élève.getId()==i)
			{
				return élève;
			}
		}
		return null;
	}

	@Override
	public List<Elève> getAll() {
		// TODO Auto-generated method stub
		return élèves;
	}

	
	
	
}
