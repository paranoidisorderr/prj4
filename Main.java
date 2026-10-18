package ivan.homework6;

import java.sql.SQLOutput;

public class Main {
    static void main(String[] args) {
        Phone samsung = new Phone(25, "A", 125.5);
        Phone iphone = new Phone(16, "Pro", 145);
        Phone huawei = new Phone(40, "P", 130);


        //samsung
        System.out.println(samsung.model);
        System.out.println(samsung.number);
        System.out.println(samsung.weight);

        //iphone
        System.out.println(iphone.weight);
        System.out.println(iphone.number);
        System.out.println(iphone.model);

        //huawei
        System.out.println(huawei.model);
        System.out.println(huawei.number);
        System.out.println(huawei.weight);


        //getting numbers
        samsung.getNumber();
        iphone.getNumber();
        huawei.getNumber();

        iphone.recieveCall("ivan", 802955544941L);

    }
}