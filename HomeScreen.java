import java.awt.*;
import java.awt.event.*;    

/*This class right now is acting as a general workspace
 more than anything else as I'm figuring out what methods/objects I need to use.
*/
public class HomeScreen{  
   
   HomeScreen(){
   }
   
   public static void homeFrame(){
    /*  //Creating Frame
       Frame home = new Frame("Wordle_Practice");
      //setting frame size
      home.setSize(1000, 1000);
      home.setResizable(true);
      //Setting the layout for the Frame
      home.setLayout(new FlowLayout());
      //Sets background of frame to Gray
      home.setBackground(Color.GRAY);
      //makes frame visible
      home.setVisible(true);
      //creates button play
      Button ButtonPlay = new Button("play");
      Button ButtonPlay2 = new Button("play");
      Button ButtonPlay3 = new Button("play");
      Button ButtonPlay4 = new Button("play");
      Button ButtonPlay5 = new Button("play");
      Button ButtonPlay6 = new Button("play");
      Button ButtonPlay7 = new Button("play");
      Button ButtonPlay8 = new Button("play");

      //creates a grid
      Panel grid = new Panel(new GridLayout(3,3));
      grid.add(ButtonPlay);
      grid.add(ButtonPlay2);
      grid.add(ButtonPlay3);
      grid.add(ButtonPlay4);
      grid.add(ButtonPlay5);
      grid.add(ButtonPlay6);
      grid.add(ButtonPlay7);
      grid.add(ButtonPlay8);
      home.add(grid);
      //sets button location
      //ButtonPlay.setBounds(1300,1700,1300,1900);
      //adds button to frame
      

      //Defines what action occurs when button is pressed  
      ButtonPlay.addActionListener(new ActionListener() {     
      public void actionPerformed (ActionEvent e) {
         /*I -think- I'll call the information in PanelGrid here
          (so I ned to create that before I can really do anything)
                
             }    
         });
   */
      }
   
   
   //I should delete this later and run all HomeScreen stuff from WordleMain
   public static void main(String[]args){
     //homeFrame();
   }
}