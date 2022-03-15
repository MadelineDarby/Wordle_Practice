
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelGrid  implements ActionListener{

   public static void mainGame(){

      //Creating Frame
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


      
      //
      Label basicl = new Label("SCREECH");
      home.add(basicl);
      basicl.setAlignment(Label.LEFT);
      basicl.setSize(350,100);
      //adds action listener to textFields 
      //-- can do this to all the Try's with a loop to make code cleaner
      PanelGrid p = new PanelGrid();
      TryOne.addActionListener(new ActionListener(){
         public void actionPerformed(ActionEvent e) {
         String z = "z";
         basicl.setText(z); 
         }
      });
      
      //adds action listener to textFields
      PanelGrid p = new PanelGrid();
      TryOne.addActionListener(p);


   @Override
   public void actionPerformed(ActionEvent e) {
      // TODO Auto-generated method stub
      