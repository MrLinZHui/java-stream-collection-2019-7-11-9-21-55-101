package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class MyMap {

    List<Integer> array;
    private String[] letters = new String[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l",
            "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
    private List<String> letterList = Arrays.asList(letters);

    public MyMap(List<Integer> array) {
        this.array = array;
    }

    public List<Integer> getTriple() {
        //throw new NotImplementedException();
        return this.array.stream().map(num -> num*3).collect(Collectors.toList());
    }

    public List<String> mapLetter() {
       // throw new NotImplementedException();
        return this.array.stream().map(num -> ((char)(num+96))+"").collect(Collectors.toList());
    }

    public List<String> mapLetters() {
        throw new NotImplementedException();
    }

    public List<Integer> sortFromBig() {
        //throw new NotImplementedException();
        //return this.array.stream().
        this.array.sort((o1,o2) ->{
            return o2 -o1;
        });
        return array;
    }

    public List<Integer> sortFromSmall() {
        Integer[] array = new Integer[]{3, 2, 4, 5, 1};
        List<Integer> list = Arrays.asList(array);
        Collections.sort(list);
        return list;
        //throw new NotImplementedException();
    }
}
