package oop2;

import java.util.ArrayList;
import java.util.List;

public class Dairy {
    private String username;
    private String password;
    public boolean isLocked = true;
    private final List<Entry> entries = new ArrayList<>();
    private int counter = 101;

    public Dairy(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void unLocked(String correctPin) {
        if (password.equals(correctPin)) {
            isLocked = false;
        }
    }

    public boolean isLocked() {
        return isLocked;
    }

    public void lock() {
        isLocked = true;
    }

    public Entry createEntry(String title, String body) {
        Entry newEntry = new Entry(generateIdEntry(), title, body);
        entries.add(newEntry);
        return newEntry;
    }

    public List<Entry> getEntries() {
        return entries;
    }

    public Entry findEntry(int id) {
        for (Entry entry : entries) {
            if (entry.getId() == id) {
                return entry;
            }
        }
        return null;
    }

    public int generateIdEntry() {
        return counter++;
    }

    public void deleteEntry(int id) {
        Entry entry = findEntry(id);
        if (entry != null) {
            entries.remove(entry);
        }
    }

    public void updateEntry(int id, String title, String body) {
        for (Entry entry : entries) {
            if (entry.getId() == id) {
                entry.setTitle(title);
                entry.setBody(body);
            }
        }
    }
}