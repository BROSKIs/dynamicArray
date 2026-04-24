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

    @Override
    public String get(int index){
        if(index>=size || index<0) throw new IndexOutOfBoundsException("The Index is invalid");
        return data[index];
    }   

    @Override
    public void set(int index, String value){
        if(index>=size || index<0) throw new IndexOutOfBoundsException("The Index is invalid");
        data[index] = value;
    }

    @Override
    public void add(String value){
        if(!(capacity()-size()>0)){
            String[] old = data.clone();
            capacity = capacity*2; //double capacity

            data = new String[capacity];
            for(int i = 0; i<old.length;i++){
                data[i]=old[i];
            }
        }
        data[size] = value; //add the value to the index of size
        size++;
    }

    @Override
    public String remove(int index){
        String r = data[index];
        for(int i = index;i<=size;i++){
            data[i]=data[i+1];
        }
        size--;
        return r;
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
