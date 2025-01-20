// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.security.AlgorithmParameters;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import java.nio.charset.Charset;


class test {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
// Algorithm ParameterSpec ivSpec = new IvParameterSpec(ivBytes);

        byte[] ivBytes = new byte[16]; 

        IvParameterSpec ivSpec = new IvParameterSpec(ivBytes);
        System.out.println(new String(ivBytes, Charset.forName("UTF-8")));      
}
}