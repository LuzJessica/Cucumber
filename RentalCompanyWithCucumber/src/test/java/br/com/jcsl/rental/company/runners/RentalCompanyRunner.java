package br.com.jcsl.rental.company.runners;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

/* Setting cucumber to run with
 * feature rentalCompany
  pretty plugin,
  write methods with CAMELCASE 
  check features and each corresponding step definition
  output results in readable format
  
  Cucumber will start through this class
 */

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\Alex\\Desktop\\Cucumber\\RentalCompanyWithCucumber\\src\\test\\resources\\features\\rentalCompany.feature",
				 glue = "br.com.jcsl.rental.company.steps",
				 plugin = "pretty",
				 snippets = SnippetType.CAMELCASE,
				 dryRun = false,
				 monochrome = true)
public class RentalCompanyRunner {

}
