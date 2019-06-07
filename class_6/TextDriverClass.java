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
public class TextDriverClass extends JFrame implements KeyListener{
  /*
   * The panel to work with.
   */
  JPanel panel;
  /*
   * The visual novel to work with.
   */
  VisualNovel vn;
  /*
   * Class constructor
   */
  public TextDriverClass () {
    
    setSize(1080,720);
    setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    setPreferredSize(new Dimension(1080,720));
    
    panel = new JPanel();
    panel.setLayout(null);
    add(panel);  
    vn = new VisualNovel(panel, "testScript");
    panel = vn.addText();
    setVisible(true);
    this.pack();
    this.addKeyListener(this);
  }
  /*
   * Method that runs if a key is pressed.
   */
  public void keyPressed(KeyEvent e) {
    if (vn.getIndex() == vn.getLines())
      this.removeKeyListener(this);
    else {
      System.out.println("press");
      int keyValue = e.getKeyCode();
      if (keyValue == 10 || keyValue == 32)
        panel = vn.addText();
    }
  }
  /*
   * Method that runs if a key is released.
   */
  public void keyReleased(KeyEvent e) {    
  }  
  /*
   * Method that runs if a key is typed.
   */
  public void keyTyped(KeyEvent e) {  
  }
  /*
   * The main method that runs the Text and Letter classes.
   */
  public static void main (String[] args) {
    
    TextDriverClass driver = new TextDriverClass();
    
  }
}