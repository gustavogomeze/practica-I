/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicai;

import java.util.Scanner;
/**
 *
 * @author gusta
 */
public class PracticaI {
    
    
public class ArregloProd {
    
    int contador=0, cod=1; //Vbles de control
    Producto productos[] = new Producto[50]; //Arreglo de objetos
    Scanner lector= new Scanner(System.in);
    public ArregloProd(){
    
    
    
    int opcion=0;
    
    do{
    System.out.println("Ingrese una opcion:");
            System.out.println("1. Agregar un producto");
            System.out.println("2. Buscar producto");
            System.out.println("3. Eliminar producto");
            System.out.println("4. Mostrar Inventario");
            System.out.println("5. Realizar venta");
            System.out.println("6. Mostrar Inventario");
            System.out.println("6. Mostrar ganacias");
            System.out.println("7. Salir");
            opcion=lector.nextInt();

    switch (opcion) {
            case 1:
               ingresar();
               break;
               
            case 2:
               buscar();
               break;
                
            case 3:
              eliminar();
                break;  
            
            case 4:
                mostrar();
               break;
            
            case 5:
              venta();
                break;  
            
            case 6:
                ganancias();
               break;
                
                
            case 7:
                break;  
            default:
                    System.out.println("Ingrese una opcion valida");
                        break;
        
    }
    }while (opcion !=7);
    }
        
        



        
    public void ingresar(){
        String nombre;
        int precio, cant;
        Producto tmp = new Producto();
        System.out.println("Ingrese el nombre del producto: ");
        nombre=lector.next();
        System.out.println("Ingrese la cantidad del producto: ");
        cant=lector.nextInt();
        System.out.println("Ingrese el precio del producto: ");
        precio=lector.nextInt();
        
        tmp.setNombre(nombre);
        tmp.setCantidad(cant);
        tmp.setPrecio(precio);
        
        productos[contador]=tmp;
        contador++;
        cod++;
        
        
    }
    
    public void buscar(){
        String prod;
        
        System.out.println("Ingrese el nombre del producto: ");
        prod=lector.next();
        
        if (contador!=0){
            for(int i=0; i<contador; i++){
            if(productos[i].getNombre()==prod){
            System.out.println("El nombre del producto es: "+productos[i].getNombre());
            System.out.println("La cantidad del producto es: "+productos[i].getCantidad());
            System.out.println("El precio del producto es: "+productos[i].getPrecio());
            }   
            }
        }
    }
    
    public void eliminar(){
        int c=0,sw=0;
        String elim;
        
        Producto prodstmp[] = new Producto[contador-1];
        System.out.println("Ingrese el nombre del producto: ");
        elim=lector.next();
        for(int i=0; i<contador; i++){
            if(elim==prodstmp[i].getNombre()){
                sw=1;c=i;
               }
            if (sw==1){
              for(i=0; i<contador; i++){
                  if(i<c){
                      prodstmp[i]=productos[i];
                  }
                  if(i>c){
                      prodstmp[i]=productos[i+1];
                  }
              } 
            }
                
            
        }
        
        }
    
    
    public void mostrar(){
        for(int i=0; i<contador; i++){
            System.out.println("El nombre del producto es: "+productos[i].getNombre());
            System.out.println("La cantidad del producto es: "+productos[i].getCantidad());
            System.out.println("El precio del producto es: "+productos[i].getPrecio()); 
        }
    }   
    
    public void venta(){
        String prod;
        int c,venta;
        
        System.out.println("Ingrese el nombre del producto: ");
        prod=lector.next();
        
        if (contador!=0){
            for(int i=0; i<contador; i++){
            if(productos[i].getNombre()==prod){
            System.out.println("Ingrese la cantidad de unidades a vender");
            c=lector.nextInt();
            venta=productos[i].getVentas()+c;
            productos[i].setVentas(venta);
            }   
            }
        }
    }
    
   public void ganancias() {
       int ventasAcum=0, ganancia, gananciaAcum=0;
       
       for(int i=0; i<contador; i++){
           ventasAcum=ventasAcum+productos[i].getVentas();
           ganancia=productos[i].getVentas()*productos[i].getPrecio();
           gananciaAcum=gananciaAcum+ganancia;
           System.out.println("Del producto "+productos[i].getNombre()+" se han vendido "+productos[i].getVentas()+" unidades lo que da una ganancia de: "+ganancia);

       }
       System.out.println("En total se han realizado unas ventas de: "+gananciaAcum);
       
   }
}    
}

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        
       ArregloProd p = new ArregloProd() ;
        // TODO code application logic here
    
  
}
