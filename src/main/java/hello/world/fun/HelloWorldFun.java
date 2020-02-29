package hello.world.fun;

import io.micronaut.core.annotation.*;

@Introspected
public class HelloWorldFun {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

