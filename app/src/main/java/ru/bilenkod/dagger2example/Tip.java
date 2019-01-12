package ru.bilenkod.dagger2example;

import javax.inject.Inject;

class Tip {
    private Ball ball;

    @Inject
    Tip(Ball ball) {
        this.ball = ball;
    }
}
