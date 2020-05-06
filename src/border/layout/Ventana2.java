/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package border.layout;

import java.awt.Button;
import java.awt.Frame;
import java.awt.BorderLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 *
 * @author Windows
 */
public class Ventana2 extends Frame {
    
    Button btn=new Button("Norte");
    Button btn2=new Button("Sur");
    Button btn3=new Button("Este");
    Button btn4=new Button("Oeste");
    
    /** Creates a new instance of Ventan2 */
    
    public Ventana2(){
        super("Ventana con eventos");
        setSize(400,300);
        setResizable(false);
        setLayout(new BorderLayout());
        
        add("North",btn);
        add("South",btn2);
        add("West",btn2);
        add("East",btn4);
        
        addWindowListener(
                   new WindowAdapter(){
                       public void windowClosing(WindowEvent e){
                           System.exit(0);
                           
                       }
                   }
        );
    }
    
}
