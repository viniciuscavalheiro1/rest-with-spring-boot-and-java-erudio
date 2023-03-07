package br.com.vinicius.controllers;

import br.com.vinicius.domain.Greeting;
import br.com.vinicius.exceptions.UnsupportedMathOperationException;
import br.com.vinicius.services.MathService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(path = "/calculadora")
public class MathController {

    private final MathService mathService;

    public MathController(MathService mathService) {
        this.mathService = mathService;
    }

    @RequestMapping(path = "/sum/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public Double sum(
            @PathVariable(value = "numberOne") String numberOne,
            @PathVariable(value = "numberTwo") String numberTwo
        ) throws Exception {
        return mathService.Soma(numberOne, numberTwo);
    }

    @RequestMapping(path = "/sub/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public Double sub(
            @PathVariable(value = "numberOne") String numberOne,
            @PathVariable(value = "numberTwo") String numberTwo
    ) throws Exception {
        return mathService.Subtracao(numberOne, numberTwo);
    }

    @RequestMapping(path = "/mult/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public Double multiplicao(
            @PathVariable(value = "numberOne") String numberOne,
            @PathVariable(value = "numberTwo") String numberTwo
    ) throws Exception {
        return mathService.Multiplicacao(numberOne, numberTwo);
    }

    @RequestMapping(path = "/div/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public Double div(
            @PathVariable(value = "numberOne") String numberOne,
            @PathVariable(value = "numberTwo") String numberTwo
    ) throws Exception {
        return mathService.Divisao(numberOne, numberTwo);
    }

    @RequestMapping(path = "/sqrt/{number}", method = RequestMethod.GET)
    public Double sqrt(
            @PathVariable(value = "number") String number
    ) throws Exception {
        return mathService.RaizQuadrada(number);
    }

}
