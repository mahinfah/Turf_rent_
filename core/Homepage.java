package core;
import java.io.*;
import java.awt.event.*;
import java.awt.*;  
import javax.swing.*;

import admin.Admin;

import java.util.*;

public class Homepage implements ActionListener {
    private JFrame f;
    private JButton dark_mode,admin,registration,signin;
    private JLabel title,field_gif;
    
   public Homepage() 
   {    
     f = new JFrame("Home page light") ; 
          
    Font font1 = new Font( "sarif",Font.ROMAN_BASELINE , 30);
    Color mycolor = new Color(255,255,255);
    Color mycolor3 = new Color(102,255,102); 
 

     ImageIcon field = new ImageIcon("./image/field.gif");
     field_gif = new JLabel(field);
     field_gif.setBounds(100,200,120,120);
      f.add(field_gif);
//gfg

      title = new JLabel("Rent Turf");
    title.setFont(font1);
    title.setBounds(275,150,140,45);
    f.add(title);
//ADDD
   
     dark_mode = new JButton("Dark mode");
     dark_mode.setBounds(550,0,100,40);
     f.add(dark_mode);

    admin = new JButton("Admin");
    admin.setBounds(300, 360, 100, 30);
    admin.setBackground(mycolor3);
    f.add(admin);



    registration = new JButton("Signup");
    registration.setBounds(360, 300, 100, 30);
    registration.setBackground(mycolor3);
    f.add(registration);


   
    signin = new JButton("Signin");
    signin.setBounds(230, 300, 100, 30);
     signin.setBackground(mycolor3);
    f.add(signin);






     dark_mode.addActionListener(this);
     registration.addActionListener(this);
     signin.addActionListener(this);
     admin.addActionListener(this);
     
    

     f.setSize(700,600);
     f.setLayout(null);
     f.setVisible(true);
     f.getContentPane().setBackground(mycolor);
   f.setLocationRelativeTo(null);
     

    }


        
	
	
	 public void actionPerformed(ActionEvent e)
     {
    
 
         if((e.getSource()).equals(dark_mode))
        {
          f.setVisible(false);
            new Homepagedark();
        }

        if((e.getSource()).equals(registration))
        {
          f.setVisible(false);
            new userReg();
        }



        if((e.getSource()).equals(signin))
        {
          f.setVisible(false);
            new Login();
        }

       

        if((e.getSource()).equals(admin))
        {
          f.setVisible(false);
            new Admin();
        }




     }  
     
     public static void main(String [] args)
     {
        new Homepage();
     }
     
        
        
}


































