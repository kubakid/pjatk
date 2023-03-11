package ppj.powtorka.w1314;

import java.util.Objects;

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

    public boolean equals(Object obj){
        if(obj == null)
            return false;
        if(this == obj)
            return true;
        if(!(obj instanceof Student))
            return false;
        Student student = (Student) obj;
        return this.sNumber == student.sNumber
                && super.equals(obj);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), sNumber);
    }
}
