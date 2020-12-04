import java.util.NoSuchElementException;
public class Range implements IntegerSequence{
  private int start, end, current;
  public Range(int start, int end){
    this.start = start;
    this.end = end;
    current = start;
  }
  public void reset(){
    current = start;
  }
  public int length(){
    return (end - start + 1);
  }
  public boolean hasNext(){
    return (current <= end && current >= start);
  }

  //@throws NoSuchElementException
  public int next(){
    if (!hasNext()){
      throw new NoSuchElementException("No element next.");
    }
    else{
      current += 1;
      return (current - 1);
    }
  }

}
