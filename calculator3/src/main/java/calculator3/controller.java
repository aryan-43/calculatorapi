package calculator3;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.PathVariable;

@Controller("/cal")
public class controller {
    @Get("/add/{x}/{y}")
    public int addition(@PathVariable int x,@PathVariable int y){
        return x+y;
    }
    @Get("/substract/{x}/{y}")
    public int substraction(@PathVariable int x,@PathVariable int y){
        return x-y;
    }
    @Get("/multiply/{x}/{y}")
    public int multiplication(@PathVariable int x,@PathVariable int y){
        return x*y;
    }
    @Get("/divide/{x}/{y}")
    public int division(@PathVariable int x,@PathVariable int y){
        return x/y;
    }
   
}
