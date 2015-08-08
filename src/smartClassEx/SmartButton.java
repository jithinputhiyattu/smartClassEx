/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package smartClassEx;

import java.awt.*;
import javax.swing.JButton;

/**
 *
 * @author JITHIN.P
 */

public class SmartButton extends JButton
{

    private Color colorTop;
    private Color colorBottum;
    
    public SmartButton(String sTitle,Color cTop,Color cBottom) 
    {    
        super(sTitle);
        colorTop = cTop;
        colorBottum = cBottom;
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
    
   @Override
    public Dimension getPreferredSize()
    {
        return new Dimension(200,100);
    }
}