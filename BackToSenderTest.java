import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BackToSenderTest {
    private BackToSender backToSender;
    @BeforeEach
    public void initializer(){
        backToSender = new BackToSender();
    }
    @Test
    public void testWhenCollectionRateIsLessThan50Percentage(){
        double percentageRate = backToSender.percentageRate(80);
        double ridersDailyWage = backToSender.calculateDailyWage(percentageRate);
        assertEquals(45000, ridersDailyWage);
    }

    @Test
    public void testWhenCollectionRateIsBetween50To69Percentage(){
        double percentageRate = backToSender.percentageRate(25);
        double ridersDailyWage = backToSender.calculateDailyWage(percentageRate);
        assertEquals(9000, ridersDailyWage);
    }
    @Test
    public void testWhenCollectionRateIsAboveTheRate(){
        assertThrows(IllegalArgumentException.class,()-> backToSender.calculateDailyWage(120));
    }
    @Test
    public void testWhenCollectionRateIsNegative(){
        assertThrows(IllegalArgumentException.class,()-> backToSender.calculateDailyWage(-50));
    }

}
