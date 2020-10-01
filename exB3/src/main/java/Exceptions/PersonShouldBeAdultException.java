package Exceptions;

public class PersonShouldBeAdultException extends Exception {

    public PersonShouldBeAdultException() {
        super();
    }

    public PersonShouldBeAdultException(String msg) {
        super(msg);
    }

    public PersonShouldBeAdultException(Throwable thr){
        super(thr);
    }

    public PersonShouldBeAdultException(String msg, Throwable thr) {
        super(msg, thr);
    }

}
