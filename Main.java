package com.company;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Random;


public class Main {
    public static void main(String[] args){
        Random rand = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        BinTree tree = new BinTree();

        for (int i = 0; i < 10; i++)
            list.add(rand.nextInt(10));
        System.out.println("Порядок вставки элементов в двоичное дерево поиска: ");
        for (Integer it : list){
            System.out.print(it + " ");
            tree.insert(it);
        }
        System.out.println();

        tree.doThreading();

        System.out.println("Проход по прошитому дереву в прямом порядке:");
        tree.doTraversing();

        tree.insertToThreadedBinaryTree(-1);
        tree.insertToThreadedBinaryTree(-500);
        tree.insertToThreadedBinaryTree(20);
        tree.insertToThreadedBinaryTree(999);
        tree.insertToThreadedBinaryTree(15);
        tree.insertToThreadedBinaryTree(30);
        tree.insertToThreadedBinaryTree(-45);

        System.out.println("Проход по прошитому дереву в прямом порядке после вставки:");
        tree.doTraversing();

        tree.deleteFromThreadedBinaryTree(-1);
        tree.deleteFromThreadedBinaryTree(999);

        System.out.println("Проход по прошитому дереву в прямом порядке после удаления:");
        tree.doTraversing();
    }
}
