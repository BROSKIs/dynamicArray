public class DynamicStringList implements StringList{
    int size;
    int capacity;
    String[] data;

    public String get(int index){
        if(index>=size || index<0) throw new IndexOutOfBoundsException("The Index is invalid");
        return data[index];
    }

    public void set(int index, String value){

    }
    //Hopefully good
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
