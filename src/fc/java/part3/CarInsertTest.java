package fc.java.part3;

import fc.java.model.CarDAO;
import fc.java.model.CarDTO;

import java.util.Scanner;

public class CarInsertTest {
    public static void main(String[] args) {
        // Q. 자동차 정보를 키보드로부터 입력을 받아서 DB에 저장하세요.
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
        String carType = scanner.nextLine();
        scanner.nextLine();

        //System.out.println(carSn + "\t" + carPrice + "\t" + carOwner + "\t" + carYear + "\t" + carType);
        //carInfoPrint(carSn, carPrice, carOwner, carYear, carType);
        CarDTO car = new CarDTO();
        car.carSn = carSn;
        car.carOwner = carOwner;
        car.carPrice = carPrice;
        car.carType = carType;
        car.carYear = carYear;

        CarDAO dao = new CarDAO();
        dao.carInsert(car);
        dao.carSelect();
    }
}
