
package quizapp;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Rules extends JFrame implements ActionListener{
    String name;
    JButton start,back;
    Rules(String name)
    {
        this.name =name;
        getContentPane().setBackground(Color.white);
        setLayout(null);
        
    JLabel mainheading=new JLabel("Welcome"+name+"to Simple Minds") ;
    mainheading.setBounds(50,20, 700,30);
    mainheading.setFont(new Font("Viner Hand ITC",Font.BOLD,28));
    mainheading.setForeground(new Color(30,144,254));
    add(mainheading);
    
    
      JLabel rules=new JLabel("Welcome"+name+"to Simple Minds") ;
    rules.setBounds(20,90, 700,350);
    rules.setFont(new Font("Tohoma",Font.PLAIN,16));
  
rules.setText(
            "<html>"+ 
                "1. You are trained to be a programmer and not a story teller, answer point to point" + "<br><br>" +
                "2. Do not unnecessarily smile at the person sitting next to you, they may also not know the answer" + "<br><br>" +
                "3. You may have lot of options in life but here all the questions are compulsory" + "<br><br>" +
                "4. Crying is allowed but please do so quietly." + "<br><br>" +
                "5. Only a fool asks and a wise answers (Be wise, not otherwise)" + "<br><br>" +
                "6. Do not get nervous if your friend is answering more questions, may be he/she is doing Jai Mata Di" + "<br><br>" +
                "7. Brace yourself, this paper is not for the faint hearted" + "<br><br>" +
                "8. May you know more than what John Snow knows, Good Luck" + "<br><br>" +
            "<html>"
);
    add(rules);
    
    
    back=new JButton("Back");
     back.setBounds(150,500, 100, 30);
     back.setBackground(Color.blue);
     back.setForeground(Color.white);
      back.addActionListener(this);
    // btn.setFont(new Font("Times New Roman",Font.BOLD,20));
     add(back);
     
     
     start=new JButton("Start");
     start.setBounds(500,500, 110, 25);
     start.setBackground(Color.blue);
     start.setForeground(Color.white);
      start.addActionListener(this);
    // btn.setFont(new Font("Times New Roman",Font.BOLD,20));
     add(start);
        
        
        setSize(800,650);
        setLocation(350,100);
        setVisible(true);
    }
    
    public static void main(String args[])
    {
        new Rules("Dear user");
    }
    public void actionPerformed(ActionEvent e)
{
 if(e.getSource()==back) 
 {   
     
      new login();
 }
 else if(e.getSource()==start) 
 {
     
     new Quiz();
 }
}
    
}
