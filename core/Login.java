package core ;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Login 
{         private JFrame f;
          private JButton dark_mode;
          private JLabel name , pass , title ;
          private JTextField name_field ;
          private JPasswordField pass_field;
          private JButton enter ;

   public Login() 
   {   
           f = new JFrame();
         
     Color mycolor = new Color(192,192,192);  
     dark_mode = new JButton("Dark mode");
     dark_mode.setBounds(550,200,100,40);
     Font font1 = new Font("serif",Font.BOLD,15);
     Font font2 = new Font("serif",Font.BOLD,35);
     //f.add(dark_mode);

     title = new JLabel("Login");
     title .setBounds(250,60,180,30);
     title.setFont(font2);
     f.add(title);



     name = new JLabel("NAME");
     name.setBounds(270,150,80,30);
     name.setFont(font1);
     name.setBackground(mycolor);
     f.add(name);

     name_field = new JTextField();
     name_field.setBounds(400,150,160,30);
     
     f.add(name_field);
           
     pass = new JLabel("PASSWORD ");
      pass.setBounds(260, 250, 100, 30);
      pass.setBackground(mycolor);
      pass.setFont(font1);
      f.add(pass);
      
      pass_field = new JPasswordField();
      pass_field.setBounds(400, 250, 160, 30);
      f.add(pass_field);
 
      enter = new JButton("Enter");
      enter.setBounds(356,360,80,30);
      f.add(enter);       
   
     f.setSize(700,600);
     f.setLayout(null);
     f.setVisible(true);
     f.getContentPane().setBackground(mycolor);
  

    
    
	 enter.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
       login();
     f.setVisible(false);
    }
  });
   }
   
public void login()
{


   
}
   public static void main(String [] args)
   {
new Login();
   }
}

