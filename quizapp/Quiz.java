
package quizapp;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Quiz extends JFrame implements ActionListener {
    
    JButton next,lifeline,submit;
    JLabel qno,que;
    JRadioButton  op1,op2,op3,op4;
    String questions[][]=new String[10][5];
    String answers[][]=new String[10][2];
    String userans[][]=new String[10][2];
    public static int timer = 15;
     public static int answergiven = 0;    
     public static int count = 0;
      public static int score = 0;
     

     
     ButtonGroup bg;
  
    
    Quiz()
    {
        setLayout(null);
     ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("imeges/k.jpg"));
    JLabel image=new JLabel(i1);
    image.setBounds(0,0,1200,300);
    add(image);
    
     qno=new JLabel();
     qno.setBounds(20,370,50,30);  
     qno.setFont(new Font("Tonma",Font.PLAIN,20));
     add(qno);
     
       que=new JLabel();
     que.setBounds(50,370,900,30);  
     que.setFont(new Font("Tonma",Font.PLAIN,20));
     
     add(que);
     
   
	questions[0][0] = "Which is used to find and fix bugs in the Java programs.?";
        questions[0][1] = "JVM";
        questions[0][2] = "JDB";
        questions[0][3] = "JDK";
        questions[0][4] = "JRE";

        questions[1][0] = "What is the return type of the hashCode() method in the Object class?";
        questions[1][1] = "int";
        questions[1][2] = "Object";
        questions[1][3] = "long";
        questions[1][4] = "void";

        questions[2][0] = "Which package contains the Random class?";
        questions[2][1] = "java.util package";
        questions[2][2] = "java.lang package";
        questions[2][3] = "java.awt package";
        questions[2][4] = "java.io package";

        questions[3][0] = "An interface with no fields or methods is known as?";
        questions[3][1] = "Runnable Interface";
        questions[3][2] = "Abstract Interface";
        questions[3][3] = "Marker Interface";
        questions[3][4] = "CharSequence Interface";

        questions[4][0] = "In which memory a String is stored, when we create a string using new operator?";
        questions[4][1] = "Stack";
        questions[4][2] = "String memory";
        questions[4][3] = "Random storage space";
        questions[4][4] = "Heap memory";

        questions[5][0] = "Which of the following is a marker interface?";
        questions[5][1] = "Runnable interface";
        questions[5][2] = "Remote interface";
        questions[5][3] = "Readable interface";
        questions[5][4] = "Result interface";

        questions[6][0] = "Which keyword is used for accessing the features of a package?";
        questions[6][1] = "import";
        questions[6][2] = "package";
        questions[6][3] = "extends";
        questions[6][4] = "export";

        questions[7][0] = "In java, jar stands for?";
        questions[7][1] = "Java Archive Runner";
        questions[7][2] = "Java Archive";
        questions[7][3] = "Java Application Resource";
        questions[7][4] = "Java Application Runner";

        questions[8][0] = "Which of the following is a mutable class in java?";
        questions[8][1] = "java.lang.StringBuilder";
        questions[8][2] = "java.lang.Short";
        questions[8][3] = "java.lang.Byte";
        questions[8][4] = "java.lang.String";

        questions[9][0] = "Which of the following option leads to the portability and security of Java?";
        questions[9][1] = "Bytecode is executed by JVM";
        questions[9][2] = "The applet makes the Java code secure and portable";
        questions[9][3] = "Use of exception handling";
        questions[9][4] = "Dynamic binding between objects";


	
        
        answers[0][1] = "JDB";
        answers[1][1] = "int";
        answers[2][1] = "java.util package";
        answers[3][1] = "Marker Interface";
        answers[4][1] = "Heap memory";
        answers[5][1] = "Remote interface";
        answers[6][1] = "import";
        answers[7][1] = "Java Archive";
        answers[8][1] = "java.lang.StringBuilder";
        answers[9][1] = "Bytecode is executed by JVM";
     
         op1=new JRadioButton(); 
      op1.setBounds(90, 420,900,20);
      op1.setBackground(Color.white);
      op1.setFont( new Font("Dialog",Font.PLAIN,20));
       add(op1);
       
       op2=new JRadioButton(); 
      op2.setBounds(90, 460,900,20);
      op2.setBackground(Color.white);
      op2.setFont( new Font("Dialog",Font.PLAIN,20));
       add(op2);
       
         op3=new JRadioButton(); 
      op3.setBounds(90, 500,900,20);
      op3.setBackground(Color.white);
      op3.setFont( new Font("Dialog",Font.PLAIN,20));
       add(op3);
       
       op4=new JRadioButton(); 
      op4.setBounds(90, 540,900,20);
      op4.setBackground(Color.white);
      op4.setFont( new Font("Dialog",Font.PLAIN,20));
       add(op4);
        
       bg=new ButtonGroup();
       bg.add(op1);
       bg.add(op2);
       bg.add(op3);
       bg.add(op4);
       
       
       next=new JButton("Next");
     next.setBounds(1000,450, 150, 30);
    next.setBackground(Color.blue);
    next.setForeground(Color.white);
      next.addActionListener(this);
     next.setFont(new Font("Dialog",Font.BOLD,20));
     add(next);
     
     
     lifeline=new JButton("50-50 Life_Line");
     lifeline.setBounds(1000,500, 150, 30);
   lifeline.setBackground(Color.blue);
    lifeline.setForeground(Color.white);
      lifeline.addActionListener(this);
     lifeline.setFont(new Font("Dialog",Font.BOLD,20));
     add(lifeline);
     
     
     
     submit=new JButton("Submit");
     submit.setBounds(1000,550,150,30);
    submit.setBackground(Color.blue);
    submit.setForeground(Color.white);
      submit.addActionListener(this);
     submit.setFont(new Font("Dialog",Font.BOLD,20));
     submit.setEnabled(false);
     add(submit);
       
      setBounds(50,0,1200,850);  
      setVisible(true);
      getContentPane().setBackground(Color.white);
      
      
      start(count);
    }
    
    public static void main(String argg[])
    {
        new Quiz();
    }
    
   
    public void paint(Graphics g)
    {
        super.paint(g);
        String time="Tme left - "+timer+" second";
        
        g.setColor(Color.red);
        g.setFont(new Font("Tohama",Font.PLAIN,15));
    
        if(timer>0)
        {
            g.drawString(time,950,430);
        }
        else
        {
             g.drawString("times up!!",950,430);
        }
        timer--;
       
        
        
        try{
        Thread.sleep(1000);
        repaint();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        
        
         if(answergiven==1)
    {
         answergiven=0;
         timer=0;
   
    }else if(timer<0)
    {  op1.setEnabled(true);
    op2.setEnabled(true);
    op3.setEnabled(true);
    op4.setEnabled(true);
        timer=15;
        if(bg.getSelection()==null)
        {
           userans[count][0]=""; 
        }
        else{
            userans[count][0]=bg.getSelection().getActionCommand();
        }
         
        count++;
        
        if(count==10)
        {
          submit.setEnabled(true);  
          next.setEnabled(false);
          if(timer>0)
          {
             for(int i=0;i<answers.length;i++) 
           {   System.out.println("userans"+ userans[i][0]+"correctans."+answers[i][1]);
               if( userans[i][0]==answers[i][1])
               {
                   score+=10;
               }
               else score+=0;
              
           }
            new Score();
         
          }
        }
        
       start(count);
        repaint();
       
    }
    }
    
   
    
    
    public void start(int count)
    {
       qno.setText(""+(count+1)+".");
       que.setText(questions[count][0]);
       op1.setText(questions[count][1]);
        op2.setText(questions[count][2]);
        op3.setText(questions[count][3]);
        op4.setText(questions[count][4]);
     op1.setActionCommand(questions[count][1]);
     op2.setActionCommand(questions[count][2]);
     op3.setActionCommand(questions[count][3]);
     op4.setActionCommand(questions[count][4]);

      bg.clearSelection();
    }
    
    
     public void actionPerformed  (ActionEvent e)
    {
       if(e.getSource()==next)
       { op1.setEnabled(true);
    op2.setEnabled(true);
    op3.setEnabled(true);
    op4.setEnabled(true);
        
         
           
            timer=15;
        if(bg.getSelection()==null)
        {
           userans[count][0]=""; 
        }
        else{
            userans[count][0]=bg.getSelection().getActionCommand();
        }  
        
        repaint();
        count++;
        start(count);
        
        if(count==8)
        {
          submit.setEnabled(true);  
          next.setEnabled(false);
        }
    }
       else if(e.getSource()==lifeline)
       {
          if(count==2||count==4||count==6||count==8||count==9) 
          {
              op1.setEnabled(false);
              op4.setEnabled(false);

          }else{              op3.setEnabled(false);op2.setEnabled(false);
            }
         lifeline.setEnabled(false); 
       }
       else if(e.getSource()==submit)                                       //submit button
       {  
         
           for(int i=0;i<answers.length;i++) 
           {
               if( userans[i][0]==answers[i][1])
               {
                   score+=10;
               }
               else score+=0;
              
           }
          
            new Score(score);
       }
       
    }
}
