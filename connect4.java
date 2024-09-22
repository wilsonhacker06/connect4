import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JLabel;


class Main {
  //global declaration of array
  static char b[]=new char [16];
  //board method aka subprogram or def
  public static void board() 
  {
     
    System.out.println("_________");
    System.out.println("|"+b[0]+"|"+b[1]+"|"+b[2]+"|"+b[3]+"|");
    System.out.println("|"+b[4]+"|"+b[5]+"|"+b[6]+"|"+b[7]+"|");
    System.out.println("|"+b[8]+"|"+b[9]+"|"+b[10]+"|"+b[11]+"|");
    System.out.println("|"+b[12]+"|"+b[13]+"|"+b[14]+"|"+b[15]+"|");
    System.out.println("‾‾‾‾‾‾‾‾‾");
  
  }
  public static void wincheck()
  {
    if (b[12]=='o'&&b[13]=='o'&&b[14]=='o'&&b[15]=='o')
      System.out.println("4 in a row");
        else if (b[8]=='o'&&b[9]=='o'&&b[10]=='o'&&b[11]=='o')
      System.out.println("4 in a row");   
    else if (b[4]=='o'&&b[5]=='o'&&b[6]=='o'&&b[7]=='o')
      System.out.println("4 in a row");
    else  if (b[0]=='o'&&b[1]=='o'&&b[2]=='o'&&b[3]=='o')
      System.out.println("4 in a row");
   
    
     
  
  
  }
  public static void main(String[] args) {
    
    Scanner sc=new Scanner(System.in);
    char column='A';
    //char b[]=new char [16];
  
    System.out.println("");
    System.out.println("");
    System.out.println("");
    System.out.println("Welcome To Connect 4");
    System.out.println ("First, decide who goes first and what color each player will have.");
  System.out.println("Players must alternate turns, and only one disc can be dropped in each turn.");
 System.out.println("On your turn, drop one of your colored discs from the top into any of the seven slots.");
 System.out.println("The game ends when there is a 4-in-a-row or a stalemate.");
 System.out.println("The starter of the previous game goes second on the next game.");
    
    
    
    
    
    
    for (int index=0;index<=15;index++)
      {
        b[index]='*';
      }
   
    System.out.println('A'+" "+'B'+" "+'C'+" "+'D');
   board();//call statement that activates method/subprogram/definition

    for (int turn=1;turn<=16;turn++)
      {
    
        System.out.println("Choose column A,B,C,D");
        column=sc.next().charAt(0);
        if (column=='A')//initialize the A column
         {
         for(int y=0;y<=12;y=y+4)
          {
            
          //if (b[y]=='o')break;
          if (y!=0&&b[y]=='o')//for case where there
          {                  //is a checker at bottom
            b[y-4]='o';      //and none at top  
            //System.out.println("b[y-4]="+b[y-4]);
            break;
          }
          if (y==12) b[y]='o';//initialize the lowest position of this column
          char temp=b[y];
          b[y]='o';
          //if (b[y+4]=='o'&&(y+4)<=12) 
          //{
           // b[y]='o';
           // break;
         // }//end if b[y+1]
        board();
          b[y]=temp;
          System.out.println("Delay - enter any char to continue press enter");
          column=sc.next().charAt(0);
          System. out. print("\033[H\033[2J");
          System. out. flush();
        }//end for col A
    }//end if col==A
    if (column=='B')//initialize the B column
    {
      for(int y=1;y<=13;y=y+4)
        {
          if (y!=1&&b[y]=='o')//for case where there
          {                  //is a checker at bottom
            b[y-4]='o';      //and none at top  
            //System.out.println("b[y-4]="+b[y-4]);
            break;
          }
          if (y==13) b[y]='o';//initialize the lowest position of this column
          char temp=b[y];
          b[y]='o';
          
        board();
          b[y]=temp;
          System.out.println("Delay - enter any char to continue press enter");
          column=sc.next().charAt(0);
          System. out. print("\033[H\033[2J");
          System. out. flush();
        }//end for col B
       }//end if col==B
    if (column=='C')//initialize the C column
    {
      for(int y=2;y<=14;y=y+4)
        {
          if (y!=2&&b[y]=='o')//for case where there
          {                  //is a checker at bottom
            b[y-4]='o';      //and none at top  
            //System.out.println("b[y-4]="+b[y-4]);
            break;
          }
          if (y==14) b[y]='o';//initialize the lowest position of this column
          char temp=b[y];
          b[y]='o';
          
          board();
          b[y]=temp;
          System.out.println("Delay - enter any char to continue and press enter");
          column=sc.next().charAt(0);
          System. out. print("\033[H\033[2J");
          System. out. flush();
        }//end for col C
       }//end if col==C
    if (column=='D')//initialize the D column
    {
      for(int y=3;y<=15;y=y+4)
        {
          if (y!=3&&b[y]=='o')//for case where there
          {                  //is a checker at bottom
            b[y-4]='o';      //and none at top  
            //System.out.println("b[y-4]="+b[y-4]);
            break;
          }
          if (y==15) b[y]='o';//initialize the lowest position of this column
          char temp=b[y];
          b[y]='o';
          
          board();
          b[y]=temp;
          System.out.println("Delay - enter any char to continue press enter");
          column=sc.next().charAt(0);
          System. out. print("\033[H\033[2J");
          System. out. flush();
        }//end for col D
       }//end if col==D
        wincheck();
      }//end of the for turn=4 loop
    
   //here is the initialized board with lowest positions filled
    System.out.println("here is the initialized board with lowest positions filled");
        board();
    
    //Now at this point all positions at bottom are full
    
     JFrame frame = new JFrame();
	  ImageIcon icon = new ImageIcon("pic.png");
	  JLabel label = new JLabel(icon);
	  frame.add(label);
	  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  frame.pack();
	  frame.setVisible(true);
      
     
      
       
  }//main
}//class
