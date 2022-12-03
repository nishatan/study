package com.others;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.function.Consumer;

public class AnonymousInter {
    public static void main(String[] args) {
        Father father = new Father();
        Arrays.asList(1,2,3,4,5,6).forEach(father::consume);
 
    }
}
interface IA{
     void cry();
}
class Outer01{
    private  int n1 = 10;
    public void method(){
    }
}
 
class Tiger implements IA{

    @Override
    public void cry() {
        System.out.println("tiger is cry");
    }
}
class Father{
    public <T> void consume(T t){
        System.out.println(t);
    }
}