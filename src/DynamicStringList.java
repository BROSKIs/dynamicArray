public class DynamicStringList implements StringList{
    private int size;
    private int capacity;
    private String[] data;
    //constructor
    public DynamicStringList(){
        size = 0;
        capacity = 10;
        data = new String[capacity];
    }
    //Should be good
    @Override
    public String get(int index){
        if(index>=size || index<0) throw new IndexOutOfBoundsException("The Index is invalid");
        return data[index];
    }   
    //Should be good
    @Override
    public void set(int index, String value){
        if(index>=size || index<0) throw new IndexOutOfBoundsException("The Index is invalid");
        data[index] = value;
    }

    //Hopefully good
    @Override
    public void add(String value){
        if(!(capacity()-size()>0)){
            String[] old = data.clone();
            capacity = capacity*2;

            data = new String[capacity];
            for(int i = 0; i<old.length;i++){
                data[i]=old[i];
            }
        }

        //add the value to the index of size
        data[size] = value;

        size++;
        //size++
    }

    @Override
    public String remove(int index){
        
    }

    @Override
    public int size(){
        return size;
    }

    @Override
    public int capacity(){
        return capacity;
    }
}
