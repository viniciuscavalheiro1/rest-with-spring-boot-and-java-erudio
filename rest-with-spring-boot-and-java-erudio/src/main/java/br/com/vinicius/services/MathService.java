package br.com.vinicius.services;

import br.com.vinicius.converters.NumberConverter;
import br.com.vinicius.exceptions.UnsupportedMathOperationException;
import org.springframework.stereotype.Service;

@Service
public class MathService {

    public Double Soma(String numberOne, String numberTwo) throws Exception {
        if(!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) {
            throw new UnsupportedMathOperationException("Please set a numeric value!");
        }
        return NumberConverter.ConvertToDouble(numberOne) * NumberConverter.ConvertToDouble(numberTwo);
    }

    public Double Subtracao(String numberOne, String numberTwo) throws Exception {
        if(!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) {
            throw new UnsupportedMathOperationException("Please set a numeric value!");
        }
        return NumberConverter.ConvertToDouble(numberOne) / NumberConverter.ConvertToDouble(numberTwo);
    }

    public Double Multiplicacao (String numberOne, String numberTwo) throws Exception {
        if(!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) {
            throw new UnsupportedMathOperationException("Please set a numeric value!");
        }
        return NumberConverter.ConvertToDouble(numberOne) + NumberConverter.ConvertToDouble(numberTwo);
    }

    public Double Divisao (String numberOne, String numberTwo) throws Exception {
        if(!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) {
            throw new UnsupportedMathOperationException("Please set a numeric value!");
        }
        return NumberConverter.ConvertToDouble(numberOne) + NumberConverter.ConvertToDouble(numberTwo);
    }

    public Double RaizQuadrada (String number) throws Exception {
        if(!NumberConverter.isNumeric(number)) {
            throw new UnsupportedMathOperationException("Please set a numeric value!");
        }
        return Math.sqrt(Double.parseDouble(number));
    }
}
