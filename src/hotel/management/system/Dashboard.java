
package hotel.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Dashboard extends JFrame implements ActionListener {
 
    Dashboard(){
        setBounds(0,0, 1550, 1000);
        
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Icons/dashb.png"));
        Image i2 = i1.getImage().getScaledInstance(1550, 1000, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 1500, 1000);
        add(image);
        
        JLabel text = new JLabel(" SAKEC HOTEL");
        text.setBounds(1080, 20, 500, 80);
        text.setFont(new Font("Tahoma",Font.PLAIN, 46));
        text.setForeground(Color.WHITE);
        image.add(text);
        
        JLabel text1 = new JLabel("WELCOMES YOU");
        text1.setBounds(1100, 56, 500, 80);
        text1.setForeground(Color.WHITE);
        text1.setFont(new Font("serif",Font.BOLD,20));
        image.add(text1);
        
        JMenuBar mb = new JMenuBar();
        mb.setBounds(0,0,1550,30);
        image.add(mb);
        
        JMenu hotel = new JMenu("Hotel Management");
        hotel.setForeground(Color.RED);
        mb.add(hotel);
        
        
        JMenuItem reception = new JMenuItem("RECEPTION");
        reception.addActionListener(this);
        hotel.add(reception);
        
        JMenu admin = new JMenu("ADMIN");
        admin.setForeground(Color.blue);
        mb.add(admin);
        
        JMenuItem addemployee = new JMenuItem("ADD EMPLOYEE");
        addemployee.addActionListener(this);
        admin.add(addemployee);
        
        JMenuItem addrooms = new JMenuItem("ADD ROOMS");
        addrooms.addActionListener(this);
        admin.add(addrooms);
        
                
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getActionCommand().equals("ADD EMPLOYEE")){
            new AddEmployee();
        } else if(ae.getActionCommand().equals("ADD ROOMS")){
           new AddRoom();
        } else if(ae.getActionCommand().equals("RECEPTION")){
           new Reception();
    }
}
    
    public static void main(String[] args){
        new Dashboard();
    }
}
