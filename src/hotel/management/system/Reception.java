
package hotel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Reception extends JFrame implements ActionListener{
    JButton newCustomer , rooms ,department,allEmployees,managerINFO ,customers,searchRoom,update,roomStatus,checkout,logout;
    Reception(){
        
        
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        
       
        newCustomer = new JButton("New Customer Form");
        newCustomer.setBounds(30, 50, 200 ,30 );
        newCustomer.setBackground(Color.BLACK);
        newCustomer.setForeground(Color.WHITE);
        newCustomer.addActionListener(this);
        add(newCustomer);
        
        
          rooms = new JButton(" rooms");
         rooms.setBounds(30, 90, 200 ,30 );
         rooms.setBackground(Color.BLACK);
         rooms.setForeground(Color.WHITE);
          rooms.addActionListener(this);
        add(rooms);
        
        
         department = new JButton("Department ");
         department .setBounds(30, 130, 200 ,30 );
         department.setBackground(Color.BLACK);
         department.setForeground(Color.WHITE);
          department.addActionListener(this);
        add(department );
        
         allEmployees = new JButton("All Employees ");
         allEmployees.setBounds(30, 170, 200 ,30 );
         allEmployees.setBackground(Color.BLACK);
         allEmployees.setForeground(Color.WHITE);
          allEmployees.addActionListener(this);
        add(allEmployees );
        
        
        customers = new JButton("Customer INFO ");
         customers.setBounds(30, 210, 200 ,30 );
         customers.setBackground(Color.BLACK);
         customers.setForeground(Color.WHITE);
         customers.addActionListener(this);
        add(customers );
        
        
        
        managerINFO = new JButton("Manager INFO ");
         managerINFO.setBounds(30, 250, 200 ,30 );
         managerINFO.setBackground(Color.BLACK);
         managerINFO.setForeground(Color.WHITE);
          managerINFO.addActionListener(this);
        add(managerINFO );
        
        
        checkout = new JButton("Checkout");
         checkout.setBounds(30, 290, 200 ,30 );
         checkout.setBackground(Color.BLACK);
         checkout.setForeground(Color.WHITE);
         checkout.addActionListener(this);
        add(checkout);
        
        
        update= new JButton("Update Status");
         update.setBounds(30, 330, 200 ,30 );
         update.setBackground(Color.BLACK);
         update.setForeground(Color.WHITE);
         update.addActionListener(this);
        add(update );
        
        
         roomStatus= new JButton("Update Room Status");
         roomStatus.setBounds(30, 370, 200 ,30 );
         roomStatus.setBackground(Color.BLACK);
         roomStatus.setForeground(Color.WHITE);
         roomStatus.addActionListener(this);
        add(roomStatus );
        
        
        searchRoom= new JButton("Search Rooms");
         searchRoom.setBounds(30, 410, 200 ,30 );
         searchRoom.setBackground(Color.BLACK);
         searchRoom.setForeground(Color.WHITE);
        searchRoom.addActionListener(this);
        add(searchRoom );
        
        
         logout= new JButton("Logout");
         logout.setBounds(30, 450, 200 ,30 );
         logout.setBackground(Color.BLACK);
         logout.setForeground(Color.WHITE);
         logout.addActionListener(this);
        add(logout );
        
        ImageIcon il = new ImageIcon(ClassLoader.getSystemResource("icons/DESK.jpg"));
        Image i2 = il.getImage().getScaledInstance(1000,500, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(260,50,700,425);    // adjust the picture 
        add(image);
                
                
                
                
        setBounds(350,200,1000,600);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
       if (ae.getSource() == newCustomer ){
           setVisible(false);
           new AddCustomer();
       }else if (ae.getSource() == rooms ) {
            setVisible(false);
            new Room();
      }else if (ae.getSource() == department ){
          setVisible(false);
          new Department();
      }else if (ae.getSource() == allEmployees ){
          setVisible(false);
          new Employeeinfo();
      }else if (ae.getSource() == searchRoom ){
          setVisible(false);
          new SearchRoom();
      }else if (ae.getSource() == managerINFO) {
          setVisible(false);
          new ManagerInfo();
            }else if (ae.getSource() == update) {
          setVisible(false);
          new UpdateCheck();
            }else if (ae.getSource() == roomStatus) {
          setVisible(false);
          new UpdateRoom();
            }else if (ae.getSource() == checkout) {
          setVisible(false);
          new Checkout();
            }else if (ae.getSource() == customers) {
          setVisible(false);
          new CustomerInfo();
    }else if (ae.getSource() == logout) {
          setVisible(false);
         System.exit(0);
    }
    }
    public static void main (String[] args)
    {
        new Reception ();

}
}