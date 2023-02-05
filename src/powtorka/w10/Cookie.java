package powtorka.w10;

public
    class Cookie {
    private int weight;
    private final String ingredient;

    public Cookie(int weight, String ingredient){
        this.weight = weight;
        this.ingredient = ingredient;
    }

    public Cookie(int weight){
        this( weight, "czekolada");
/*
        this.weight = weight;
        this.ingredient = "czekolada";
*/
    }

    public void show(){
        System.out.println(
            "Cookie: "+this.weight+" "+this.ingredient
        );
    }

    public Cookie getHalf(){
        int newWeigth = this.weight / 2;
        this.weight = newWeigth;
        return new Cookie( newWeigth, this.ingredient);
    }

    public String getIngredient(){
        return this.ingredient;
    }

    public int getWeight(){
        return this.weight;
    }

    public void setWeight(int weight){
        System.out.println(
            "Waga ciasteczka nie może ulec zmianie."
        );
    }

}
