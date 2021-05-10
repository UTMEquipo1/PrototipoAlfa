/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vendedor.persisitencia;

/**
 *
 * @author willm
 */
public class Producto {
    String Nombre;
    String Descripcion;
    Integer Cantidad;
    Float Precio;
    String Tipo;
    String ID;
    
    public Producto(String Nombre, String Descripcion,Integer Cantidad,Float Precio,String Tipo,String ID){
        this.Nombre=Nombre;
        this.Descripcion = Descripcion;
        this.Cantidad = Cantidad;
        this.Precio = Precio;
        this.Tipo = Tipo;
        this.ID = ID;
    }
    public Producto(){
        this.Nombre="";
        this.Descripcion ="";
        this.Cantidad =0;
        this.Precio = null;
        this.Tipo = "";
        this.ID = "";
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public Integer getCantidad() {
        return Cantidad;
    }

    public void setCantidad(Integer Cantidad) {
        this.Cantidad = Cantidad;
    }

    public Float getPrecio() {
        return Precio;
    }

    public void setPrecio(Float Precio) {
        this.Precio = Precio;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }
      
    
    
}
