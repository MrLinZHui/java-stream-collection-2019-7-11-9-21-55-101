package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.*;
import java.util.stream.Collectors;

public class Filter {

    List<Integer>  array;

    public Filter(List<Integer> array) {
     this.array = array;
    }

    public List<Integer> filterEven() {
//        List<Integer>  array1 = new ArrayList<>();
//        for(int i=0;i<this.array.size();i++){
//            int num = array.get(i);
//            if(num%2==0){
//                array1.add(num);
//            }
//        }
//        return array1;
        return this.array.stream().filter(num -> num % 2==0).collect(Collectors.toList());
    }

    public List<Integer> filterMultipleOfThree() {
        return this.array.stream().filter(num -> num % 3 == 0).collect(Collectors.toList());
    }

    public List<Integer> getCommonElements(List<Integer> firstList, List<Integer> secondList) {
        //throw new NotImplementedException();
        //    return this.array.stream().distinct().collect(Collectors.toList());
//        return Arrays.stream(this.array.stream().collect(Collectors.toSet()).toArray()).c;
//        List<Integer> list = new ArrayList<>();
//        this.array.stream().collect(Collectors.toSet()).forEach(num -> list.add(num) );
//        return  list;
        return firstList.stream().filter(num->secondList.contains(num)).collect(Collectors.toList());
    }

    public List<Integer> getDifferentElements() {
        //throw new NotImplementedException();
        return new ArrayList<>(array.stream().collect(Collectors.toSet()));
    }
}