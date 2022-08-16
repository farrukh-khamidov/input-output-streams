package test;

import java.io.Serializable;

public class C implements Serializable {
    private int v1;
    private static double v2;
    private transient A v3 = new A();
}
