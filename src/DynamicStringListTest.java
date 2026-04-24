import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DynamicStringListTest {
   
  @Test
  void testGetFunctionGetsCorrectIndex() {
      //arrange
      DynamicStringList theList = new DynamicStringList();
      theList.add("Hey");
      theList.add(", ");
      theList.add("Hello ");
      theList.add("there");
      theList.add(". ");
      //act
      String actual = theList.get(0);
      
      //asert
      assertEquals("Hey", actual);
  }

  @Test
    void testSetFunctionSetsValueAtIndex() {
        //arrange
        DynamicStringList theList = new DynamicStringList();
        theList.add("Hey");
        theList.add(", ");
        theList.add("Hello ");
        theList.add("there");
        theList.add(". ");

        //act
        theList.set(1, "... ");
        String actual = theList.get(1);
        
        //asert
        assertEquals("... ", actual);
    }

  @Test
    void testAddFunctionAddsValueToEnd() {
        //arrange
        DynamicStringList theList = new DynamicStringList();
        theList.add("Hey");
        theList.add(", ");
        theList.add("Hello ");
        theList.add("there");
        theList.add(". ");

        //act
        theList.add("The end");
        String actual = theList.get(5);
        
        //asert
        assertEquals("The end", actual);
    }

    @Test
    void testRemoveFunctionRemoveElementAtIndex() {
        //arrange
        DynamicStringList theList = new DynamicStringList();
        theList.add("Hey");
        theList.add(", ");
        theList.add("Hello ");
        theList.add("there");
        theList.add(". ");

        //act
        theList.remove(2);
        String actual = theList.get(2);
        
        //asert
        assertEquals("there", actual);
    }

    @Test
    void testSizeFunctionShowsArraySize() {
        //arrange
        DynamicStringList theList = new DynamicStringList();
        theList.add("Hey");
        theList.add(", ");
        theList.add("Hello ");
        theList.add("there");
        theList.add(". ");

        //act
        int actual = theList.size();
        
        //asert
        assertEquals(5, actual);
    }

    @Test
    void testCapacityFunctionShowsArrayCapacity() {
        //arrange
        DynamicStringList theList = new DynamicStringList();
        theList.add("Hey");
        theList.add(", ");
        theList.add("Hello ");
        theList.add("there");
        theList.add(". ");

        //act
        int actual = theList.capacity();
        
        //asert
        assertEquals(10, actual);
    }
}
