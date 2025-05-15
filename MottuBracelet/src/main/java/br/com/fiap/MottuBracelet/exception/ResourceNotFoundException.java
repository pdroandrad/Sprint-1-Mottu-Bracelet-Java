package br.com.fiap.MottuBracelet.exception;

public class ResourceNotFoundException extends RuntimeException {

    // Construtor com detalhes específicos
    public ResourceNotFoundException(String resourceName, String fieldName, Object fieldValue) {
        super(String.format("%s não encontrado com %s: '%s'",
                resourceName, fieldName, fieldValue));
    }

    // Construtor simples
    public ResourceNotFoundException(String message) {
        super(message);
    }
}