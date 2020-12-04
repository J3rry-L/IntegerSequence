public class Tester{
  IntegerSequence r = new Range(10,20);
  while(r.hasNext()){
    System.out.print(r.next())
     if(r.hasNext()){
        System.out.print( ", " );
     }
  }
  System.out.println();
}
