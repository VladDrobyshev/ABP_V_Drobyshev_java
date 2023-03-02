package lab_3;


abstract class Machine implements Run {
    public static final int max_speed = 600;
    public static final int min_speed = 0;
    public static final int min_passengers = 1;
    public static final int max_passengers = 8;

    private String name;
    private int speed;


    public Machine(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }


    public String getName() {
        return this.name;
    }
    public int getSpeed() {
        return this.speed;
    }
    public int get_max_Passengers(){
        return max_passengers;
    }
    public int get_min_Passengers(){
        return min_passengers;
    }




    public abstract double getMass();
    public abstract double getLength();
    public abstract int getWheels();
    public abstract double getDiameter();
    public abstract void outAll();






}

