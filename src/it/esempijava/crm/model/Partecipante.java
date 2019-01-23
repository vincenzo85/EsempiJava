package it.esempijava.crm.model;


public abstract class Partecipante {
	
	/**
	 *  variabile di instanza, caratterizzano lo stato della classe ;
	 *  
	 *  
	 *  Java Bean : pattern, modalità operativa per risolvere un problema noto, tutte le volte che ho bisogno di tante informazioni 
	 *  le raccolgo in una classe. 
	 */
	
	private static int counter = 0;
	private int idx;
	private String nome;
	private String email;
	private int eta;
	private String cognome;
	
	/* getter e setter */
	
	static {
		/* esegue eventuali blocchi statichi per la prima volta */
		
		/* variabili e metodi statici */
		System.err.print("Sono dentro al metodo static che si avvia una sola volta .... ");
		
		counter = 100; 
	}
	
	
	
	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public int getEta() {
		return eta;
	}


	public void setEta(int eta) {
		this.eta = eta;
	}


	public String getCognome() {
		return cognome;
	}


	public void setCognome(String cognome) {
		this.cognome = cognome;
	}


	/* overriding del costruttore di default */
	
	public Partecipante() {
		System.out.println("Chiamo il costruttore senza argomenti di Partecipante");
		init();
		
				
	}
	
	/* costruttore con firma diversa */
	public Partecipante( String nome,  int eta, String cognome) {
		this();
		System.out.println("Chiamo il costruttore con gli argomenti");
		System.out.println("Chiamo anche il costruttore senza argomenti che potrebbe avere un init");
		
		this.nome = nome;
		this.eta = eta;
		this.cognome = cognome;
	}
	
	public Partecipante(String nome, String email, int eta, String cognome) {
		this(nome, eta, cognome);
	
		this.email = email;
	
	}
	
	public void init() {
		System.out.println("CHIAMO INIT PER AUMENTARE Idx COSI' SO CHE NUMERO DI INSTANZE HO APERTO");
		this.idx = ++counter;
		System.out.println("STAMPO IDX: " + idx);
	}
	
	/**
	 *  permette di stampare l'oggetto partecipante 
	 */
	@Override
	public String toString() {
		
		return super.toString()+ "TO STRNG METHOD " + "Nome: "+ nome + ", Cognome:" + cognome + ", email: " + email +  ", eta:" + eta ;
	}
	
	/* aggiunto il metoo per stampare il singolo partecipante */
	
	public void stampaPartecipante() {
		System.out.println("Nome: " + nome + ", Cognome:" + cognome + ", Email:" + email + ", età: " + eta);
	}
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("Sono dentro equals");
		
		if (this == obj) {
			
			System.out.println("Ho confrontato la reference");
			
			return true;
			/*per controllare la reference*/
			
		}
		
		System.out.println("Sto controllando se è un instanzia di partecipante");
		
		if (obj instanceof Partecipante) {
			System.out.println("E' un'instanza di partecipante");
			
			Partecipante p = (Partecipante)obj;
			
			System.out.println("Controllo che ogni singolo campo è uguale tra loro");
			if (this.nome.equals(p.getNome())
				&&
				this.cognome.equals(p.getCognome()) 
				&&
				this.email.equals(p.getEmail())) 
			{
				System.out.println("Sono uguali ho usato equals di di string");
				return true;
				
			}
			
		}
		
		System.out.println("Non sono uguali");
		
		return false;
	}
	
	public abstract double calcolaCompensoGiornaliero();
	

}
