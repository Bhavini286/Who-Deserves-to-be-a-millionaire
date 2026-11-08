package WHM;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 * Sets the background for a panel. 
 **/
public class BackgroundPanel extends JPanel {
    private Image backgroundImage;

    /**
     * Contructor for the class. So when an object of BackgroundPanel created the location must 
     * be given. 
     * @param imagePath
     **/
    public BackgroundPanel(String imagePath) {

        java.net.URL imageURL = getClass().getResource(imagePath);
        ImageIcon icon = new ImageIcon(imageURL);
        backgroundImage = icon.getImage().getScaledInstance(1000, 520, Image.SCALE_SMOOTH);
        setLayout(null);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(backgroundImage, 0, 0, this);
    }
}
