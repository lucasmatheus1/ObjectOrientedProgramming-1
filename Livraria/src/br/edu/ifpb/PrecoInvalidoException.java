package br.edu.ifpb;

public class PrecoInvalidoException extends Exception {
    @Override
    public String getMessage() {
        return super.getMessage();
    }

    public PrecoInvalidoException(String message) {
        super(message);
    }

}
