package demo;

import Dataprovider.DataProviderBasic;
import Dataprovider.DataProviderExcel;
import org.testng.annotations.Test;

public class CTest extends D {


    @Test(dataProvider = "getData" , dataProviderClass = DataProviderExcel.class)
    public void methodWithSingleAttribute( int a, String b , String c, String d,String gender) {
        System.out.println(a+"\t"+b+"\t"+c+"\t"+d+"\t"+gender);
    }

    @Test(dataProvider = "employeeData" , dataProviderClass = DataProviderBasic.class)
    public void m3(String a , String b , String c){
        System.out.println(a+"\t"+b+"\t"+c);
    }
}
