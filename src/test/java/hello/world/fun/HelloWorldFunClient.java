package hello.world.fun;

import io.micronaut.function.client.FunctionClient;
import io.micronaut.http.annotation.Body;
import io.reactivex.Single;
import javax.inject.Named;

@FunctionClient
public interface HelloWorldFunClient {

    @Named("hello-world-fun")
    Single<HelloWorldFun> apply(@Body HelloWorldFun body);

}
