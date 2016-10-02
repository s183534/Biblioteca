package biblioteca;

public class Gestione {
	
	public Libro registraLibro(Biblioteca b, String titolo, String autore,
			String serNum, int cp) {

		Libro l = null;
		l = b.getLibri().get(serNum);

		if (l != null) { // se esiste aggiorniamo

			l.setCopiaTotale(l.getCopiaTotale() + cp);
			l.setCopiaDisponibile(l.getCopiaDisponibile() + cp);

		} else { // se non esiste creiamo una nuova istanza e inseriamo dentro
			      // Bilblioteca 

			l = new Libro(titolo, autore, serNum);

			l.setCopiaTotale(cp);
			l.setCopiaDisponibile(cp);
			
			
			b.aggiungiLibro(l);

		}

		return l;
   }
	
	
	public Utente registraUtente(Biblioteca b, String nome , String cognome , String cf) throws UtenteGiaEsiste{
		
		 
		
		if(b.getUtenti().containsKey(cf)){
			throw new UtenteGiaEsiste("esiste in bibliteca "+b.getNome());
		}
		
		Utente u=new Utente(nome,cognome,cf);
		
		b.aggiungiUtente(u);
		
		
		return u;
	}
	
	
	public boolean prestaLibro(Biblioteca b,String serialNum ,  String cf){
		boolean result=false;
		
		
		Libro l=null;
		  l=b.getLibri().get(serialNum);
		  
		Utente u=null ;
		
		u=b.getUtenti().get(cf);
		
		if(l!=null && u!=null &&  u.getNumeroLibri()<3 && l.getCopiaDisponibile() > 0 ){// libro esiste
			
			
			
			
			
			
			
			
			
			
		}
		
		
		
		
		return result;
	}
	
	
	

}
