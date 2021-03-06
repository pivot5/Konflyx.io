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
/***
 * The Border Class. Creates a black screen.
 * @author Ansh Sharma, Braulio Carrion
 * @date 2019.06.10
 */
public class BlackScreen extends Component {
  /**
   * The class constructor. This class's primary purpose is to draw a text border onto the screen.
   */
  public BlackScreen() {
    this.setSize(1080, 720);
    this.setBounds(0,0,1080,720);
  }
  /**
   * The main graphics method to draw the border onto the screen.
   */
  public void paint (Graphics g) {
    super.paint(g);
    try{
      g.setColor(Color.black);
      g.fillRect(0,0,1080,720);
    }
    catch (Exception e){
      System.out.println(e);
    }  
  }
}