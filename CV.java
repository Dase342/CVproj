
public class CV {
	
	private String nom;
	
	private String prenom;
	
	private String formation;
	
	private int experience;
	
	private String[] competence;
	
	private String attente;
	
	public CV (String n, String p, String f, int e, String[] c, String a) {
		setNom(n);
		setPrenom(p);
		setFormation(f);
		setExperiance(e);
		setCompetence(c);
		setAttente(a);
	}
	
	public String getNom() {
		return this.nom;
		
	}
	
	public String getPrenom() {
		return this.prenom;
		
	}
	public String getFormation() {
		return this.formation;
		
	}
	public int getExperiance() {
		return this.experience;
		
	}
	public String[] getCompetence() {
		return this.competence;
		
	}
	public String getAttente() {
		return this.attente;
		
	}
	
	public void setNom(String x) {
		this.nom = x;
	}
	
	public void setPrenom(String x) {
		this.prenom = x;
	}

	public void setFormation(String x) {
		this.formation = x;
	}

	public void setExperiance(int x) {
		this.experience = x;
	}

	public void setCompetence(String[] x) {
		this.competence = x;
	}

	public void setAttente (String x) {
		this.attente = x;
	}
	
	public void affiche() {
		System.out.print( "\nNom: " + this.getNom() + "\nPrenom: " + this.getPrenom() + "\nFormation: "
				+ this.getFormation() + "\nExperiance: " + this.getExperiance() + "\nCompetence: " );

		for ( String com : this.competence ) {
			System.out.print( com + ", " );
		}

		System.out.println( "\nAttente: " + this.getAttente() );
	}
	
	public static void main(String[] args){
		System.out.println("Bienvenue chez Barette!");
		
		String[] tabUn = {"travailleur"};
		
		String[] competencePierre = {"Java","C#"};
		
		CV personneUn = new CV("To","David","Informatique de gestion",0, tabUn,"Améliorer la performance des programmes et "
				+ "verifier qu'il n'y a pas de bug");
		
		personneUn.affiche();
		
		CV pierre = new CV("vellone","Pierre-Rafael","Montmorency",0,competencePierre,"apprendre des information utile pour le marcher du travail");
		
		pierre.affiche();
	}
	
	
}


