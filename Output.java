public class Input {

    public static void main(String[] args) {

        int a = 0, e, f = 3;

        System.out.println("a = " + a);

        System.out.println("f = " + f);

        int b, c;

        int g = c = a = 1;

        System.out.println("g = " + g);

        b = 1;
        System.out.println("b = " + b);
        g = c = a = 1;
        System.out.println("g = " + g);
        System.out.println("c = " + c);
        System.out.println("a = " + a);
        b = ++c;

        System.out.println("b = " + b);

        System.out.println("c = " + c);

        ++a;

        System.out.println("a = " + a);

        a += 3;

        System.out.println("a = " + a);

        for(int i = 0; i < 10; ++i) {
            String aString = "hello";
        System.out.println("aString = " + aString);
        }

        Boolean flag;
        switch(flag) {
            case (a = 5):
              System.out.println("a = " + a);
              // code block
              break;
            case (b = 10):
              System.out.println("b = " + b);
              // code block
              break;
            default:
              // code block
          }
        
    }
}