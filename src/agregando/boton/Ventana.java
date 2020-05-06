
//Diapositiva 14. Agregandoun componente: Botón.



package agregando.boton;

import java.awt.Button;
import java.awt.Frame;

/**
 *
 * @author Windows
 */
public class Ventana extends Frame {
Button boton1;
   
    public Ventana(){
    super("Mi primer ventana AWT");
    setSize(600,340);
    boton1= new Button("Botón 1");
    add(boton1);
    }
    
public static void main(String[] args){
    
    Ventana principal = new Ventana();
    principal.setSize(400,300);
    principal.setVisible(true);
}  

}


