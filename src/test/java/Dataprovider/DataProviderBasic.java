package Dataprovider;

import demo.D;
import org.testng.annotations.DataProvider;

public class DataProviderBasic extends D {


    @DataProvider
    public Object[] studentData() {
        Object[] data = new Object[3];
        data[0] = "Make";
        data[1] = "Selenium";
        data[2] = "Easy";
        return data;
    }

    // A data provider method with return type as 2D array
    @DataProvider
    public Object[][] employeeData() {

        return new Object[][]
                {
                        {"Mukesh", "Otwani", "Motwani@gmail.com"},
                        {"Amod", "Mahajan", "Amahajan@hotmail.com"},
                        {"Animesh", "Prashant", "aprashant@gmail.com"},
                        {"Ankur", "Singh", "asingh@gmail.com"},
                        {"Amritansh", "Kumar", "akumar@gmail.com"}

                };
    }
}
