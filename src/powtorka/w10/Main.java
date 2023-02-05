package powtorka.w10;

public
    class Main {

    public static void main(String[] args) {

        CookieArray arr = new CookieArray();
        Cookie rCookie = new Cookie( 10, "rodzynki");
        arr.add(rCookie);

        rCookie = new Cookie(20);
        rCookie.show();

        arr.add(rCookie);
        arr.show();
        arr.add(rCookie.getHalf());
        arr.show();
        arr.getCookieAt(0).getHalf();
        arr.getCookieAt(0).getHalf();
        arr.getCookieAt(0).getHalf();
        arr.getCookieAt(0).getHalf();
        arr.show();

        // =============================

        System.out.println(
            rCookie.getWeight()
        );

        rCookie.setWeight(100);

/*
        Cookie[] tab = new Cookie[10];

        Cookie rCookie = new Cookie( 10, "rodzynki");
        tab[0] = rCookie;

        rCookie = new Cookie(20);
        rCookie.show();

        tab[1] = rCookie;

        System.out.println("==============");

        for(int i=0; i<2; i++)
            tab[i].show();

        tab[2] = rCookie.getHalf();

        System.out.println("==============");

        for(int i=0; i<3; i++)
            tab[i].show();

 */
    }

}