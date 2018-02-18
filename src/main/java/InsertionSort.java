public class InsertionSort {

  public void sort(Integer[] toBeSorted){

    for(int i=1; i<=toBeSorted.length-1; i++){
      Integer key = toBeSorted[i];
      int j = i;

      while(j>0 && toBeSorted[j-1] > key){
        toBeSorted[j] = toBeSorted[j-1];
        j = j-1;
      }
      toBeSorted[j] = key;

    }
  }

}
