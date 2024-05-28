package core ;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;


public class Login 
{         private JFrame f;
          private JButton dark_mode;
          private JLabel name , pass , title ;
          private JTextField name_field ;
          private JPasswordField pass_field;
          private JButton enter , back ;

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



     name = new JLabel("USERNAME");
     name.setBounds(255,180,180,30);
     name.setFont(font1);
     name.setBackground(mycolor);
     f.add(name);

     name_field = new JTextField();
     name_field.setBounds(400,180,160,30);
     
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
   
      
      back = new JButton("Back");
      back.setBounds(600,530,80,30);
      f.add(back);       
   

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

      
back.addActionListener(new ActionListener() {
   public void actionPerformed(ActionEvent e) {
    new Homepage();
  f.setVisible(false);
 }
});

   }
   
public void login()
{
   String email = name_field.getText();
   String password =  new String ( pass_field.getPassword());
      
   String file = ".\\Data\\userdata.txr";
   
        try {

            BufferedReader reader = new BufferedReader(new FileReader(file));
            int totalLines = 0;
            while (reader.readLine() != null)
                totalLines++;
            reader.close();
           for(int i = 0; i< totalLines; i++ )
           {
            String line = Files.readAllLines(Paths.get(file)).get(i);
            String x = line.substring(0,4);
            if(x equals())  
           }   


        } catch (IOException ex)
        {
         return;
        }

}
   public static void main(String [] args)
   {
new Login();
   }
}

