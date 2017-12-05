package model;

import java.sql.Date;
import java.util.List;

import enumerator.TipoQuarto;

public class Reservar {
	
	private Date checkIn;
	private Date checkOut;
	private TipoQuarto tipoQuarto;
	private List<Quarto> qtdQuarto;
	private List<Hospede> qtdHospedes;
	
	public Date getCheckIn() {
		return checkIn;
	}
	
	public void setCheckIn(Date checkIn) {
		this.checkIn = checkIn;
	}
	
	public Date getCheckOut() {
		return checkOut;
	}
	
	public void setCheckOut(Date checkOut) {
		this.checkOut = checkOut;
	}
	
	public TipoQuarto getTipoQuarto() {
		return tipoQuarto;
	}
	
	public void setTipoQuarto(TipoQuarto tipoQuarto) {
		this.tipoQuarto = tipoQuarto;
	}
	
	public List<Quarto> getQtdQuarto() {
		return qtdQuarto;
	}

	public void setQtdQuarto(List<Quarto> qtdQuarto) {
		this.qtdQuarto = qtdQuarto;
	}

	public List<Hospede> getQtdHospedes() {
		return qtdHospedes;
	}

	public void setQtdHospedes(List<Hospede> qtdHospedes) {
		this.qtdHospedes = qtdHospedes;
	}
	


	


	
	
	

}
