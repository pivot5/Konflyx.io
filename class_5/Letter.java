import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import java.awt.Component;
import java.awt.Color;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JPanel;
import javax.swing.*;
import java.awt.image.*;
/*
 * The Letter class. Creates a letter using JFrame to easily create sentences.
 * @authors Ansh Sharma, Braulio Carrion
 * @date 2019.05.22
 */
public class Letter extends Component{
  /*
   * The colour of the letter.
   */
  Color letter_colour;
  /*
   * The size of the letter.
   */
  int letter_size;
  /*
   * Whether or not the letter will animate when on screen.
   */
  boolean idleAnimation;
  /*
   * Whether or not the letter will animate into the scene.
   */
  boolean animateIn;
  /*
   * Whether or not the letter will animate out of the scene.
   */
  boolean animateOut;
  /*
   * The horizontal position of the bottom-leftmost part of the letter on the screen, in pixels.
   */
  int posX;
  /*
   * The vertical position of the bottom-leftmost part of the letter on the screen, in pixels.
   */
  int posY;
  /*
   * The String value of the letter to represent.
   */
  String letter;
  
  /*
   * The class constructor. Creates a Letter object with all variables set.
   * @param colour The letter's colour.
   * @param size The letter's size.
   * @param idleAnim Whether or not the letter animates on screen.
   * @param inAnim Whether or not the letter animates into the screen.
   * @param outAnim Whether or not the letter animates out of the screen.
   * @param x The horizontal position of the letter.
   * @param y The vertical position of the letter.
   * @param let The letter to represent.
   */
  public Letter (Color colour, int size, boolean idleAnim, boolean inAnim, boolean outAnim, int x, int y, String let) {
    letter_colour = colour;
    letter_size = size;
    idleAnimation = idleAnim;
    animateIn = inAnim;
    animateOut = outAnim;
    posX = x;
    posY = y;
    letter = let;
    this.setSize(letter_size, letter_size);
    this.setBounds(posX,posY,letter_size,letter_size);
  }
  /*
   * Draws the letter with respective colour and size. Will animate while drawing if animateIn is on. Also calls animateIdle() if animateIdle is on.
   * @param g The graphics to draw onto.
   */
  public void paint (Graphics g) {
    System.out.print("drawing: ");
    super.paint(g);
    try{
      File imageFile = new File(letter + ".png");
      BufferedImage image = ImageIO.read(imageFile);
      g.drawImage(image, 0, 0,letter_size,letter_size,null);
      System.out.println("Drawn" + letter);
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
    
  }
  /* 
   * Erases the letter. Will animate out if animateOut is on.
   */
  public void erase() {
    //to be implemented
  }
  /*
   * Returns the size of the letter, for use in the Text class.
   */
  public int getWidth() {
    return letter_size;
  }
}