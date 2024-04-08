package Airline_Project;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class Home_Page extends JFrame implements ActionListener{


    // Remember According to numbers of [Buttons - Labels - Panels - Border]
    // statue at ARRAY OF OBJECTS  to avoid the null pointer Exceptions

    private JLabel [] label = new JLabel[4];   
    private JButton [] button = new JButton[3];
    private JPanel [] panel = new JPanel[5];
    private Border border [] = new Border[3] ;

    private ImageIcon image;
    private ImageIcon image1;
   


    Home_Page () {

    image = new ImageIcon("C:\\Users\\Youssef Essa\\Desktop\\VSC Projects\\Java Projects\\Java_Programming\\Airline_Project\\Screenshot (219).png");
    image1 = new ImageIcon("C:\\Users\\Youssef Essa\\Desktop\\VSC Projects\\Java Projects\\Java_Programming\\Airline_Project\\Screenshot (256).png");
    border[0] = BorderFactory.createLineBorder(Color.black, 5);
    border[1] = BorderFactory.createLineBorder(Color.blue, 5);
    border[2] = BorderFactory.createLineBorder(Color.blue, 5);


    // Starting Message :
    JOptionPane.showMessageDialog(null, "Welcome To our Airline App"," Airline_App", JOptionPane.INFORMATION_MESSAGE);

      // --------------------------------------------------------------
      // JLabels :

      label[0] = new JLabel();   // For Airline Mangment
      label[0].setText("Airline Managment");
      label[0].setForeground(Color.white);
      label[0].setBounds(50, 0, 300, 90);
      label[0].setFont(new Font("Ilastic",Font.ITALIC, 20));
      label[0].setLayout(null);

      label[1] = new JLabel();   // For Underline At the Top Left
      label[1].setText("__________________________");
      label[1].setBounds(50, 50, 210, 30);
      label[1].setForeground(Color.white);
      label[1].setFont(new Font("Ilastic",Font.ITALIC, 10));
      label[1].setLayout(null);

      label[2] = new JLabel();   // Stating For Home Page
      label[2].setText("Home Page");
      label[2].setForeground(Color.white);
      label[2].setBounds(1130, 75, 210, 30);
      label[2].setFont(new Font("Ilastic",Font.ITALIC, 25));
      label[2].setLayout(null);

      label[3] = new JLabel();   // Only For DashBoard as Good Form !
      label[3].setText("DashBoard");
      label[3].setForeground(Color.white);
      label[3].setFont(new Font("Ilastic",Font.ITALIC, 25));
      label[3].setBounds(310, 10, 210, 30);
      label[3].setLayout(null);


     
      // --------------------------------------------------------------

      // JButtons :

      button[0] = new JButton();  // Button For Checking ID At the Left
      button[0].setBounds(10, 120, 100, 50);
      button[0].setText("Check ID");
      button[0].setForeground(Color.white);
      button[0].setBackground(Color.black);    
      button[0].setFont(new Font("Ilastic",Font.ITALIC, 15));
      button[0].setBorder(border[1]);
      button[0].addActionListener(this);
      
      button[1] = new JButton();  // Button For Checking ID At the Left
      button[1].setBounds(10, 180, 130, 50);
      button[1].setText("Booking Tickits");
      button[1].setForeground(Color.white);
      button[1].setBackground(Color.black);    
      button[1].setFont(new Font("Ilastic",Font.ITALIC, 15));
      button[1].setBorder(border[1]);
      button[1].addActionListener(this);

      button[2] = new JButton();  // Button For Checking ID At the Bottom Left
      button[2].setBounds(150, 660, 130, 50);
      button[2].setText("Help !!");
      button[2].setForeground(Color.white);
      button[2].setBackground(Color.black);    
      button[2].setFont(new Font("Ilastic",Font.ITALIC, 15));
      button[2].setBorder(border[1]);
      button[2].setFocusable(false);
      button[2].addActionListener(this);
      

      // ---------------------------------------------------------------

      // JPanels :

      panel[0] = new JPanel();    // First Panel for Left One 
      panel[0].setBounds(0, 0, 300, 730);
      panel[0].setBackground(new Color(0x520054A));
      panel[0].setBorder(border[0]);
      panel[0].setLayout(null);
      panel[0].add(label[0]);
      panel[0].add(label[1]);
      panel[0].add(button[0]);
      panel[0].add(button[1]);
      panel[0].add(button[2]);
   

      panel[1] = new JPanel();   // For Home Page
      panel[1].setBackground(new Color(0x520054A));
      panel[1].setBounds(1100, 70, 190, 50);
      panel[1].setBorder(border[0]);
      panel[1].setLayout(null);
      panel[1].add(label[2]);
      

      panel[2] = new JPanel();  // On the Top of the Windows (panel for DashBoard)
      panel[2].setBackground(new Color(0x520024A));
      panel[2].setBounds(300, 0, 990, 60);
      panel[2].setBorder(border[0]);
      panel[2].setLayout(null);
      panel[2].add(label[3]);

      panel[3] = new JPanel(); // On The Right of our Window below Home Page
      panel[3].setBounds(1120, 120, 160, 600);
      panel[3].setBorder(border[0]);
      panel[3].setBackground(new Color(0x123456));


      panel[4] = new JPanel(); // On The Top Right of our Window For Setting or Somthing advanced
      panel[4].setBounds(1320, 20, 100, 500);
      panel[4].setBorder(border[0]);
      panel[4].setBackground(new Color(0x1245));


      // JFrames :

        this.setSize(1500, 1500);
        this.setTitle("Airline App ");
        this.setIconImage(image.getImage());
        this.getContentPane().setBackground(new Color(0x123));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.setResizable(false);
        this.setLayout(null);
        this.setVisible(true);

        // Adding Elements in Frames :

        // For Loops For adding Elements :
        // With Each [Label - Buttons - Panels] are created Automatic added to our Frame !!!!!

        for (int i = 0 ; i < label.length;++i) { this.add(label[i]); }
        
        for (int i = 0 ; i < button.length;++i) { this.add(button[i]); }
        
        for (int i = 0 ; i < panel.length;++i) { this.add(panel[i]); }


    }


    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == button[2]) { Help_Info C = new Help_Info(); } // Opening New Window For Help !

        // Just Waiting for another buttons under working !!
        if (e.getSource() == button[0]) {

         JOptionPane.showMessageDialog(null, "It is still under procedure \n Contact with Youssef !"," Wait !", JOptionPane.WARNING_MESSAGE);
            } 

        if (e.getSource() == button[1]) {

         JOptionPane.showMessageDialog(null, "It is still under procedure \n Contact with Youssef !"," Wait !", JOptionPane.WARNING_MESSAGE);
        
        } 
    }
}
