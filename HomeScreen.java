import java.awt.*;
import java.awt.event.*;    

/*This class right now is acting as a general workspace
 more than anything else as I'm figuring out what methods/objects I need to use.
*/

public class HomeScreen{     
   HomeScreen(){}
   
   public static void homeFrame(){
      //Creating Frame
      Frame home = new Frame("Wordle_Practice");
      //setting frame size
      home.setSize(1000, 1000);
      home.setResizable(true);
      //Setting the layout for the Frame
      home.setLayout(new GridBagLayout());
      home.setLayout(new FlowLayout());
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
     // ButtonPlay.addActionListener(new ActionListener() {     
      //public void actionPerformed (ActionEvent e) {