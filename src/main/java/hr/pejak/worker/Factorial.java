package hr.pejak.worker;

public class Factorial {

public long calculate(long number){


    if (number == 1){
        return number;
    }
    else {
        return calculate(number -1)  * number;
    }


    }
}
