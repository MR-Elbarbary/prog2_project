package Airline_Project;
import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;
public class Help_Info extends JFrame {

    JPanel panel ;
    JLabel label [] = new JLabel[2];
    private Border border ;


    Help_Info () {

        border = BorderFactory.createLineBorder(Color.blue, 5);
        // JLabel :
 
        // BEST METHOD for loops but remeber to create (new ) for placing in memort to avoid Erorr
     
        for (int i = 0 ; i < label.length;++i)
        {
            label[i] = new JLabel();   // === > IMPORTANT
            label[i].setForeground(Color.white);
            label[i].setFont(new Font("Ilastic",Font.ITALIC, 20));
            label[i].setLayout(null);

        }
      
        label[0].setText("Efficinetly manage your flight withcomprehensive airline App");
        label[0].setBounds(30, 20,1000, 30);
    
        label[1].setText("Facilitating easy booking and providing detailed flight information at your fingertips !");
        label[1].setBounds(40, 60,1000, 30);


        // ----------------------------------------
        // JPanel :

        panel = new JPanel();
        panel.setBounds(10, 20, 800, 200);
        panel.setBackground(Color.darkGray);
        panel.setBorder(border);
        panel.setLayout(null);
        for (int i = 0 ; i < label.length;++i) { panel.add(label[i]) ;}

        // ----------------------------------------
        // JFrames :
        this.setSize(1000, 300);
        this.setTitle("App Help !");
        this.getContentPane().setBackground(Color.black);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setResizable(true);
        this.setLayout(null);
        this.setVisible(true);
        this.add(panel);

    }
}
