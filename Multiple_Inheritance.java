  interface Circle 
  {
    void Area_Circle(int r );
  }  
  interface Triangle 
  {
    void Area_Triangle(int b , int h);
  }
  interface Rectangle 
  {
    void Area_Rectangle(int l, int w);
  }

  class Display implements Circle, Triangle,Rectangle
  {
    public void Area_Circle(int r)
    {
        double area=(3.14*r*r);
        System.out.println("Area of Circle is :" +area);
    }

    public void Area_Triangle(int h, int b)
    {
        double area = (0.5*h*b);
        System.out.println("Area of Triangle is :" +area );
    }
    
    public void Area_Rectangle(int w, int l)
    {
        double area =(w * l);
        System.out.println("Area of Rectangle is :" +area );
    }
  }

    public class Multiple_Inheritance
    {
        public static void main(String args [])
        {
            Display d = new Display();
            d.Area_Circle(3);
            d.Area_Triangle(2,8);
            d.Area_Rectangle(4,9);
        }
    }


      OUTPUT:-
               Area of Circle is :28.259999999999998
               Area of Triangle is :8.0
               Area of Rectangle is :36.0