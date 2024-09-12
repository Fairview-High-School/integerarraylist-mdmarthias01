public class IntegerArrayList implements IntegerList{
    private Integer[]data;
    private int size;

    public IntegerArrayList(){
        data = new Integer[10];
        size = 0;
    }


     public void add(Integer val){
         if (size >= data.length){
            Integer[] biggerArray = new Integer[data.length * 2];
            for(int i=0; i<data.length; i++){
                biggerArray[i] = data[i];
            }
            data =biggerArray;
            
            
         }
        data[size] = val;
        size ++; 
     }


    public void add(int index, Integer val){
        throw new IndexOutOfBoundsException();

    }



    public void set(int index, Integer val){
        throw new IndexOutOfBoundsException();

    }




    public void clear(){
        throw new IndexOutOfBoundsException();

    }





    public Integer remove(int index){
        throw new IndexOutOfBoundsException();

    }



    public Integer get(int index){
        if(index < 0 || index >= size){
            throw new IndexOutOfBoundsException(" Index: " + index);
        }
        return data[index];
        

    }



    public int size(){
        throw new IndexOutOfBoundsException();

    }


    public boolean isEmpty(){
        throw new IndexOutOfBoundsException();

    }



    public boolean contains(Integer val){
        throw new IndexOutOfBoundsException();
    }



    public int indexOf(Integer val){
        throw new IndexOutOfBoundsException();

    }



    public boolean equals(List<Integer> other){
        throw new IndexOutOfBoundsException();
    }


    public String toString(){
        String result = "[";
        for (int i = 0; i <size-1; i++){
            result += data[i] + ",";
        } 
        
        result +=data[size-1] + "]";
        return result;

    }



    
}
