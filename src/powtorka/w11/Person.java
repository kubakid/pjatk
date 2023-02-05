package powtorka.w11;

public
    class Person
    extends Object{

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


}
