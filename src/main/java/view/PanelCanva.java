/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import java.awt.Color;
import  java.awt.Graphics;
import javax.swing.JPanel; 


/**
 *
 * @author lab2-18
 */
public class PanelCanva extends JPanel{
     
    private int x ;
    private int y ;
    
    public PanelCanva (){
        
        this.x = 20 ;
        this.y = 20 ; 
    }
    // PaintComponenete el que genera o crea un grafco o fugura en el panel 
    protected void paintComponent (Graphics g) {
    //La figura se mueve 10px hacia la drecha 
    super.paintComponent (g);
    //Pone el color a la figura creada por Graphics g
    g.setColor(Color.PINK);
    g.fillOval(this.x, this.y, 20, 20);
   
    

          //g.setColor(Color.white)
           // g.fillRect(this.x,this.y, 10, 10 );
}
    
    
    public void  moveFigure () {
        //
        int moveDistance = 10;
        int figureSize = 20;
         
        if (x + moveDistance +  figureSize <= getWidth ()) {
            x += moveDistance;
        } else {
             x= getWidth ()+ figureSize;
        }
        //re pinta la figur geometrica en el panel 
        repaint ( );
        }
    }
