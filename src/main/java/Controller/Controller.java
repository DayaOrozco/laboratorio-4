/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;


 import view.GUIframe;
 import view.PanelCanva;
import java.awt.event.ActionEvent;
 import java.awt.event.ActionListener;
/**
 *
 * @author lab2-18
 */
public class Controller  implements ActionListener {
    
     private GUIframe guiFrame;
     private PanelCanva panelCanva;
    
     
     public Controller () {
          this.guiFrame = new GUIframe ();
          this.panelCanva = guiFrame.getPanelCanva( );
          this.guiFrame.listenerButton (this);
     
     }

    @Override
    public void actionPerformed(ActionEvent e) {
        this.panelCanva.moveFigure();
    }

}
