package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.averagingInt;

public class Add {
    public int getSumOfEvens(int leftBorder, int rightBorder) {
        List<Integer>arrayList = new ArrayList<Integer>();
        arrayList = IntStream.range(rightBorder,leftBorder+1).boxed().collect(Collectors.toList());
        if(leftBorder <=rightBorder){
            arrayList = IntStream.range(leftBorder,rightBorder+1).boxed().collect(Collectors.toList());
        }
//        int sum = (int)arrayList.stream().filter(num->num%2==0).collect(Collectors.summarizingInt(value -> value)).getSum();
//        return sum;
        return arrayList.stream().filter(num ->num%2==0).mapToInt(num ->num).sum();

    }

    public int getSumOfOdds(int leftBorder, int rightBorder) {
        throw new NotImplementedException();
    }

    public int getSumTripleAndAddTwo(List<Integer> arrayList) {
        //return arrayList.stream().map(num ->3*num+2).reduce((num1,num2) ->num1 +=num2).get().intValue();
        return arrayList.stream().map((num ->3*num+2)).mapToInt(num ->num).sum();
        //return (int)arrayList.stream().map(num ->3*num+2).collect(Collectors.summarizingInt(value -> value)).getSum();
        //throw new NotImplementedException();
    }

    public List<Integer> getTripleOfOddAndAddTwo(List<Integer> arrayList) {
       return arrayList.stream().map(num ->num%2==0?num:(num*3+2)).collect(Collectors.toList());
    }

    public int getSumOfProcessedOdds(List<Integer> arrayList) {
        throw new NotImplementedException();
    }

//    public double getMedianOfEven(List<Integer> arrayList) {
//        throw new NotImplementedException();
//    }

    public double getAverageOfEven(List<Integer> arrayList) {
//        List <Integer> arrayList1 =arrayList.stream().filter(num -> num%2==0).collect(Collectors.toList());
//        int count = arrayList1.size();
//        return (double)arrayList1.stream().reduce((num1,num2) ->num1+=num2).get().intValue()/count;
      //  return arrayList.stream().filter(num -> num%2==0).collect(Collectors.averagingInt(item ->item));
        return   arrayList.stream().filter((num ->num%2==0)).mapToInt(num ->num).average().getAsDouble();
    }

    public boolean isIncludedInEvenIndex(List<Integer> arrayList, Integer specialElment) {
        throw new NotImplementedException();
    }

    public List<Integer> getUnrepeatedFromEvenIndex(List<Integer> arrayList) {
        return arrayList.stream().filter(num ->num%2==0).distinct().collect(Collectors.toList());
    }

//    public List<Integer> sortByEvenAndOdd(List<Integer> arrayList) {
//        throw new NotImplementedException();
//    }

//    public List<Integer> getProcessedList(List<Integer> arrayList) {
//        throw new NotImplementedException();
//    }
}
