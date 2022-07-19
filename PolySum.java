class Addition
  {
    void sum(int a,int b)
    {
      System.out.println((a+b));
    }
    void sum(float a,int b)
    {
      System.out.println((a+b));
    }
    void sum(int a,int b,int c)
    {
      System.out.println((a+b+c));
    }
    
  }
class Main
  {
    public static void main(String args[])
    {
      Addition addition=new Addition();
      addition.sum(2,3);
      addition.sum(2,3,4);
      addition.sum(2.3f,4);
      
    }
  }