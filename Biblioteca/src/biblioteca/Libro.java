package biblioteca;

public class Libro  implements ValidaDati{
	
	private String titolo;
	private String autore;
	
	private String serialNum;
	
	private int copiaTotale;
	
	private int copiaDisponibile;
	
	
	

	public Libro() {
	
	}




	public Libro(String titolo, String autore, String serialNum) {
		
		this.titolo = titolo;
		this.autore = autore;
		this.serialNum = serialNum;
		this.copiaTotale = 0;
		this.copiaDisponibile = 0;
	}




	public String getTitolo() {
		return titolo;
	}




	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}




	public String getAutore() {
		return autore;
	}




	public void setAutore(String autore) {
		this.autore = autore;
	}




	public String getSerialNum() {
		return serialNum;
	}




	public void setSerialNum(String serialNum) {
		this.serialNum = serialNum;
	}




	public int getCopiaTotale() {
		return copiaTotale;
	}




	public void setCopiaTotale(int copiaTotale) {
		this.copiaTotale = copiaTotale;
	}




	public int getCopiaDisponibile() {
		return copiaDisponibile;
	}




	public void setCopiaDisponibile(int copiaDisponibile) {
		this.copiaDisponibile = copiaDisponibile;
	}




	@Override
	public boolean isValid() {
	  
		boolean result= false;
		
		
		if( 
			 (!titolo.isEmpty() && titolo != null ) && 
		     (!autore.isEmpty() && autore != null ) && 
		     (!serialNum.isEmpty() && serialNum != null )
		  ){
			
			result=true;
		}
		
		return result;
	}
	
	
	
	
	
	

}
