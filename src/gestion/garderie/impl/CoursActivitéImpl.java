package gestion.garderie.impl;

import java.util.ArrayList;
import java.util.List;

import gestion.garderie.dao.IGestion;
import gestion.garderie.model.CoursActivité;

public class CoursActivitéImpl implements IGestion<CoursActivité> {
	
	ArrayList<CoursActivité> coursActivités = new ArrayList<CoursActivité>();
	
	//***************Gestion Cours/Acvitité*******************
	
	
		@Override
		public void add(CoursActivité coursActivité) {
			// TODO Auto-generated method stub
			coursActivités.add(coursActivité);
		}

		@Override
		public void remove(CoursActivité coursActivité) {
			// TODO Auto-generated method stub
			coursActivités.remove(coursActivité);
		}

		@Override
		public void update(CoursActivité coursActivité) {
			// TODO Auto-generated method stub
			for (CoursActivité coursActivité1:coursActivités)
			{
				if (coursActivité1.getCode()==coursActivité.getCode())
				{
					
					coursActivité1.setDésignation(coursActivité.getDésignation());
					coursActivité1.setAnimateurResponsable(coursActivité.getAnimateurResponsable());
					coursActivité1.setVolumeHoraire(coursActivité.getVolumeHoraire());
					coursActivité1.setFraisC(coursActivité.getFraisC());
			}
			}
		}
		
		@Override
		public CoursActivité getById(int i) {
			// TODO Auto-generated method stub
			for (CoursActivité coursActivité:coursActivités)
			{
				if (coursActivité.getCode()==i)
				{
					return coursActivité;
				}
			}
			return null;
		}

		@Override
		public List<CoursActivité> getAll() {
			// TODO Auto-generated method stub
			return coursActivités;
		}

}
