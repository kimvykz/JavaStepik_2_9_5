package kz.kimvy.stepiktask295.figure;

public class Triangle extends Figure{
    int a;
    int b;
    int c;

    {
    super.description = "Triangle";
    }

    public Triangle(){
        super();
    }

    public Triangle(int a, int b, int c){
        this();
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public void paint(){
        System.out.println("Triangle painted");
    }
}
