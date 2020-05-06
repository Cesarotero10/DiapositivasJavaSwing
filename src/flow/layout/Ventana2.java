/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flow.layout;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 *
 * @author Windows
 */
public class Ventana2 extends Frame {
    
    Button btn=new Button("Norte");
    Button btn1=new Button("Sur");
    Button btn2=new Button("Este");
    Button btn3=new Button("Oeste");
     
    /** Creates a new instance of Ventana2 */
    
    public Ventana2(){
        super ("Ventana con eventos");
        setSize (400,300);
        setResizable(false);
        setLayout(new FlowLayout());
         
        add(btn);
        add(btn1);
        add(btn2);
        add(btn3);
        
        
        addWindowListener(
             new WindowAdapter(){
                 public void windowClosing(WindowEvent e){
                     System.exit(0);
                     
                 }
             
    }
        
        );
    
    }
        
    
    
}
