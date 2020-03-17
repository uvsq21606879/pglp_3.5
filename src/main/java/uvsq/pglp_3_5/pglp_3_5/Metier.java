package uvsq.pglp_3_5.pglp_3_5;

public class Metier {

	private Affilog AT;
	public Metier(final Affilog AT) {
		this.AT = AT;
	}
	
	public void uneMethodeMetier() {
		this.AT.affichageTemporel(": Début de uneMethodeMetier");
		
		this.AT.affichageTemporel(": Fin de uneMethodeMetier");
	}
	
	public void uneMethodeMetierSLF4J() {
		this.AT.affichageTemporelSLF4J(": Début de uneMethodeMetier");
		
		this.AT.affichageTemporelSLF4J(": Fin de uneMethodeMetier");
	}
}
