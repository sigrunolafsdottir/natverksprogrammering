/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swingchatt;
import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.Container;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MainFrame extends JFrame implements ActionListener{
     final JTextArea textArea = new JTextArea();
     JButton button = new JButton("Koppla i från!");
        
    public MainFrame(String title){
        super(title);
        
        // set layout manager
        setLayout(new BorderLayout());
        setVisible(true); 
        // create swing components
       
        
        // add swing components to content pane
        Container c = getContentPane();
        c.add(textArea, BorderLayout.CENTER);
        c.add(button, BorderLayout.SOUTH);
        button.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                // todo auto-game method stub
                textArea.append("Disconected\n");
            }
        });
    }
    
    static public void main(String[] args){
        MainFrame myFrame = new MainFrame("FUNKAR"); 
    }
    
    public void actionPerformed(ActionEvent evt){}
            
}