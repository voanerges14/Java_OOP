import javax.swing.*;
import java.awt.*;

/**
 * Created by user on 16.02.2016.
 */
public class MainWindow {
    public static void main(String[] args) {
        JFrame mainFrame =  new JFrame("Лабораторная работа №1");
        mainFrame.setVisible(true);
        mainFrame.setSize(300, 200);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ShapesDrawer shapesDrawer = new ShapesDrawer();
        mainFrame.add(shapesDrawer);
        shapesDrawer.addFigure(new Line(new Point(10,10), new Point(20, 100)));
        shapesDrawer.draw();
    }
}
