package pro.sky.Test24.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.Test24.service.CalculatorService;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {
    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping("/calculator")
    public String getHello() {
        return "Добро пожаловать в калькулятор";
    }

    @GetMapping("/plus")
    public String getSummary(@RequestParam(value = "num1", required = false) Integer num1,
                             @RequestParam(value = "num2", required = false) Integer num2) {
        int result = calculatorService.getSummary(num1, num2);
        return num1 + " + " + num2 + " = " + result;
    }

    @GetMapping("/minus")
    public String getSubtraction(@RequestParam(value = "num1", required = false) Integer num1,
                                 @RequestParam(value = "num2", required = false) Integer num2) {
        int result = calculatorService.getSubtraction(num1, num2);
        return num1 + " + " + num2 + " = " + result;
    }

    @GetMapping("/multiply")
    public String getMultiply(@RequestParam(value = "num1", required = false) Integer num1,
                              @RequestParam(value = "num2", required = false) Integer num2) {
        int result = calculatorService.getSubtraction(num1, num2);
        return num1 + " + " + num2 + " = " + result;
    }

    @GetMapping("/divide")
    public String getDivision(@RequestParam(value = "num1", required = false) Integer num1,
                              @RequestParam(value = "num2", required = false) Integer num2) {
        int result = calculatorService.getSubtraction(num1, num2);
        return num1 + " + " + num2 + " = " + result;


    }

}
