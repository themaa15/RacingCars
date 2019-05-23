
package Data;

import java.io.BufferedWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author maxth
 */
public class Car {
    
    public int carid;
    public String carname;
    public String driver;
    public double time;
    public int place;

    //Default-Constructor
    public Car(int carid, String carname, String driver, double time, int place) {
        this.carid = carid;
        this.carname = carname;
        this.driver = driver;
        this.time = time;
        this.place = place;
    }

    //Getter-Methoden
    public int getCarid() {
        return carid;
    }

    public void setCarid(int carid) {
        this.carid = carid;
    }

    public String getCarname() {
        return carname;
    }

    public void setCarname(String carname) {
        this.carname = carname;
    }

    public String getDriver() {
        return driver;
    }

    
    //Setter-Methoden
    public void setDriver(String driver) {
        this.driver = driver;
    }

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }

    public int getPlace() {
        return place;
    }

    public void setPlace(int place) {
        this.place = place;
    }

    //To-String
    @Override
    public String toString() {
        return " || Carid: "+carid+" || Carname: "+carname+"|| Driver: "+driver+" || Time: "+time+" || Place: "+place+" ||";
    }
    
    //Main zum Testen
    public static void main(String[] args) {
        Car car = new Car(815,"Test-Car","Jonny Test",10.50,0);
        String output = car.toString();
        System.out.println(output);
    }

    
    
    
    
}
