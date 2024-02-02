package fc.java.part3;

import fc.java.model.CarDTO;

import java.util.Scanner;

public class CarTest {
    public static void main(String[] args) {
        // Q. 자동차 정보를 [키보드로부터 입력] 받아 [다른 메서드]로 이동
        Scanner scanner = new Scanner(System.in);

        System.out.println("자동차 정보를 입력하세요.");

        System.out.print("일련번호:");
        int carSn = scanner.nextInt();
        scanner.nextLine();

        System.out.print("가격:");
        int carPrice = scanner.nextInt();
        scanner.nextLine();

        System.out.print("소유자:");
        String carOwner = scanner.nextLine();

        System.out.print("연식:");
        int carYear = scanner.nextInt();
        scanner.nextLine();

        System.out.print("타입:");
        int carType = scanner.nextInt();
        scanner.nextLine();

        //System.out.println(carSn + "\t" + carPrice + "\t" + carOwner + "\t" + carYear + "\t" + carType);
        //carInfoPrint(carSn, carPrice, carOwner, carYear, carType);
        CarDTO car = new CarDTO();
        car.carSn = carSn;
        car.carOwner = carOwner;
        car.carPrice = carPrice;
        car.carType = carType;
        car.carYear = carYear;
        carInfoPrint(car);
    }

    // Q. 매개 변수로 자동차의 정보를 받아서 출력하는 메서드를 정의하세요.
    //public static void carInfoPrint(int carSn, int carPrice, String carOwner, String carYear, String carType) {
    public static void carInfoPrint(CarDTO car) {
        //System.out.println(carSn + "\t" + carPrice + "\t" + carOwner + "\t" + carYear + "\t" + carType);
        System.out.println(car.carSn + "\t" + car.carPrice + "\t" + car.carOwner + "\t" + car.carYear + "\t" + car.carType);
    }
}
