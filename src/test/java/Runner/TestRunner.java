package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"classpath:resous/Google.feature"},
		glue= {"com.example.steaps"}
	)			
		
public class TestRunner {
	

}
