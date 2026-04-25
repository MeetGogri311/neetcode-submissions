class DynamicArray {
public:
    int capacity, length, *arr;
    DynamicArray(int capacity) {
        arr = new int[capacity];
        length = 0;
        this->capacity = capacity;
    }

    int get(int i) {
        return arr[i];
    }

    void set(int i, int n) {
        arr[i] = n;
    }

    void pushback(int n) {
        length++;
        if(capacity < length){
            capacity=max(2*capacity, length);
            int* a = arr;
            arr = new int[capacity];
            for(int i = 0;i<length-1;i++) arr[i] = a[i];
        }
        arr[length-1] = n;
    }

    int popback() {
        length--;
        int result = arr[length];
        arr[length] = 0;
        return result;
    }

    void resize() {
        capacity*=2;
        int* a = arr;
        arr = new int[capacity];
        for(int i = 0;i<length-1;i++) arr[i] = a[i];
    }

    int getSize() {
        return length;
    }

    int getCapacity() {
        return capacity;
    }
};
