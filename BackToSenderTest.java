import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BackToSenderTest {
    @Test
    public void testWhenCollectionRateIsLessThan50Percentage(){
        double percentageRate = BackToSender.percentageRate(80);
        double ridersDailyWage = BackToSender.calculateDailyWage(percentageRate);
        assertEquals(45000, ridersDailyWage);
    }

    @Test
    public void testWhenCollectionRateIsBetween50To69Percentage(){
        double percentageRate = BackToSender.percentageRate(25);
        double ridersDailyWage = BackToSender.calculateDailyWage(percentageRate);
        assertEquals(9000, ridersDailyWage);
    }
    @Test
    public void testWhenCollectionRateIsAboveTheRate(){
        assertThrows(IllegalArgumentException.class,()-> BackToSender.calculateDailyWage(120));
    }
    @Test
    public void testWhenCollectionRateIsNegative(){
        assertThrows(IllegalArgumentException.class,()-> BackToSender.calculateDailyWage(-50));
    }

}
