package lab_6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Triangle extends JFrame implements ActionListener {
    JRadioButton rB, bB, gB;
    TrianglePanel trianglePanel;


    Triangle() {
        super("Лабараторна робота №6");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());




        rB = new JRadioButton("Залити фігуру червоним");
        rB.addActionListener(this);
        bB = new JRadioButton("Залити фігуру чорним");
        bB.addActionListener(this);
        gB = new JRadioButton("Залити фугуру зеленим");
        gB.addActionListener(this);

        ButtonGroup allButton = new ButtonGroup();
        allButton.add(rB);
        allButton.add(bB);
        allButton.add(gB);
        trianglePanel = new TrianglePanel();
        JPanel buttonPanel = new JPanel();

        add(trianglePanel, BorderLayout.CENTER);
        buttonPanel.add(rB);
        buttonPanel.add(bB);
        buttonPanel.add(gB);
        add(buttonPanel, BorderLayout.SOUTH);
        buttonPanel.setBackground(new Color(0,0,70));

        ImageIcon logo = new ImageIcon("logo_black.jpg");
        setIconImage(logo.getImage());
        setSize(700, 700);
        setVisible(true);
        setLocationRelativeTo(null);



    }


    public void actionPerformed(ActionEvent e) {
        if (rB.isSelected()) {
            trianglePanel.setColor(Color.RED);
        }
        else if (bB.isSelected()) {
            trianglePanel.setColor(Color.BLACK);
        }
        else if (gB.isSelected()) {
            trianglePanel.setColor(Color.GREEN);
        }
    }


    private class TrianglePanel extends JPanel {
        Color color = new Color(0,0,70);

        void setColor(Color color) {
            this.color = color;
            repaint();
        }



        public void paint(Graphics g) {
            super.paint(g);
            int[] x = {100,350,600};
            int[] y = {500,100,500};
            g.setColor(color);
            g.fillPolygon(x, y, 3);
        }
    }
}
