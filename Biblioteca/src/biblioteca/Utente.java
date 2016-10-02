package biblioteca;

import java.util.HashMap;
import java.util.Map;

public class Utente implements ValidaDati {
	
	private String nome;
	private String cognome;
	private String cf;
	
	private Map<String,Libro> libri=new HashMap<String,Libro>();
	
	
	public Utente() {
		
	
	}

	
	

	public Utente(String nome, String cognome, String cf) {
	
		this.nome = nome;
		this.cognome = cognome;
		this.cf=cf;
	}






	public String getNome() {
		return nome;
	}




	public void setNome(String nome) {
		this.nome = nome;
	}




	public String getCognome() {
		return cognome;
	}




	public void setCognome(String cognome) {
		this.cognome = cognome;
	}


	public String getCf() {
		return cf;
	}




	public void setCf(String cf) {
		this.cf = cf;
	}

	@Override
	public boolean isValid() {

		boolean result = false;
		
		if( 
				 (!nome.isEmpty() && nome != null ) && 
			     (!cognome.isEmpty() && cognome != null ) &&
			     (!cf.isEmpty() && cf != null ) 
			  ){
				
				result=true;
			}

		return result;
	}


  public int getNumeroLibri(){
	  return this.libri.size();
  }
  
  public void aggiungiLibro(Libro l){
	  this.libri.put(l.getSerialNum(), l);
  }
     
	

}
