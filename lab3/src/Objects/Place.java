package Objects;

import Enums.Conditions;
import Enums.CoordinateEnum;
import Interfaces.Amplifiable;
import Interfaces.Coordinate;
import Interfaces.Property;

import java.sql.Time;
import java.util.Objects;

public class Place extends Obj implements Coordinate, Property, Amplifiable {
    final String name;

    public Place(String name){
        super(name);
        this.name = name;
    }
    @Override
    public void getCoordinate(CoordinateEnum xyz){
        if (xyz == CoordinateEnum.NoCoordinate){
            super.name = super.name;
        }

    }
    @Override
    public void getCoordinate(Place place){
        super.name = super.name + " в " + place.name;
    }
    @Override
    public void getProperty(String property){
        super.name = super.name + " " + this.name;
        super.name = super.name+" "+property;
    }
    @Override
    public void amplify(Conditions conditions){
        if (conditions == Conditions.ThatIs){
            System.out.print("что это "+ super.name + "a");
        }
    }



}