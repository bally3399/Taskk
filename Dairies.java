package oop2;

import java.util.ArrayList;
import java.util.List;

public class Dairies {
    private final List<Dairy> dairies = new ArrayList<>();

    public void add(String username, String password) {
        Dairy newDairy = new Dairy(username, password);
        dairies.add(newDairy);

    }

    public List<Dairy> getLength() {
        return dairies;
    }

    public Dairy findByUserName(String username) {
        for (Dairy dairy : dairies) {
            if (dairy.getUsername().equals(username)) {
                return dairy;
            }
        }
        return null;
    }


    public void remove(String username, String password) {
        Dairy dairy = findByUserName(username);
        if (dairy != null && dairy.getUsername().equals(username) && dairy.getPassword().equals(password)) {
            dairies.remove(dairy);
        }
    }
}
