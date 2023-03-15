package gestion.garderie.impl;

import java.util.ArrayList;
import java.util.List;

import gestion.garderie.dao.IGestion;
import gestion.garderie.model.El�ve;

public class El�veImpl implements IGestion<El�ve> {

	ArrayList<El�ve> �l�ves = new ArrayList<El�ve>();
	

	//***************Gestion �l�ve*******************

	@Override
	public void add(El�ve �l�ve) {
		// TODO Auto-generated method stub
		
		�l�ves.add(�l�ve);
	}

	@Override
	public void remove(El�ve �l�ve) {
		// TODO Auto-generated method stub

		�l�ves.remove(�l�ve);
	}

	@Override
	public void update(El�ve �l�ve) {
		// TODO Auto-generated method stub

		for (El�ve �l�ve1:�l�ves)
		{
			if (�l�ve1.getId()==�l�ve.getId())
			{
				
				�l�ve1.setNom(�l�ve.getNom());
				�l�ve1.setPrenom(�l�ve.getPrenom());
				�l�ve1.setDateNaissance(�l�ve.getDateNaissance());
				�l�ve1.setNumDesignationRue(�l�ve.getNumDesignationRue());
				�l�ve1.setVilleCodePostal(�l�ve.getVilleCodePostal());
				�l�ve1.setGouvernerat(�l�ve.getGouvernerat());
				�l�ve1.setPrenomPere(�l�ve.getPrenomPere());
				�l�ve1.setPrenomGP(�l�ve.getPrenomGP());
				�l�ve1.setPrenomMere(�l�ve.getPrenomMere());
				�l�ve1.setNomMere(�l�ve.getNomMere());
				�l�ve1.setCinPere(�l�ve.getCinPere());
				�l�ve1.setTelPere(�l�ve.getTelPere());
				�l�ve1.setNivScolaire(�l�ve.getNivScolaire());
				�l�ve1.setNbrCours(�l�ve.getNbrCours());
			}
		}
		
	}

	@Override
	public El�ve getById(int i) {
		// TODO Auto-generated method stub

		for (El�ve �l�ve:�l�ves)
		{
			if (�l�ve.getId()==i)
			{
				return �l�ve;
			}
		}
		return null;
	}

	@Override
	public List<El�ve> getAll() {
		// TODO Auto-generated method stub
		return �l�ves;
	}

	
	
	
}
