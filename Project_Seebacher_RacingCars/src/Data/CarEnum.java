
package Data;

/**
 *
 * @author maxth
 */
public enum CarEnum {
    CARID("Car-ID"),
    CARNAME("Carname"),
    DRIVER("Driver"),
    TIME("Time in seconds"),
    PLACE("Place");

    private String name;

    private CarEnum(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
