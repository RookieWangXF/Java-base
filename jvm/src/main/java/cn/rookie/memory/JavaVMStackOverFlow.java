package cn.rookie.memory;

/**
 * Created by Rookie on 2016/5/14.
 * Package_name is cn.rookie.memory
 * Description: 使得stack溢出
 */
public class JavaVMStackOverFlow {

    private static int stackLength = 0;

    public void stackLeak() {
        System.out.println("the stack frame depth is : " + (++stackLength));
        stackLeak();
    }

    public static void main(String[] args) {
        System.out.println("JavaVMStackOverFlow");
        JavaVMStackOverFlow oom = new JavaVMStackOverFlow();
        try {
            oom.stackLeak();
        } catch (Exception e) {
            System.out.println("the stack frame depth is : " + (++stackLength));
            throw e;
        }
    }
}
