package uvsq.pglp_3_5.pglp_3_5;

import java.time.LocalDateTime;

import org.slf4j.LoggerFactory;

public class Affilog implements Affichage {

	final org.slf4j.Logger logger;
	
	public Affilog() {
		
		this.logger = LoggerFactory.getLogger(Affilog.class);
		
		
	}
	public void affichageTemporel(final String descriptif) {
		System.out.println(LocalDateTime.now() + descriptif);
	}
	
	public void affichageTemporelSLF4J(final String descriptif) {
		logger.info(LocalDateTime.now() + descriptif);
	}

}