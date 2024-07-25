package core;
import javax.swing.*;
import java.awt.event.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.awt.*;
import javax.swing.*;


public class userReg 
{
    private JFrame f ;
    private JButton enter ,back, c ;
    private JLabel title, name ,  Nid  , phone , pass,repass;
    private JPasswordField pass_field ,repass_field;
    private JTextField name_field , nid_field , phone_field ;
    boolean check = false ;

    public userReg()

    {
          JFrame f = new JFrame("registration");
          Font font1= new Font(" Serif ", Font.BOLD,25);
          Color mycolor = new Color(15, 255, 80);
          f.getContentPane().setBackground(mycolor);

        title = new JLabel("RENT FIELD");
        title .setBounds(250,80,180,30);
        title.setFont(font1);
        f.add(title);


       name = new JLabel("NAME");
       name.setBounds(260,150,80,30);
       title.setFont(font1);
       f.add(name);
  
       name_field = new JTextField();
       name_field.setBounds(400,150,160,30);
       f.add(name_field);
                
       
       Nid = new JLabel("NID NO");
       Nid.setBounds(260,200,80,30);
       f.add(Nid);
  
       nid_field = new JTextField();
       nid_field.setBounds(400,200,160,30);
       f.add(nid_field);
         

       phone = new JLabel("PHONE NO");
       phone.setBounds(260,250,80,30);
       f.add(phone);
  
       phone_field = new JTextField();
       phone_field.setBounds(400,250,160,30);
       f.add(phone_field);
         
      pass = new JLabel("PASSWORD ");
      pass.setBounds(260, 300, 80, 30);
      f.add(pass);
      
      pass_field = new JPasswordField();
      pass_field.setBounds(400, 300, 160, 30);
      f.add(pass_field);

      repass = new JLabel("RETYPE PASSWORD ");
      repass.setBounds(260, 350, 180, 30);
      f.add(repass);
      
      repass_field = new JPasswordField();
      repass_field.setBounds(400, 350, 160, 30);
      f.add(repass_field);




      enter = new JButton("Enter");
      enter.setBounds(450,500,80,35);
      f.add(enter);

      
      back = new JButton("Back");
      back.setBounds(600,620,80,35);
      f.add(back);

       //  f.setLocationRelativeTo(null);
         f.setSize(700,700);
         f.setLayout(null);
         f.setVisible(true);
         f.setLocationRelativeTo(null);


         enter.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            saveuser();
        if(check){
            new Homepage();
            f.setVisible(false);
          }
        }
      });
/////////

//back button      
      back.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
         new Homepage();
       f.setVisible(false);
      }
    });


     
        }     
      public void saveuser()
      {
             String name = name_field.getText();
             String  nidno = nid_field.getText();
             String phone = phone_field.getText();
             String password = new String(pass_field.getPassword());
             String repassword = new String(repass_field.getPassword());
              
             User user = new User (name, nidno, phone, password, repassword);

  try {

            File file = new File("./Data/userdata.txt");
            if (!file.exists()) {
                file.getParentFile().mkdirs();
                file.createNewFile();
            }
            
            
            try (PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(file, true)))) {
                out.println("Name:" + user.getName());
             
                out.println("Nid no:" + user.getnid());
                out.println("Phone:" + user.getPhone());
                out.println("password:" + user.getPassword());
                out.println("Repassword:" + user.getRepassword());
                out.println("=====================================");
            }
             check = true ;
          //   f.setVisible(false);
          //   new User();
   

           }  
            catch (Exception e) {
              e.printStackTrace();
            }
            
    }
       public static void main()
       {
   // new userReg();
       } 

}
