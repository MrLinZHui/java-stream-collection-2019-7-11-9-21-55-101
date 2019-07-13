package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CollectionOperator {
    public List<Integer> getListByInterval(int left, int right) {
        if(left<right){
            return IntStream.range(left,right+1).boxed().collect(Collectors.toList());
        }
        List<Integer> list = IntStream.range(right,left+1).boxed().collect(Collectors.toList());
             list.sort((o1,o2)->{
                return o2-o1;
             });
        return list;
    }

    public List<Integer> getEvenListByIntervals(int left, int right) {
        if(left<right){
            return IntStream.range(left,right+1).boxed().filter(num->num%2==0).collect(Collectors.toList());
        }
        List<Integer> list = IntStream.range(right,left+1).boxed().filter(num->num%2==0).collect(Collectors.toList());
        list.sort((o1,o2)->{
            return o2-o1;
        });
        return list;
    }

    public List<Integer> popEvenElments(int[] array) {
        throw new NotImplementedException();
    }

    public int popLastElment(int[] array) {
        throw new NotImplementedException();
    }

    public List<Integer> popCommonElement(int[] firstArray, int[] secondArray) {
        throw new NotImplementedException();
    }

    public List<Integer> addUncommonElement(Integer[] firstArray, Integer[] secondArray) {
        throw new NotImplementedException();
    }
}
