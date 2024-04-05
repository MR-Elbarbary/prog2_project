package Java_Programming;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.plaf.ColorUIResource;
public class Calc2 implements ActionListener{

  Border border = BorderFactory.createLineBorder(Color.BLACK, 3);
  Border border2 = BorderFactory.createLineBorder(Color.BLUE, 2);

  JFrame frame  = new JFrame();
  JLabel label  = new JLabel();
  JLabel label2 = new JLabel();
  JLabel label3 = new JLabel();
  JPanel panel  = new JPanel();
  JPanel panel2 = new JPanel();
  JButton button = new JButton();

    Calc2 () {      
      
        ImageIcon image = new ImageIcon("C:\\Users\\Youssef Essa\\Desktop\\VSC Projects\\Java Projects\\Java_Programming\\Screenshot (220).png");
        ImageIcon image2 = new ImageIcon("C:\\Users\\Youssef Essa\\Desktop\\VSC Projects\\Java Projects\\Java_Programming\\Screenshot (219).png");
      
        // Labels :
        label.setIcon(image2);
        label.setBounds(10, 0, 500, 300);
        label.setBorder(border);
        
        label2.setText("Welcome to our Airline Management !");
        label2.setFont(new Font("Ilastic", Font.ITALIC, 20));
        label2.setForeground(Color.white);
        label2.setBounds(520, 10, 400, 60);
        label2.setBorder(border2);
      
        label3.setBounds(520, 80, 600, 240);
        label3.setBorder(border2);
        label3.setText("Description");
        label3.setFont(new Font("Ilastic", Font.BOLD, 30));
        label3.setForeground(Color.white);
      
        
      
        // Pannels :
        panel.setBackground(Color.black);
        panel.setBounds(20, 330, 1300, 2);
      
        // Buttons :
        button.setText("New Window");
        button.setBounds(100, 340, 160, 40);
        button.addActionListener(this);
        button.setBackground(Color.black);
        button.setForeground(Color.white);
        button.setFont(new Font("Ilastic", Font.BOLD, 20));
        button.setBorder(border2);
        
      
        // Frames :
        frame.setTitle("AirLine App Managment");
        frame.setSize(1200, 1000);
        frame.setResizable(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setIconImage(image.getImage());
        frame.getContentPane().setBackground(new ColorUIResource(0x12345));
        frame.setVisible(true);
        frame.setLayout(null);
        frame.add(label);
        frame.add(label2);
        frame.add(label3);
        frame.add(panel);
        frame.add(button);

  }

    @Override
    public void actionPerformed(ActionEvent e) {
       if (e.getSource() == button)
       { Calc3 C = new Calc3();} // object for getting default Constructor

    }
}
