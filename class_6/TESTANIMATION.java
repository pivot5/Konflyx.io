import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class TESTANIMATION extends JPanel implements ActionListener{
  Timer tm = new Timer(5, this); // 5 -> milliseconde, this -> ActionListener
  int x = 0, velX = 10;
  int y = 0, velY = 10;
  
  public TESTANIMATION(){
    tm.start();
  }
  
  public void paintComponent(Graphics g){
    super.paintComponent(g);
    
    try{
      File imageFile = new File("DVD.png");
      BufferedImage image = ImageIO.read(imageFile);
      g.drawImage(image, x, y,50,30,null);
    }
    catch (Exception e) {
      System.out.println(e.getMessage());
    }
    
    // tm.start(); // not optimal
  }
  
  public void actionPerformed(ActionEvent e){
    if(x < 0 || x > 550)
      velX = -velX;
    
    if(y < 0 || y > 340)
      velY = -velY;
    
    y = y + velY;
    x = x + velX;
    repaint();
    
  }
  
  public static void main(String[] args) {
    TESTANIMATION t = new TESTANIMATION();
    JFrame jf = new JFrame();
    jf.setSize(600, 400);
    jf.setVisible(true);
    jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    jf.setResizable(false);
    jf.add(t);
  }
}