import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assumptions.abort;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DynamicStringListTest {
      /**
   * Retrieves the string at the specified index in the list.
   *
   * @param index the index of the string to retrieve.
   * @return the string at the specified index.
   * @throws IndexOutOfBoundsException if the index is out of range (index < 0 or index >= size()).
   */
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

    


  /**
   * Replaces the string at the specified index with the given value.
   *
   * @param index the index of the string to replace.
   * @param value the new value to set at the specified index.
   * @throws IndexOutOfBoundsException if the index is out of range (index < 0 or index >= size()).
   */
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

  /**
   * Adds a new string to the end of the list.
   *
   * @param value the string to add to the list.
   */
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
  /**
   * Removes the string at the specified index from the list.
   *
   * @param index the index of the string to remove.
   * @return the string that was removed.
   * @throws IndexOutOfBoundsException if the index is out of range (index < 0 or index >= size()).
   */
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
  /**
   * Returns the number of strings currently in the list.
   *
   * @return the size of the list.
   */
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
  /**
   * Returns the current capacity of the list (i.e., the number of elements it can hold before resizing).
   *
   * @return the capacity of the list.
   */
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
        assertEquals(1, actual);
    }
}
