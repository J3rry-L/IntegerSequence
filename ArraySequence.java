import java.util.NoSuchElementException;
public class ArraySequence implements IntegerSequence{
  private int currentIndex;
  private int[] data;

  /*Construct the sequence by copying values from the other array into the data array*/
  public ArraySequence(int[] other){
    data = new int[other.length];
    for (int i = 0; i < other.length; i++){
      data[i] = other[i];
    }
    currentIndex = 0;
  }

  public ArraySequence(IntegerSequence otherseq){
    otherseq.reset();
    data = new int[otherseq.length()];
    int i = 0;
    while(otherseq.hasNext()){
      data[i] = otherseq.next();
      i++;
    }
    otherseq.reset();
    currentIndex = 0;
  }

  public boolean hasNext(){
    return (currentIndex < data.length && currentIndex >= 0);
  }

  public int next(){
    if (!hasNext()){
      throw new NoSuchElementException("No element next.");
    }
    else{
      currentIndex++;
      return (data[currentIndex - 1]);
    }
  }

  public int length(){
    return data.length;
  }

  public void reset(){
    currentIndex = 0;
  }

}
