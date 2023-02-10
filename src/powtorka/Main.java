package powtorka;




public class Main {
    public static void main(String[] args) {
//============================================================================ task1
        int[] arr = {0b0001, 0x3, '\u0006', 9, 0b0010, 05, 0x07};
        int val = arr[0];
        for (int k = 0; k < arr.length;){
            if (arr[k++] < val){
                val = arr[k];
                System.out.println(val*9);
            } else
                System.out.println((arr[k+1]));
        }

        // output 6 9 2 5 7 ArrayInderOutOfBoundsException

//        ======================================================================= task2
//        A a1 = new A(3.14);
//        System.out.println(a1.val);
//        System.out.println(a1.a.val);


        // task3============================================
//        A a = new A();
//        a.methodOne();

// task 4 ==========================================================


//        int wrt = -1;
//
//        if((wrt = 0) >= 0)
//            while(wrt < 0b11)
//                if (wrt++ < 0x0000_0001)
//                    System.out.println("A");
//        else
//                    System.out.println("B");


        //========================================= task5

//        int[] myArray = {, 4,0,-1,2,7,-3};
//        int val = Integer.MAX_VALUE;
//        int buf = Integer.MIN_VALUE;
//        for(int i = 0; i < myArray.length; i++)
//            if(myArray[i] == val)
//                buf = val;
//            else
//                if (myArray[i] < val){
//                    buf = val;
//                    val = myArray[i];
//                } else
//                    if(myArray[i] < buf)
//                        buf = myArray[i];
//            System.out.println(buf);


        ////////////=====================================================task 6
//        A a1 = new A("First");
//        A a2 = new A("Second");
//        a1.a = a2;
//        a2.a = a1;
//
//        System.out.println(a1.a.s);
//        System.out.println(a2.a.s);

        //========================== task 7

//        N n = new N(26);
//        System.out.println(n.i);



    }
}



