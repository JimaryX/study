package Overview;

import java.util.Arrays;

public class CompareInterface implements Comparable {
    private int age;
    private String name;

    public CompareInterface(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "CompareInterface{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        CompareInterface[] compares = new CompareInterface[4];
        compares[0] = new CompareInterface(15, "Tom");
        compares[1] = new CompareInterface(10, "Marry");
        compares[2] = new CompareInterface(23, "Lily");
        compares[3] = new CompareInterface(17, "Somith");

        int[] a = {2, 5, 10, 3, 8, 0};

        System.out.println("before: " + Arrays.toString(compares));
        System.out.println("before: " + Arrays.toString(a));

        Arrays.sort(compares);
        Arrays.sort(a);

        System.out.println("after: " + Arrays.toString(a));
        System.out.println("after: " + Arrays.toString(compares));
    }

    @Override
    public int compareTo(Object o) {

        if (o instanceof CompareInterface) {
            CompareInterface c = (CompareInterface) o;
            if (this.age > c.age) {
                return 1;
            } else if (this.age == c.age){
                return 0;
            } else {
                return -1;
            }
        }
        return 0;
    }
}
