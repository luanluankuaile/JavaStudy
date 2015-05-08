package TestNG;
import org.testng.annotations.Test;
import org.testng.annotations.*;
import org.openqa.selenium.*;

public class HelloTest
{
@BeforeMethod
public void checkBefore(){
	
}

@Test
public void checkTest()
{
Boolean a;
a=true;
System.out.println("Hello World");
assert(a);
}


@Test
public void checkTesta()
{
Boolean a;
a=true;
System.out.println("Hello World");
assert(a);
}

@AfterMethod
public void checkAfter(){
	
}

}

