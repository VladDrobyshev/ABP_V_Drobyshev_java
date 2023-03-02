package lab_4;

import javax.swing.*;
import java.awt.*;




public class lab_4{
    public static void lab_4() {
        //фото
        ImageIcon logo = new ImageIcon("logo_black.jpg");
        ImageIcon background = new ImageIcon("background1.jpg");


        //лейбл фону
        JLabel back = new JLabel();
        back.setIcon(background);
        back.setBounds(0, 0, 500, 500);



        //лейбл з іменем
        JLabel label = new JLabel();
        label.setText("Владислав Дробишев");
        label.setForeground(Color.RED);
        label.setFont(new Font("SF UI Display",Font.ITALIC+Font.BOLD,19));
        label.setVerticalAlignment(JLabel.BOTTOM);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.BOTTOM);
        label.setBounds(100,100,300,350);



        //фрейм
        JFrame frame = new JFrame();
        frame.setTitle("Лабараторна робота №4");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setSize(500,500);
        frame.setBounds(10,10,500,500);
        frame.setIconImage(logo.getImage());
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);

        //стрілка
        JLabel paint = new JLabel(){
            public void paint(Graphics g){
                Graphics2D f = (Graphics2D) g;
                int[] xPoints = {200,100,250,400,300,300,200};
                int[] yPoints = {200,200,50,200,200,400,400};

                f.setPaint(Color.RED);
                f.fillPolygon(xPoints, yPoints, 7);

                f.setPaint(Color.GREEN);
                f.fillPolygon(xPoints, yPoints, 7);

                f.setPaint(Color.BLUE);
                f.fillPolygon(xPoints, yPoints, 7);

            }



        };

        frame.add(label);
        frame.add(paint);
        //frame.add(back);












    }

}




