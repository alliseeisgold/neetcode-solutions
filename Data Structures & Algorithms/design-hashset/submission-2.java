public class MyHashSet {
    private int[] set;

    public MyHashSet() {
        set = new int[31251];
    }

    public void add(int key) {
        set[key / 32] |= getMask(key);
    }

    public void remove(int key) {
        if (contains(key)) {
            set[key / 32] ^= getMask(key);
        }
    }

    public boolean contains(int key) {
        return (set[key / 32] & getMask(key)) != 0;
    }

    private int getMask(int key) {
        return 1 << (key % 32);
    }
}

