import javax.swing.*;
import java.awt.event.*;

public class Main {
  public static void main(String[] args) {
    // creating instance of JFrame
    JFrame f = new JFrame();

    // creating instance of JButton
    SmileyFace b = new SmileyFace();

    // add button to JFrame
    f.add(b);

    f.setSize(800, 600);
    f.setLayout(null);
    // make the frame visible
    f.setVisible(true);
  }
}