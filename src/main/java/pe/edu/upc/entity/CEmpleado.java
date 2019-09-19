package pe.edu.upc.entity;

import java.util.Date;

public class CEmpleado {

	private int C_Empleado;
	private int ID_Empleado;
	private int C_Puesto;
	private int C_Empresa;
	private String N_Empleado;
	private Date D_Creacion;
	private Boolean F_Eliminar;
	public CEmpleado(int c_Empleado, int id_Empleado, int c_Puesto, int c_Empresa, String n_Empleado, Date d_Creacion,
			Boolean f_Eliminar) {
		super();
		C_Empleado = c_Empleado;
		ID_Empleado = id_Empleado;
		C_Puesto = c_Puesto;
		C_Empresa = c_Empresa;
		N_Empleado = n_Empleado;
		D_Creacion = d_Creacion;
		F_Eliminar = f_Eliminar;
	}
	public CEmpleado() {
		super();
	}
	public int getC_Empleado() {
		return C_Empleado;
	}
	public void setC_Empleado(int c_Empleado) {
		C_Empleado = c_Empleado;
	}
	public int getId_Empleado() {
		return ID_Empleado;
	}
	public void setId_Empleado(int id_Empleado) {
		ID_Empleado = id_Empleado;
	}
	public int getC_Puesto() {
		return C_Puesto;
	}
	public void setC_Puesto(int c_Puesto) {
		C_Puesto = c_Puesto;
	}
	public int getC_Empresa() {
		return C_Empresa;
	}
	public void setC_Empresa(int c_Empresa) {
		C_Empresa = c_Empresa;
	}
	public String getN_Empleado() {
		return N_Empleado;
	}
	public void setN_Empleado(String n_Empleado) {
		N_Empleado = n_Empleado;
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

