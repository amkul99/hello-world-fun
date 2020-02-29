package hello.world.fun;

import io.micronaut.test.annotation.MicronautTest;
import org.junit.jupiter.api.Test;
import javax.inject.Inject;

import static org.junit.jupiter.api.Assertions.assertEquals;

@MicronautTest
public class HelloWorldFunFunctionTest {

    @Inject
    HelloWorldFunClient client;

    @Test
    public void testFunction() throws Exception {
    	HelloWorldFun body = new HelloWorldFun();
    	body.setName("hello-world-fun");
        assertEquals("hello-world-fun", client.apply(body).blockingGet().getName());
    }
}
