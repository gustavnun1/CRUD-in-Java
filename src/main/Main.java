
package main;

import View.Index;
import javax.swing.SwingUtilities;

public class Main {

  
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
             public void run() {
                Index frame = new Index();
                frame.setVisible(true);
            }
        
         
        
           });
    

         }
}