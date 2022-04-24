package am.basic.util.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.CONFLICT)
public class NullUserException extends Exception{
    public NullUserException() {

    }

    public NullUserException(String message) {
        super(message);
    }
}
