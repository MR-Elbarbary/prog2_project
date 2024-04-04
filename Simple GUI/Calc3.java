package Java_Programming;
import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;
import javax.swing.plaf.ColorUIResource;
public class Calc3 {
    
    Calc3 () {
      
        Border border = BorderFactory.createLineBorder(Color.black,12);   
        JFrame frame = new JFrame();
        JLabel label = new JLabel();
    
      label.setText("Waitng for Us !");
      label.setBorder(border);        
      label.setBounds(520, 80, 300, 100);
      label.setFont(new Font("Ilastic", Font.BOLD, 30));
      label.setForeground(Color.white);
    
      
      frame.setSize(1200, 400);
      frame.setTitle("Window 1 ");
      frame.setResizable(true);
      frame.getContentPane().setBackground(new ColorUIResource(0x1235));
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setVisible(true);
      frame.setLayout(null);
      frame.setVisible(true);
      frame.add(label);

    }
}
