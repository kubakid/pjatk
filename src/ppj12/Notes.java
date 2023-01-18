package ppj12;

public class Notes {

    //WYJATKI

    // dwa wyjscia - system out i system error . kod

    // sa dwie niezalezne od siebie kolejki , są to strumienie wyjściowe.


    // jezeli output mamy w konsoli i niektóre rzeczy idą na out a niektóre na error to kolejnosc ich jest randomowa,
    // aby tak sie nie działo należy wrzucić wszystko do strumienia out - czyli do jednej kolejki
    // System.out | System.error

    // w momencie kiedy w bloku try znajdzie błąd od razu z niego wychodzi


    // jezeli cos ma byc wyjątkiem to musi dziedziczyc po klasie Exception

    // jeśli metoda statyczna to mozna wywołąć ją bezposrednio z klasy , nie trzeba tworzyć obiektu tej klasy

    // Od metody main zaczyna się wywoływanie programu, metoda main nigdy nie powinna rzucać obiektami

    // nie zawsze opłaca się tworzyć cała oddzielna klasę jesli uzyjemy go tylko raz. można zastosować general
    // exception ( throw new Exception)
}
