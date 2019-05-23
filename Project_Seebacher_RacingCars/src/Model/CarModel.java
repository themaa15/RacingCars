package Model;

import Data.Car;
import Data.CarEnum;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author maxth
 */
public class CarModel extends AbstractTableModel {

    public List<Car> list;

    public CarModel() {
        this.list = new ArrayList();
    }

    @Override
    public int getRowCount() {
        return this.list.size();
    }

    @Override
    public int getColumnCount() {
        return CarEnum.values().length;
    }

    @Override
    public Object getValueAt(int rowindex, int columnindex) {
        Car car = this.list.get(rowindex);
        CarEnum enumIndex = CarEnum.values()[columnindex];
        switch (enumIndex) {
            case CARID:
                return car.getCarid();
            case CARNAME:
                return car.getCarname();
            case DRIVER:
                return car.getDriver();
            case TIME:
                return car.getTime();
            case PLACE:
                return car.getPlace();
            default:
                return "?";
        }
    }

    public void add(Car a) {
        this.list.add(a);
        this.fireTableDataChanged();
    }

    @Override
    public String getColumnName(int i) {
        return CarEnum.values()[i].getName();
    }

    public void read(File f) {
        try {
            Scanner sc = new Scanner(f);
            Car tmp;
            String[] parts;
            while (sc.hasNextLine()) {
                parts = sc.nextLine().split(",");
                tmp = new Car(Integer.parseInt(parts[0]), parts[1], parts[2], Double.parseDouble(parts[3]), Integer.parseInt(parts[4]));
                add(tmp);
            }
            sc.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
    }

    public void write(File f) {
        try {
            FileWriter w = new FileWriter(f);
            String saveString;
            for (int i = 0; i < this.list.size(); i++) {
                saveString = ("" + Integer.toString(this.list.get(i).getCarid()) + ","
                        + this.list.get(i).getCarname() + ","
                        + this.list.get(i).getDriver() + ","
                        + Double.toString(this.list.get(i).getTime()) + ","
                        + Integer.toString(this.list.get(i).getPlace()));
                w.write(saveString);
                w.write("\r\n");
            }
            w.flush();
            w.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
