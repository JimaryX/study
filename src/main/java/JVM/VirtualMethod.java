package JVM;

import javax.sound.midi.SoundbankResource;

/**
 * 重载时，虚拟机通过参数的静态类型决定使用哪个重载版本；
 * 此处时根据实际类型来调用函数的
 */
public class VirtualMethod extends FinalClass{
    @Override
    public void demo(){
        System.out.println("virtualmethod");
    }
    public static void main(String[] args) {
        VirtualMethod v = new VirtualMethod();
        v.demo();
        FinalClass f = v;
        f.demo();
    }
}

class FinalClass {
    public void demo() {
        System.out.println("FinalClass");
    }
}
