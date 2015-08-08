/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package smartClassEx;

import java.awt.*;
import javax.swing.JPanel;

/**
 *
 * @author JITHIN.P
 */
public class CustomTitlePanel extends JPanel {
    
    private Color colorTop;
    private Color colorBottum;
    
    public CustomTitlePanel(Color cTop,Color cBottom) 
    {
    
     //   super(sTitle);
        colorTop = cTop;
        colorBottum = cBottom;
    // TODO Auto-generated constructor stub

    }
    @Override
    public void paintComponent(Graphics graphics)
    {
        super.paintComponent( graphics);

        if(UIBlitz.getUIBlitz())
        {
            Graphics2D graphics2D=(Graphics2D)graphics.create();
            int h = getHeight()-2;
            int w = getWidth()-2;

            graphics2D.setComposite(AlphaComposite.getInstance(
                    AlphaComposite.SRC_OVER, .5f));
            graphics2D.setPaint(new GradientPaint(0, 0, colorTop, 0, h, colorBottum));
            graphics2D.fillRect(1, 1, w, h);

            graphics2D.dispose();
        }
    }
    
}
