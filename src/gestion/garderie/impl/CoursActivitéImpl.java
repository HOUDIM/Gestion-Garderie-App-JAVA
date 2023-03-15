package gestion.garderie.impl;

import java.util.ArrayList;
import java.util.List;

import gestion.garderie.dao.IGestion;
import gestion.garderie.model.CoursActivit�;

public class CoursActivit�Impl implements IGestion<CoursActivit�> {
	
	ArrayList<CoursActivit�> coursActivit�s = new ArrayList<CoursActivit�>();
	
	//***************Gestion Cours/Acvitit�*******************
	
	
		@Override
		public void add(CoursActivit� coursActivit�) {
			// TODO Auto-generated method stub
			coursActivit�s.add(coursActivit�);
		}

		@Override
		public void remove(CoursActivit� coursActivit�) {
			// TODO Auto-generated method stub
			coursActivit�s.remove(coursActivit�);
		}

		@Override
		public void update(CoursActivit� coursActivit�) {
			// TODO Auto-generated method stub
			for (CoursActivit� coursActivit�1:coursActivit�s)
			{
				if (coursActivit�1.getCode()==coursActivit�.getCode())
				{
					
					coursActivit�1.setD�signation(coursActivit�.getD�signation());
					coursActivit�1.setAnimateurResponsable(coursActivit�.getAnimateurResponsable());
					coursActivit�1.setVolumeHoraire(coursActivit�.getVolumeHoraire());
					coursActivit�1.setFraisC(coursActivit�.getFraisC());
			}
			}
		}
		
		@Override
		public CoursActivit� getById(int i) {
			// TODO Auto-generated method stub
			for (CoursActivit� coursActivit�:coursActivit�s)
			{
				if (coursActivit�.getCode()==i)
				{
					return coursActivit�;
				}
			}
			return null;
		}

		@Override
		public List<CoursActivit�> getAll() {
			// TODO Auto-generated method stub
			return coursActivit�s;
		}

}
