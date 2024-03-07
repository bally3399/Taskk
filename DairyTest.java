package oop2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DairyTest {
    private Dairy myDairy;
    @BeforeEach
    public void initializer(){
        myDairy = new Dairy("name", "correctPin");
    }
    @Test
    public void createEntryTest(){
        myDairy.unLocked("correctPin");
        assertFalse(myDairy.isLocked());

        myDairy.createEntry("title", "body");
        assertEquals(1, myDairy.getEntries().size());

    }

    @Test
    public void setUpDiaryTest(){
        myDairy.unLocked("correctPin");
        assertFalse(myDairy.isLocked());
    }

    @Test
    public void enterWrongPassword_diaryRemainsLocked(){
        myDairy.unLocked("inCorrectPin");
        assertTrue(myDairy.isLocked());
    }
    @Test
    public void testThatDiaryCanBeLock(){
        myDairy.lock();
        assertTrue(myDairy.isLocked());
    }

    @Test
    public void findEntryByIdTest(){
        myDairy.unLocked("correctPin");
        assertFalse(myDairy.isLocked());

        myDairy.createEntry("title", "body");

        Entry foundEntry = myDairy.findEntry(101);
        assertEquals(101, foundEntry.getId());
    }
    @Test
    public void createEntry_findEntry_deleteEntryTest(){
        myDairy.unLocked("correctPin");
        assertFalse(myDairy.isLocked());

        myDairy.createEntry("title","body");
        myDairy.findEntry(101);

        myDairy.deleteEntry(101);
        assertEquals(0, myDairy.getEntries().size());
    }

    @Test
    public void updateEntryTest(){
        myDairy.unLocked("correctPin");
        assertFalse(myDairy.isLocked());
        myDairy.createEntry("title", "body");

        myDairy.updateEntry(101, "newTitle", "newBody");
        Entry foundDiary = myDairy.findEntry(101);
        assertEquals("newTitle", foundDiary.getTitle());
        assertEquals("newBody", foundDiary.getBody());


    }

}
