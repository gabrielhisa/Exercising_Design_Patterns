package org.example.trees;

public class PlasticTree extends Tree{
    public int size;

    public PlasticTree(){
    }

    public PlasticTree(PlasticTree type){
        super(type);
        if (type != null){
            this.size = type.size;
        }
    }

    @Override
    public Tree clone() {
        return new PlasticTree(this);
    }

    @Override
    public boolean equals(Object obj2){
        if (!(obj2 instanceof PlasticTree) || !super.equals(obj2)) return false;
        PlasticTree tree2 = (PlasticTree) obj2;
        return tree2.size == size;
    }
}
