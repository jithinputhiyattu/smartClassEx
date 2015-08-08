/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package smartDB;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;

/**
 *
 * @author JITHIN.P
 */
public class Common 
{
    private static JFrame masterFame;
     public static void setPosition(javax.swing.JDialog  dialog)
     {
       Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        // calculate the new location of the window
        int w = dialog.getSize().width;
        int h = dialog.getSize().height;
        int x = (dim.width - w) / 2;
        int y = (dim.height - h) / 2;
        dialog.setLocation(x, y);
       
     }
       public static void setPosition(javax.swing.JFrame  dialog)
     {
       Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        // calculate the new location of the window
        int w = dialog.getSize().width;
        int h = dialog.getSize().height;
        int x = (dim.width - w) / 2;
        int y = (dim.height - h) / 2;
        dialog.setLocation(x, y);
       
     }
       
       public static void setMaximumSize(javax.swing.JFrame  dialog)
     {
       Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        // calculate the new location of the window
        dialog.setSize(dim);
        int w = dialog.getSize().width;
        int h = dialog.getSize().height;
        int x = (dim.width - w) / 2;
        int y = (dim.height - h) / 2;
        dialog.setLocation(x, y);
       
     }
       
      public static void setMasterFrame(JFrame jFrame)
      {
          masterFame = jFrame;
      }
      
      public static JFrame getMasterFrame()
      {
         return masterFame;
      }
}