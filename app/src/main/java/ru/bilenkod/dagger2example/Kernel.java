package ru.bilenkod.dagger2example;

import javax.inject.Inject;

class Kernel {
    private Tip tip;
    private Ink ink;
    private Tube tube;

    @Inject
    Kernel(Tip tip, Ink ink, Tube tube) {
        this.tip = tip;
        this.ink = ink;
        this.tube = tube;
    }
}
