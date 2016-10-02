package biblioteca;

public class Studente extends Utente {
	
	private int media;

	public Studente(String nome, String cognome, String cf,int media) {
		super(nome,cognome,cf);
		this.media = media;
	}

	public int getMedia() {
		return media;
	}

	public void setMedia(int media) {
		this.media = media;
	}
	
	

}
