package ppj.powtorka.w11;

public
    class Student
    extends Person {

    protected int sNumber;

    public Student(
        String name, int birthYear,
        int sNumber
    ){
        super( name, birthYear);
        this.sNumber = sNumber;
    }

    public Student(
        Person person,
        int sNumber
    ){
        super(
            person.name,
            person.birthYear
        );
        this.sNumber = sNumber;
    }

    public String whoAreYou(){
        return super.whoAreYou()+
                " -> Student("+sNumber+")";
    }

    public String toString(){
        return super.toString()+
                " -> Student("+sNumber+")";
    }

}
