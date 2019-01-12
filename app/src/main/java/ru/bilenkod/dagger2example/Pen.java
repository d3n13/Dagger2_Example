package ru.bilenkod.dagger2example;

import javax.inject.Inject;

class Pen {
    private Body body;
    private Kernel kernel;
    private String color;

    @Inject
    Pen(Body body, Kernel kernel) {
        this.body = body;
        this.kernel = kernel;
    }

    public void setColor(String color) {
        this.color = color;
    }

    void write() {
        System.out.println(this.getClass().getSimpleName() + " is writing. Color: "+color);
    }
}
