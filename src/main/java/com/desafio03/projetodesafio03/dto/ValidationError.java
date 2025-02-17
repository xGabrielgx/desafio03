package com.desafio03.projetodesafio03.dto;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

public class ValidationError extends CustomError{

    List<FieldMessage> erros = new ArrayList<>();

    public ValidationError(Instant timestamp, Integer status, String error, String path) {
        super(timestamp, status, error, path);
    }

    public List<FieldMessage> getErros() {
        return erros;
    }

    public void addErros(String fieldName, String fieldMessage) {
        erros.add(new FieldMessage(fieldName, fieldMessage));
    }
}
