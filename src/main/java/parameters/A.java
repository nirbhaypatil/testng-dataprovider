package parameters;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class A {

    @Parameters({"s","in","b"})
    @Test
    public void testmethod(String s,int in , boolean c ){

        System.out.println("String value "+ s);
        System.out.println("In value "+ (in+in));
        System.out.println("Boolean value "+ c);
    }
}
