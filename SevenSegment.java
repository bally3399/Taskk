public class SevenSegment {
    private String[] segments = new String[7];
    public  void splittingIntoArray(String binary) {
        for (int index = 0; index < segments.length; index++) {
            if (binary.charAt(index) != '0'  && binary.charAt(index) != '1') throw new IllegalArgumentException("invalid binary");
            segments[index] = "" + binary.charAt(index);


        }
        displaySeven();
    }

    public void displaySeven() {
        if (segments.length > 7){
            throw new IllegalArgumentException("Bimbim");
        }
        try {
            display1(segments[0]);
            display1(segments[5], segments[1]);
            display1(segments[6]);
            display1(segments[4], segments[2]);
            display1(segments[3]);
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid input: " + e.getMessage());
        }
    }


    private void display1(String segments) {
        if (!segments.equals("0") && !segments.equals("1")) {
            throw new IllegalArgumentException("Invalid segment");
        }
        if (segments.equals("1")) System.out.println("* * * * *");

    }

    private void display1(String segments, String segment2) {
        if (!segments.equals("0") && !segments.equals("1")) {
            throw new IllegalArgumentException("Invalid segment");
        }


        if (segments.equals("1") && segment2.equals("1"))
            for (int index = 0; index < 4; index++) System.out.println("*       *");

        if (segments.equals("1") && !segment2.equals("1"))
            for (int index = 0; index < 4; index++) System.out.println("*       ");

        if (!segments.equals("1") && segment2.equals("1"))
            for (int index = 0; index < 4; index++) System.out.println("        *");

    }

    private boolean isOn = true;
    private final int switchValue = 0;

    public boolean isOn() {
        return isOn;
    }

    public void turnOn() {
        if (switchValue == 1) {
            isOn = true;
        }
    }
}
