/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Felix;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
/**
 *
 * @author Felix
 */
public class SwingChatt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SwingUtilities.invokeLater(new Runnable(){
            public void run(){
                 JFrame frame = new MainFrame("Hello And welcome to this Swing aplication!");
        frame.setSize(500, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
            }
    });
       
    }
    
}
