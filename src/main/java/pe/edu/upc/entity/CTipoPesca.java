package pe.edu.upc.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "TipoPesca")
public class CTipoPesca implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int C_TipoPesca;
	@Column(name = "N_TipoPesca", nullable = false, length = 50)
	private String N_TipoPesca;
	private Date D_Creacion;
	private Boolean F_Eliminar;
	public CTipoPesca(int iD_TipoPesca, int c_TipoPesca, String n_TipoPesca, Date d_Creacion, Boolean f_Eliminar) {
		super();
		
		C_TipoPesca = c_TipoPesca;
		N_TipoPesca = n_TipoPesca;
		D_Creacion = d_Creacion;
		F_Eliminar = f_Eliminar;
	}
	public CTipoPesca() {
		super();
	}
	
	public int getC_TipoPesca() {
		return C_TipoPesca;
	}
	public void setC_TipoPesca(int c_TipoPesca) {
		C_TipoPesca = c_TipoPesca;
	}
	public String getN_TipoPesca() {
		return N_TipoPesca;
	}
	public void setN_TipoPesca(String n_TipoPesca) {
		N_TipoPesca = n_TipoPesca;
	}
	public Date getD_Creacion() {
		return D_Creacion;
	}
	public void setD_Creacion(Date d_Creacion) {
		D_Creacion = d_Creacion;
	}
	public Boolean getF_Eliminar() {
		return F_Eliminar;
	}
	public void setF_Eliminar(Boolean f_Eliminar) {
		F_Eliminar = f_Eliminar;
	}

}
