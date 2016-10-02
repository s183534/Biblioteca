package biblioteca;

import java.util.HashMap;
import java.util.Map;

public class Biblioteca implements ValidaDati {
	private String nome;
	
	private Map<String,Utente> utenti  = new HashMap<String,Utente>();
	private Map<String,Libro> libri  = new HashMap<String,Libro>();

	public Biblioteca() {

	}

	public Biblioteca(String nome) {

		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
   
	public Map<String,Utente> getUtenti() {
		return utenti;
	}

	public void setUtenti(Map<String,Utente> utenti) {
		this.utenti = utenti;
	}
	
	public void aggiungiUtente(Utente u){
		this.utenti.put(u.getCf(),u);
	}
	
	
	
	public Map<String,Libro> getLibri() {
		return libri;
	}

	public void setLibri(Map<String,Libro> libri) {
		this.libri = libri;
	}
 
	
	public void aggiungiLibro(Libro l){
		
		libri.put(l.getSerialNum(), l);
	}
	
	
	@Override
	public boolean isValid() {
boolean result = false;
		
		if(!nome.isEmpty() && nome != null){
				
				result=true;
			}

		return result;
	}


	

}
