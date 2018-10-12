import com.company.abstractfactorydesignpattern.AbstractWidgetFactory;
import com.company.abstractfactorydesignpattern.GUIBuilder;
import com.company.abstractfactorydesignpattern.MacOSXWidgetFactory;
import com.company.abstractfactorydesignpattern.MsWindowsWidgetFactory;
import com.company.builderdesignpattern.builder.Address;
import com.company.builderdesignpattern.builder.Name;
import com.company.builderdesignpattern.builder.Person;
import com.company.factorydesignpattern.Animal;
import com.company.factorydesignpattern.AnimalFactory;
import com.company.prototypedesignpattern.Employees;
import com.company.singletondesignpattern.Singleton;

import java.util.List;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {

        System.out.println("Builder Design pattern");
        Name name = new Name.Builder().firstName("Ashwin")
                .lastName("Raghunath").build();

        Address address = new Address.Builder().city("Dharwad")
                .houseNumber(8)
                .zipCode("580008")
                .build();

        Person person = new Person.Builder().Address(address)
                .Name(name)
                .email("araghunath@teksystems.com")
                .id(1)
                .build();

        System.out.println("Person's city is " + person.getAddress().getCity());
        System.out.println("Person's name is " + person.getName().getFirstName());

        System.out.println("Singleton instance is ");
        Singleton.getSingletonInstance().printSingleton();

        System.out.println("Factory design pattern");
        AnimalFactory animalFactory = new AnimalFactory();
        Animal animal;
        animal = animalFactory.getAnimal("dog");
        System.out.println("Animal action: " + animal.speak());
        animal = animalFactory.getAnimal("lion");
        System.out.println("Animal action: " + animal.speak());

        System.out.println("Prototype design pattern");
        Employees emps = new Employees();
        emps.loadData();

        //Use the clone method to get the Employee object
        Employees empsNew = (Employees) emps.clone();
        Employees empsNew1 = (Employees) emps.clone();
        List<String> list = empsNew.getEmpList();
        list.add("John");
        List<String> list1 = empsNew1.getEmpList();
        list1.remove("Shreyas");

        System.out.println("emps List: " + emps.getEmpList());
        System.out.println("empsNew List: " + list);
        System.out.println("empsNew1 List: " + list1);

        System.out.println("Abstract factory design pattern");

        GUIBuilder builder = new GUIBuilder();
        AbstractWidgetFactory widgetFactory ;
        //check what platform we're on
        String oS = System.getProperty("os.name");
        if (oS == "MACOSX"){
            widgetFactory  = new MacOSXWidgetFactory();
        } else {
            widgetFactory  = new MsWindowsWidgetFactory();
        }
        builder.buildWindow(widgetFactory);
        System.out.println("created ");

    }
}
