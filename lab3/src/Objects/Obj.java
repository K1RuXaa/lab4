package Objects;
import Enums.Action;
import Enums.Gender;

import java.util.Objects;

public abstract class Obj {
    protected String name;
    private Place location;
    public Obj(String name){
        this.name = name;
    }
    protected Obj(String name, Place location) { //перегрузка
        this(name);
        this.location = location;
    }




}