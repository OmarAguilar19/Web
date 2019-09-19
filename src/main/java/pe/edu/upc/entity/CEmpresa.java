package pe.edu.upc.entity;

import java.util.Date;

public class CEmpresa {

	private int ID_Empresa;
	private int C_Empresa;
	private String N_Empresa;
	private Date D_Creacion;
	private Boolean F_Eliminar;
	public CEmpresa(int iD_Empresa, int c_Empresa, String n_Empresa, Date d_Creacion, Boolean f_Eliminar) {
		super();
		ID_Empresa = iD_Empresa;
		C_Empresa = c_Empresa;
		N_Empresa = n_Empresa;
		D_Creacion = d_Creacion;
		F_Eliminar = f_Eliminar;
	}
	
	
	
	
	public CEmpresa() {
		super();
	}




	public int getID_Empresa() {
		return ID_Empresa;
	}
	public void setID_Empresa(int iD_Empresa) {
		ID_Empresa = iD_Empresa;
	}
	public int getC_Empresa() {
		return C_Empresa;
	}
	public void setC_Empresa(int c_Empresa) {
		C_Empresa = c_Empresa;
	}
	public String getN_Empresa() {
		return N_Empresa;
	}
	public void setN_Empresa(String n_Empresa) {
		N_Empresa = n_Empresa;
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
