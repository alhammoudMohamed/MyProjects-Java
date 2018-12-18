package JavaWeek6.Exercise1;

public class HotAirBalloonApplication {
    public static void main(String[] args) {
        SmallHotAirBalloon smallBalloon = new SmallHotAirBalloon();
        System.out.println("...SmallBalloon...");
        smallBalloon.liftUp();
        smallBalloon.land();
        System.out.println("....BigBalloon");
        BigHotAirBalloon bigBalloon = new BigHotAirBalloon();
        bigBalloon.liftUp();
        bigBalloon.land();
        HotAirBalloon small = new SmallHotAirBalloon();
        HotAirBalloon big = new BigHotAirBalloon();
        System.out.println("....Big...");
        big.land();
        big.liftUp();
        System.out.println("....Small....");
        small.land();
        small.liftUp();



    }
}
