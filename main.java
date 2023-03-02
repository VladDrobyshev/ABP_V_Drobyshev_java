import javax.swing.JOptionPane;


import lab_1.lab_1;
import lab_2.lab_2;
import lab_3.lab_3;

import Lectures.menu;
import Lectures.lec_5;

import develop.develop_1;
import develop.develop_2;
import develop.learn;

public class main {




    public static void main(String args[]) {
        //develop_1.code();
        //develop_2.code();





        JOptionPane.showMessageDialog(null, "Дробишев Владислав\nВаріант-8");
        int lab = Integer.parseInt(JOptionPane.showInputDialog("Оберіть лабараторну роботу\n"
                + "- - - - - - - - - - - - - - - - - - - - - - - \n"
                + "Lab_1 = 1\n"
                + "Lab_2 = 2\n"
                + "Lab_3 =3\n"

                +"\n\n"

                + "- - - - - - - - - - - - - - - - - - - - - - - \n"
                + "Меню лекцій = 100\n"
                + "Вихід = 0"));


        switch (lab) {
            case 0:
                JOptionPane.showMessageDialog(null, "\uD83D\uDEAB Програму завершено \uD83D\uDEAB");
                break;

            case 1:
                JOptionPane.showMessageDialog(null, "↻ Завантаження " + lab + "-ї лаби ↻");
                lab_1.lab_1();
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "↻ Завантаження " + lab + "-ї лаби ↻");
                lab_2.lab_2();
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "↻ Завантаження " + lab + "-ї лаби ↻");
                lab_3.lab_3();
                break;




            case 100:
                JOptionPane.showMessageDialog(null, "↻ Завантаження меню лекцій ↻");
                menu.lectures();
                break;


            default:
                JOptionPane.showMessageDialog(null, "⚠️ Ви ввели недопустиме значення ⚠️");
                break;

        }









    }


}
