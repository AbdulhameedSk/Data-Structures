 class Node{
        int key;
        int value;
        Node(int key,int value){
            this.key=key;
            this.value=value;
        }
    }
class MyHashMap {
int ARRAY_SIZE = 10000;
List<Node>[] data = new ArrayList[ARRAY_SIZE];

    public MyHashMap() {
        for(int i=0;i<ARRAY_SIZE;i++){
            data[i]=new ArrayList<>();
        }        
    }
    public int hash(int key){
        return key%ARRAY_SIZE;
    }
    public void put(int key, int value) {
        int index=hash(key);
        for(Node node:data[index]){
        if(node.key==key){    node.value=value; return; }
        }
data[index].add(new Node(key,value));
    }
    
    public int get(int key) {
        int index=hash(key);
        for (Node node : data[index]) { if (node.key == key) { return node.value; }  }return -1;
    }
    
    public void remove(int key) {
        int index=hash(key);{
        data[index].removeIf(node -> node.key==key);           
        }
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */