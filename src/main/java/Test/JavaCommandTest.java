package Test;

public class JavaCommandTest {
    public static void main(String[] args) throws InterruptedException {
        int i = 0;
        while (true){
            System.out.println(i);
            i++;
            Thread.sleep(2000);
        }
    }
}
