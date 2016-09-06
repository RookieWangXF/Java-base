package cn.rookie;

/**
 * Hello world!
 */

class Bowl {
    int j = 0;
    Bowl(int marker) {
        System.out.println("Bowl(" + marker + ")");
    }
    public void f1(int marker) {
        System.out.println("f1(" + marker + ")");
    }
    private final Bowl b = new Bowl(5);
    static {
        System.out.println("staticBowl");
    }


}

class Table{

    int i;
    {
        i = 9;
    }
    static Bowl bowl1 = new Bowl(1);

    Table() {
        System.out.println("Table()");
        bowl2.f1(2);
    }
    public void f2(int marker) {
        System.out.println("f2(" + marker + ")");
    }
    static Bowl bowl2 = new Bowl(2);
    static {
        System.out.println("staticTable");
    }
}
public class App 
{
    /*static Table table = new Table();
    static {
        System.out.println("static");
    }*/

    public static void main( String[] args )
    {
        System.out.println("App");
        Table table = new Table();
        Class clazz = table.getClass();
    }
}
