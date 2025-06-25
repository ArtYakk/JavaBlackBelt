package org.course.collection;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorEx1 {
    public static void main(String[] args) {
        String s = "madam";
      /*  String sReversed = new StringBuilder(s).reverse().toString();
        System.out.println(s.equals(sReversed));*/
        List<Character> list = new LinkedList<>();
        for(char ch : s.toCharArray()){
            list.add(ch);
        }
        ListIterator<Character> iterator = list.listIterator();
        ListIterator<Character> reverseIterator = list.listIterator(list.size());
        boolean isPalindrome = true;
        while (iterator.hasNext() && reverseIterator.hasPrevious()){
            if(!iterator.next().equals(reverseIterator.previous())){
                isPalindrome = false;
                break;
            }
        }
        if(isPalindrome){
            System.out.println("PALINDROME");
        }else{
            System.out.println("NOT A PALINDROME");
        }


    }
}
