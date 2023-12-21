package Objects;

import Enums.Time;

public class PlaceTime {

    public static void setTime(Time time){
        if (time == Time.Then){
            System.out.print("Потом ");
        }else if (time == Time.Sometimes){
            System.out.print(" порой ");
        } else if (time == Time.When) {
            System.out.print("Когда ");;
        } else if (time == Time.Earlier) {
            System.out.print("Накануне ");

        }

    }
}