import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import java.awt.Component;
import java.awt.Color;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.image.*;
import java.util.*;
/*
 * The TextDriverClass Class. Creates an example of the use of the Text and Letter classes.
 * @author Ansh Sharma, Braulio Carrion
 * @date 2019.05.22
 */
public class TextDriverClass extends JFrame {
  /*
   * The frame to contain all GUI.
   */
  //public JFrame frame;
  /*
   * The Panel to contain all GUI.
   */
  //public JPanel panel;
  /*
   * Class constructor
   */
  public TextDriverClass () {
   setSize(400,400);
   setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
   setPreferredSize(new Dimension(400,400));
   
   JPanel panel = new JPanel();
   panel.setLayout(null);
   
   
   Text t = new Text (new Color (25,25,25),  40,  false,  false,  false,  20,  20, "TEST");
   Text t2 = new Text (new Color (25,25,25),  40,  false,  false,  false,  10,  100, "PEEPEE");
   
   add(t);
   add(t2);
   
   setVisible(true);
   this.pack();
  }
  /*
   * The main method that runs the Text and Letter classes.
   */
  public static void main (String[] args) {
    
    TextDriverClass driver = new TextDriverClass();
    
  }
}