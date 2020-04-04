package JVM;

public class ObjectCreate {
    public int num;
    public double count;
    public boolean bool;
    public String str;

    @Override
    public String toString() {
        return "ObjectCreate{" +
                "num=" + num +
                ", count=" + count +
                ", bool=" + bool +
                ", str='" + str + '\'' +
                '}';
    }

    public static void main(String[] args) throws InterruptedException {
        ObjectCreate obj = new ObjectCreate();
        while (true)
            Thread.sleep(5000);
//        System.out.println(obj.toString());
    }
}
