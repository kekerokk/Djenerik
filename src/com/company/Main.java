package com.company;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static int djeneric_1(List<Integer> list)
    {
        int FINGERS = 0;
        for(int i = 0;i<list.size();i++)
        {
            if((list.get(i)&1)==0) {
                FINGERS++;
            }
        }
        return FINGERS;
    }
    public static void djeneric_2(List<Integer> list,int place1,int place2)
    {
        int OnPlace1 = 0,OnPlace2=0;
        OnPlace1 = list.get(place1-1);
        OnPlace2 = list.get(place2-1);
        list.set(place1-1,OnPlace2);
        list.set(place2-1,OnPlace1);
    }
    public static void Show(List<Integer> list)
    {
        System.out.println("Список:");
        for(int i = 0;i< list.size();i++)
        {
            System.out.println(list.get(i));
        }
    }
    public static void main(String[] args) {
        List<Integer> lst = new ArrayList<>();
        //Iterator iter = lst.iterator();
        for(int i = 0;i<10;i++)
        {
            double kek = Math.random()*(20-1)+1;
            //System.out.println(kek);
            int numb = (int)kek;
            lst.add(numb);
            //System.out.println(lst.get(i));
        }
        Show(lst);
        System.out.println("Четных чисел: "+djeneric_1(lst));
        djeneric_2(lst,1,4);
        Show(lst);
    }
}
