package Reflection3;

import java.util.ArrayList;

import java.util.Collections;
import java.util.List;


    class NumberMirror{
    public List<Integer> mirror(Double number) {
        List<Integer> numbers = new ArrayList<>();
        Collections.reverse(numbers);
        System.out.println(numbers);

        return numbers;
    }
    }
