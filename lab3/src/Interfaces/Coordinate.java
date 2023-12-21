package Interfaces;
import Enums.CoordinateEnum;
import Objects.Place;

public interface Coordinate {
    public void getCoordinate(CoordinateEnum xyz);//xyz - тк Ох Оу Оz
    public void getCoordinate(Place place);
}