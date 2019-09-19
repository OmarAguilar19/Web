package pe.edu.upc.entity;

import java.util.Date;

public class CProducto {

	
	private int ID_Producto;
	private int C_Producto;
	private String N_Producto;
	private Date D_Creacion;
	private Boolean F_Eliminar;
	public CProducto(int iD_Producto, int c_Producto, String n_Producto, Date d_Creacion, Boolean f_Eliminar) {
		super();
		ID_Producto = iD_Producto;
		C_Producto = c_Producto;
		N_Producto = n_Producto;
		D_Creacion = d_Creacion;
		F_Eliminar = f_Eliminar;
	}
	public CProducto() {
		super();
	}
	public int getID_Producto() {
		return ID_Producto;
	}
	public void setID_Producto(int iD_Producto) {
		ID_Producto = iD_Producto;
	}
	public int getC_Producto() {
		return C_Producto;
	}
	public void setC_Producto(int c_Producto) {
		C_Producto = c_Producto;
	}
	public String getN_Producto() {
		return N_Producto;
	}
	public void setN_Producto(String n_Producto) {
		N_Producto = n_Producto;
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
