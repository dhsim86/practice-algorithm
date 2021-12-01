package com.dongho.dev.inner;

public class InnerSample {

    class InstanceInner {
        //private int snumber = staticNumber;
        private int inumber = instanceNumber;
    }

    static class StaticInner {
        private int snumber = staticNumber;
        //private int inumber = instanceNumber;
    }

    private static int staticNumber = 0;
    private int instanceNumber = 0;

    public static void staticMethod() {
        StaticInner staticInner = new StaticInner();
        System.out.println(staticInner.snumber);

        //InstanceInner instanceInner = new InstanceInner();
        InnerSample innerSample = new InnerSample();
        InstanceInner instanceInner = innerSample.new InstanceInner();
        System.out.println(instanceInner.inumber);
    }

    public void instanceMethod() {
        StaticInner staticInner = new StaticInner();
        System.out.println(staticInner.snumber);

        InstanceInner instanceInner = new InstanceInner();
        System.out.println(instanceInner.inumber);
    }

}
