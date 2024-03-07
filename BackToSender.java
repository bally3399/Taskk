public class BackToSender {


    public static double percentageRate(int numberOfParcelDelivered) {
        int numberOfPackagesAssignedDaily = 100;
        return ((double) numberOfParcelDelivered / numberOfPackagesAssignedDaily) * 100.0;
    }

    public static double calculateDailyWage(double percentageRate) {
        if(percentageRate < 0 || percentageRate > 100) throw new IllegalArgumentException("Input invalid");
        if(percentageRate >0 && percentageRate < 50){
            return getDailyWageFor(percentageRate, 160);
        } else if (percentageRate > 50 && percentageRate <= 59) {
            return getDailyWageFor(percentageRate, 200);
        }else if (percentageRate > 60 && percentageRate <= 69){
            return getDailyWageFor(percentageRate, 250);
        } else if (percentageRate >= 70) {
            return getDailyWageFor(percentageRate, 500);
        }

        return percentageRate;
    }

    public static double getDailyWageFor(double percentageRate, int amountPerParcel){
        int basePay = 5000;
        return percentageRate * amountPerParcel + basePay;
    }
}
