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
 * The Gameplay class. Manages the game, switching between typing, display of text to type, and letting the user choose what they want to type.
 * used for the visual novel.
 * @authors Ansh Sharma, Braulio Carrion
 * @date 2019.06.10
 */
public class Gameplay {
  /*
   * The JPanel to work with.
   */
  JPanel panel;
  /*
   * The TextBox to work with.
   */
  TextBox textbox = new TextBox();
  /*
   * The background to work with.
   */
  Background background = new Background(1);
  /*
   * The person to work with.
   */
  Person person = new Person(1,1);
  /*
   * The ArrayList of instructions to be carried out by the Gameplay class.
   */
  ArrayList <String> instructions = new ArrayList<String>();;
  /*
   * The current index in the visual novel. Each line has its own index to manage storytelling.
   */
  int index = 0;
  /*
   * The total number of lines in the current script.
   */
  int lines = 0;
  /*
   * What the Gameplay class is currently handling. 0 is visualnovel-style text which the user advances through,
   * 1 is prompting the user to select text, and 2 is prompting the user to type text.
   */
  int mode = 0;
  /*
   * The class constructor. Creates the visual novel.
   */
  public Gameplay(JPanel panel, String script) {
    this.panel = panel;
    generateScript(script);
    index = 0;
  }
  /*
   * Searches through the list of scripts for a script with this particular gameplay, then loads each line from this script into the instructions.
   * @param script The particular script to search for.
   */
  public void generateScript (String script) {
    File scriptList = new File("scripts/" + script + ".txt");
    try {
      Scanner scan = new Scanner(scriptList); 
      background = new Background(Integer.parseInt((scan.nextLine().substring(11))));
      scan.nextLine();
      scan.nextLine();
      scan.nextLine();
      while (scan.hasNextLine()) {
        String line = scan.nextLine(); 
        
      }
    }
    catch (Exception e) {
      System.out.println(e);
    }
  }
  /*
   * Removes the background from the JPanel, then adds it again to manage layers.
   * @param The background int to add.
   */
  public void addBg () {
    panel.remove(background);
    panel.add(background);
  }
  /*
   * Removes the textbox from the JPanel, then adds it again to manage layers.
   */
  public void addTextBox () {
    panel.remove(textbox);
    panel.add(textbox);
  }
  /*
   * Adds text to the screen using the Text and Letter classes, with a character and their respective emotion displayed.
   * @return The JPanel after text is added.
   */
  public JPanel addText () {
    return getPanel();
  }
  /*
   * Returns the current JPanel.
   * @return the JPanel.
   */
  public JPanel getPanel() {
    Component[] components = panel.getComponents();
    for (int i = 0; i < components.length; i++) {
      if (components[i] instanceof Letter)
        panel.setComponentZOrder(components[i],0);
      else if (components[i] instanceof TextBox)
        panel.setComponentZOrder(textbox,1);
      else if (components[i] instanceof Person)
        panel.setComponentZOrder(components[i],2);
      else if (components[i] instanceof Background)
        panel.setComponentZOrder(components[i],3);
    }
    return panel;
  }
  /*
   * Returns the current line in the script.
   */
  public int getIndex () {
    return index;
  }
  /*
   * Returns the total number of lines in the script.
   */
  public int getLines () {
    return lines;
  }
}