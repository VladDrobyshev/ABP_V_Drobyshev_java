package lab_3;

import javax.swing.JOptionPane;

public class onTracks extends Machine {
    public double mass;
    public double length;


    public onTracks(String name, int speed, double mass, double length) {
        super(name, speed);
        this.mass = mass;
        this.length = length;
    }

    public double getMass() {
        return this.mass;
    }
    public double getLength(){
        return this.length;
    }
    public int getWheels() {
        return 0;
    }
    public double getDiameter(){
        return 0;
    }
    public void outAll(){
        JOptionPane.showMessageDialog(null,
                "Назва = " + super.getName()
                +"\nШвидкість = " + super.getSpeed()
                +"\nМаса = " + this.mass
                +"\nДовжина гусениці = " +this.length

        );

    }
}
