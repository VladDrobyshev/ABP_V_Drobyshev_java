package lab_1;

import javax.swing.JOptionPane;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;
public class lab_1 {
    public static void lab_1() {
        Scanner scanner = new Scanner(System.in);      //ввід
        int num;
        num = 1;



        while(num != 0){
            int number_task = Integer.parseInt(JOptionPane.showInputDialog("Оберіть № завдання\n"
                    +"- - - - - - - - - - - - - - - - -\n"
                    +"Завдання 1 = 1\n"
                    +"Завдання 2 = 2\n"
                    +"Завдання 3 = 3\n"
                    +"Завдання 4 = 4\n"
                    +"Завдання 5 = 5\n"
                    +"- - - - - - - - - - - - - - - - -\n"
            ));
            num = number_task;
            switch(num){
                default:
                    JOptionPane.showMessageDialog(null, "Ви ввели недопустиме значення");
                    break;
                case 0:
                    JOptionPane.showMessageDialog(null, "Завершення");
                    num=0;
                    break;
                case 1:
                    task_1();
                    break;
                case 2:
                    task_2();
                    break;
                case 3:
                    task_3();
                    break;
                case 4:
                    task_4();
                    break;
                case 5:
                    task_5();
                    break;

            }





        }
    }
    public static void task_1() {
        //ввід данних
        double first = Float.parseFloat(JOptionPane.showInputDialog("Введіть значення 1-го чисела"));
        double second = Float.parseFloat(JOptionPane.showInputDialog("Введіть значення 2-го чисела"));

        //обчислення
        double s = (Math.pow(first,3)+Math.pow(second,3))/2;
        double g = Math.sqrt(Math.abs(first)+Math.abs(second));



        //Вивід відповіді
        JOptionPane.showMessageDialog(null, "Середнє арифмитичне кубів цих чисел:\n" +s);
        JOptionPane.showMessageDialog(null, "Середнє геометричне модулів цих чисел:\n" +g);
    }
    public static void task_2() {
        int num = Integer.parseInt(JOptionPane.showInputDialog("Введіть число в діапазоні від -999 до 999"));

        String p_m = "", q = "";

        if(num >= -999 && num <= 999){
            double abs = Math.abs(num);
            System.out.print(q);
            if(abs == num && abs != 0){
                p_m = "додатнє ";
            }
            else if(abs == 0){
                p_m = "";
            }
            else{
                p_m = "від'ємне ";
            }
            if(abs >= 100){
                q = "трицифрове число";
            }
            else if(abs >= 10 && abs <= 99){
                q = "двоцифрове число";
            }
            else if(abs >= 1 && abs <= 10){
                q = "одноцифрове число";
            }
            else if(abs == 0){
                q = "нуль";
            }
        }
        else {
            JOptionPane.showMessageDialog(null, "⚠️ Ви ввели недопустиме значення ⚠️");
        }
        JOptionPane.showMessageDialog(null, p_m +q);
    }
    public static void task_3() {
        int num = Integer.parseInt(JOptionPane.showInputDialog("Введіть число"));

        double div = num % 2;
        if(num < 0){
            JOptionPane.showMessageDialog(null, "Ви ввели від'ємне значення");
        }
        else if(num == 0){
            double fact = 1;
            for(int i = 1; i <= num; i++){             //Обчислення факторіалу
                fact = fact * i;
            }
            double sol = (num * Math.pow(2,num))/fact; //Обчислення значення

            JOptionPane.showMessageDialog(null,"<Нуль>\n Відповідь:" +sol);
        }
        else if(div == 0) {                            //парне
            double fact = 1;
            for(int i = 1; i <= num; i++){             //Обчислення факторіалу
                fact = fact * i;
            }
            double sol = (num * Math.pow(2,num))/fact; //Обчислення значення

            JOptionPane.showMessageDialog(null,"Парне число,\n Відповідь:" +sol);


        }
        else if(div > 0){                    //непарне
            double fact = 1;

            for(int i = 1; i <= num; i++){             //Обчислення факторіалу
                fact = fact * i;
            }
            double sol = fact/(Math.pow(2,num));        //Обчислення значення

            JOptionPane.showMessageDialog(null,"Непарне число,\n Відповідь:" +sol);

        }


    }
    public static void task_4() {
        Random random = new Random();
        int size = Integer.parseInt(JOptionPane.showInputDialog("Введіть розмір масиву\n"));
        int arr[] = new int[size];
        for(int i = 0; i < size; i++){
            arr[i] = random.nextInt(20)-10;
        }
        for(int i = 0; i < size; i++){
            System.out.print(" " +arr[i]);
        }

        HashMap<Integer, Integer> numbers = new HashMap<Integer, Integer>();
        for (int i = 0; i < size; i++) {
            int number = arr[i];
            if (numbers.containsKey(number)) {
                numbers.put(number,numbers.get(number)+1);
            }
            else {
                numbers.put(number, 1);
            }
        }

        int maxc = 0;
        int maxn = 0;
        for (HashMap.Entry<Integer, Integer> entry : numbers.entrySet()) {
            if (entry.getValue() > maxc) {
                maxc = entry.getValue();
                maxn = entry.getKey();
            }
        }






        JOptionPane.showMessageDialog(null,"Найчастіший елемент = " + maxn +" \nЧастота = " +maxc);



    }
    public static void task_5() {
        double x1,y1,x2,y2,x3,y3,x4,y4;
        x1 = Double.parseDouble(JOptionPane.showInputDialog("Введіть координату x1 = "));
        y1 = Double.parseDouble(JOptionPane.showInputDialog("Введіть координату y1 = "));
        x2 = Double.parseDouble(JOptionPane.showInputDialog("Введіть координату x2 = "));
        y2 = Double.parseDouble(JOptionPane.showInputDialog("Введіть координату y2 = "));
        x3 = Double.parseDouble(JOptionPane.showInputDialog("Введіть координату x3 = "));
        y3 = Double.parseDouble(JOptionPane.showInputDialog("Введіть координату y3 = "));
        x4 = Double.parseDouble(JOptionPane.showInputDialog("Введіть координату x4 = "));
        y4 = Double.parseDouble(JOptionPane.showInputDialog("Введіть координату y4 = "));

        HashMap<String, Double> distances = new HashMap<String, Double>();
        distances.put("x1,y1 та x2,y2",distance(x1,y1,x2,y2));
        distances.put("x1,y1 та x3,y3",distance(x1,y1,x3,y3));
        distances.put("x1,y1 та x4,y4",distance(x1,y1,x4,y4));
        distances.put("x2,y2 та x2,y2",distance(x2,y2,x3,y3));
        distances.put("x2,y2 та x4,y4",distance(x2,y2,x4,y4));
        distances.put("x3,y3 та x4,y4",distance(x3,y3,x4,x4));
        double max = 0;
        String name = "";
        for (HashMap.Entry<String, Double> entry : distances.entrySet()) {
            if (entry.getValue() > max) {
                name = entry.getKey();
                max = entry.getValue();
            }
        }

        JOptionPane.showMessageDialog(null, "Найбільша відстань між точками " +name +"\n"
                +"Значення = " +max);



    }
    static double distance(double x, double y ,double X, double Y){
        double dist = Math.sqrt(Math.pow((x-X),2)+Math.pow((y-Y),2));
        return dist;
    }
    }





