package beans;

import java.io.Serializable;

import javax.annotation.ManagedBean;

import model.Hospede;

@ManagedBean(value="cadastrarMB")
public class CadastrarMB implements Serializable{

	private static final long serialVersionUID = 1698262913104893338L;
	private Hospede hospedeAtual;
	
	public Hospede getHospedeAtual() {
		return hospedeAtual;
	}

	public void setHospedeAtual(Hospede hospedeAtual) {
		this.hospedeAtual = hospedeAtual;
	}

	public CadastrarMB(){
		setHospedeAtual(new Hospede());
	}
	
}
