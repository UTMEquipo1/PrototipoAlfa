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
public class Botones {
    
    private static Anadir anadir;
    private static Producto producto[];
    private static int contador;
    
    public static void main(String[] arg){
        anadir= new Anadir();
        producto=new Producto[500];
        
        
        
        for(int i =0; i<500;i++){
            producto[i]= new Producto();
        }
        contador=0;
        
        anadir.setVisible(true);
    }
    public static void guardar(String N, String D,Integer C,Float P,String T,String id ){
        producto[contador].setNombre(N);
        producto[contador].setDescripcion(D);
        producto[contador].setCantidad(C);
        producto[contador].setPrecio(P);
        producto[contador].setTipo(T);
        producto[contador].setID(id);     
        contador++;
    }
    

}
