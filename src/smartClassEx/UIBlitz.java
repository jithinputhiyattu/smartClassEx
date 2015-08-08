/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package smartClassEx;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;

/**
 *
 * @author JITHIN.P
 */
public class UIBlitz
{
   
    public static String  METAL     =   "Metal";
    public static String  NIMBUS    =   "Nimbus";
    public static String  MOTIF     =   "CDE/Motif";
    public static String  WIN32     =   "Windows";
    public static String  CLASSIC   =   "Windows Classic";
    
    private static boolean bUseBlitz = false;
    
    public static void setLookAndFeelInfo(String sName)

    {
        try
        {
        for(LookAndFeelInfo lookAndFeelInfo: UIManager.getInstalledLookAndFeels())
        {

            if(lookAndFeelInfo.getName().equals(sName))
            {

                UIManager.setLookAndFeel(lookAndFeelInfo.getClassName());
            }
        }
        }
        catch(Exception e)
        {
        }

   }
        public static void setUIBlitz(boolean bValue)
        {
            bUseBlitz = bValue;
        }
        
         public static boolean getUIBlitz()
        {
           return bUseBlitz ;
        } 
      public static void setAtCenter(javax.swing.JDialog  dialog)
     {
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        // calculate the new location of the window
        int nWidth = dialog.getSize().width;
        int nHight = dialog.getSize().height;
        int nX = (dimension.width - nWidth) / 2;
        int nY = (dimension.height - nHight) / 2;
        dialog.setLocation(nX, nY);
     }
    
}
