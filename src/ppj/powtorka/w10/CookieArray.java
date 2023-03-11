package ppj.powtorka.w10;

public
    class CookieArray {
    private Cookie[] tab;
    private int fill;

    public CookieArray(){
        this.tab = new Cookie[10];
        this.fill = 0;
    }

    public void add(Cookie cookie){
        tab[fill] = cookie;
        fill = fill + 1;
    }

    public Cookie getCookieAt(int index){
        return tab[index];
    }

    public int size(){
        return fill;
    }

    public void show(){
        System.out.println("====================");
        for(int i = 0; i < fill; i++)
            tab[i].show();
        System.out.println("^^^^^^^^^^^^^^^^^^");
    }

}
