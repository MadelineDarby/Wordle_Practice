import java.awt.*;
import java.awt.event.*;    

public class HomeScreen{     
   HomeScreen(){
   
   }
   
   public static void homeFrame(){
      //Creating Frame
      Frame home = new Frame("Wordle_Practice");
      //setting frame size
      home.setSize(1000, 1000);
      home.setResizable(true);
      //Setting the layout for the Frame
      home.setLayout(new GridBagLayout());
      //Sets background of frame to Gray
      home.setBackground(Color.GRAY);
      //makes frame visible
      home.setVisible(true);
      //creates button play
      Button ButtonPlay = new Button("play");
      /*/creates a grid
      Panel grid = new Panel(new GridLayout(3,3));
      grid.add(ButtonPlay);
      home.add(grid);
      */
      //sets button location
      ButtonPlay.setBounds(1300,1700,1300,1900);
      //adds button to frame
      home.add(ButtonPlay);

      //Defines what action occurs when button is pressed  
//       ButtonPlay.addActionListener(new ActionListener() {     
//          public void actionPerformed (ActionEvent e) {
//          //PanelGrid.mainGame();
//          boolean z = true;                
//              }    
//          });
//    
       }
   
   
   //I should delete this later and run all HomeScreen stuff from WordleMain
   //public static void main(String[]args){
     //homeFrame();
   //}
}
