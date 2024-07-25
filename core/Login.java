package core ;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
//import java.io.BufferedReader;
//import java.io.FileReader;
//import java.io.IOException;
//import java.nio.file.Files;
//import java.nio.file.Paths;


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
        Color mycolor2 = new Color (132,131,183);
     Color mycolor = new Color(02,0,12);  
     dark_mode = new JButton("Dark mode");
     dark_mode.setBounds(550,200,100,40);
     Font font1 = new Font("serif",Font.BOLD,15);
     Font font2 = new Font("serif",Font.BOLD,35);
     //f.add(dark_mode);

     title = new JLabel("Login");
     title .setBounds(250,60,180,50);
     title.setFont(font2);
     f.add(title);
ImageIcon image = new ImageIcon("img/tt.png");
JLabel label = new JLabel(image);

label.setBounds(1, 1, 700, 600);

ImageIcon icon = new ImageIcon("img/tt.png");
f.setIconImage(icon.getImage());
//f.setLocationRelativeTo(null);

     name = new JLabel("USERNAME");
     name.setBounds(255,180,180,30);
     name.setFont(font1);
     name.setForeground(mycolor);
     f.add(name);

     name_field = new JTextField();
     name_field.setBounds(400,180,160,30);
     
     f.add(name_field);
           
     pass = new JLabel("PASSWORD ");
      pass.setBounds(260, 250, 100, 30);
      pass.setForeground(mycolor);
      pass.setBackground(mycolor2);
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
     f.getContentPane().setBackground(mycolor2);
    //f.add(label);
    f.setLocationRelativeTo(null);

    
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
   String name= name_field.getText();
   String password =  new String ( pass_field.getPassword());
   String file = "./Data/userdata.txt";



try {
   BufferedReader reader = new BufferedReader(new FileReader(file));//?
   String line;  //?
   //boolean loggedIn = false;
       int count=0;

   while ((line = reader.readLine()) != null) {
    line = line.trim();
      if (line.startsWith("Name:"))
       {          
         String value = line.substring("Name:".length());
         if(value.equals(name))
         {   count++;
           
           // new Dashboard();  
         }
       //  String nextLine = reader.readLine(); 
          }
          else if(count==1&&line.startsWith("password:"))
          {
            String valu1e = line.substring("password:".length());
            if(valu1e.equals(password))
            {
           //  System.out.println("now i can do NEXTPART  : " +valu1e);
             new Dashboard();  
             reader.close();
             User user= new User();
             user.setName(name);

            }
          }

 
  


   

}

}
catch (IOException ex) {
   ex.printStackTrace();//??
}



try 
(BufferedReader reader = new BufferedReader(new FileReader(file)))
{ 
   String line ;
while((line = reader.readLine()) != null)
{
   if(line.contains("Name:"+name)){

String[] data = new String[4];
for(int i = 0 ;i<4;i++)
{
line = reader.readLine();
data[i] = line.split(":")[1];
}

System.out.println(data[3]);
User user = new User(name,data[0],data[1],data[2],data[3]);

   }
}
} catch(IOException e) {
e.printStackTrace();
}




}
   public static void main(String [] args)
   {
new Login();
   }

}
