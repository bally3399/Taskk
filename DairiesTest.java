package oop2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DairiesTest {

    @Test
    public void addTest(){
        Dairies dairies = new Dairies();
        dairies.add("username","password");
        assertEquals(1, dairies.getLength().size());
    }

    @Test
    public void findByUserNameTest(){
        Dairies dairies = new Dairies();
        dairies.add("username","password");

        Dairy foundDairy = dairies.findByUserName("username");
        assertEquals("username", foundDairy.getUsername());

    }

    @Test
    public void deleteTest(){
        Dairies dairies = new Dairies();
        dairies.add("username","password");
        dairies.remove("username", "password");
        assertEquals(0, dairies.getLength().size());
    }
}
