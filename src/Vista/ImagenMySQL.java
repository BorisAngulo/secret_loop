/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import javax.swing.JPanel;
import javax.swing.ImageIcon;

/**
 *
 * @author boris
 */
public class ImagenMySQL extends JPanel{
    
    BufferedImage ruta;
    public ImagenMySQL(int x, int y, BufferedImage ruta){
        this.setSize(x, y);
        this.ruta = ruta;
        
    }
    
    @Override
    public void paint(Graphics g){
        
        Dimension height = getSize();
        //ImageIcon img = new ImageIcon(getClass().getResource(ruta));
        BufferedImage img = ruta;
        
        g.drawImage(img, 0, 0, 450, 350, null);
        setOpaque(false);
        super.paintComponent(g);
    }
}