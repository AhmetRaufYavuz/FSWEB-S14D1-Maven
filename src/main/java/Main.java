import com.workintech.cylinder.Circle;
import com.workintech.cylinder.Cylinder;
import com.workintech.developers.*;
import com.workintech.pool.Cuboid;
import com.workintech.pool.Rectangle;

public class Main {
    public static void main(String[] args) {

       Circle circle = new Circle(2);
       Cylinder cylinder = new Cylinder(2,2);
        Rectangle rectangle = new Rectangle(1,2);
        Cuboid cuboid = new Cuboid(1, 2, 3);
       Employee employee = new Employee(1, "Jane Doe", 20000);
       HRManager hrManager = new HRManager(1, "John Doe", 120000);
       JuniorDeveloper juniorDeveloper = new JuniorDeveloper(1, "Junior Doe", 45000);
        MidDeveloper midDeveloper = new MidDeveloper(1, "Mid Doe", 60000);
        SeniorDeveloper seniorDeveloper = new SeniorDeveloper(1, "Senior Doe", 100000);

        System.out.println(rectangle.getArea());
        System.out.println(cuboid.getVolume());

    }
}