/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grid.layout;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 *
 * @author Windows
 */
public class Ventana2 extends Frame {
    
    Button btn=new Button("Presioname");
    Button btn1=new Button("En segundo lugar a este");
    Button btn2=new Button("Despues de este");
    Button btn3=new Button("Por ultimo este");
    
    /** Creates a new instance of Vebtana2 */
    
    public Ventana2(){
        super("Ventana con eventos");
        setSize(400,300);
        setResizable(false);
        setLayout(new GridLayout(3,2));
        
        add(btn,0);
        add(btn1,1);
        add(btn2,2);
        add(btn3,3);
        
        addWindowListener(
             new WindowAdapter(){
                 public void windowClosing(WindowEvent e){
                     System.exit(0);
                     
                 }
             
    }
        
        );
    
    
    
}
}
