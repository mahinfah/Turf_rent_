package core;
import javax.swing.*;

import admin.Adminupdate;

//import admin.turf_info;
import java.awt.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Dashboard  {
    private JFrame f;
    private JPanel profile_Panel,editable_area;
    private JButton profile;
    private JButton dark_mode, back;
    private JLabel name, pass, title;
    private JTextField name_field;
    private JPasswordField pass_field;

    private JTextArea name1;
    public Dashboard(){
        f = new JFrame();

       // String turfname = admin.getTurfname();

        Color mycolor = new Color(192, 192, 192);
        dark_mode = new JButton("Dark mode");
        dark_mode.setBounds(550, 200, 100, 40);
        Font font1 = new Font("serif", Font.BOLD, 15);
        Font font2 = new Font("serif", Font.BOLD, 35);

        title = new JLabel("DashBoard");
        title.setBounds(250, 60, 180, 30);
        title.setFont(font2);
        f.add(title);

        
        editable_area = new JPanel();
        editable_area.setBounds(20, 120, 200, 550);
        editable_area.setBackground(Color.BLACK);
        editable_area.setLayout(null);
        f.add(editable_area);

        name = new JLabel("djsds[dsjdss]");
        name.setBounds(255, 180, 180, 30);
        name.setFont(font1);
        name.setBackground(mycolor);

        JLabel click = new JLabel("CLICK");
        click.setBounds(35,5,90,100);
        click.setForeground(Color.WHITE);
        editable_area.add(click);

        name_field = new JTextField();
        name_field.setBounds(400, 180, 160, 30);

        pass = new JLabel("PASSWORD ");
        pass.setBounds(260, 250, 100, 30);
        pass.setBackground(mycolor);
        pass.setFont(font1);

        pass_field = new JPasswordField();
        pass_field.setBounds(400, 250, 160, 30);
//
   // enter = new JLabel("Enter" + getTurfname());
     //   enter.setBounds(356, 360, 80, 30);
    //    f.add(enter);

profile =  new JButton("Profile");
profile.setBounds(50,90,100, 30);
f.add(profile);

        back = new JButton("Back");
        back.setBounds(600, 530, 80, 30);
        f.add(back);

        f.setSize(700, 600);
        f.setLayout(null);
        f.setVisible(true);
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
    }
	public void profile()
    {
//     // System.err.println("method called");
       editable_area.removeAll();
       editable_area.repaint();
  editable_area.revalidate();
 
        String username = User.getName();
        String file_path = "./Data/userdata.txt";
        String[] user_data = getUserData(file_path, username);

        

name1 = new JTextArea(user_data[2]);
name1.setBounds(10,10, 80, 30 );
name1.setForeground(Color.WHITE);

editable_area.add(name1);

  
    }

        private String[] getUserData(String file_path, String username) {
        try (BufferedReader reader = new BufferedReader(new FileReader(file_path))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.contains("Name:" + username)) {
                    String[] Data = new String[4];
                    for (int i = 0; i < 4; i++) {
                        line = reader.readLine();
                        Data[i] = line.split(":")[1];
                    }
                    return Data;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }


    private String getName(String filePath, String username) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            String nameLine = null;
            while ((line = reader.readLine()) != null) {
                if (line.trim().equals("Name:" + username)) {
                    if (nameLine != null && nameLine.startsWith("Name:")) {
                        return nameLine.split(":")[1].trim();
                    }
                }
                nameLine = line;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
}

    

    public static void main(String[] args) {
        new Dashboard();
    }
}