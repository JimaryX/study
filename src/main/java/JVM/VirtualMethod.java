package JVM;

import javax.sound.midi.SoundbankResource;

public class VirtualMethod extends FinalClass{
    @Override
    public final void demo(){
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
