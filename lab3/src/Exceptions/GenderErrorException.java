package Exceptions;

// сделать ошибку при неправильном установлении пола
public class GenderErrorException extends RuntimeException{
    public GenderErrorException(String message){
        super(message);
    }
}
