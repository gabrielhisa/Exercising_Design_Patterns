package org.example.components;

public class Blade {
    private String size;
    private String material;

    public Blade(String size, String material) {
        this.size = size;
        this.material = material;
    }

    public String getSize() {
        return size;
    }

    public String getMaterial() {
        return material;
    }
}
