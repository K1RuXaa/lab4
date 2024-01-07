package Objects;
import Exceptions.InputException;
import Exceptions.WeatherException;

import Enums.Conditions;
import Enums.CoordinateEnum;
import Interfaces.Amplifiable;
import Interfaces.Implied;
import Interfaces.Property;
import java.util.Random;

import java.util.Objects;

public class Thing extends Obj implements Property, Amplifiable, Implied {
    final String name;
    public boolean flagi;
    public boolean WhereAmI = true;
    public String statmentOutside,statementInside;

    public Thing(String name){
        super(name);
        this.name = name;
    }
    public static class EndSentence{ //статик вложенный класс
        public static void endMessage(String str){
            System.out.print(str+ " ");
        }
    }
    @Override
    public void getProperty(String property){
        super.name = this.name;
        super.name = property + " " + super.name;
    }
    @Override
    public void amplify(Conditions conditions){
        if (conditions == Conditions.ThatIs){
            System.out.print(" что это просто " + super.name  );
        } else if (conditions==Conditions.That) {
            System.out.print(this.name + " что было ");

        }
    }
    @Override
    public void implie(Place place){
        super.name = this.name + " " + place.name;
    }
    public  void  implie(Obj e){
        System.out.print(super.name +" " + e.name + "и" + ",сухую бутылку и сухую пробку");

    }
    public void getStatement(CoordinateEnum coordinate){
        //if (coordinate == CoordinateEnum.OutSide){
            System.out.print("из thing");
        //}

    }
    public void processInput(String inputstring) throws InputException {

    }
}