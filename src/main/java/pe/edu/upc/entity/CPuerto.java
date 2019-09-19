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
@Table(name = "Puerto")
public class CPuerto implements Serializable {
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int C_Puerto;
	@Column(name = "N_Puerto", nullable = false, length = 50)
	private String N_Puerto;
	private Date D_Creacion;
	private Boolean F_Eliminar;
	
	public CPuerto(int iD_Puerto, int c_Puerto, String n_Puerto, Date d_Creacion, Boolean f_Eliminar) {
		super();

		C_Puerto = c_Puerto;
		N_Puerto = n_Puerto;
		D_Creacion = d_Creacion;
		F_Eliminar = f_Eliminar;
	}
	
	public CPuerto() {
		super();
	}

	public int getC_Puerto() {
		return C_Puerto;
	}
	public void setC_Puerto(int c_Puerto) {
		C_Puerto = c_Puerto;
	}
	public String getN_Puerto() {
		return N_Puerto;
	}
	public void setN_Puerto(String n_Puerto) {
		N_Puerto = n_Puerto;
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
