package core;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

import javax.swing.table.*;
import java.io.*;
import java.nio.file.*;
//import static javax.swing.JOptionPane.showMessageDialog;

public class BookyourTurf 
{
     
    JFrame frame;
    JLabel label1,l1 ;
    JPanel panel1;
    JScrollPane scroll;
    JTable table;
    DefaultTableModel model;
    JButton back,rent ,b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13;
    ImageIcon i1;

    
    private String[] column = { "Turf Name", "Capacity","Email", "Number", "Location", "Duration","Rent"};
    private String[] rows = new String[7];

   BookyourTurf()

   
    {

    frame = new JFrame();
    panel1 = new JPanel();
    panel1.setBounds(0, 0, 2120, 768);
    panel1.setBackground(new Color(167, 213, 121));
    
    l1 = new JLabel("Turf Available");
    l1.setBounds(400,5,200,40);
    frame.add(l1);
   

 back = new JButton("Back");
 back.setBounds(803, 20, 80, 30);
 frame.add(back);

rent = new JButton("Rent");
rent.setBounds(400, 580, 80, 50);
frame.add(rent);


    // table
    table = new JTable();
    model = new DefaultTableModel();
    model.setColumnIdentifiers(column);

    table.setModel(model);
    table.setSelectionBackground(Color.decode("#8AC5FF"));
    table.setBackground(Color.WHITE);
    table.setRowHeight(30);
    table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
    table.getColumnModel().getColumn(0).setPreferredWidth(120);
    table.getColumnModel().getColumn(1).setPreferredWidth(120);
    table.getColumnModel().getColumn(2).setPreferredWidth(140);
    table.getColumnModel().getColumn(3).setPreferredWidth(140);
    table.getColumnModel().getColumn(4).setPreferredWidth(120);
    table.getColumnModel().getColumn(5).setPreferredWidth(120);
    table.getColumnModel().getColumn(6).setPreferredWidth(100);

    scroll = new JScrollPane(table);
    scroll.setBounds(1, 50, 950, 500);
    scroll.setBackground(Color.cyan);
    frame.add(scroll);

  //  String file = ".\\Data\\Turf_info.txt";

    String file  = "./Data/Turf_info.txt";
    String temp = "./Data/RentInfo.txt";
    //String Rent = "./Data/rentinfo.txt";

    // To input data in the table
    try {

        BufferedReader reader = new BufferedReader(new FileReader(file));
        int totalLines = 0;
        while (reader.readLine() != null)
            totalLines++;
        reader.close();

        for (int i = 0; i < totalLines; i++) {
            String line = Files.readAllLines(Paths.get(file)).get(i);
            String x = line.substring(0, 4);
            if (x.equals("turf")) {
                rows[0] = Files.readAllLines(Paths.get(file)).get(i).substring(10); // turf Name
                rows[1] = Files.readAllLines(Paths.get(file)).get((i + 1)).substring(10); // capacity           
                rows[2] = Files.readAllLines(Paths.get(file)).get((i + 2)).substring(7); // phone
                rows[3] = Files.readAllLines(Paths.get(file)).get((i + 3)).substring(7); // email
                rows[4] = Files.readAllLines(Paths.get(file)).get((i + 4)).substring(10); // location
                rows[5] = Files.readAllLines(Paths.get(file)).get((i + 5)).substring(10); // duration
                rows[6] = Files.readAllLines(Paths.get(file)).get((i + 6)).substring(6); // Rent
                model.addRow(rows);
            }
        }

    } catch (Exception ex) {
        System.out.println("error");
        return;
    }


// selecting the item from table

   // Delete Button
   rent.addActionListener(new ActionListener() {
  
       public void actionPerformed(ActionEvent ae) {

        if (table.getSelectionModel().isSelectionEmpty()) {
            JOptionPane.showMessageDialog(null, "Please select a turf to rent", "Warning!",
                    JOptionPane.WARNING_MESSAGE);
        } else {
            String removeUser = table.getModel().getValueAt(table.getSelectedRow(), 0).toString();

            File oldFile = new File(file);
            File newFile = new File(temp);

            int q = 0;

            try {
               

                BufferedReader reader = new BufferedReader(new FileReader(file));
                int totalLines = 0;
                while (reader.readLine() != null)
                    totalLines++;
                reader.close();

                for (int i = 0; i < totalLines; i++) {
                    String line = Files.readAllLines(Paths.get(file)).get(i);
                    String x = line.substring(0, 4);
                    if (x.equals("turf")) {
                        String userName = Files.readAllLines(Paths.get(file)).get(i);
                        if (userName.substring(10).equals(removeUser)) {
                            q = i;
                        }
                    }
                }
            } catch (Exception ex) {
                return;
            }

            try {
              


                FileWriter fw = new FileWriter(temp, true);
                BufferedWriter bw = new BufferedWriter(fw);
                PrintWriter pw = new PrintWriter(bw);

            //  FileWriter fww = new FileWriter(Rent, true);
            //    BufferedWriter bww = new BufferedWriter(fw);
            //    PrintWriter pww = new PrintWriter(bw);

                FileReader fr = new FileReader(file);
                BufferedReader br = new BufferedReader(fr);

                BufferedReader reader = new BufferedReader(new FileReader(file));
                int totalLines = 0;
                while (reader.readLine() != null)
                    totalLines++;
                reader.close();
              
              int n =0;
              
                for (int j = 0; j < totalLines; j++) {
                 
                    String line = Files.readAllLines(Paths.get(file)).get(j);
                 
                    
                   //String x = line.substring(0, 4);
          
                  
                    if (q != 0 && (j == q || j == (q + 1) || j == (q + 2) || j == (q + 3) || j == (q + 4)
                            || j == (q + 5) || j == (q + 6) )) {
                                if(n==0)
                                {
                                    pw.println("Rented by " +core.User.getName() ); 
                                    n++;  
                                }
                        
                                String userName = Files.readAllLines(Paths.get(file)).get(j);
                  
            
                        pw.println("#Rented "+ userName);
                    } 
                    else {
                        String userName = Files.readAllLines(Paths.get(file)).get(j);
                        //String userName = Files.readAllLines(Paths.get(Rent)).get(j);
                        
                        pw.println(userName);
                    }
                }
                pw.flush();
                pw.close();
                fr.close();
                br.close();
                bw.close();
                fw.close();

            } catch (Exception ex) {
                System.out.print(ex);
            }

            oldFile.delete();
            File dump = new File(file);
            newFile.renameTo(dump);

            new BookyourTurf();
            frame.setVisible(false);
        }

    }
});














    
   
    frame.add(panel1);
    frame.setSize(900, 768);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setLocationRelativeTo(null);
    frame.setLayout(null);
    frame.setVisible(true);
    frame.setResizable(false);

    // Action
    back.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {

            if (e.getSource() == back) {
                frame.setVisible(false);
                new Dashboard();
            }
        }
    });

   


   
}
public static void main(String[] args) {
  // AdminDashBoard1 H= new AdminDashBoard1();
   new BookyourTurf();
  
//h.setVisible(false);
}
}