package org.example;

import org.example.trees.OakTree;
import org.example.trees.PlasticTree;
import org.example.trees.Tree;

import java.util.ArrayList;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        List<Tree> trees = new ArrayList<>();
        List<Tree> treesCopy = new ArrayList<>();

        // --------------------------------------------------------------
        PlasticTree xmasTree = new PlasticTree();
        xmasTree.radius = 10;
        xmasTree.size = 5;
        xmasTree.material = "Green plastic";
        trees.add(xmasTree);

        PlasticTree anotherPlasticTree = (PlasticTree) xmasTree.clone();
        trees.add(anotherPlasticTree);

        // --------------------------------------------------------------
        OakTree oldOak = new OakTree();
        oldOak.age = 200;
        oldOak.area = 250;
        trees.add(oldOak);

        // --------------------------------------------------------------
        cloneAndCompare(trees, treesCopy);

    }

    private static void cloneAndCompare(List<Tree> trees, List<Tree> treesCopy){

        for (Tree tree : trees){
            treesCopy.add(tree.clone());
        }

        for (int i = 0; i < trees.size(); i++){
            System.out.println(trees.get(i));
            if (trees.get(i) != treesCopy.get(i)){
                System.out.println(i + " : Trees are different objects.");
                if (trees.get(i).equals(treesCopy.get(i))){
                    System.out.println(i + " : And they are identical.");
                } else {
                    System.out.println(i + " : But they are not identical.");
                }
            } else {
                System.out.println(i + " : Tree objects are the same.");
            }
        }
    }
}