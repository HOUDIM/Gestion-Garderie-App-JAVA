package gestion.garderie.impl;

import java.util.ArrayList;
import java.util.List;

import gestion.garderie.dao.IGestion;
import gestion.garderie.model.Classe;

public class ClasseImpl implements IGestion<Classe>{
	
	ArrayList<Classe> classes = new ArrayList<Classe>();
	
	//***************Gestion Classe*******************
	

		@Override
		public void add(Classe classe) {
			// TODO Auto-generated method stub
			classes.add(classe);
		}

		@Override
		public void remove(Classe classe) {
			// TODO Auto-generated method stub
			classes.remove(classe);
		}

		@Override
		public void update(Classe classe) {
			// TODO Auto-generated method stub
			for (Classe classe1:classes)
			{
				if (classe1.getIdClasse()==classe.getIdClasse())
				{
					
					classe1.setNomClasse(classe.getNomClasse());
					classe1.setAnimateurs(classe.getAnimateurs());
					classe1.setCoursActivités(classe.getCoursActivités());
					classe1.setÉlèves(classe.getÉlèves());
			}
			}
		}

		@Override
		public Classe getById(int i) {
			// TODO Auto-generated method stub
			for (Classe classe2:classes)
			{
				if (classe2.getIdClasse()==i)
				{
					return classe2;
				}
			}
			return null;
		}

		@Override
		public List<Classe> getAll() {
			// TODO Auto-generated method stub
			return classes;
		}

}
