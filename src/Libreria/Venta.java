package Libreria;
// Hecho por PATRICK WALTER CIUDAD ITURRA
public class Venta implements IVenta {
    // Atributos
	private int id_venta;
	private int cantidad;
	private int precioUnitario;
    // Constructor
    public Venta(){
        id_venta=0;
        cantidad=0;
        precioUnitario=0;
    }
    // Propiedades
    public int getId_venta() {
        return id_venta;
    }

    public void setId_venta(int id_venta) {
        this.id_venta = id_venta;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(int precioUnitario) {
        this.precioUnitario = precioUnitario;
    }
    // Métodos
    public int obtenerMontoVenta() {
        int montoVenta;
        montoVenta= (int) cantidad * precioUnitario;
        return montoVenta;
    }
    public String obtenerDatos() {     
        String datos="";
        datos +="Número de Venta    : " + id_venta + "\n";
        datos +="Cantidad           : " + cantidad + "\n";
        datos +="Precio Unitario    : " + precioUnitario + "\n"; 
        datos +="Monto de Venta     : " + obtenerMontoVenta() + "\n";
        return datos;
    }
}	