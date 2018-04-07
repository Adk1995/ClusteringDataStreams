/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cdsbsdbmc;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Points extends JPanel {

  public int plotValues[];
  public Points(int []values){
      System.out.println("in paints");
      plotValues = values;
      for(int i=0;i<plotValues.length;i++){
          System.out.println(plotValues[i]);
      }
  }  
  public void paintComponent(Graphics g) {
    super.paintComponent(g);

    Graphics2D g2d = (Graphics2D) g;

    g2d.setColor(Color.green);
    
    for(int i=0;i<plotValues.length;i++){
      int value = plotValues[i];
      Dimension size = getSize();
        System.out.println("hgfghf"+size);
      int w = size.width ;
      int h = size.height;
      Random r = new Random();
      int x = Math.abs(r.nextInt()) % w;
      int y = Math.abs(r.nextInt()) % h;
      
      //g2d.drawLine(value,value, value,value);
      //g2d.drawRect(value, value, 3, 3);
      g2d.fillRoundRect(value, value, 5, 5,3,3);
     
    }
    
  }

  public static void main(String[] args) {
     /* 
    int tempValues[] = {120,234,237,190,199,220,334,337,390,399};
    Points points = new Points(tempValues);
   JFrame frame = new JFrame("Points");
   frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   frame.add(points);
   frame.setSize(400, 400);
   frame.setLocationRelativeTo(null);
   frame.setVisible(true);
*/
  }
}