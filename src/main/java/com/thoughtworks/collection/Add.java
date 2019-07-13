package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Add {
    public int getSumOfEvens(int leftBorder, int rightBorder) {
        ArrayList<Integer>arrayList = new ArrayList<Integer>();
        if(leftBorder <=rightBorder){
            while(leftBorder <=rightBorder){
                arrayList.add(leftBorder++);
            }
        }else{
            while(leftBorder >=rightBorder){
                arrayList.add(rightBorder++);
            }
        }

        int sum =arrayList.stream().filter(num->num%2==0).reduce(( num,num1) ->num+=num1).get().intValue();
        return sum;

    }

    public int getSumOfOdds(int leftBorder, int rightBorder) {
        throw new NotImplementedException();
    }

    public int getSumTripleAndAddTwo(List<Integer> arrayList) {
        return arrayList.stream().map(num ->3*num+2).reduce((num1,num2) ->num1 +=num2).get().intValue();
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
        List <Integer> arrayList1 =arrayList.stream().filter(num -> num%2==0).collect(Collectors.toList());
        int count = arrayList1.size();
       // System.out.println("count:"+count+",arrayList:"+arrayList);
        return (double)arrayList1.stream().reduce((num1,num2) ->num1+=num2).get().intValue()/count;
        //throw new NotImplementedException();
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
