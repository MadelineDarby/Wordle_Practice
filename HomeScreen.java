import java.awt.*;

//This class right now is acting as a general workspace more than anything else as I'm figuring out what methods/objects I need to use.

public class HomeScreen{  
   
   HomeScreen(){
   }
   
   public static void homeFrame(){
      //Creating Frame
      Frame home = new Frame();
      //setting frame size
      home.setSize(1000, 1000);
      //Setting the layout for the Frame
      home.setLayout(new FlowLayout());
      //makes frame visible
      home.setVisible(true);
   }
   
   public static void homeButtons(){
      //creates button play
      Button ButtonPlay = new Button("play");
      //sets button location
      ButtonPlay.setBounds(500,300,200,100);
      
      //adds button to frame
      home.add(ButtonPlay);  
   }
   
   
   //I should delete this later and run all HomeScreen stuff from Wordle.Main
   public static void main(String[]args){
      homeFrame();
      homeButtons();
        }
}