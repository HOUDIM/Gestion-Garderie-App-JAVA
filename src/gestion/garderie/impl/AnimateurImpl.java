package gestion.garderie.impl;

import java.util.ArrayList;
import java.util.List;

import gestion.garderie.dao.IGestion;
import gestion.garderie.model.Animateur;




public class AnimateurImpl implements IGestion<Animateur> {
	
	
	ArrayList<Animateur> animateurs = new ArrayList<Animateur>();
	

	
	//***************Gestion animateur*******************
	
	@Override
	public void add(Animateur animateur) {
		// TODO Auto-generated method stub
		animateurs.add(animateur);
	}

	@Override
	public void remove(Animateur animateur) {
		// TODO Auto-generated method stub
		animateurs.remove(animateur);
	}

	@Override
	public void update(Animateur animateur) {
		// TODO Auto-generated method stub

		for (Animateur animateur1:animateurs)
		{
			if (animateur1.getId()==animateur.getId())
			{
				System.out.println(animateur1.getId()==animateur.getId());
				animateur1.setNom(animateur.getNom());
				animateur1.setPrenom(animateur.getPrenom());
				animateur1.setDateNaissance(animateur.getDateNaissance());
				animateur1.setNumDesignationRue(animateur.getNumDesignationRue());
				animateur1.setVilleCodePostal(animateur.getVilleCodePostal());
				animateur1.setGouvernerat(animateur.getGouvernerat());
				animateur1.setCinA(animateur.getCinA());
				animateur1.setNumTelA(animateur.getNumTelA());
				animateur1.setSalaire(animateur.getSalaire());
		}
		}
	}

	@Override
	public Animateur getById(int i) {
		// TODO Auto-generated method stub
		for (Animateur animateur:animateurs)
		{
			if (animateur.getId()==i)
			{
				return animateur;
			}
		}
		return null;
	}

	@Override
	public List<Animateur> getAll() {
		// TODO Auto-generated method stub
		return animateurs;
	}

	

	

}