package oop2;

import java.util.Scanner;
public class MainApp {
    private static final Dairy dairy = new Dairy("username","correctPin");
    public static void main(String[] args) {
        display();
    }
    public static void display() {
        String display = """
                Welcome to My Diary
                1.Create Entry
                2.Unlock
                3.lock
                4.Check if Diary is locked
                5.Find Entry
                6.Delete Entry
                7.Update Entry
                8.Exit App
                """;
        String choice = input(display);
        switch (choice.charAt(0)) {
            case '1':
                createEntry();
            case '2':
                unlock();
            case '3':
                lock();
            case '4':
                checkIfDiaryIsLocked();
            case '5':
                findEntry();
            case '6':
                deleteEntry();
            case '7':
                updateEntry();
            case '8':
                exitApp();
            default:
                display();
        }


    }

    private static void updateEntry() {
        String id = input("Enter your id");
        String title = input("Enter title");
        String body = input("Enter body");
        dairy.updateEntry(Integer.parseInt(id), title, body);
        print("You have successfully Updated your entry");
    }

    private static void deleteEntry() {
        String id = input("Enter ID of the entry to delete: ");
        dairy.deleteEntry(Integer.parseInt(id));
        print("Entry deleted successfully");
    }


    private static void findEntry() {
        String id = input("Enter your id");
        dairy.findEntry(Integer.parseInt(id));
        print("Entry found for ID: " + id);
    }


    private static void checkIfDiaryIsLocked() {
        String password = input("Enter your password");
        if(password.equals(dairy.getPassword())) {
            if (dairy.isLocked()){
                print("Dairy is locked");
            }else{
                print("Diary is unlocked");
            }
        }else{
            print("Incorrect password");
        }
        display();
    }

    private static void lock() {
        String password = input("Enter your password");
        if(password.equals(dairy.getPassword())) {
            dairy.lock();
            print("You have successfully lock dairy");
        } else{
            print("Incorrect password");
        }
        display();
    }

    private static void unlock() {
        String password = input("Enter your password");
        if (password.equals(dairy.getPassword())) {
            dairy.unLocked(password);
            print("You have successfully unlock dairy");
        }else{
            print("Incorrect Password");
        }
        display();

    }

    private static void createEntry() {
        String title = input("Enter title: ");
        String body = input("Enter  body: ");
        dairy.createEntry(title, body);
        print("Entry created successfully!");
        display();
    }

    private static void exitApp () {
        System.exit(8);
    }

    private static String input(String display) {
        print(display);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    private static void print(String input){
        System.out.println(input);

    }

}
