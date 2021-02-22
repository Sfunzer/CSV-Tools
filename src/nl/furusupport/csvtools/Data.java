package nl.furusupport.csvtools;

public class Data {
    protected final String name;
    protected final String location;
    protected final String info;



    public Data(String name, String location, String info) {
        this.name = name;
        this.location = location;
        this.info = info;
    }


    @Override
    public String toString() {
        return name + "," + location + "," + info;
    }

}
