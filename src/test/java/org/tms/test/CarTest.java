package org.tms.test;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.tms.model.Car;


public class CarTest {

@Test
    public void compareCarsTest(){
        Car car1 = new Car("Volvo", "3");
        Car car2 = new Car("Volvo", "3");
        Car car3 = Car.builder()
                .brand("ww")
                .model("4")
                .build();
        Assert.assertEquals(car1,car2);
    }
}
