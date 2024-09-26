public class IntegerArrayList implements IntegerList {
    private Integer[] data;
    private int size;

    public IntegerArrayList() {
        data = new Integer[10];
        size = 0;
    }

    public void add(Integer val) {
        if (size >= data.length) {
            Integer[] biggerArray = new Integer[data.length * 2];
            for (int i = 0; i < data.length; i++) {
                biggerArray[i] = data[i];
            }
            data = biggerArray;
        }
        data[size] = val;
        size++;
    }

    public void add(int index, Integer val) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        }
        if (size >= data.length) {
            Integer[] biggerArray = new Integer[data.length * 2];
            for (int i = 0; i < data.length; i++) {
                biggerArray[i] = data[i];
            }
            data = biggerArray;
        }
        for (int i = size; i > index; i--) {
            data[i] = data[i - 1];
        }
        data[index] = val;
        size++;
    }

    public void set(int index, Integer val) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        data[index] = val;
    }

    public void clear() {
        data = new Integer[10];
        size = 0;
    }

    public Integer remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        Integer removed = data[index];
        for (int i = index; i < size - 1; i++) {
            data[i] = data[i + 1];
        }
        data[size - 1] = null;
        size--;
        return removed;
    }

    public Integer get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index);
        }
        return data[index];
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean contains(Integer val) {
        return indexOf(val) != -1;
    }

    public int indexOf(Integer val) {
        for (int i = 0; i < size; i++) {
            if (data[i].equals(val)) {
                return i;
            }
        }
        return -1;
    }

    public boolean equals(List<Integer> other) {
        if (other == null || other.size() != size) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            if (!data[i].equals(other.get(i))) {
                return false;
            }
        }
        return true;
    }

    public String toString() {
        if (size == 0) {
            return "[]";
        }
        StringBuilder result = new StringBuilder("[");
        for (int i = 0; i < size - 1; i++) {
            result.append(data[i]).append(", ");
        }
        result.append(data[size - 1]).append("]");
        return result.toString();
    }
}
