package kz.kimvy.stepiktask295.figure;

public class TriangleEquilateral extends Triangle{

    public TriangleEquilateral(int a){
        super(a, a, a);
    }

    @Override
    public void paint(){
        System.out.println("Equilateral Triangle painted");
    }
}
