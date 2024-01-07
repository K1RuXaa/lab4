package Objects;

import Enums.*;
import Interfaces.Coordinate;
import Interfaces.Implied;
import Interfaces.Property;
import Interfaces.Amplifiable;

import java.util.Locale;
import java.util.Objects;

public class Entity extends Obj implements Property, Coordinate,Amplifiable {

    //проверка игнорирующая регистр
    @Override
    public boolean equals(Object o) {
        Entity entity = (Entity) o;
        return Objects.equals(ending, entity.ending) && Objects.equals(name.toLowerCase(), entity.name.toLowerCase());
    }

    //сравнение по полу
    @Override
    public int hashCode() {
        return Objects.hash(ending);
    }

    //вывод имени и пола объекта
    @Override
    public String toString() {
        return "Entity{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                '}';
    }


    private String ending;
    final private String name;
    final private Gender sex;


    public Entity(String name, Gender sex){
        super(name);
        this.name = name;
        this.sex = sex;
        this.ending = sex.getName();

    }
    public void doSomethingAbSbSomeWhere(Action act, Place place,Obj e){
        switch (act)
        {case Put -> System.out.print(this.name + "положил " + ending + e.name  + "у"+ " в " + place.name + "у");

        }

    }
    public void doSomeThingSomeWhere(Action act, Place place){
        switch (act)
        {
            case Write -> System.out.print(super.name + " напишет что-нибудь " +place.name);
            case Put -> System.out.print(super.name + "в " + place.name+"у ");
            case Throw -> System.out.print("бросит " + place.name);
            case Wrote -> System.out.print(" и написал " + place.name);

        }
        /*if (act == Action.Write){
            System.out.print(super.name + " напишет что-нибудь " +place.name);
        } else if (act == Action.Put) {
            System.out.print(super.name + "в " + place.name+"у ");
        } else if (act == Action.Throw) {
            System.out.print("бросит " + place.name);

        } else if (act == Action.Wrote) {
            System.out.print(" и написал " + place.name);

        }*/
    }

    public void doSomething(Action act){
        switch (act)
        {
            case Clogged -> System.out.print(super.name + " закупорил " + ending);
            case DropOut ->  System.out.print(super.name+"не выпасть"+ending);
            case Watch ->  System.out.print(this.name + " следил" );
            case Swim -> System.out.print(super.name + " уплывает");
            case Hurt -> System.out.print(super.name + " не заболел"+ending);
            case Stand -> System.out.print(super.name + " стало ");
            case Seem -> System.out.print("казаться ");
            case Understood -> System.out.print(super.name + " понял");
            case Thinks -> System.out.print(super.name + " подумал ");
            case Stay -> System.out.print("оставалось сухого");
            case Started -> System.out.print(super.name + " начался,");
            case Sleep -> System.out.print(super.name + " спал.");
            case Tired -> System.out.println(super.name + " устал ");
        }
        /*if (act == Action.Clogged){
            System.out.print(super.name + " закупорил " + ending);

        }else if (act == Action.DropOut){
            System.out.print(super.name+"не выпасть"+ending);
        }else if (act == Action.Watch){
            System.out.print(this.name + " следил" );
        }else if (act == Action.Swim){
            System.out.print(super.name + " уплывает");
        }else if (act == Action.Hurt){
            System.out.print(super.name + " не заболел"+ending);
        }else if (act == Action.Stand){
            System.out.print(super.name + " стало ");
        }else if (act == Action.Seem){
            System.out.print("казаться ");
        }else if (act == Action.Understood){
            System.out.print(super.name + " понял");
        }else if (act == Action.Thinks){
            System.out.print(super.name + " подумал ");
        } else if (act == Action.Stay) {
            System.out.print("оставалось сухого");
        } else if (act == Action.Started) {
            System.out.print(super.name + " начался,");
        } else if (act == Action.Sleep) {
            System.out.print(super.name + " спал.");
        } else if (act == Action.Tired) {
            System.out.println(super.name + " устал ");

        }*/
    }

    public void doSomethingAboutSb(Action act, Obj e){
        switch (act)
        {
            case Put -> super.name = " положит " + e.name+ ending;
            case Watch -> System.out.print(super.name + " смотрел"+ ending + e.name);
            case Clogged -> System.out.print(super.name + " закупорил " + ending + e.name + "у");
            case LeanedOut -> System.out.print(super.name + " высунулся" + ending + " из " + e.name + "а");
            case Throw ->  System.out.print(super.name + "бросил" + ending + e.name + "у");
            case See -> System.out.print(super.name +" " + e.name + " никогда не увидит");
            case Search -> System.out.print(this.name + " обыскал " + e.name);
            case Found -> System.out.print(super.name + " нашел " + e.name);

        }



    }
    public void bothActions(Action act, Action act2){
        if (act == Action.Done  & act2 == Action.Could){
            System.out.print(super.name + " сделал" + ending +"все, что мог для своего спасения");
        } else if (act == Action.Goes && act2 == Action.Goes) {
            System.out.print(super.name + "лил и лил");
        } else if (act == Action.Sleep && act2 == Action.Sleep) {
            System.out.print(this.name + " спал,спал и спал");

        }
    }
    public void bothActions(Action act, Action act2,Obj e) {
        if (act == Action.Come & act2 == Action.Save) {
            System.out.print(super.name + " придет и спасет его " );
        }
    }
    @Override
    public void getProperty(String property){
        super.name = super.name + " " + this.name;
        super.name = super.name+" "+property;

    }


    @Override
    public void getCoordinate(CoordinateEnum xyz){
        switch (xyz)
        {
            case NoCoordinate -> super.name = super.name;
            case Far -> super.name = super.name + " дальше ";
        }
        /*if (xyz == CoordinateEnum.NoCoordinate){
            super.name = super.name;
        }else if (xyz == CoordinateEnum.Far){
            super.name = super.name + " дальше ";
        }*/
    }
    @Override
    public void getCoordinate(Place place){

        super.name = super.name + " в " + place.name;
    }
    @Override
    public void amplify(Conditions conditions) {
        switch (conditions)
        {
            case Defolt -> super.name = "как можно";
            case Better -> super.name = " как можно лучше";
            case But -> super.name = " но так,чтобы ";
            case PowerFull -> super.name = " изо всех сил ";
            case How -> super.name = "как";
            case While -> System.out.print(" пока " + super.name);
            case ThatIs ->  super.name = "что это" + super.name;
            case That -> super.name = "что ";
            case Finally ->  super.name = " наконец " + this.name;
            case ThatIf -> super.name = " что если " + this.name;
            case Maybe -> super.name = "может быть, " + super.name;
            case Very -> super.name = this.name + " очень ";

        }
        /*if (conditions == Conditions.Defolt) {
            super.name = "как можно";
        } else if (conditions == Conditions.Better) {
            super.name = " как можно лучше";

        }else if (conditions==Conditions.But){
            super.name = " но так,чтобы ";
        }else if (conditions==Conditions.PowerFull){
            super.name = " изо всех сил ";
        }else if (conditions == Conditions.How){
            super.name = "как";
        }else if (conditions == Conditions.While){
            System.out.print(" пока " + super.name);
        }else if (conditions == Conditions.ThatIs){

            super.name = "что это" + super.name;
        }else if (conditions == Conditions.That){
            super.name = "что " + this.name;
        }else if (conditions == Conditions.Finally){
            super.name = " наконец " + this.name;
        }else if (conditions == Conditions.ThatIf){
            super.name = " что если " + this.name;
        } else if (conditions == Conditions.Maybe) {
            super.name = "может быть, " + super.name;
        } else if (conditions == Conditions.Very) {
            super.name = this.name + " очень ";

        }*/

    }


}