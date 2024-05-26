package core;
import java.lang.*;
import java.io.*;
import java.awt.event.*;
import java.awt.*;  
import javax.swing.*; 
import java.util.*;

public class Homepagedark implements ActionListener {
    private JFrame f;
    private JButton dark_mode,registration,signin,admin;
    private JLabel hello,field_gif,title;
    
   public Homepagedark() 
   {   
         f = new JFrame("dark mode") ; 
         
    Font font1 = new Font( "sarif",Font.ROMAN_BASELINE , 30);
     Color mycolor = new Color(255,255,255);  
     Color mycolor2 = new Color(0,0,0);
     Color mycolor3 = new Color(102,255,102); 
 
     
     ImageIcon field = new ImageIcon("./image/field.gif");
     field_gif = new JLabel(field);
     field_gif.setBounds(100,200,120,120);
      f.add(field_gif);


      title = new JLabel("Rent Turf");
      title.setFont(font1);
      title.setBounds(275,150,140,45);
      title.setForeground(mycolor);
      f.add(title);

  
     dark_mode = new JButton("Light mode");
     dark_mode.setBounds(550,20,100,40);
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
 
 
 
 
 
 
     // dark_mode.addActionListener(this);
      registration.addActionListener(this);
      

   dark_mode.addActionListener(this);
      f.setSize(700,600);
    f.setLayout(null);
      f.setVisible(true);
      f.getContentPane().setBackground(mycolor2);
      

    }


        
	
	
	 public void actionPerformed(ActionEvent e)
     {
    
 
         if((e.getSource()).equals(dark_mode))
        {
          f.setVisible(false);
            new Homepage();

        } 

        
        if((e.getSource()).equals(registration))
        {
          f.setVisible(false);
            new userReg();

        } 
        
     
    }
}
