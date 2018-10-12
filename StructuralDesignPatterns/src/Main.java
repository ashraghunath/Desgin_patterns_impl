import com.company.adapterdesignpattern.AudioPlayer;
import com.company.bridgedesignpattern.Circle;
import com.company.bridgedesignpattern.GreenCircle;
import com.company.bridgedesignpattern.RedCircle;
import com.company.bridgedesignpattern.Shape;
import com.company.compositedesignpattern.Employee;
import com.company.facadedesignpattern.FacadeShapeMaker;
import com.company.proxydesignpattern.Image;
import com.company.proxydesignpattern.ProxyImage;

public class Main {

    public static void main(String[] args) {

        Employee john = new Employee("john",50000,"CEO");
        Employee peter = new Employee("peter", 20000,"Dev manager");
        Employee harry = new Employee("harry", 10000,"software engineer");

        john.addSubordinate(peter);
        peter.addSubordinate(harry);

        System.out.println("facade design pattern");
        FacadeShapeMaker facadeShapeMaker = new FacadeShapeMaker();
        facadeShapeMaker.drawCircle();
        facadeShapeMaker.drawRectangle();


        System.out.println("proxy design pattern");
        Image image = new ProxyImage("image.jpg");
        image.display();
        image.display();

        System.out.println("Adapter design pattern");
        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp3", "1.mp3");
        audioPlayer.play("mp4", "2.mp4");
        audioPlayer.play("vlc", "3.vlc");
        audioPlayer.play("avi", "4.avi");

        System.out.println("Bridge design pattern");
        Shape redCircle = new Circle(100,100, 10, new RedCircle());
        Shape greenCircle = new Circle(100,100, 10, new GreenCircle());

        redCircle.draw();
        greenCircle.draw();
    }
}
