package pe.edu.upc.entity;

public class CActvidadProducto {
	private int ID_Producto;
	private int ID_Actividad;
	public CActvidadProducto(int iD_Producto, int iD_Actividad) {
		super();
		ID_Producto = iD_Producto;
		ID_Actividad = iD_Actividad;
	}
	public CActvidadProducto() {
		super();
	}
	public int getID_Producto() {
		return ID_Producto;
	}
	public void setID_Producto(int iD_Producto) {
		ID_Producto = iD_Producto;
	}
	public int getID_Actividad() {
		return ID_Actividad;
	}
	public void setID_Actividad(int iD_Actividad) {
		ID_Actividad = iD_Actividad;
	}
	

}
