package powtorka.w1314;

import java.io.Serializable;
import java.util.Objects;

public
    class Person
    extends Object
    implements Serializable {

    protected String name;
    protected int birthYear;

    public Person(
        String name, int birthYear
    ) {
        this.name = name;
        this.birthYear = birthYear;
    }

    public Person(){
        this( "Noname", 9999);
    }

    public String whoAreYou(){
        return "Person("+
            this.name+", "+
            this.birthYear+")";
    }

    public String toString(){
        return super.toString()+
            "Person("+
            this.name+", "+
            this.birthYear+")";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return birthYear == person.birthYear && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, birthYear);
    }
}
