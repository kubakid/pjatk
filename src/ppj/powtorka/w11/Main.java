package ppj.powtorka.w11;

//import protTest.MyProtectedClass;

public
    class Main {

    public static void main(String[] args) {
        A a = new A(10);
        System.out.println(a.field);
        System.out.println(a.equals(null));
        B b = new B();

        Two two = new Two();
        two.showSum(30);
        // =====

        System.out.println(a.toString());
        System.out.println(b.toString());
        System.out.println(two.toString());

//        MyProtectedClass myProtectedClass = new MyProtectedClass();
//        System.out.println(
//            "mpc_public: "+myProtectedClass.publicVal
//        );
//        System.out.println(
//            "mpc_protected: "+myProtectedClass.protectedVal
//            "mpc_private: "+myProtectedClass.privateVal
//        );

// ===============================================================
        Person person = new Person("Ala", 1986);
        System.out.println(person.whoAreYou());

        Student student = new Student("Jan", 2000, 12345);
        System.out.println(student.whoAreYou());

        Person[] pTab = { person, student};
        for(Person personVal : pTab)
            System.out.println(">"+personVal.whoAreYou());

        Object[] objects = { person, student};
        for(Object object : objects)
            System.out.println("->"+object.toString());
    }

}
