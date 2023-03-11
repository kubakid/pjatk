package ppj.powtorka.w12;

public
    class Main {

    public static void main(String[] args) {
        int[] tab = {1, 2, 3};
        try {
            System.out.println(tab[3]);
        }catch (ArrayIndexOutOfBoundsException ex){
            System.out.println("wyjscie poza tablice");
        }

        // =================================

        Rocket rocket = new Rocket(80);
        for(int i=0; i<3; i++) {
            try {
                rocket.start();
                System.out.println("rocket start");
                i = 3;
            } catch (FullLimitException e) {
                System.out.println("tankujemy dodatkowe paliwo");
                rocket.fillFule(50);
            } catch (EngineException ex){
                ex.printStackTrace();
            }
        }
    }
}
