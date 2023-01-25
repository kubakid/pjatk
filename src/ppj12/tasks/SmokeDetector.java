package ppj12.tasks;

public class SmokeDetector{

    public static void check(boolean isSmoke) throws Alarm{
        if (isSmoke)
            throw new Alarm();
    }

//    public static void checkB(boolean isSmoke) throws Exception{
//
//        if(isSmoke){
//            throw new Exception("Exception");
//        }
//        System.out.println(5555);
//    }
//
//
//    public static void checkC(boolean isSmoke) throws RuntimeException{
//        if (isSmoke) {
//            System.out.println(444);
//            throw new RuntimeException("oops");
//        }
//
//    }


}
