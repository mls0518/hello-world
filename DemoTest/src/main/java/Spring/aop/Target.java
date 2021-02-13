package Spring.aop;

public class Target implements TargetInterface {
    @Override
    public void save() {
        System.out.println("save runing...");
        //int i = 10/0;
    }
}
