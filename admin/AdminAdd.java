package admin;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;

import java.io.*;


public class AdminAdd extends JFrame {

    private Container c;
    private ImageIcon icon;
    private JLabel label1,label2;
    private Font f1, f2, f3, f4, f5, f6;
    private JTextField tname, capa, email,tf4,duration,rent,location,phone,l,clg,graduation,pass;
    private JButton btn1, btn2, nBtn;
    
    private Cursor cursor;

    AdminAdd() {
        // Frame Layout
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Add Turf");
        this.setSize(800, 780);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setLocationRelativeTo(null);

        c = this.getContentPane();
        c.setLayout(null);
        

         c.setBackground(Color.decode("#00416a"));

        // Icon
        icon = new ImageIcon("./img/turf.png");
        this.setIconImage(icon.getImage());

        // Fonts
        f1 = new Font("Montserrat", Font.BOLD, 30);
        f2 = new Font("serif", Font.BOLD, 25);
        f3 = new Font("Montserrat", Font.BOLD, 15);
        f4 = new Font("Montserrat", Font.BOLD, 15);
        f5 = new Font("Montserrat", Font.BOLD,15);
        f6 = new Font("Montserrat", Font.BOLD, 15);

        // Title
        label1 = new JLabel();
        label1.setText("ADD Turf");
		label1.setForeground(Color.BLACK);
        label1.setBounds(300, 30, 400, 30);
        label1.setFont(f1);
        c.add(label1);


       
        // User Name

label1 = new JLabel();
label1.setText("Turf Name : ");
label1.setForeground(Color.BLACK);
label1.setBounds(400, 195, 100, 25);
label1.setFont(f4);
c.add(label1);

tname= new JTextField();
tname.setBounds(510, 195, 160, 30);
tname.setFont(f5);
c.add(tname);


        label1 = new JLabel();
        label1.setText("Capacity :");
		label1.setForeground(Color.BLACK);
        label1.setBounds(400, 245, 100, 25);
        label1.setFont(f4);
        c.add(label1);

        capa = new JTextField();
        capa.setBounds(510, 245, 160, 30);
        capa.setFont(f5);
        c.add(capa);


        // Email
        label1 = new JLabel();
        label1.setText("Email");
		label1.setForeground(Color.BLACK);
        label1.setBounds(400, 290, 100, 25);
        label1.setFont(f4);
        c.add(label1);

        email = new JTextField();
        email.setBounds(510, 290, 160, 30);
        email.setFont(f5);
        c.add(email);

        // Phone
        label1 = new JLabel();
		label1.setForeground(Color.BLACK);
        label1.setText("Phone No");
        label1.setBounds(400, 335, 100, 25);
        label1.setFont(f4);
        c.add(label1);

        phone = new JTextField();
        phone.setBounds(510,335, 160, 30);
        phone.setFont(f2);
        c.add(phone);

//field
        label1 = new JLabel();
        label1.setForeground(Color.BLACK);
        label1.setText("Location");
        label1.setBounds(400, 380, 100, 25);
        label1.setFont(f4);
        c.add(label1);

        location = new JTextField();
        location.setBounds(510,380, 160, 30);
        location.setFont(f2);
        
        c.add(location);
//licence
label1 = new JLabel();
label1.setForeground(Color.BLACK);
label1.setText("Duration");
label1.setBounds(400, 425, 100, 25);
label1.setFont(f4);
c.add(label1);

duration = new JTextField();
duration.setBounds(510,425, 160, 30);
duration.setFont(f2);

c.add(duration);

//clg

label1 = new JLabel();
label1.setForeground(Color.BLACK);
label1.setText("Rent");
label1.setBounds(400, 470, 100, 25);
label1.setFont(f4);
c.add(label1);

rent  = new JTextField();
rent.setBounds(510,470, 160, 30);
rent.setFont(f2);

c.add(rent);
//graduation

label1 = new JLabel();
label1.setForeground(Color.BLACK);
label1.setText("Graduation year");
label1.setBounds(400, 515, 100, 25);
label1.setFont(f4);
//c.add(label1);

graduation = new JTextField();
graduation.setBounds(510,515, 160, 30);
graduation.setFont(f2);

//.add(graduation);

//passs

label1 = new JLabel();
label1.setForeground(Color.BLACK);
label1.setText("Pass");
label1.setBounds(400, 560, 100, 25);
label1.setFont(f4);
//c.add(label1);

pass = new JTextField();
pass.setBounds(510,560, 160, 30);
pass.setFont(f2);

//c.add(pass);




    
        // Cursor for JButtons
        cursor = new Cursor(Cursor.HAND_CURSOR);

        // JButtons
        btn1 = new JButton("Back");
        btn1.setBounds(680, 600, 100, 30);
        btn1.setFont(f2);
        btn1.setCursor(cursor);
        btn1.setForeground(Color.WHITE);
        btn1.setBackground(Color.decode("#C00000"));
        c.add(btn1);

        btn2 = new JButton("Add");
        btn2.setBounds(480, 600, 100, 30);
        btn2.setFont(f2);
        btn2.setCursor(cursor);
        btn2.setForeground(Color.WHITE);
        btn2.setBackground(Color.decode("#2E75B6"));
        c.add(btn2);

        nBtn = new JButton("");
        nBtn.setBounds(0, 0, 0, 0);
        c.add(nBtn);
        ImageIcon image = new ImageIcon("./img/turrf.png");
        label2 = new JLabel(image);
         label2.setBounds(0,0,1000,700);
         c.add(label2);         
         
        // Back Button
        btn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {

                setVisible(false);
                new Admindashboard();
             //   f.setVisible(true);
            }
        });

        // Register Button
        btn2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                String turfname = tname.getText();
          
                String capacity = capa.getText();

                String emailinfo = email.getText();
                String phoneinfo= phone.getText();
                String Locationinfo= location.getText();
                String Durationinfo= duration.getText();
                String Rentinfo= rent.getText();


                if (capacity.isEmpty() || turfname.isEmpty() || emailinfo.isEmpty() || phoneinfo.isEmpty())
                      {
                    JOptionPane.showMessageDialog(null, "Please fill all of the fields.", "Something Went Wrong!",
                            JOptionPane.WARNING_MESSAGE);
                } else {
                    
                    turf_info turf = new  turf_info(turfname,capacity, emailinfo, phoneinfo , Locationinfo ,Durationinfo, Rentinfo);
                       
                 // System.out.println(admin.turf_info.getTurfname());
                    try {
                        File file = new File("./Data/Turf_info.txt");
                        if (!file.exists()) {
                            file.createNewFile();
                        }
                        FileWriter fw = new FileWriter(file, true);
                        BufferedWriter bw = new BufferedWriter(fw);
                        PrintWriter pw = new PrintWriter(bw);

                  

                         
                         pw.println("turfname: " + turfname);
                         pw.println("Capacity: " + capacity);
                         pw.println("phone: " + phoneinfo);
                         pw.println("email: " + emailinfo);
                         pw.println("Location: " + Locationinfo);
                         pw.println("Duration: " + Durationinfo);
                         pw.println("Rent: " + Rentinfo);
                         
                       
                         pw.println("=====================================");
                         pw.close();

                    } catch (Exception ex) {
                        System.out.print(ex);
                    }

                    JOptionPane.showMessageDialog(null, "User has been added.", "User Added",
                            JOptionPane.INFORMATION_MESSAGE);
                    setVisible(false);
                  new Admindashboard();
                    //frame.setVisible(true);
                }
            }
        });
    }

    public static void main(String[] args) {

        AdminAdd frame = new AdminAdd();
        frame.setVisible(true);
    }
}
