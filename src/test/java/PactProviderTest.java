import au.com.dius.pact.provider.junit.PactRunner;
import au.com.dius.pact.provider.junit.Provider;
import au.com.dius.pact.provider.junit.State;
import au.com.dius.pact.provider.junit.loader.PactFolder;
import au.com.dius.pact.provider.junit.target.HttpTarget;
import au.com.dius.pact.provider.junit.target.Target;
import au.com.dius.pact.provider.junit.target.TestTarget;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.springframework.boot.SpringApplication;
import org.springframework.web.context.ConfigurableWebApplicationContext;

@RunWith(PactRunner.class)
@Provider("test_runner")
@PactFolder("../../../target/mypacts")
public class PactProviderTest {

    //Defining the Target api for verifying the test (Pact stuff)
    @TestTarget
    public final Target target = new HttpTarget("http","localhost",8082, "/spring-rest");

    private static ConfigurableWebApplicationContext application;

    @BeforeClass
    public static void start(){
        //starting the spring boot app
        application = (ConfigurableWebApplicationContext) SpringApplication.run(MainApplication.class);
    }


    @State("test GET")
    public void toGetState(){
        //Code to bring the provider to the State expected by the consumer before running the test
    }

    @State("test POST")
    public void toPostState(){
        //Code to bring the Provider to the State expected by the consumer before running the test
    }


}
