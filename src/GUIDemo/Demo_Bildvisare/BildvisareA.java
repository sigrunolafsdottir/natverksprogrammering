package GUIDemo.Demo_Bildvisare;

import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.*;

//Visar en bild
public class BildvisareA extends JFrame {
    
    private JButton changeImageButton;
    private JLabel imageViewer;
    protected JPanel panel;
    final String imagePath = "src/GUIDemo/Demo_Bildvisare/images/bild0.jpg";
    
    public BildvisareA() {
        changeImageButton = new JButton("Byt bild");
        imageViewer = new JLabel(new ImageIcon(imagePath));
        panel = new JPanel();
        panel.setLayout(new FlowLayout());
        panel.setBackground(Color.BLACK);
        panel.add(imageViewer);
        panel.add(changeImageButton);
        this.add(panel);
        setSize(800,600);   
        setVisible(true); 
        setDefaultCloseOperation(EXIT_ON_CLOSE); 
    }
    
    public static void main(String args[]){
        BildvisareA bildvisare = new BildvisareA();
    }
}
