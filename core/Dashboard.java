package core;
import javax.swing.*;
import javax.swing.text.html.HTMLDocument.HTMLReader.BlockAction;

import admin.Adminupdate;
import admin.turf_info;

//import admin.turf_info;
import java.awt.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Dashboard   {
    private JFrame f;
    private JPanel profile_Panel,editable_area;
    private JButton profile,update;
    private JButton dark_mode, back,book,payment;
    private JLabel name, pass, title;
    private JTextField name_field;
    private JPasswordField pass_field;
    private JTextArea name1;

    public Dashboard()
     {
        f = new JFrame();

     // Font font2 = new Font("serif",Font.BOLD,35);
        Color mycolor2 = new Color (132,131,183);
        Color mycolor = new Color(116, 126, 22);
        Color mycolor3 = new Color(66, 16, 22);
        dark_mode = new JButton("Dark mode");
        dark_mode.setBounds(550, 200, 100, 40);
        Font font1 = new Font("arial", Font.BOLD, 15);
        Font font2 = new Font("arial", Font.BOLD, 35);
        Font font3 = new Font("arial", Font.BOLD, 18);
        title = new JLabel("DashBoard");
        title.setBounds(240, 20, 190, 30);
        title.setFont(font2);
        f.add(title);

        
        editable_area = new JPanel();
        editable_area.setBounds(1, 100, 700, 500);
        editable_area.setBackground(Color.BLACK);
        editable_area.setLayout(null);
        f.add(editable_area);

        name = new JLabel("djsds[dsjdss]");
        name.setBounds(255, 180, 180, 30);
        name.setFont(font1);
        name.setBackground(mycolor);

        JLabel c1 = new JLabel("Features:");
        c1.setBounds(60,25,600,80);
        c1.setForeground(Color.WHITE);
        c1.setBackground(mycolor);
        c1.setFont(font2);
        editable_area.add(c1);
        


        JLabel click = new JLabel("# You Can See Details Here if you click on the profile Button .");
        click.setBounds(60,105,600,80);
        click.setForeground(Color.WHITE);
        click.setBackground(mycolor);
        click.setFont(font1);
        editable_area.add(click);

        JLabel c2 = new JLabel("# You Can Rent your slot from your fav place if you click on Book your Turf .");
        c2.setBounds(60,175,600,80);
        c2.setForeground(Color.WHITE);
        c2.setBackground(mycolor);
        c2.setFont(font1);
        editable_area.add(c2);
        
        JLabel c3 = new JLabel("# You Can Make your Payment if you click on Payment Button ." );
        c3.setBounds(60,245,600,80);
        c3.setForeground(Color.WHITE);
        c3.setBackground(mycolor);
        c3.setFont(font1);
        editable_area.add(c3);
        name_field = new JTextField();
        name_field.setBounds(400, 180, 160, 30);

        
        JLabel c33 = new JLabel("# You Can Rent Three Slot Once a day " );
        c33.setBounds(60,315,600,80);
        c33.setForeground(Color.WHITE);
        c33.setBackground(mycolor);
        c33.setFont(font1);
        editable_area.add(c33);
        name_field = new JTextField();
        name_field.setBounds(400, 180, 160, 30);

        pass = new JLabel("PASSWORD ");
        pass.setBounds(260, 250, 100, 30);
        pass.setBackground(mycolor);
        pass.setFont(font1);

        pass_field = new JPasswordField();
        pass_field.setBounds(400, 250, 160, 30);
        //payment will show here in the editable area below


profile =  new JButton("Profile");
profile.setBounds(280,65,100, 33);
f.add(profile);
profile.setBackground(mycolor2);
back = new JButton("Back");  
back.setBounds(604, 2, 80, 30);
// editable_area.add(update);
f.add(back);
back.setBackground(mycolor2);

book = new JButton("Book your Turf");
book.setBounds(35, 65, 200, 33);
book.setBackground(mycolor2);
f.add(book);

payment = new JButton("Payment");
payment.setBounds(430,65,190,33);
payment.setBackground(mycolor2);
f.add(payment);
        f.setSize(700, 600);
        f.setLayout(null);
        f.setVisible(true);
        f.setLocationRelativeTo(null);
 //       f.getContentPane().setBackground(mycolor);

        back.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new Homepage();
                f.setVisible(false);
            }
        });

        profile.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                profile();
                editable_area.setVisible(true);
            }
        });

        payment.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                paymentclear();
                editable_area.setVisible(true);
            }
        });
        
        book.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
             new BookyourTurf () ;
               
                editable_area.setVisible(true);
            }
        });
        


    }





	
  void profile()
  {
   Color mycolor2 = new Color (132,131,183);
   System.out.println("sasasa");
   editable_area.removeAll();
   editable_area.repaint();
   editable_area.revalidate();

String name = core.User.getName();
//String nid = core.User.getnid();
String file  = "./Data/userdata.txt";
String nidi =core.User.getnid();

System.out.println(nidi);

String[] data = new String[4];  // for taking information from the file and use the name variable which is equal to core.User.getName()

try 
(BufferedReader reader = new BufferedReader(new FileReader(file)))
{ String line ;
    
while((line = reader.readLine()) != null)
{
   if(line.contains("Name:"+name)){


for(int i = 0 ;i<4;i++)
{
line = reader.readLine();
data[i] = line.split(":")[1];
}

System.out.println(data[3]);
//User user = new User(name,data[0],data[1],data[2],data[3]);

   }
}
} catch(IOException e) {
e.printStackTrace();
}

        JLabel profile = new JLabel("Profile");
        profile.setBounds(180, 30, 100, 20);
        profile.setForeground(Color.WHITE);
        profile.setFont(new Font("Arial", Font.BOLD, 20));
        editable_area.add(profile);

        JLabel name1 = new JLabel("Name: ");
        name1.setBounds(50, 70, 100, 20);
        name1.setForeground(Color.WHITE);
        editable_area.add(name1);



        JTextArea name_text = new JTextArea(name);
        name_text.setBounds(190,70, 150, 20);
        name_text.setBackground(Color.cyan);
        name_text.setForeground(Color.BLACK);
        name_text.setFont(new Font("Arial", Font.PLAIN, 16));
        name_text.setEditable(is_editable);
        editable_area.add(name_text);

        JLabel nid = new JLabel("Nid No: ");
        nid.setBounds(50, 110, 100, 20);
        nid.setForeground(Color.WHITE);
        editable_area.add(nid);



        JTextArea nid_text = new JTextArea(data[0]);
        nid_text.setBounds(190,110, 150, 20);
        //  name_text.setBackground(Color.BLACK);
        nid_text.setBackground(Color.cyan);
        //nid_text.setBackground(Color.BLACK);
        nid_text.setForeground(Color.BLACK);
        nid_text.setFont(new Font("Arial", Font.PLAIN, 16));
        nid_text.setEditable(is_editable);
        editable_area.add(nid_text);

        JLabel phone = new JLabel("Number: ");
        phone.setBounds(50,150, 100, 20);
        phone.setForeground(Color.WHITE);
        editable_area.add(phone);



        JTextArea phone1 = new JTextArea(data[1]);
        phone1.setBounds(190,150, 150, 20);
        //  name_text.setBackground(Color.BLACK);
        phone1.setBackground(Color.cyan);
        //nid_text.setBackground(Color.BLACK);
        phone1.setForeground(Color.BLACK);
        phone1.setFont(new Font("Arial", Font.PLAIN, 16));
        phone1.setEditable(is_editable);
        editable_area.add(phone1);

        JLabel pass = new JLabel("Password: ");
        pass.setBounds(50,190, 100, 20);
        pass.setForeground(Color.WHITE);
        editable_area.add(pass);



        JTextArea pass1 = new JTextArea(data[2]);
        pass1.setBounds(190,190, 150, 20);
        //  name_text.setBackground(Color.BLACK);
        pass1.setBackground(Color.cyan);
        //nid_text.setBackground(Color.BLACK);
        pass1.setForeground(Color.BLACK);
        pass1.setFont(new Font("Arial", Font.PLAIN, 16));
        pass1.setEditable(is_editable);
        editable_area.add(pass1);

        update = new JButton("Update User");
        update.setBounds(110,270,160,34);
        update.setBackground(mycolor2);
        //f.add(update);
        editable_area.add(update);  



        }

        void paymentclear()
        {

         ///  ./// Color mycolor2 = new Color (132,131,183);
          //  Color mycolor = new Color(116, 126, 22);
            Color mycolor3 = new Color(66, 16, 22);

   System.out.println("called");
   //Color mycolor2 = new Color (132,131,183);
   System.out.println("sasasa");
   editable_area.removeAll();
   editable_area.repaint();
   editable_area.revalidate();

   String name = core.User.getName();
         
        JLabel name1 = new JLabel("Hello ");
        name1.setBounds(250, 50, 60, 20);
        name1.setFont(new Font("Arial", Font.BOLD, 18));
        name1.setForeground(Color.WHITE);
        editable_area.add(name1);

        JLabel name2 = new JLabel("You Can Make Your Payment by Bkash / Nogod"); 
        name2.setBounds(100, 90, 480, 20);
        name2.setFont(new Font("Arial", Font.BOLD, 18));
        name2.setForeground(Color.WHITE);
        editable_area.add(name2);



        Font font1 = new Font("arial", Font.BOLD, 15);

        JLabel name_text = new JLabel(name +"!");
        name_text.setBounds(300,50, 150, 20);
      //  name_text.setBackground(mycolor);
        name_text.setForeground(Color.WHITE);
        name_text.setFont(new Font("Arial", Font.BOLD, 18));
      
        editable_area.add(name_text);

        JButton c11 = new JButton("Payment Details");
        c11.setBounds(90,130,170,260);
        c11.setForeground(Color.WHITE);
        c11.setBackground(mycolor3);
       
        c11.setFont(font1);
        editable_area.add(c11);

        JButton c111 = new JButton("Total Cost");
        c111.setBounds(280,130,170,260);
        c111.setForeground(Color.WHITE);
        c111.setBackground(mycolor3);
       
        c111.setFont(font1);
        editable_area.add(c111);

        JButton c1111 = new JButton("Your Offers");
        c1111.setBounds(470,130,170,260);
        c1111.setForeground(Color.WHITE);
        c1111.setBackground(mycolor3);
        c1111.setFont(font1);
        editable_area.add(c1111);


        c11.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
             
             rentdetails();   
            }
        });
        
        c111.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               costdetails();
            }
        });
        
        c1111.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
          
            }
        });
        

    }

  private boolean is_editable = false;

  private void toggleEditable() {
      is_editable = !is_editable;
  }

  //cost details------------------------------------------------------------------
  void costdetails()
  {

System.out.println("hello");
Color mycolor = new Color(117, 153, 211);
double sum1=0;
Color mycolor2 = new Color(199, 21, 11);

editable_area.setBackground(mycolor);

editable_area.removeAll();
editable_area.repaint();
editable_area.revalidate();

JLabel name2 = new JLabel("______________________Total Cost________________________"); 
name2.setBounds(40, 40, 600, 20);
name2.setFont(new Font("Arial", Font.BOLD, 20));
name2.setForeground(Color.BLACK);
name2.setBackground(mycolor);
editable_area.add(name2);

JLabel name11 = new JLabel("Your Total Rent :");

 name11.setBounds(90, 160, 320, 30);
 name11.setFont(new Font("Arial", Font.BOLD, 16));
 name11.setForeground(Color.BLACK);
 name11.setBackground(mycolor);
 editable_area.add(name11);




String name = core.User.getName();

System.out.println(name);
String file = "./Data/Turf_info.txt";


String[] data = new String[7];
try 
(BufferedReader reader = new BufferedReader(new FileReader(file)))
{ 
   String line ;
   int count =0;
while((line = reader.readLine()) != null)
{
   if(line.contains("Rented by "+name))
   {

for(int i = 0 ;i<7;i++)
{
line = reader.readLine();
data[i] = line.split(":")[1];
}

 System.out.println(data[6]);
 double weight = Double.parseDouble(data[6]);
 sum1 = sum1 + weight;


 


   }
}
count++;
} catch(IOException e) {
e.printStackTrace();
} 
System.out.println(sum1);
//String weight = String.parsetring(sum1);


JLabel cost = new JLabel(" "+sum1 +" Taka");
cost.setBounds(240,165, 300, 20);
cost.setFont(new Font("Arial", Font.BOLD, 15));
cost.setForeground(Color.BLACK);
cost.setBackground(mycolor);

cost.setFont(new Font("Arial", Font.PLAIN, 16));
editable_area.add(cost);


JButton bkash = new JButton("Bkash");
bkash.setBounds(230, 240, 80, 30);
bkash.setBackground(mycolor2);
bkash.setForeground(Color.WHITE);

editable_area.add(bkash);

JButton nogod = new JButton("Nogod");
nogod.setBounds(310, 260, 80, 30);
editable_area.add(nogod);

bkash.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
  System.out.println("CAllded basksj);");
    }
});


nogod.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
     
    

    }
});





  }


  void rentdetails()
  {

    String name = core.User.getName();
    Color mycolor = new Color(167, 213, 121);
    double sum1=0;
    Color mycolor2 = new Color(199, 21, 11);
    

System.out.println("Called Rent details");
editable_area.setBackground(mycolor);

editable_area.removeAll();
editable_area.repaint();
editable_area.revalidate();

JLabel name2 = new JLabel("___-__-__Rent Details__-__-___"); 
name2.setBounds(190, 40, 600, 20);
name2.setFont(new Font("Arial", Font.BOLD, 20));
name2.setForeground(Color.BLACK);
name2.setBackground(mycolor);
editable_area.add(name2);


JLabel name23 = new JLabel("Hello "+name+"! Here are the details of your rent :"); 
name23.setBounds(30, 100, 600, 20);
name23.setFont(new Font("Arial", Font.ITALIC, 18));
name23.setForeground(Color.BLACK);
name23.setBackground(mycolor);
editable_area.add(name23);

JLabel name11 = new JLabel("Vanue:");

 name11.setBounds(90, 140, 100, 30);
 name11.setFont(new Font("Arial", Font.BOLD, 16));
 name11.setForeground(Color.BLACK);
 name11.setBackground(mycolor);
 editable_area.add(name11);

 JLabel name12 = new JLabel("Cost");

 name12.setBounds(250, 140, 80, 30);
 name12.setFont(new Font("Arial", Font.BOLD, 16));
 name12.setForeground(Color.BLACK);
 name12.setBackground(mycolor);
 editable_area.add(name12);

 JLabel name13 = new JLabel("Time");

 name13.setBounds(380, 140, 320, 30);
 name13.setFont(new Font("Arial", Font.BOLD, 16));
 name13.setForeground(Color.BLACK);
 name13.setBackground(mycolor);
 editable_area.add(name13);

 JLabel name132 = new JLabel("Number");

 name132.setBounds(535, 140, 320, 30);
 name132.setFont(new Font("Arial", Font.BOLD, 16));
 name132.setForeground(Color.BLACK);
 name132.setBackground(mycolor);
 editable_area.add(name132);



//String name = core.User.getName();

System.out.println(name);
String file = "./Data/Turf_info.txt";


String[] data = new String[7];
String[] rent = new String[21];

try 
(BufferedReader reader = new BufferedReader(new FileReader(file)))
{ 
   String line ;
   int c =0;
while((line = reader.readLine()) != null)
{
   if(line.contains("Rented by "+name))
   {

for(int i = 0 ;i<7;i++)
{
line = reader.readLine();
data[i] = line.split(":")[1];
rent[c] = data[i];
c++;
}

   }
}

} catch(IOException e) {
e.printStackTrace();
} 

// entry point OF RENTED SLOTS

JLabel name1 = new JLabel(rent[0]);
name1.setBounds(70,180, 120, 30);
name1.setFont(new Font("Arial", Font.PLAIN, 16));
//name1.setEditable(is_editable);
editable_area.add(name1);


JLabel name22 = new JLabel(rent[7]);
name22.setBounds(70,250, 120, 30);
name22.setFont(new Font("Arial", Font.PLAIN, 16));
editable_area.add(name22);

JLabel name222 = new JLabel(rent[14]);
name222.setBounds(70,320, 120, 30);
name222.setFont(new Font("Arial", Font.PLAIN, 16));
editable_area.add(name222);



JLabel c = new JLabel(rent[6]);
c.setBounds(250,180, 120, 30);
c.setFont(new Font("Arial", Font.PLAIN, 16));
editable_area.add(c);


JLabel c2 = new JLabel(rent[13]);
c2.setBounds(250,250, 120, 30);
c2.setFont(new Font("Arial", Font.PLAIN, 16));
editable_area.add(c2);



JLabel c22 = new JLabel(rent[20]);
c22.setBounds(250,320, 120, 30);
c22.setFont(new Font("Arial", Font.PLAIN, 16));
editable_area.add(c22);



JLabel tc = new JLabel(rent[2]);
tc.setBounds(520,180, 200, 30);
tc.setFont(new Font("Arial", Font.PLAIN, 16));
editable_area.add(tc);


JLabel tc2 = new JLabel(rent[9]);
tc2.setBounds(520,250, 200, 30);
tc2.setFont(new Font("Arial", Font.PLAIN, 16));
editable_area.add(tc2);



JLabel tc22 = new JLabel(rent[16]);
tc22.setBounds(520,320, 120, 30);
tc22.setFont(new Font("Arial", Font.PLAIN, 16));
editable_area.add(tc22);



JLabel tc1 = new JLabel(rent[5]);
tc1.setBounds(355,180, 200, 30);
tc1.setFont(new Font("Arial", Font.PLAIN, 16));
editable_area.add(tc1);


JLabel tc21 = new JLabel(rent[12]);
tc21.setBounds(355,250, 200, 30);
tc21.setFont(new Font("Arial", Font.PLAIN, 16));
editable_area.add(tc21);



JLabel tc221 = new JLabel(rent[19]);
tc221.setBounds(355,320, 120, 30);
tc221.setFont(new Font("Arial", Font.PLAIN, 16));
editable_area.add(tc221);





  }


    public static void main(String[] args) {
        new Dashboard();
    }
}