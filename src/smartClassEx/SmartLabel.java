/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package smartClassEx;

import java.awt.*;
import java.awt.Graphics;
import javax.swing.JLabel;

/**
 *
 * @author JITHIN.P
 */
public class SmartLabel extends JLabel
{
    private Color colorTop;
    private Color colorBottum;
    
    public SmartLabel(String sTitle,Color cTop,Color cBottom) 
    {
    
        super(sTitle);
        colorTop = cTop;
        colorBottum = cBottom;
    // TODO Auto-generated constructor stub

    }
    @Override
    public void paintComponent(Graphics graphics)
    {
        super.paintComponent( graphics);

//        Graphics2D graphics2D=(Graphics2D)graphics.create();
//        int h = getHeight();
//        int w = getWidth();
//
//        graphics2D.setComposite(AlphaComposite.getInstance(
//                AlphaComposite.SRC_OVER, .5f));
//        graphics2D.setPaint(new GradientPaint(0, 0, colorTop, 0, h, colorBottum));
//        graphics2D.fillRect(0, 0, w, h);
//
//        graphics2D.dispose();
    }
   
}
