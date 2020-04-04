package JVM;

public class StringIntern {
    public static void main(String[] args) {
        String str1 = new StringBuilder("String1").append("String2").toString();
        System.out.println(str1.intern() == str1);

        String str2 = new StringBuilder("Java").append("Java").toString();
        System.out.println(str2.intern() == str2);
    }
}
