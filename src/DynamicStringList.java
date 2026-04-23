public class DynamicStringList implements StringList{
    int size;
    int capacity;
    String[] data;

    public String get(int index){
        
    }

    public void set(int index, String value){

    }

    public void add(String value){
        if(!(capacity()-size()>0)){
            //double our array size
        }

        //add the value to the index of size
        data[size] = value;

        size++;
        //size++
    }

    public String remove(int index){

    }

    public int size(){
        return size;
    }

    public int capacity(){
        return capacity;
    }

    public static void main(String[] args){
        size = 0;
        capacity = 10;
        data = new String[capacity];
    }
}
