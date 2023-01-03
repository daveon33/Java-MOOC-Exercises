package application;

public class Program {

    public static void main(String[] args) throws Exception {
        // you can test your classes here:
        AverageSensor ka = new AverageSensor();
        ka.addSensor( new StandardSensor(3) );
        ka.addSensor( new StandardSensor(7) );
        ka.read();
        System.out.println(ka.readings());
    }

}
