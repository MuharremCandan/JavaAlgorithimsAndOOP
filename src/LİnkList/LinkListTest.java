package LİnkList;

import java.util.Scanner;

public class LinkListTest {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        LinkList list = new LinkList();

        for(int i= 0; i<=100;i++){
            list.add(i);
        }
        list.print();






    }
}
