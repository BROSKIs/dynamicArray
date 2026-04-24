import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DynamicStringListTest {
   
  //public String get(int index);
    @Test
    void testGetFunction() {
        //arrange
        DynamicStringList theList =new DynamicStringList();
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

  //public void set(int index, String value);
  @Test
    void testSetFunction() {
        //arrange
        DynamicStringList theList =new DynamicStringList();
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

  //public void add(String value);
  @Test
    void testAddFunction() {
        //arrange
        DynamicStringList theList =new DynamicStringList();
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
  //public String remove(int index);
    @Test
    void testRemoveFunction() {
        //arrange
        DynamicStringList theList =new DynamicStringList();
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
  //public int size();
    @Test
    void testSizeFunction() {
        //arrange
        DynamicStringList theList =new DynamicStringList();
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
  //public int capacity();
    @Test
    void testCapacityFunction() {
        //arrange
        DynamicStringList theList =new DynamicStringList();
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
