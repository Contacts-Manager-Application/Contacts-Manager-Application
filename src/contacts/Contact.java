package contacts;

import util.Methods;

public class Contact extends Methods {
    private String name;
    private String number;
    public Contact(String name, String number) {
        this.name = name;
        this.number = number;
    }
    public Contact(String name)
    {
        this.name = name;
    }
    public String toString() {
        return name + " | " + number;
    }
}
