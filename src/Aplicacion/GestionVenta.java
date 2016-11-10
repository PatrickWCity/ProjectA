package Aplicacion;

import Libreria.Venta;

public class GestionVenta {
    public static void main(String[] args){
        // Datos de Venta
        int id_venta=1234;
        int cantidad=10;
        int precioUnitario=9000; 
        
        Venta a = new Venta();
        
        a.setId_venta(id_venta);
        a.setCantidad(cantidad);
        a.setPrecioUnitario(precioUnitario);
        
        mostrarVenta(a);
    }
    public static void mostrarVenta(Venta a){
        System.out.println(a.obtenerDatos());
    }
}