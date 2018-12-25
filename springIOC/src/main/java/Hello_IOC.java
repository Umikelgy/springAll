import data.DataSoure;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import peson.Car;
import peson.Person;
import peson.SayH;

import java.util.List;

public class Hello_IOC {
    public static void main(String []args){
        ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
        SayH sayH= (SayH) context.getBean("hw");
        sayH.sayHello();

        ApplicationContext act=new ClassPathXmlApplicationContext("beans.xml");
        Person person= (Person) act.getBean("autowire");
     List<Car> s =person.getCar();
     for(Car c:s){
         System.out.println("CC="+c);
     }

     System.out.println("Arg="+person.getAge());

        DataSoure dataSoure= (DataSoure) act.getBean("datasoure");

        System.out.println(dataSoure.toString());

    }
}
