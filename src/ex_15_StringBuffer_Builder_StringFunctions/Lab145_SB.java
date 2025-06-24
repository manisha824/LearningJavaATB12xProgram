package ex_15_StringBuffer_Builder_StringFunctions;

public class Lab145_SB {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("Manisha");
        stringBuffer.append("Mohanty");
        System.out.println(stringBuffer);

        String s1 = "Manisha";
        s1 = s1+ "Mohanty";
        System.out.println(s1);

    }
}
