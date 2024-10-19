package pro.sky.Test24.service;

import org.springframework.stereotype.Service;
import pro.sky.Test24.exception.ZeroException;

@Service
public class CalculatorService {
    public int getSummary(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            throw new IllegalArgumentException("Один из параметров не передан");
        }
        return  num1 + num2;
    }

    public int getSubtraction(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            throw new IllegalArgumentException("Один из параметров не передан");
        }
        return  num1 - num2;
    }
    public int getMultiply(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            throw new IllegalArgumentException("Один из параметров не передан");
        }
        return  num1 * num2;
    }
    public int getDivision(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            throw new IllegalArgumentException("Один из параметров не передан");
        }
        if(num2 == 0) {
           throw new ZeroException();
        }

        return num1 / num2;
    }

}
