package ppj11.wyklad.tasks;

public class Phrase {

    private String phrase;

    public Phrase(String phrase) {
        this.phrase = phrase;
    }

    public void addWordAtEnd (String Word){
        this.phrase += " " + Word;
    }

    public void show(){
        System.out.println(phrase);
    }


    //spytac sie o drugą metode
}
