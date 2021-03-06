package ch04;

public class Cylinder
{
  private Circle base;
  private int height;
  
  public Cylinder(int r, int h)
  {
    base = new Circle(r);
    height = h;
  }
  
  public int getHeight()
  {
    return height;
  }
  
  public int getBase()
  {
    return base.getRadius();
  }
  
  public double getVolume()
  {
    return base.getArea() * height;
  }

}
