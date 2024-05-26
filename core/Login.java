package core ;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Login implements ActionListener
{         private JFrame f;
           private JButton dark_mode;


   public Login() 
   {   
           f = new JFrame();
         
     Color mycolor = new Color(51,51,51);  
     dark_mode = new JButton("Dark mode");
     dark_mode.setBounds(550,200,100,40);
     f.add(dark_mode);

     dark_mode.addActionListener(this);
      f.setSize(700,600);
      f.setLayout(null);
      f.setVisible(true);
      f.getContentPane().setBackground(mycolor);

    } 
    	
	
	 public void actionPerformed(ActionEvent e)
   {
  

       if((e.getSource()).equals(dark_mode))
      {
        f.setVisible(false);
          new Homepage();
          //checking
      }

   }  
   
}
