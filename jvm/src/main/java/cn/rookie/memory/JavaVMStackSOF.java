package cn.rookie.memory;

/**
 * Created by Rookie on 2016/5/14.
 * Package_name is cn.rookie.memory
 * Description: 使得stack溢出
 */
public class JavaVMStackSOF {
    private long stackLength = 1;

    public void stackLeak() {
        stackLength++;
        stackLeak();
    }

    public static void main(String[] args) {
        System.out.println("JavaVMStackSOF");
        JavaVMStackSOF oom = new JavaVMStackSOF();
        try {
            oom.stackLeak();
        } catch (Exception e) {
            System.out.println(oom.stackLength);
            throw e;
        }
    }
}
