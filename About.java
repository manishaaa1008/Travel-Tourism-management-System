import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class About extends JFrame implements ActionListener {
    About() {
        setBounds(600,200,500,550);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);

        JLabel l1 = new JLabel("About");
        l1.setFont(new Font("Tahoma", Font.BOLD,30));
        l1.setBounds(200,10,100,40);
        l1.setForeground(Color.red);
        add(l1);

        String s= "About Projects          \n" +

       " \n" +
        
        "The objective of the Travel and Tourism Management System project is to develop a platform that streamlines various aspects of travel planning and management, catering to both travelers and service providers. \n" +
        "\n" +
         "This application will help in accessing the information related to the travel to the particular destinations, including details on accommodations, attractions, hotel options,various packages and different places. \n" +
         
         "\n" +
       
        
        "Advantages of Project: \n" +
        
        "Gives accurate information\n" +
        
        "Simplifies the manual work\n" +
        
        "It minimizes the documentation related work\n" +
        
        "Provides up to date information\n" +
        
        "Friendly Environment by providing warning messages. \n" +
        
        "Travelers details can be provided\n" + 
        "Booking confirmation notification";

        TextArea area = new TextArea(s, 10, 40, Scrollbar.VERTICAL);
        area.setEditable(false);
        area.setBounds(20,100,450,300);
        add(area);

        JButton back = new JButton("Back");
        back .setBounds(200, 420, 100, 25);
        back .setBackground(Color.black);
        back .setForeground(Color.white);
        back.addActionListener(this);
        add(back);



       setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        setVisible(false);
    }

    public static void main(String[] args) {
        new About();
    }
    
}
