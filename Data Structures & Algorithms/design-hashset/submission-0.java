class MyHashSet {
    
    private final Map<Integer, Boolean> container;
    public MyHashSet() {
        container = new HashMap<>();
    }

    public void add(int key) {
        container.put(key, true);
    }
    
    public void remove(int key) {
        container.remove(key);
    }
    
    public boolean contains(int key) {
        return container.getOrDefault(key, false);
    }
}

// add -> 
// contains -> 
// remove -> 

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */