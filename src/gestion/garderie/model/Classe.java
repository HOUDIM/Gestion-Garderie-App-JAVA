package gestion.garderie.model;


import java.util.List;
import java.util.Scanner;


import gestion.garderie.impl.AnimateurImpl;
import gestion.garderie.impl.ClasseImpl;
import gestion.garderie.impl.CoursActivit�Impl;
import gestion.garderie.impl.El�veImpl;



public class Classe {

		
		//Les attributs
		private int idClasse;
		private String nomClasse;
		private List<El�ve> �l�ves;
		private List<Animateur> animateurs;
		private List<CoursActivit�> coursActivit�s;
		
		static Scanner sc = new Scanner(System.in);
		
		
		//Les constructeurs 

		public Classe()
		{
			
		}
		
		public Classe(int idClasse, String nomClasse, List<El�ve> �l�ves, List<Animateur> animateurs,
				List<CoursActivit�> coursActivit�s) {
			super();
			this.idClasse = idClasse;
			this.nomClasse = nomClasse;
			this.�l�ves = �l�ves;
			this.animateurs = animateurs;
			this.coursActivit�s = coursActivit�s;
		}


		//Les getteurs et les setteurs
		
		public int getIdClasse() {
			return idClasse;
		}

		public void setIdClasse(int idClasse) {
			this.idClasse = idClasse;
		}

		public String getNomClasse() {
			return nomClasse;
		}

		public void setNomClasse(String nomClasse) {
			this.nomClasse = nomClasse;
		}

		public List<El�ve> get�l�ves() {
			return �l�ves;
		}

		public void set�l�ves(List<El�ve> �l�ves) {
			this.�l�ves = �l�ves;
		}

		public List<Animateur> getAnimateurs() {
			return animateurs;
		}

		public void setAnimateurs(List<Animateur> animateurs) {
			this.animateurs = animateurs;
		}

		public List<CoursActivit�> getCoursActivit�s() {
			return coursActivit�s;
		}

		public void setCoursActivit�s(List<CoursActivit�> coursActivit�s) {
			this.coursActivit�s = coursActivit�s;
		}
		
		//Les m�thodes d'ordre g�n�ral
	
		
		@Override
		public String toString() {
			return "Classe [idClasse=" + idClasse + ", nomClasse=" + nomClasse + "\n �l�ves=" + �l�ves + "\n animateurs="
					+ animateurs + "\n coursActivit�s=" + coursActivit�s + "]\n";
		}

		
		
		public static void menuClasse(String[] args)
		{
			
			System.out.println("\n*********************Gestion des classes*****************************\n");
			
			System.out.println("\nVeuillez choisir une option :\n " +
						"\n\t1- Ajout d'une classe\n\t2- Mise � jour d'une classe\n"
						+ "\t3- Suppression d'une classe\n\t4- Liste des classes\n"
						+ "\t5- Revenir au menu principal");
		}

		public static void ajouterClasse(ClasseImpl classeImpl,El�veImpl �l�veImpl,AnimateurImpl animateurImpl,CoursActivit�Impl coursActivit�Impl,
				List<El�ve> �l�ves,List<Animateur> animateurs,List<CoursActivit�> coursActivit�s)
		{

			System.out.println("\n - Saisissez l'ID : ");
			int idClasse=sc.nextInt();
			
			//v�rification de l'ID
			boolean saisieIdC = false;
            while (saisieIdC == false) {
            String si=String.valueOf(idClasse);
            if (si.matches("^[0-9]+$") && classeImpl.getById(idClasse) == null) {
                idClasse=Integer.parseInt(si);
                saisieIdC = true;
                break;
            }else {
            	 System.out.println("\n -Erreur!  Re-saisissez l'ID  : ");
            	 idClasse=sc.nextInt();
            	 sc.nextLine();
            }
            }
			
			System.out.println("\n - Saisissez le nom de la classe : ");
			String nomClasse=sc.next();
			
			System.out.println("\n - Saisissez le nombre des �l�ves dans cette classe : ");
			int nbrEl�ve=sc.nextInt();
			
			for (int i=1; i <= nbrEl�ve ; i++)
			{
				System.out.println("\n - Saisissez l'ID de l'�l�ve N� "+ i +" apparatenant � cette classe : ");
				int ide=sc.nextInt();
				
				//v�rification de l'ID
				boolean saisieIdEc = false;
                while (saisieIdEc == false) {
                String si=String.valueOf(ide);
                if (si.matches("^[0-9]+$") && �l�veImpl.getById(ide) != null) {
                    ide=Integer.parseInt(si);
                    saisieIdEc = true;
                    break;
                }else {
                	 System.out.println("\n - Cet ID n'existe pas!  Re-saisissez un autre ID  : ");
                	 ide=sc.nextInt();
                	 sc.nextLine();
                }
                }
				
				El�ve �l�ve = �l�veImpl.getById(ide);
				
				�l�ves.add(�l�ve);
				
			}
			
			System.out.println("\n - Saisissez le nombre des animateurs dans cette classe : ");
			int nbrAnimateur=sc.nextInt();
			
			
			for (int i=1; i <= nbrAnimateur ; i++)
			{
				System.out.println("\n - Saisissez l'ID de l'animateur N� "+ i +" apparatenant � cette classe : ");
				int ide=sc.nextInt();
				
				//v�rification de l'ID
				boolean saisieIdCa = false;
                while (saisieIdCa == false) {
                String si=String.valueOf(ide);
                if (si.matches("^[0-9]+$") && animateurImpl.getById(ide) != null) {
                    ide=Integer.parseInt(si);
                    saisieIdCa = true;
                    break;
                }else {
                	 System.out.println("\n - Cet ID n'existe pas!  Re-saisissez un autre ID  :  : ");
                	 ide=sc.nextInt();
                	 sc.nextLine();
                }
                }
				
				Animateur animateur = animateurImpl.getById(ide);
				
				animateurs.add(animateur);
				
				
			}
			
			System.out.println("\n - Saisissez le nombre des cours dans cette classe : ");
			int nbrCA=sc.nextInt();
			
			for (int i=1; i <= nbrCA ; i++)
			{
				System.out.println("\n - Saisissez le code de le cours N� "+ i +" apparatenant � cette classe : ");
				int codee=sc.nextInt();
				
				//v�rification de l'ID
				boolean saisieCodeC = false;
                while (saisieCodeC == false) {
                String si=String.valueOf(codee);
                if (si.matches("^[0-9]+$") && coursActivit�Impl.getById(codee) != null) {
                   // codee=Integer.parseInt(si);
                    saisieCodeC = true;
                    break;
                }else {
                	 System.out.println("\n - Cet ID n'existe pas!  Re-saisissez un autre ID  : : ");
                	 codee=sc.nextInt();
                	 sc.nextLine();
                }
                }
				
				
				CoursActivit� coursActivit� = coursActivit�Impl.getById(codee);
				
				coursActivit�s.add(coursActivit�);
				
			}
			
			Classe classe = new Classe();
			
			classe.setIdClasse(idClasse);
			classe.setNomClasse(nomClasse);
			classe.set�l�ves(�l�ves);
			classe.setAnimateurs(animateurs);
			classe.setCoursActivit�s(coursActivit�s);
			
			
			
			classeImpl.add(classe);
			
			System.out.println("\n\n Classe ajout�e avec succ�s! \n\n");
		}
		
		public static void modifierClasse(ClasseImpl classeImpl,El�veImpl �l�veImpl,AnimateurImpl animateurImpl,CoursActivit�Impl coursActivit�Impl,
				List<El�ve> �l�ves,List<Animateur> animateurs,List<CoursActivit�> coursActivit�s)
		{
			System.out.println("\n - Saisissez l'ID de la classe dont vous voulez modifier : ");
			int ida=sc.nextInt();
			
			//v�rification de l'ID
			boolean updateIdC = false;
            while (updateIdC == false) {
            String si=String.valueOf(ida);
            if (si.matches("^[0-9]+$") && classeImpl.getById(ida) != null) {
                ida=Integer.parseInt(si);
                updateIdC = true;
                break;
            }else {
            	 System.out.println("\n - Cet ID n'existe pas!  Re-saisissez un autre ID  : ");
            	 ida=sc.nextInt();
            	 sc.nextLine();
            }
            }
			
			Classe classe1 = classeImpl.getById(ida);
			
		
					System.out.println("\n - Choisissez les informations � modifier :"
							+ "\n 1- Nom"
							+ "\n 2- Ajouter �l�ve"
							+ "\n 3- Ajouter animateur"
							+ "\n 4- Ajouter cours");
					System.out.println("\n - Votre Choix : ");
					int choix= sc.nextInt();
					switch(choix) {
					case 1:
						System.out.println("\n - Saisissez le nom de la classe : ");
						String nomClasse1=sc.next();
						classe1.setNomClasse(nomClasse1);
						break;
					case 2:
						System.out.println("\n - Saisissez l'ID de l'�l�ve que vous voulez ajouter � cette classe : ");
						int ide1=sc.nextInt();
						
						//v�rification de l'ID
						boolean saisieIdEc = false;
	                    while (saisieIdEc== false) {
	                    String si=String.valueOf(ide1);
	                    if (si.matches("^[0-9]+$") && �l�veImpl.getById(ide1) != null) {
	                        ide1=Integer.parseInt(si);
	                        saisieIdEc = true;
	                        break;
	                    }else {
	                    	 System.out.println("\n - Cet ID n'existe pas!  Re-saisissez un autre ID   : ");
	                    	 ide1=sc.nextInt();
	                    	 sc.nextLine();
	                    }
	                    }
				
						El�ve �l�ve1 = �l�veImpl.getById(ide1);
						�l�ves.add(�l�ve1);
						classe1.set�l�ves(�l�ves);
						break;
					case 3:
						System.out.println("\n - Saisissez l'ID de l'animateur que vous voulez ajouter � cette classe : ");
						int ida1=sc.nextInt();
						
						//v�rification de l'ID
						boolean saisieIdCa = false;
	                    while (saisieIdCa == false) {
	                    String si=String.valueOf(ida1);
	                    if (si.matches("^[0-9]+$") && animateurImpl.getById(ida1) != null) {
	                        ida1=Integer.parseInt(si);
	                        saisieIdCa = true;
	                        break;
	                    }else {
	                    	 System.out.println("\n - Cet ID n'existe pas!  Re-saisissez un autre ID  : ");
	                    	 ida1=sc.nextInt();
	                    	 sc.nextLine();
	                    }
	                    }
				
						Animateur animateur1 = animateurImpl.getById(ida1);
						animateurs.add(animateur1);
						classe1.setAnimateurs(animateurs);
						break;
					case 4:
						System.out.println("\n - Saisissez le code de le cours ue vous voulez ajouter � cette classe : ");
						int codee1=sc.nextInt();
						
						//v�rification de l'ID
						boolean saisieCodeC = false;
	                    while (saisieCodeC == false) {
	                    String si=String.valueOf(codee1);
	                    if (si.matches("^[0-9]+$") && coursActivit�Impl.getById(codee1) != null) {
	                       // codee=Integer.parseInt(si);
	                        saisieCodeC = true;
	                        break;
	                    }else {
	                    	 System.out.println("\n -Erreur!  Re-saisissez l'ID  : ");
	                    	 codee1=sc.nextInt();
	                    	 sc.nextLine();
	                    }
	                    }
						
				
						CoursActivit� coursActivit�1 = coursActivit�Impl.getById(codee1);
						coursActivit�s.add(coursActivit�1);
						classe1.setCoursActivit�s(coursActivit�s);
						break;
					default:
						System.out.println("\n Choix invalide!\n");
						break;
		
					}
			//classeImpl.add(classe1);
			
			System.out.println("Classe modifi� avec succ�");
		}
		
		public static void supprimerClasse(ClasseImpl classeImpl,El�veImpl �l�veImpl,AnimateurImpl animateurImpl,CoursActivit�Impl coursActivit�Impl,
				List<El�ve> �l�ves,List<Animateur> animateurs,List<CoursActivit�> coursActivit�s)
		{
			System.out.println("\n - Saisissez l'ID de la classe dont vous voulez modifier ou retirer : ");
			int idc=sc.nextInt();
			
			boolean removeIdC = false;
            while (removeIdC == false) {
            String si=String.valueOf(idc);
            if (si.matches("^[0-9]+$") && classeImpl.getById(idc) != null) {
                idc=Integer.parseInt(si);
                removeIdC = true;
                break;
            }else {
            	 System.out.println("\n -Erreur!  Re-saisissez l'ID  : ");
            	 idc=sc.nextInt();
            	 sc.nextLine();
            }
            }
			
			Classe classe2 = classeImpl.getById(idc);
			
		
					System.out.println("\n - Choisissez les informations � retirer :"
							+ "\n 1- Supprier toute la classe"
							+ "\n 2- Supprimer un �l�ve"
							+ "\n 3- Supprimer un animateur"
							+ "\n 4- Supprimer un cours");
					System.out.println("\n - Votre Choix : ");
					int choix1= sc.nextInt();
					switch(choix1) {
					case 1:
						classeImpl.remove(classe2);
						System.out.println("\n - Classe supprim�e ! \n ");
						
						break;
					case 2:
						System.out.println("\n - Saisissez l'ID de l'�l�ve que vous voulez retirer de cette classe : ");
						int ide2=sc.nextInt();
						
						//v�rification de l'ID
						boolean removeIdEc = false;
	                    while (removeIdEc== false) {
	                    String si=String.valueOf(ide2);
	                    if (si.matches("^[0-9]+$") && �l�veImpl.getById(ide2) != null) {
	                        ide2=Integer.parseInt(si);
	                        removeIdEc = true;
	                        break;
	                    }else {
	                    	 System.out.println("\n -Erreur!  Re-saisissez l'ID  : ");
	                    	 ide2=sc.nextInt();
	                    	 sc.nextLine();
	                    }
	                    }
				
						El�ve �l�ve2 = �l�veImpl.getById(ide2);
						�l�ves.remove(�l�ve2);
						break;
					case 3:
						System.out.println("\n - Saisissez l'ID de l'animateur que vous voulez retirer de cette classe : ");
						int ida2=sc.nextInt();
						
						//v�rification de l'ID
						boolean removeIdCa = false;
	                    while (removeIdCa == false) {
	                    String si=String.valueOf(ida2);
	                    if (si.matches("^[0-9]+$") && animateurImpl.getById(ida2) != null) {
	                        ida2=Integer.parseInt(si);
	                        removeIdCa = true;
	                        break;
	                    }else {
	                    	 System.out.println("\n -Erreur!  Re-saisissez l'ID  : ");
	                    	 ida2=sc.nextInt();
	                    	 sc.nextLine();
	                    }
	                    }
				
						Animateur animateur2 = animateurImpl.getById(ida2);
						animateurs.remove(animateur2);
						break;
					case 4:
						System.out.println("\n - Saisissez le code de le cours ue vous voulez retirer de cette classe : ");
						int codee2=sc.nextInt();
						
						//v�rification de l'ID
						boolean removeCodeC = false;
	                    while (removeCodeC == false) {
	                    String si=String.valueOf(codee2);
	                    if (si.matches("^[0-9]+$") && coursActivit�Impl.getById(codee2) != null) {
	                       // codee=Integer.parseInt(si);
	                        removeCodeC = true;
	                        break;
	                    }else {
	                    	 System.out.println("\n -Erreur!  Re-saisissez l'ID  : ");
	                    	 codee2=sc.nextInt();
	                    	 sc.nextLine();
	                    }
	                    }
				
						CoursActivit� coursActivit�2 = coursActivit�Impl.getById(codee2);
						coursActivit�s.remove(coursActivit�2);
						break;
					default:
						System.out.println("\n Choix invalide!\n");
						break;
		
					}
		}
	
}
