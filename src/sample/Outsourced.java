package sample;
//inherits from Part

public class Outsourced extends Part{
    //fields
    private String companyName;

    //methods

    //FIXME - I'm not sure this is right, calling Super() with parameters then setting this.companyname.
    public Outsourced(int id, String name, double price, int stock, int min, int max, String companyName) {
        super(id, name, price, stock, min, max);
        this.companyName = companyName;

    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyName() {
        return companyName;
    }
}
