package hello.world.fun;

import io.micronaut.function.executor.FunctionInitializer;
import io.micronaut.function.FunctionBean;
import javax.inject.*;
import java.io.IOException;
import java.util.function.Function;

@FunctionBean("hello-world-fun")
public class HelloWorldFunFunction extends FunctionInitializer implements Function<HelloWorldFun, HelloWorldFun> {

    @Override
    public HelloWorldFun apply(HelloWorldFun msg) {
         return msg;
    }

    /**
     * This main method allows running the function as a CLI application using: echo '{}' | java -jar function.jar 
     * where the argument to echo is the JSON to be parsed.
     */
    public static void main(String...args) throws IOException {
        HelloWorldFunFunction function = new HelloWorldFunFunction();
        function.run(args, (context)-> function.apply(context.get(HelloWorldFun.class)));
    }    
}

