package com.company.hr.subhr.wagemgmt.controller;

import java.util.*;

class testCode {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3};
        System.out.println("Available numbers in Arrays are:" + Arrays.toString(arr));

        List<String> arrlist = new ArrayList<String>();
        arrlist.add("orange");
        arrlist.add("red");
        arrlist.add("green");
        arrlist.add("yellow");
        arrlist.add("white");
        System.out.println("Available colors in ArrayList are:" + arrlist);
        System.out.println("Available colors iterating through ArrayList are:");
        for (String a : arrlist) {
            System.out.println(a);
        }
        arrlist.add(0, "black");
        System.out.println("Available colors in ArrayList after insertion are:" + arrlist);
        System.out.println("specifix index 4: " + arrlist.get(4));
        System.out.println("specifix index 1: " + arrlist.get(1));
        arrlist.set(0, "Blue");
        System.out.println("Available colors in ArrayList after replacement are:" + arrlist);
        arrlist.remove(2);
        System.out.println("Available colors in ArrayList after removing 3rd element:" + arrlist);
        System.out.println("Finding an element orange: " +arrlist.contains("orange"));
        Collections.sort(arrlist);
        System.out.println("Sorted arrayList: " +arrlist );
        List<String> newList = new ArrayList<String >();
//        for(String s:arrlist){
//            newList.add(s);
//        }
        for(int i=1;i<=5;i++){
            newList.add("i");
        }
        System.out.println("New list before: " +newList );
        Collections.copy(newList, arrlist);

        System.out.println("New copid list using collections copy method: " +newList );
        System.out.println("Checking old list: " + arrlist );
        Collections.shuffle(arrlist);
        System.out.println("Shuffled list: " + arrlist );
        Collections.reverse(arrlist);
        System.out.println("Reversed list: " + arrlist );

        System.out.println("Portion of an ArrayList: " +arrlist.subList(1,3));
        compare(arrlist, newList);
        Collections.copy(newList, arrlist);
        //following is another way without using compare method
        for(String t:arrlist) {
            if (newList.contains(t)) {
                System.out.println("element present in both");
            } else
                System.out.println("not present");

        }
        Collections.swap(arrlist, 0, 2);
        System.out.println("After swapping 1st and 3rd element using collections swap methos " +arrlist.subList(1,3));
        //Swapping using custom method swap()
        swap(arrlist);
        System.out.println("Before join: " + arrlist );
        System.out.println("Before join: " + newList );
        for(String s:arrlist){

            newList.add(s);
        }
        System.out.println("After join: " + arrlist );
        System.out.println("After join: " + newList );
        List<String> finaList = new ArrayList<String>();
        /*for(String s:arrlist){

            finaList.add(s);
        }
        for(String s:newList){

            finaList.add(s);
        }*/
        // if not above we can use addAll
        finaList.addAll(arrlist);
        finaList.addAll(newList);
        System.out.println("New final list after join: " + finaList );
        List<String> cloneList = (ArrayList<String>) ((ArrayList<String>) finaList).clone();
        System.out.println("Cloned list using clone method: " + cloneList );
        cloneList.removeAll(cloneList);
        System.out.println("Cloned list after remove all(empty): " + cloneList );
        System.out.println("Is cloned list empty? "+cloneList.isEmpty());
        ArrayList<Integer> intArr = new ArrayList<>(6);
        System.out.println("Integer Array size before assigning values: "+intArr.size());
        for(int i=1;i<=6;i++){
            intArr.add(i);
        }
        System.out.println("Integer Array before trim: "+intArr.size());
        intArr.trimToSize();
        System.out.println("Integer Array After trim to size: " +intArr.size());
        intArr.add(5);
        System.out.println("AUtomatoc increase in the size neverthless of the initial capacity(10): " +intArr.size());
        intArr.ensureCapacity(9);
        intArr.add(7);
        intArr.add(8);
        System.out.println("After ensuring(increasing) capacity, size is: " +intArr.size());
        System.out.println("Integer Array before replacing 2nd element: " +intArr);
        Collections.replaceAll(intArr, intArr.get(1),17);
        System.out.println("Integer Array After replacment through collection replaceall method: " +intArr);
        for(int i=0; i<intArr.size();i++){
            System.out.println("Integer Array list with position: " +intArr.get(i));
        }

    }

    public static void compare(List<String> arrlist, List<String> newList){


        System.out.println("Comparing two lists");
        for(int i=0;i<5;i++){

            if(arrlist.get(i) == newList.get(i)){
                System.out.println("equal");
            }else
                System.out.println("not equal");
        }

    }
    // replaceColors(arrlist.get(0), "blue");

        public static void swap(List<String> arrList){

            System.out.println("In the swap method");
            System.out.println("Before: " + arrList.get(0) + " & " + arrList.get(2));
            String firstElement = arrList.get(0);
            arrList.set(0,arrList.get(2));
            arrList.set(2,firstElement);
            System.out.println("After: " + arrList.get(0) + " & " + arrList.get(2));

        }
}
