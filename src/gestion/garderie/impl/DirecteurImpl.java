package gestion.garderie.impl;

import java.util.ArrayList;
import java.util.List;

import gestion.garderie.dao.IGestion;
import gestion.garderie.model.Directeur;

public class DirecteurImpl implements IGestion<Directeur>{

	ArrayList<Directeur> directeurs = new ArrayList<Directeur>();
	
	//***************Gestion Directeur*******************
	
		@Override
		public void add(Directeur directeur) {
			// TODO Auto-generated method stub
			directeurs.add(directeur);
		}

		@Override
		public void remove(Directeur directeur) {
			// TODO Auto-generated method stub
			directeurs.remove(directeur);
		}

		@Override
		public void update(Directeur directeur) {
			// TODO Auto-generated method stub
			for (Directeur directeur1:directeurs)
			{
				if (directeur1.getId()==directeur.getId())
				{
					
					directeur1.setNom(directeur.getNom());
					directeur1.setPrenom(directeur.getPrenom());
					directeur1.setDateNaissance(directeur.getDateNaissance());
					directeur1.setNumDesignationRue(directeur.getNumDesignationRue());
					directeur1.setVilleCodePostal(directeur.getVilleCodePostal());
					directeur1.setGouvernerat(directeur.getGouvernerat());
					directeur1.setUser(directeur.getUser());
					directeur1.setMdp(directeur.getMdp());
					directeur1.setCinD(directeur.getCinD());
					directeur1.setNumTelD(directeur.getNumTelD());
		
			}
			}
		}

		@Override
		public List<Directeur> getAll() {
			// TODO Auto-generated method stub
			return directeurs;
		}

		@Override
		public Directeur getById(int i) {
			// TODO Auto-generated method stub
			
			for (Directeur directeur:directeurs)
			{
				if (directeur.getId()==i)
				{
					return directeur;
				}
			}
			return null;
		}
}
