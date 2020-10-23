public class Tester{
  public static void main(String[] args) {
    int[][]  A  =  {  {  1,  0, 12, -1 },
                      {  7, -2,  2,  1 },
                      { -5, -2,  2, -9 }  };
    int[]  B  =   {  -2, -4, -5 };
    System.out.println(ArrayOps.sum(B));
    System.out.println(ArrayOps.largest(B));
  }
}
