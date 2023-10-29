package org.example.trees;

import java.util.Objects;

public abstract class Tree {
    public int size;
    public int radius;
    public String material;

    public Tree(){
    }

    public Tree(Tree type){
        if (type != null){
            this.size = type.size;
            this.radius = type.radius;
            this.material = type.material;
        }
    }

    public abstract Tree clone();

    @Override
    public boolean equals(Object refObject){
        if (!(refObject instanceof Tree)) return false;
        Tree tree1 = (Tree) refObject;
        return tree1.size == size && tree1.radius == radius && Objects.equals(tree1.material, material);
    }

}
