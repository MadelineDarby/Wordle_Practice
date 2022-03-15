
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelGrid  implements ActionListener{

   public static void mainGame(){
      
      //creates TextFields
      TextField TryOne = new TextField(24);
      TextField TryTwo = new TextField(24);
      TextField TryThree = new TextField(24);
      TextField TryFour = new TextField(24);
      TextField TryFive = new TextField(24);
      TextField TrySix = new TextField(24);
      
      //
      Label basicl = new Label("SCREECH");
      HomeFrame().home.add(basicl);
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
      
      TryTwo.addActionListener(p);
      TryThree.addActionListener(p);
      TryFour.addActionListener(p);
      TryFive.addActionListener(p);
      TrySix.addActionListener(p);

      //creates a grid
      Panel grid = new Panel(new GridLayout(6,1));
      grid.add(TryOne);
      grid.add(TryTwo);
      grid.add(TryThree);
      grid.add(TryFour);
      grid.add(TryFive);
      grid.add(TrySix);
      home.add(grid);
   
      
   }




   public static void main(String[]args){   
      mainGame();
   
   }

/*
   @Override
   public void actionPerformed(ActionEvent e) {
      // TODO Auto-generated method stub
      
   }
*/
}