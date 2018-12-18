package JavaWeek3.Exercise3;

public class NumberCorrector {
    public Integer correct(Double number){
        number = Math.abs(number);
        Integer number1 = (int)Math.floor(number);
        return number1;


    }
}
