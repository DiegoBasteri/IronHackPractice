import Car.Car;
import Package_IntList.IntArrayList;
import Package_IntList.IntVector;
import VideosStreaming.Movie;
import VideosStreaming.TvSeries;

import org.w3c.dom.ls.LSOutput;
import Car.Sedan;
import Car.UtiltyVehicle;
import Car.Truck;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {
    public static void main(String[] args) {

        BigDecimal number = new BigDecimal("2.2545").setScale(4, RoundingMode.HALF_UP);

        System.out.println(number);
        System.out.println(doubleReturn(number));


        BigDecimal number2 = new BigDecimal("1.2345").setScale(1, RoundingMode.HALF_UP);

        System.out.println(number2);
        System.out.println(reverseNumber(number2));

        Car auto1 = new Sedan(123456, "Ford", "Explorer", "100000 KM");
        System.out.println(auto1.toString());

        Car auto2 = new Truck(45132, "Chevrolet", "F1", "0KM", 1000);
        Car auto3 = new UtiltyVehicle(741258, "Doge", "RAM", "0KM", true);


        TvSeries Friends = new TvSeries("Friends", 40, "4K", "Netflix", 8, "Netflix", "1990");
        System.out.println(Friends.toString());

        IntArrayList list = new IntArrayList();
        IntVector list2 = new IntVector();

        for(int i = 0; i < 15;i++){
            list.addNumber(i);
        }

        for(int i = 0; i < 15;i++){
            list2.addNumber(i);
        }

        System.out.println(list2.toString());
        System.out.println(list.toString());




    }
        public static double doubleReturn (BigDecimal number){
            return number.setScale(2, RoundingMode.HALF_UP).doubleValue();
        }

        public static BigDecimal reverseNumber (BigDecimal number2){

            return BigDecimal.ZERO.subtract(number2.setScale(1, RoundingMode.HALF_UP));
        }



}




