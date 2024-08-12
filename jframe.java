import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

import javaFx.applicaton.Application;

public class jframe {
    public static void main(String[]args){
        JFrame jf = new JFrame(); // crete a frame
        jf.setTitle("this is a jframe"); // set a title frame

        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit from jframe
        jf.setResizable(false); // it is use when no resizable frame
        jf.setSize(420, 420); // set the size of frame
        jf.setVisible(true); // se is visible

        // cahnge the image icon
        ImageIcon image = new ImageIcon("hello.png"); // crete the image
        jf.setIconImage(image.getImage());  // set the image

        jf.getContentPane().setBackground(Color.green); // it change the background color of jframe



    }
}
