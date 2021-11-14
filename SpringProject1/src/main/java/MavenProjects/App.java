package MavenProjects;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context = new ClassPathXmlApplicationContext("/SpringProject1/src/main/java/MavenProjects/Pizza.java");
        Pizza pizza= (Pizza) context.getBean("pizza");
        System.out.println(pizza);
        
    }
}
