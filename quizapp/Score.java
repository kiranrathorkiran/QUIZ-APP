
package quizapp;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class Score extends JFrame {
    
   JLabel qno;
    
    Score(int score)
    {    setVisible(true);
        getContentPane().setBackground(Color.white);
        setLayout(null);
        setBounds(20,90, 700,350);
        setSize(800,600);
        setLocation(20,60);
        
         JLabel mainheading4=new JLabel("your score is : "+score) ;
    mainheading4.setBounds(70,60, 500, 45);
    mainheading4.setFont(new Font("Viner Hand ITC",Font.BOLD,40));
    mainheading4.setForeground(new Color(30,144,254));
    add(mainheading4);
  
   
    }
    public static void main(String args[])
    {
       new Score(2);
    }
    
}
