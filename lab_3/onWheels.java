package lab_3;

import javax.swing.*;

public class onWheels extends Machine{

    private int wheels;
    private double diameter;

    public onWheels(String name, int speed, int wheels, double diameter) {
        super(name, speed);
        this.wheels = wheels;
        this.diameter = diameter;
    }

    public double getMass() {
        return 0;
    }
    public int getWheels() {
        return this.wheels;
    }
    public double getDiameter(){
        return this.diameter;
    }
    public double getLength(){
        return 0;
    }

    public void outAll(){
        JOptionPane.showMessageDialog(null,
                "Назва = " + super.getName()
                        +"\nШвидкість = " + super.getSpeed()
                        +"\nКількість колес = " + this.wheels
                        +"\nДіаметр колеса = " +this.diameter

        );

    }


}
