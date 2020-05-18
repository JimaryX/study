package Overview;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Logger;

public class CatchException {
    public int catchWorry(int n) {
        Logger.getGlobal().info("The args is " + n);
        try {
            return n * n;
        } finally {
            return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println(new CatchException().catchWorry(3)); // 返回值为 0， 无论如何都会执行finally语句，nb！

        /**
         * 使用 try(Resource res = ...) {
         *
         *      } 来处理带资源的 try 语句 会非常方便，不需要写多重的try...catch..
         */
//        try (Scanner in = new Scanner(new FileInputStream("/usr/share/words.txt"), "utf-8")) {
//            while (in.hasNext()) {
//                System.out.println(in.nextLine());
//            }
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
    }
}
