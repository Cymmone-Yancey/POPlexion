//Names: Cymmone Yancey
//       Mike Favors 
//       Zavan Croom
//Instructor: Dr. B & Dr. Muhammad
//Assignment: ATLiens Final Project 
//Date Due: 07/16/19 @11:59pm
//Product Description: Collects user name, age, gender, whether or not they wear glasses, and complexion
//                     to give an output consisting of the user's information as well as a color palette 
//                     for an outfit that suits your demographic based off of out point-based algorithm! :)


import javax.swing.JFrame;             //Allows for use of a GUI                    
import javax.swing.ImageIcon;          //Allows for creation of icons for GUI
import javax.swing.JLabel;             //Allows for display of text or icons
import java.util.Scanner;              //Allows for collection of user input
import javax.swing.JOptionPane;        //Allows for dialog boxes


public class ATLiens_Project 
{
 public static void main(String args[]) 
 {
     //define scanner variable
     Scanner keyboard = new Scanner(System.in);
     
     //prompt user to save images necessary to the program
     System.out.println("Please save the images from the following URLs DO NOT ALTER FILE NAME: "
                        +"\n\t(1) https://www.colorescience.com/learn/files/2018-03/1521225785_1.jpg"
                        +"\n\t(2) https://i.pinimg.com/236x/b2/d7/d4/b2d7d48012742bfac5607c8ac03ba489.jpg"
                        +"\n\t(3) https://i.pinimg.com/236x/4f/43/05/4f4305ca1d12a296356912a47102148c.jpg"
                        +"\n\t(4) https://www.greatlakesace.com/images/userimages/Genesis-II-Swatches-2.jpg"
                        +"\n\t(5) https://i.pinimg.com/236x/e4/0e/ca/e40eca6d2d39e6adcc4bed0ef4171ab9.jpg"
                        +"\n\t(6) https://www.euroglaze.co.uk/images/rehau-window-colours.jpg"
                        +"\n\t(7) https://pbs.twimg.com/profile_images/1404393427/logo_twitsolic.jpg"
                        +"\n\t(8) https://78.media.tumblr.com/c55608347be8a1d133f571b46ae1d467/tumblr_inline_ot51t4AkAz1r5ob8p_400.png"
                        +"\n\t(9) https://images.myperfectcolor.com/repositories/images/schemes/scheme-1933-1.jpg"
                        +"\n\t(10) https://i.pinimg.com/736x/8b/55/41/8b55419b589b97ed74f34507846b3e31--navy-wedding-colors-wedding-color-palettes.jpg"
                        +"\n\t(11) https://i.pinimg.com/236x/fd/19/ff/fd19ffd736997c283b05e0466fbdff8d--burgundy-and-teal-wedding-navy-wedding-colors.jpg"
                        +"\n\t(12) https://www.color-hex.com/palettes/22324.png"
                        +"\n\t(13) https://www.color-hex.com/palettes/1223.png"
                        +"\n\t(14) https://www.color-hex.com/palettes/3555.png"
                        +"\n\t(15) https://78.media.tumblr.com/a7176daf252b69b05a6936ce362514c5/tumblr_p3aoksJ05p1wlh74do1_500.png");
         
         //CHECKPOINT: User must enter proper confirmation to move on
         String conf1 = JOptionPane.showInputDialog("Type \"confirm\" to move on:");
            String confirm1 = conf1.toLowerCase();    
                   
         String confirm = "confirm";              
         while (! confirm1.equals(confirm))
            {
               conf1 = JOptionPane.showInputDialog
                                 ("ERROR: Invalid Entry (Did not type \"confirm\")"
                                 +"\nType \"confirm\" to move on: ");
               confirm1 = conf1.toLowerCase();
            }        
        

     
         //ask user name, gender, age and if they have glasses
              String name_q = JOptionPane.showInputDialog("\n\nEnter your name: "); 
                  String name = name_q.toUpperCase();
                  
              String gen = JOptionPane.showInputDialog("Enter your gender (m or f): "); 
                  char gender = gen.toLowerCase().charAt(0); //only use first character of user string input (lowercase)
                     
                     //ERROR: Invalid entry (gender)
                     while ((gender != 'm') && (gender != 'f'))
                        {
                           gen = JOptionPane.showInputDialog
                                             ("ERROR: Invalid Entry (Did not type \"m\" or \"f\")"
                                             +"\n\nEnter your gender (m or f): ");
                           
                           gender = gen.toLowerCase().charAt(0);
                        }
         
                  
              String age_in = JOptionPane.showInputDialog("Enter your age in years: ");
                 int age = Integer.parseInt(age_in);     //computer will read user entry as integer
                    
                     //ERROR: Invalid entry (age)
                     while (age < 0)
                        {
                           age_in = JOptionPane.showInputDialog
                                             ("ERROR: Invalid Entry (Age must be > or = 0)"
                                             +"\n\nEnter your age in years: ");
                           
                           age = Integer.parseInt(age_in); 
                        }
                  
              String glass_q = JOptionPane.showInputDialog("Do you wear glasses (y or n)? ");
                  char glasses = glass_q.toLowerCase().charAt(0);  //only use first character of user string input (lowercase)
                     
                     //ERROR: Invalid entry (glasses)
                     while ((glasses != 'y') && (glasses != 'n' ))
                        {
                           glass_q = JOptionPane.showInputDialog
                                             ("ERROR: Invalid Entry (Did not type \"y\" or \"n\")"
                                             +"\n\nDo you wear glasses (y or n)? ");
                           
                           glasses = glass_q.toLowerCase().charAt(0);
                        }
                
           
         //IMPORTANT: User Instruction on how to treat GUI
           String conf2 = JOptionPane.showInputDialog("DO NOT EXIT OUT OF THE GUIDE THAT IS ABOUT TO APPEAR"
                              +"\nType \"confirm\" to move on: ");
               String confirm2 = conf2.toLowerCase();                  
               
               //CHECKPOINT: User must enter proper confirmation to move on   
               while (! confirm2.equals(confirm))
                  {
                     conf2 = JOptionPane.showInputDialog
                                       ("DO NOT EXIT OUT OF THE GUIDE THAT IS ABOUT TO APPEAR"
                                       +"\n\nERROR: Invalid Entry (Did not type \"confirm\")"
                                       +"\nType \"confirm\" to move on: ");
                     confirm2 = conf2.toLowerCase();
                     
                  }   
                       

           //Initialize GUI and necessary display variables for skin tone
              JFrame frame1 = new JFrame();                         //Creates a frame
              
              ImageIcon icon1 = new ImageIcon("1521225785_1.jpg"); //skintone icon
              
              JLabel label1 = new JLabel(icon1); //skintone image   
             
           //Display skin tone selection in GUI
              frame1.add(label1);  //display skintone image
              
              frame1.setDefaultCloseOperation         //Once you click close on GUI, it closes the program
                     (JFrame.EXIT_ON_CLOSE);
             
              frame1.pack();                          //Makes content fit frame
              
              frame1.setTitle("POPlexion");          // Puts title at top of frame
              
              frame1.setVisible(true);                //says that whatever object is called will be displayed on the screen
           
           
           //ask user skin complexion
               String complexion = JOptionPane.showInputDialog(frame1, "\n\nEnter your complexion: ");    
               
               String skintone = complexion.toLowerCase();
                       
                     //ERROR: Invalid entry (skintone)
                     while((! skintone.equals("very fair")) && (! skintone.equals("fair")) && (! skintone.equals("olive")) && (! skintone.equals("light brown")) && 
                           (! skintone.equals("brown")) && (! skintone.equals("dark brown")) && (! skintone.equals("black brown")))
                        {
                          complexion = JOptionPane.showInputDialog("\n\nERROR: Invalid Entry (Entry doesn't match a complexion from the guide)"
                                                                  +"\nEnter your complexion: ");
                          skintone = complexion.toLowerCase();
                        }
               
           //Initialize variables for point system    
                 int skintone_pt = 100;
                 int gender_pt = 100;
                 int age_pt = 100;
                 int glasses_pt = 100;
           
           //Use if-elseif nested statements to determine points assignments
                 //VERY FAIR POINTS
                 if (skintone.equals("very fair"))
                  {
                     //skintone points
                        skintone_pt = 0;
                     
                     //gender points
                        if (gender == 'm')
                           {
                              gender_pt = 0;
                           }
                       
                        else if (gender == 'f')
                           {
                              gender_pt = 2;
                           }
                     
                     //glasses points   
                        if (glasses == 'y')
                           {
                              glasses_pt = 0;
                           }
                        
                        else if (glasses == 'n')
                           {
                              glasses_pt = 2;
                           }
                     
                     //age points   
                        if (age < 30)
                           {
                              age_pt = 2;
                           }   
                        
                        else if (age >= 30)
                           {
                              age_pt = 0;
                           } 
                       
                  }
                 
            
                 //FAIR POINTS     
                 if (skintone.equals("fair"))
                  {
                     //skintone points
                        skintone_pt = 10;
                     
                     //gender points
                        if (gender == 'm')
                           {
                              gender_pt = 0;
                           }
                       
                        else if (gender == 'f')
                           {
                              gender_pt = 2;
                           }
                     
                     //glasses points   
                        if (glasses == 'y')
                           {
                              glasses_pt = 0;
                           }
                        
                        else if (glasses == 'n')
                           {
                              glasses_pt = 2;
                           }
                     
                     //age points   
                        if (age < 30)
                           {
                              age_pt = 2;
                           }   
                        
                        else if (age >= 30)
                           {
                              age_pt = 0;
                           } 
                       
                  }
                  
            
                 //OLIVE POINTS      
                 if (skintone.equals("olive"))
                  {
                     //skintone points
                        skintone_pt = 20;
                     
                     //gender points
                        if (gender == 'm')
                           {
                              gender_pt = 0;
                           }
                       
                        else if (gender == 'f')
                           {
                              gender_pt = 2;
                           }
                     
                     //glasses points   
                        if (glasses == 'y')
                           {
                              glasses_pt = 0;
                           }
                        
                        else if (glasses == 'n')
                           {
                              glasses_pt = 2;
                           }
                     
                     //age points   
                        if (age < 30)
                           {
                              age_pt = 2;
                           }   
                        
                        else if (age >= 30)
                           {
                              age_pt = 0;
                           } 
                       
                  }
            
            
                 //LIGHT BROWN POINTS
                 if (skintone.equals("light brown"))
                  {
                     //skintone points
                        skintone_pt = 30;
                     
                     //gender points
                        if (gender == 'm')
                           {
                              gender_pt = 0;
                           }
                       
                        else if (gender == 'f')
                           {
                              gender_pt = 2;
                           }
                     
                     //glasses points   
                        if (glasses == 'y')
                           {
                              glasses_pt = 0;
                           }
                        
                        else if (glasses == 'n')
                           {
                              glasses_pt = 2;
                           }
                     
                     //age points   
                        if (age < 30)
                           {
                              age_pt = 2;
                           }   
                        
                        else if (age >= 30)
                           {
                              age_pt = 0;
                           } 
                       
                  }
                  
                 
                 //BROWN POINTS 
                 if (skintone.equals("brown"))
                  {
                     //skintone points
                        skintone_pt = 40;
                     
                     //gender points
                        if (gender == 'm')
                           {
                              gender_pt = 0;
                           }
                       
                        else if (gender == 'f')
                           {
                              gender_pt = 2;
                           }
                     
                     //glasses points   
                        if (glasses == 'y')
                           {
                              glasses_pt = 0;
                           }
                        
                        else if (glasses == 'n')
                           {
                              glasses_pt = 2;
                           }
                     
                     //age points   
                        if (age < 30)
                           {
                              age_pt = 2;
                           }   
                        
                        else if (age >= 30)
                           {
                              age_pt = 0;
                           } 
                       
                  }
                  
                 
                 //DARK BROWN POINTS 
                 if (skintone.equals("dark brown"))
                  {
                     //skintone points
                        skintone_pt = 50;
                     
                     //gender points
                        if (gender == 'm')
                           {
                              gender_pt = 0;
                           }
                       
                        else if (gender == 'f')
                           {
                              gender_pt = 2;
                           }
                     
                     //glasses points   
                        if (glasses == 'y')
                           {
                              glasses_pt = 0;
                           }
                        
                        else if (glasses == 'n')
                           {
                              glasses_pt = 2;
                           }
                     
                     //age points   
                        if (age < 30)
                           {
                              age_pt = 2;
                           }   
                        
                        else if (age >= 30)
                           {
                              age_pt = 0;
                           } 
                       
                  }
                  
                 
                 //BLACK BROWN POINTS 
                 if (skintone.equals("black brown"))
                  {
                     //skintone points
                        skintone_pt = 60;
                     
                     //gender points
                        if (gender == 'm')
                           {
                              gender_pt = 0;
                           }
                       
                        else if (gender == 'f')
                           {
                              gender_pt = 2;
                           }
                     
                     //glasses points   
                        if (glasses == 'y')
                           {
                              glasses_pt = 0;
                           }
                        
                        else if (glasses == 'n')
                           {
                              glasses_pt = 2;
                           }
                     
                     //age points   
                        if (age < 30)
                           {
                              age_pt = 2;
                           }   
                        
                        else if (age >= 30)
                           {
                              age_pt = 0;
                           } 
                       
                  }
            
            
            //calculate the overall score
            int score = skintone_pt + age_pt + glasses_pt + gender_pt;
           
            //print out user input 
            JOptionPane.showMessageDialog(frame1, "\nName: " +name
                                                 +"\nAge: " +age
                                                 +"\nGender: " +gender
                                                 +"\nGlasses: " +glasses
                                                 +"\nSkintone: " +skintone
                                                 
                                                 +"\n\nPress \"ENTER\" to see results!");      
                                          
           
           //DETERMINE OUTPUT BASED ON SCORE
                 if (score >= 64)
                  {
                  
                     //Initialize GUI and necessary display variables for black brown YOUNGER demographic
                    JFrame frame10 = new JFrame();
                    ImageIcon icon10 = new ImageIcon("22324.png"); 
                    JLabel label10 = new JLabel(icon10); 
                   
                    //Display skin tone selection in GUI
                    frame10.add(label10);  
                    frame10.setDefaultCloseOperation
                           (JFrame.EXIT_ON_CLOSE);
                    frame10.pack();
                    frame10.setTitle("POPlexion");
                    frame10.setVisible(true);
                  
                  }
                  
                else if (score >= 60)
                  {
                  
                     //Initialize GUI and necessary display variables for black brown OLDER demographic
                    JFrame frame2 = new JFrame();
                    ImageIcon icon2 = new ImageIcon("1223.png"); 
                    JLabel label2 = new JLabel(icon2); 
                   
                    //Display skin tone selection in GUI
                    frame2.add(label2);  
                    frame2.setDefaultCloseOperation
                           (JFrame.EXIT_ON_CLOSE);
                    frame2.pack();
                    frame2.setTitle("POPlexion");
                    frame2.setVisible(true);
                  
                  }
                  
                else if (score >= 54)
                  {
                  
                     //Initialize GUI and necessary display variables for dark brown YOUNGER demographic
                    JFrame frame2 = new JFrame();
                    ImageIcon icon2 = new ImageIcon("tumblr_p3aoksJ05p1wlh74do1_500.png"); 
                    JLabel label2 = new JLabel(icon2); 
                   
                    //Display skin tone selection in GUI
                    frame2.add(label2);  
                    frame2.setDefaultCloseOperation
                           (JFrame.EXIT_ON_CLOSE);
                    frame2.pack();
                    frame2.setTitle("POPlexion");
                    frame2.setVisible(true);      
                  }
                  
                else if (score >= 50)
                  {
                  
                     //Initialize GUI and necessary display variables for dark brown YOUNGER demographic
                    JFrame frame2 = new JFrame();
                    ImageIcon icon2 = new ImageIcon("3555.png"); 
                    JLabel label2 = new JLabel(icon2); 
                   
                    //Display skin tone selection in GUI
                    frame2.add(label2);  
                    frame2.setDefaultCloseOperation
                           (JFrame.EXIT_ON_CLOSE);
                    frame2.pack();
                    frame2.setTitle("POPlexion");
                    frame2.setVisible(true);      
                  }
            
                else if (score >= 44)
                  {
                  
                     //Initialize GUI and necessary display variables for brown YOUNGER demographic
                    JFrame frame2 = new JFrame();
                    ImageIcon icon2 = new ImageIcon("fd19ffd736997c283b05e0466fbdff8d--burgundy-and-teal-wedding-navy-wedding-colors.jpg"); 
                    JLabel label2 = new JLabel(icon2); 
                   
                    //Display skin tone selection in GUI
                    frame2.add(label2);  
                    frame2.setDefaultCloseOperation
                           (JFrame.EXIT_ON_CLOSE);
                    frame2.pack();
                    frame2.setTitle("POPlexion");
                    frame2.setVisible(true);
                  }
                  
                else if (score >= 40)
                  {
                  
                     //Initialize GUI and necessary display variables for brown OLDER demographic
                    JFrame frame2 = new JFrame();
                    ImageIcon icon2 = new ImageIcon("8b55419b589b97ed74f34507846b3e31--navy-wedding-colors-wedding-color-palettes.jpg"); 
                    JLabel label2 = new JLabel(icon2); 
                   
                    //Display skin tone selection in GUI
                    frame2.add(label2);  
                    frame2.setDefaultCloseOperation
                           (JFrame.EXIT_ON_CLOSE);
                    frame2.pack();
                    frame2.setTitle("POPlexion");
                    frame2.setVisible(true);
                  }
                  
                else if (score >= 34)
                  {
                  
                     //Initialize GUI and necessary display variables for light brown YOUNGER demographic
                    JFrame frame2 = new JFrame();
                    ImageIcon icon2 = new ImageIcon("scheme-1933-1.jpg"); 
                    JLabel label2 = new JLabel(icon2); 
                   
                    //Display skin tone selection in GUI
                    frame2.add(label2);  
                    frame2.setDefaultCloseOperation
                           (JFrame.EXIT_ON_CLOSE);
                    frame2.pack();
                    frame2.setTitle("POPlexion");
                    frame2.setVisible(true);
                  }
                  
                else if (score >= 30)
                  {
                  
                     //Initialize GUI and necessary display variables for light brown OLDER demographic
                    JFrame frame2 = new JFrame();
                    ImageIcon icon2 = new ImageIcon("tumblr_inline_ot51t4AkAz1r5ob8p_400.png"); 
                    JLabel label2 = new JLabel(icon2); 
                   
                    //Display skin tone selection in GUI
                    frame2.add(label2);  
                    frame2.setDefaultCloseOperation
                           (JFrame.EXIT_ON_CLOSE);
                    frame2.pack();
                    frame2.setTitle("POPlexion");
                    frame2.setVisible(true);
                  }
                  
                else if (score >= 24)
                  {
                  
                     //Initialize GUI and necessary display variables for olive YOUNGER demographic
                    JFrame frame2 = new JFrame();
                    ImageIcon icon2 = new ImageIcon("logo_twitsolic.jpg"); 
                    JLabel label2 = new JLabel(icon2); 
                   
                    //Display skin tone selection in GUI
                    frame2.add(label2);  
                    frame2.setDefaultCloseOperation
                           (JFrame.EXIT_ON_CLOSE);
                    frame2.pack();
                    frame2.setTitle("POPlexion");
                    frame2.setVisible(true);
                  }
                  
                else if (score >= 20)
                  {
                  
                     //Initialize GUI and necessary display variables for olive OLDER demographic
                    JFrame frame2 = new JFrame();
                    ImageIcon icon2 = new ImageIcon("rehau-window-colours.jpg"); 
                    JLabel label2 = new JLabel(icon2); 
                   
                    //Display skin tone selection in GUI
                    frame2.add(label2);  
                    frame2.setDefaultCloseOperation
                           (JFrame.EXIT_ON_CLOSE);
                    frame2.pack();
                    frame2.setTitle("POPlexion");
                    frame2.setVisible(true);
                  }
                  
                else if (score >= 14)
                  {
                  
                     //Initialize GUI and necessary display variables for fair YOUNGER demographic
                    JFrame frame2 = new JFrame();
                    ImageIcon icon2 = new ImageIcon("Genesis-II-Swatches-2.jpg"); 
                    JLabel label2 = new JLabel(icon2);
                   
                    //Display skin tone selection in GUI
                    frame2.add(label2);  
                    frame2.setDefaultCloseOperation
                           (JFrame.EXIT_ON_CLOSE);
                    frame2.pack();
                    frame2.setTitle("POPlexion");
                    frame2.setVisible(true);
                  }
                  
                else if (score >= 10)
                  {
                  
                     //Initialize GUI and necessary display variables for fair OLDER demographic
                    JFrame frame2 = new JFrame();
                    ImageIcon icon2 = new ImageIcon("e40eca6d2d39e6adcc4bed0ef4171ab9.jpg"); 
                    JLabel label2 = new JLabel(icon2);
                   
                    //Display skin tone selection in GUI
                    frame2.add(label2);  
                    frame2.setDefaultCloseOperation
                           (JFrame.EXIT_ON_CLOSE);
                    frame2.pack();
                    frame2.setTitle("POPlexion");
                    frame2.setVisible(true);
                  
                  }
                  
                else if (score >= 4)
                  {
                  
                     //Initialize GUI and necessary display variables for very fair YOUNGER demographic
                    JFrame frame2 = new JFrame();
                    ImageIcon icon2 = new ImageIcon("4f4305ca1d12a296356912a47102148c.jpg"); 
                    JLabel label2 = new JLabel(icon2);
                   
                    //Display skin tone selection in GUI
                    frame2.add(label2); 
                    frame2.setDefaultCloseOperation
                           (JFrame.EXIT_ON_CLOSE);
                    frame2.pack();
                    frame2.setTitle("POPlexion");
                    frame2.setVisible(true);
                    
                  
                  }
                  
                else if (score < 4)
                  {
                  
                     //Initialize GUI and necessary display variables for very fair OLDER demographic
                    JFrame frame2 = new JFrame();
                    ImageIcon icon2 = new ImageIcon("b2d7d48012742bfac5607c8ac03ba489.jpg"); //very fair old icon
                    JLabel label2 = new JLabel(icon2); //very fair old image   
                   
                    //Display skin tone selection in GUI
                    frame2.add(label2);  //very fair old skintone image
                    frame2.setDefaultCloseOperation
                           (JFrame.EXIT_ON_CLOSE);
                    frame2.pack();
                    frame2.setTitle("POPlexion");
                    frame2.setVisible(true);
            }    
 }
}