package sample;
//inherits from Part

public class InHouse extends Part{
    //fields
    private int machineId;

    //methods

    //FIXME - I'm not sure this is right, calling Super() with parameters then setting this.companyname.
    public InHouse(int id, String name, double price, int stock, int min, int max, int machineId) {
        super(id, name, price, stock, min, max);
        this.machineId = machineId;

    }

    public void setMachineId(int machineId) {
        this.machineId = machineId;
    }

    public int getMachineId() {
        return this.machineId;
    }
}
