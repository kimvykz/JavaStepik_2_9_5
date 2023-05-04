package kz.kimvy.stepiktask295.figure;

public class Rectangle extends Figure{

    int a, b, c, d;

    {
        super.description = "Rectangle";
    }

    public Rectangle(){
        super();
    }

    public Rectangle(int a, int b, int c, int d){
        this();
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    @Override
    void paint(){
        System.out.println("Rectangle painted");
    }
}
