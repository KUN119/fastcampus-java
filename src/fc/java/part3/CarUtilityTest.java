package fc.java.part3;

import fc.java.model.CarDTO;
import fc.java.model.CarUtility;

public class CarUtilityTest {

    public static void main(String[] args) {
        //Q. Car 정보를 출력하는 동작을 가지고 있는 Utility클래스를 설계하시오.
        int carSn = 1118;
        int carPrice = 900000000;
        String carOwner = "홍길동";
        int carYear = 2015;
        String carType = "G";

        CarDTO car = new CarDTO();
        car.carSn = carSn;
        car.carPrice = carPrice;
        car.carOwner = carOwner;
        car.carType = carType;
        car.carYear = carYear;
        //carPrint(car);

        CarUtility carUtil = new CarUtility();
        carUtil.carPrint(car);
    }

}
