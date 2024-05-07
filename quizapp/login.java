package quizapp;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class login extends JFrame  implements ActionListener{
  JButton rules,back;
   JTextField tname;
    login()
    { 
    getContentPane().setBackground(Color.white);
    setLayout(null);
    ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("imeges/sun-or-rain.jpg"));
    JLabel image=new JLabel(i1);
    image.setBounds(0,0,600,500);
    add(image);
    //image.setBorder(Border.pink);
    
    
    JLabel mainheading=new JLabel("hansdddsh njsjsj") ;
    mainheading.setBounds(700,60, 300, 45);
    mainheading.setFont(new Font("Viner Hand ITC",Font.BOLD,40));
    mainheading.setForeground(new Color(30,144,254));
    add(mainheading);
    
    
    JLabel name=new JLabel("Enter your name") ;
    name.setBounds(810,150, 300, 20);
    name.setFont(new Font("Mongolian Baiti",Font.BOLD,18));
   name.setForeground(new Color(30,144,254));
    add(name);
    
    
     tname=new JTextField();
     tname.setBounds(735,200, 300, 25);
     tname.setFont(new Font("Times New Roman",Font.BOLD,20));
     add(tname);
     
    rules=new JButton("Rules");
    rules.setBounds(735,270, 110, 25);
    rules.setBackground(Color.blue);
    rules.setForeground(Color.white);
    rules.addActionListener(this);
    // btn.setFont(new Font("Times New Roman",Font.BOLD,20));
     add(rules);
     
      back=new JButton("Back");
     back.setBounds(935,270, 110, 25);
     back.setBackground(Color.blue);
     back.setForeground(Color.white);
      back.addActionListener(this);
    // btn.setFont(new Font("Times New Roman",Font.BOLD,20));
     add(back);
     
     
    setSize(1200,500);
    setLocation(100,100);
    setVisible(true);
    }
public void actionPerformed(ActionEvent e)
{
 if(e.getSource()==rules) 
 {     String nm=tname.getText();
      setVisible(false);
      new Rules(nm);
 }
 else if(e.getSource()==back) 
 {
     setVisible(false);
 }
}
    public static void main(String aegs[]) {
        
       new login();
    }

    
}
