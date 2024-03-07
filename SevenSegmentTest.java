import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SevenSegmentTest {
    private  SevenSegment sevenSegment;
    @BeforeEach
    public void initializer(){
        sevenSegment = new SevenSegment();
        sevenSegment.turnOn();
    }
    @Test
    public void checkIfItOn(){
        assertTrue(sevenSegment.isOn());
    }

    @Test
    public void inputTest() {
        sevenSegment.splittingIntoArray("1111111");
    }

    @Test
    public void inputTest1() {
        sevenSegment.splittingIntoArray("0110000");
    }

    @Test
    public void inputTest2() {
        sevenSegment.splittingIntoArray("1101101");
    }
    @Test
    public void inputTest3() {
        sevenSegment.splittingIntoArray("1111001");
    }

    @Test
    public void inputTest4() {
        sevenSegment.splittingIntoArray("0110011");
    }

    @Test
    public void inputTest5() {
        sevenSegment.splittingIntoArray("1011011");
    }
    @Test
    public void inputTest6() {
        sevenSegment.splittingIntoArray("1011111");
    }

    @Test
    public void inputTest7() {
        sevenSegment.splittingIntoArray("1110000");
    }
    @Test
    public void inputTest8() {
        sevenSegment.splittingIntoArray("1111111");
    }
    @Test
    public void inputTest9() {
        sevenSegment.splittingIntoArray("1110011");
    }

    @Test
    public void testInvalidInput() {
        assertThrows(IllegalArgumentException.class, () -> sevenSegment.splittingIntoArray("123310101"));
    }

    //@Test
    //public void testInvalidInput1(){
      //  assertThrows(IllegalArgumentException.class, () -> sevenSegment.splittingIntoArray("100110101"));

    //}
}
