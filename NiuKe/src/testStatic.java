
public class testStatic {
    private static int x = 100;

    public static void main(String args[]) {
        testStatic hs1 = new testStatic();
        hs1.x++;
        testStatic hs2 = new testStatic();
        hs2.x++;
        hs1 = new testStatic();
        hs1.x++;
        testStatic.x--;
        System.out.println("x=" + x);
    }
}

