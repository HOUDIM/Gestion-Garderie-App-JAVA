package gestion.garderie.model;


import java.util.Scanner;

public abstract class Personne {
	
		
		//Les attributs
		private int id;
		private String nom;
		private String prenom;
		private String dateNaissance;
		private String numdDesignationRue, villeCodePostal, gouvernerat;
		
		static Scanner sc = new Scanner(System.in);
		
		//Les constructeurs 
		public Personne()
		{
			
		}
		

		public Personne(int id,String nom, String prenom, String dateNaissance,
						String numdDesignationRue, String villeCodePostal, String gouvernerat)
		{
			this.id=id;
			this.nom=nom;
			this.prenom=prenom;
			this.dateNaissance=dateNaissance;
			this.numdDesignationRue=numdDesignationRue;
			this.villeCodePostal=villeCodePostal;
			this.gouvernerat=gouvernerat;
		}
		
		
		//Les getteurs et les setteurs
		
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getNom() {
			return nom;
		}
		public void setNom(String nom) {
			this.nom = nom;
		}
		public String getPrenom() {
			return prenom;
		}
		public void setPrenom(String prenom) {
			this.prenom = prenom;
		}
		public String getDateNaissance() {
			return dateNaissance;
		}
		public void setDateNaissance(String dateNaissance) {
			this.dateNaissance = dateNaissance;
		}
		
		public String getNumDesignationRue() {
			return numdDesignationRue;
		}
		public void setNumDesignationRue(String numdDesignationRue) {
			this.numdDesignationRue = numdDesignationRue;
		}
		public String getVilleCodePostal() {
			return villeCodePostal;
		}
		public void setVilleCodePostal(String villeCodePostal) {
			this.villeCodePostal = villeCodePostal;
		}
		public String getGouvernerat() {
			return gouvernerat;
		}
		public void setGouvernerat(String gouvernerat) {
			this.gouvernerat = gouvernerat;
		}

		
		

}
