package enumerator;

public enum TipoQuarto {
	solteiro(1), casal(2), presidencial(3);
	
	private int id;
	
	TipoQuarto(int id){
		this.id = id;
	}

	public int getId() {
		return this.id;
	}

	public String getDescricao() {
		return this.name();
	}

}
