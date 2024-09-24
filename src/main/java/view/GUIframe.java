/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import javax.swing.JButton; 
import javax.swing.JFrame;

/**
 *
 * @author lab2-18
 */

public class GUIframe extends JFrame {
    
    
    private PanelCanva panelCanva;
    private JButton btnMove;
    
  public GUIframe () {
      
              this.panelCanva = new PanelCanva ();
              this.btnMove = new JButton ( "mover en X");
      
      
         this.setSize(500 , 500);
         this.setTitle("laboratorio 4");
         this.setVisible(true );
  
         this.add ( panelCanva, BorderLayout.CENTER);
         this.add(this.btnMove, BorderLayout.SOUTH);
  } 
  public GUIframe ( String titulo, int ancho, int alto)
  {
      this.setSize (ancho, alto);
      this.setTitle ( titulo );
      this.setVisible (true);
  }
  
   public void listenerButton ( ActionListener controller){
        this.btnMove.addActionListener( controller); 
   }
 
   
   public PanelCanva getPanelCanva (){
       return this.panelCanva;
   }
}