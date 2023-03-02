package develop;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class develop_1 {
    public static void code() {
        JFrame frame = new JFrame();
        frame.setBounds(10,10,500,500);
        frame.setDefaultCloseOperation(3);
        frame.setVisible(true);
        JPanel panel = new JPanel(){
            @Override
            public void paint(Graphics g){
                Graphics2D f = (Graphics2D) g;
                int[] xPoints = {200,100,250,400,300,300,200};
                int[] yPoints = {200,200,50,200,200,400,400};

                f.setPaint(Color.RED);
                g.fillPolygon(xPoints, yPoints, 7);

                f.setPaint(Color.GREEN);
                g.fillPolygon(xPoints, yPoints, 7);

                f.setPaint(Color.BLUE);
                g.fillPolygon(xPoints, yPoints, 7);

            }

        };
        frame.add(panel);




    }
}





