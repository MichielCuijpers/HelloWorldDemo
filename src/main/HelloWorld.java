import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HelloWorld {
	
	 @RequestMapping("/")
    public String home() {
        return "Hello Docker World";
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(Application.class, args);
		System.out.println("Hello World!");
		int test = 4;
		Telop(test);
		int test2 = 5;
		vermenigvuldig(test,test2);
		
	
	}
	public static int Telop (int test){
		
		test = test +1;
		System.out.println(test);
		return test;
	}
	
	public static int vermenigvuldig (int test, int test2){
		
		int res = test * test2;
		System.out.println(res);
		return res;
	}
}
