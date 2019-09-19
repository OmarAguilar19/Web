package pe.edu.upc.entity;

import java.util.Date;

public class CBarco {
	
	private int ID_Barco;
	private int ID_Puerto;
	private int ID_Empresa;
	private int C_Barco;
	private String N_Barco;
	private Date D_Creacion;
	private Boolean F_Eliminar;
	public CBarco(int iD_Barco, int iD_Puerto, int iD_Empresa, int c_Barco, String n_Barco, Date d_Creacion,
			Boolean f_Eliminar) {
		super();
		ID_Barco = iD_Barco;
		ID_Puerto = iD_Puerto;
		ID_Empresa = iD_Empresa;
		C_Barco = c_Barco;
		N_Barco = n_Barco;
		D_Creacion = d_Creacion;
		F_Eliminar = f_Eliminar;
	}
	public CBarco() {
		super();
	}
	public int getID_Barco() {
		return ID_Barco;
	}
	public void setID_Barco(int iD_Barco) {
		ID_Barco = iD_Barco;
	}
	public int getID_Puerto() {
		return ID_Puerto;
	}
	public void setID_Puerto(int iD_Puerto) {
		ID_Puerto = iD_Puerto;
	}
	public int getID_Empresa() {
		return ID_Empresa;
	}
	public void setID_Empresa(int iD_Empresa) {
		ID_Empresa = iD_Empresa;
	}
	public int getC_Barco() {
		return C_Barco;
	}
	public void setC_Barco(int c_Barco) {
		C_Barco = c_Barco;
	}
	public String getN_Barco() {
		return N_Barco;
	}
	public void setN_Barco(String n_Barco) {
		N_Barco = n_Barco;
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
