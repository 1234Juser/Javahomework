package org.example.exception13.hard;

import java.io.IOException;

public class Child extends Parent {
    @Override
    public void doSomething() throws IOException {
        throw new IOException("예외 메시지");
    }
}
