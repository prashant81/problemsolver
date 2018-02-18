import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class InsertionSortTest {


  @DataProvider
  public Object[][] inputs(){
    return new Object[][]{
        {new Integer[]{4,3,2,1}, new Integer[]{1,2,3,4}},
        {new Integer[]{4,3}, new Integer[]{3,4}},
        {new Integer[]{4}, new Integer[]{4}},
        {new Integer[]{}, new Integer[]{}},
        {new Integer[]{8,5,10,8,7,4}, new Integer[]{4,5,7,8,8,10}}
    };
  }

  @Test(dataProvider = "inputs")
  public void testInsertionSort(Integer[] input, Integer[] expected){
    InsertionSort insertionSort = new InsertionSort();
    insertionSort.sort(input);
    Assert.assertEquals(input,expected);
  }

}
