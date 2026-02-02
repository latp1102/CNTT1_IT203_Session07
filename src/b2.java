public class b2 {
    String name;

    public static void main(String[] args) {
        int a=1;
        int b=a;
        b=2;
        System.out.println("a: " + a);
        System.out.println("b: " + b);
        b2 s1 = new b2();
        s1.name="A";
        b2 s2 = s1;
        s2.name="B";
        System.out.println("s1: " + s1.name);
        System.out.println("s2: " + s2.name);
    }

}

