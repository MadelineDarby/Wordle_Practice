
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
      //creates TextFields
      TextField TryOne = new TextField(24);
      TextField TryTwo = new TextField(24);
      TextField TryThree = new TextField(24);
      TextField TryFour = new TextField(24);
      TextField TryFive = new TextField(24);
      TextField TrySix = new TextField(24);
      //adds action listener to textFields
      PanelGrid p = new PanelGrid();
      TryOne.addActionListener(p);
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




   @Override
   public void actionPerformed(ActionEvent e) {
      // TODO Auto-generated method stub
      
   }

}