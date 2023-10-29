package org.example.trees;

public class OakTree extends Tree{
    public int age;
    public int area;

    public OakTree(){
    }

    public OakTree(OakTree tree) {
        super(tree);
        if (tree != null) {
            this.age = tree.age;
            this.area = tree.area;
        }
    }

    @Override
    public Tree clone() {
        return new OakTree(this);
    }

    @Override
    public boolean equals(Object obj2){
        if (!(obj2 instanceof OakTree) || !super.equals(obj2)) return false;
        OakTree tree2 = (OakTree) obj2;
        return tree2.age == age && tree2.area == area;
    }
}
