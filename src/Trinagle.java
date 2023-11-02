import static java.lang.StringTemplate.STR;

public class Trinagle {
    int a;
    int b;
    int c;

    public Trinagle(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Trinagle(){}

    public void area() {
        int result = (a + b + c) /2;
        System.out.println(STR."""
                Uch burchtuktun ayanty:
                    A: \{a}
                    B: \{b}
                    C: \{c}
                Ayanty: \{result}
                  """);

    }
}
