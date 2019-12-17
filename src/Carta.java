
public class Carta {
	
	private  String tipo;
	private int valor;
	
	
	//*****  Constructores
	
	public Carta(String tipo, int valor) {
		super();
		this.tipo = tipo;
		this.valor = valor;
	}
	
	public Carta( ) {
		super();
		this.tipo = "";
		this.valor = 0;
	}
	
	
	//  Getter & Setter
	
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	
	//***** ToString
	@Override
	public String toString() {
		return "Carta [tipo=" + tipo + ", valor=" + valor + "]";
	}
	
	
	
	
}
