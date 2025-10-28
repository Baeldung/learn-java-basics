public class Main {
    
    /**
     * Entry point for the lesson examples.
     * This is a minimal Javadoc that tools can read.
     */
    public static void main(String[] args) {
        
        int sum = 2 + 3;
        sum = sum + 10;

        {
            int doubled = sum * 2;
        }
        
        // single-line comment introducing the next statement
        System.out.println("greeting: Hello"); // another single-line comment
        
        // single-line comment to disable a statement
        // System.out.println("This line won't be executed");
        
        /*
           multi-line comment for longer notes
           that span several lines,
           or to disable a block of statements
        */
        
        int outside = 10;
        {
            int inside = outside + 5;
        }
        System.out.println(outside);
        // System.out.println(inside); // doesn't compile

        int myVar = 5;
        {
            // int myVar = 99; // does not compile: duplicate local variable 'myVar'
        }
        
        int a = 5;
        System.out.println(a);
        a = 12;
        System.out.println(a);

        int add = 2 + 3;
        int diff = 7 - 4;
        int product = 6 * 3;
        int quotientInt = 7 / 2;
        int remainder = 7 % 2;
        System.out.println(add);
        System.out.println(diff);
        System.out.println(product);
        System.out.println(quotientInt);
        System.out.println(remainder);
        


        System.out.println(0.1 + 0.2);
                
        int i1 = 7;
        i1 += 2;
        System.out.println(i1);

        int p = 3;
        int q = 5;
        int r = 3;
        System.out.println(p == r);
        System.out.println(p != q);
        System.out.println(q > p);
        System.out.println(p <= r);
        System.out.println(q >= 5);

        int age = 20;
        boolean hasTicket = true;
        boolean canEnter = (age >= 18) && hasTicket;
        System.out.println(canEnter);

        int denom = 0;
        boolean safe = (denom != 0) && ((10 / denom) > 1);
        System.out.println(safe);
        
        int counter = 10;
        counter++;
        System.out.println(counter);

        int number = 10;
        ++number;
        System.out.println(number);

        int down1 = 3;
        down1--;
        System.out.println(down1);

        int down2 = 3;
        --down2;
        System.out.println(down2);

        int y = 5;

        int after  = y++;
        int before = ++y;

        System.out.println(after);
        System.out.println(before);
        System.out.println(y);
        
        int result1 = 2 + 3 * 4;
        int result2 = (2 + 3) * 4;
        System.out.println(result1);
        System.out.println(result2);
        
        int leftToRightSubtraction = 20 - 5 - 3;
        System.out.println(leftToRightSubtraction);

        int n = 0;
        int m = 0;
        n = m = 4;
        System.out.println(n);
        System.out.println(m);
        
    }

}
