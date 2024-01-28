package br.rodriguesxxx.SpringBootSolution.exceptions;

public class RegistrationException extends Exception {
    public RegistrationException() {}
    public RegistrationException(String msg) {
        super(msg);
    }
}
