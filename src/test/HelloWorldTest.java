import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.embedded.LocalServerPort;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
@DirtiesContext
public class HelloWorldTest {

	@LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void testGreeting() throws Exception {
        ResponseEntity<String> entity = restTemplate
                .getForEntity("http://localhost:" + this.port + "/", String.class);
        assertEquals(HttpStatus.OK, entity.getStatusCode());
}
	
	@Test
	public void testAdd1Plus1() 
	{
	    int x  = 1 ; 
	    assertEquals(2, HelloWorld.Telop(x));
	}
	
	@Test
	public void testAdd2Plus1() 
	{
	    int x  = 2 ; 
	    assertEquals(3, HelloWorld.Telop(x));
	}
	
	@Test
	public void testMultiply2by17() 
	{
	    int x  = 2 ; int y = 17; 
	    assertEquals(34, HelloWorld.vermenigvuldig(x,y));
	}
}
