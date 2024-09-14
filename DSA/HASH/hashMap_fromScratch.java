package HASH;
import java.util.*;


public class hashMap_fromScratch {
    static class HashMap<KEY,VALUE>{
        private class Node{
            KEY key;
            VALUE value;

            //constructor - Node
            Node(KEY x, VALUE y){
                this.key = x;
                this.value = y;
            }
        }

        private int n; // n is total no. of nodes in hashmap
        private int N; // n is total no. of buckets in that array
        private LinkedList<Node> buckets[]; // each bucket has a linkedlist of node type

        //constructor - HashMap
        @SuppressWarnings("unchecked")
        HashMap(){
            this.N = 4;//no. of buckets in array

            // Initialize an array `buckets` with 4 slots, where each slot will hold a LinkedList of Node objects.
            // Each bucket will handle collisions by storing multiple key-value pairs in a linked list.         
            this.buckets = new LinkedList[4];// Example before loop: [null, null, null, null]
            
            // The loop ensures that each bucket is initialized as an empty LinkedList<Node>.
            for (int i = 0; i < buckets.length; i++) {
                this.buckets[i] = new LinkedList<>(); // Example after loop: [LinkedList1, LinkedList2, LinkedList3, LinkedList4]
            }
        }


        //put a node in hash map
        private int hashFunc(KEY x){
            int randomHash = x.hashCode(); // generate a hash
            int positive = Math.abs(randomHash); // making the hash positive
            int required = positive % N; // dividing by N will give a integer between 0 and N-1 which is required(here 0,1,2,3) and not a large no. in thousands(234234,2122) 

            return required ;
        } 
        
        //to search the position of node in linkedlist
        private int searchIdx_LL(KEY x, int BucketIndex){
            LinkedList<Node> ll = buckets[BucketIndex]; // get linkedlist at the desired bi
            for (int i = 0; i < ll.size(); i++) {// checking every node
                if (ll.get(i).key == x) {// if value matchees
                    return i;//di
                } 
            }
            
            return -1;// doesnt exists
        }
        
        //hashmap function - put
        public void put(KEY x, VALUE y){

            int bi = hashFunc(x);
            int di = searchIdx_LL(x,bi);

            if ( di == -1 ) { // node doesnt exist 
                buckets[bi].add(new Node(x, y));
                n++; // update the number of nodes
            } else {
                Node data = buckets[bi].get(di);// get the node and store in data
                data.value = y ;// update the value of the node
            }

            //check if lambda exceeds or not
            double lambda = (double) n/N;
            if ( lambda > 2.0) { // k = 2.0 is assumed for this hashmap
                reHashing();
            }

        }

        // rehash if the buckets size is exceeded         
        @SuppressWarnings("unchecked")
        private void reHashing(){
            LinkedList<Node> oldBucket[] = buckets;// saves all the buckets in oldbuckets

            //doubles the bucket size
            N = N *2;

            // Create new bucket array with double size
            buckets = new LinkedList[N]; // [null,null,null,null,null,null,null,null]

            //switches null intnces w LL
            for (int i = 0; i < buckets.length; i++) {
                buckets[i] = new LinkedList<>();// [LinkedList1, LinkedList2, LinkedList3, LinkedList4 .... LinkedList8]
            }

            for (int i = 0; i < oldBucket.length; i++) {
                // create LL for every bucket in oldBucket -> bucket0,bucket1..bucket3
                LinkedList<Node> ll = oldBucket[i];
                for (int j = 0; j < ll.size(); j++) {
                    //gets each node from LL at oldBucket[i] and stores the current key-value pair in x
                    Node x = ll.get(j);

                    //calls put function to add the node in new bucket of double size
                    put(x.key,x.value);
                }
            }
        }


        //hashmap function - containsKey
        public Boolean containsKey(KEY x){
            
            int bi = hashFunc(x);
            int di = searchIdx_LL(x, bi);

            if (di == -1) {
                return false;
            } else {
                return true;
            }
        }

        //hashmap function - remove
        public KEY remove(KEY x){
            int bi = hashFunc(x);
            int di = searchIdx_LL(x, bi);
            if (di == -1) {
                return null;
            } else {
                Node y = buckets[bi].remove(di);
                KEY z = y.key;
                n--;//removing thr node for total no. of nodes
                return z;
            }
        }

        //hashmap function - get
        public VALUE get(KEY x){
            int bi = hashFunc(x);
            int di = searchIdx_LL(x, bi);

            if (di == -1) {
                return null;
            } else {
                VALUE y = buckets[bi].get(di).value;
                return y;
            }
        }

        //hashmap function - keyset
        public ArrayList<KEY> keyset(){
        ArrayList<KEY> keys = new ArrayList<>();

        for (int i = 0; i < buckets.length; i++) {//bi
            LinkedList<Node> ll = buckets[i];
            for (int j = 0; j < ll.size(); j++) {//di
                Node b = ll.get(j);
                keys.add(b.key);
            }   
        }
            return keys;
        }

        //hashmap function - isEmpty
        public boolean isEmpty(){
            return n==0;
        }

        // chatgpt this func to print value intially during writing this code
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("{");

            for (int i = 0; i < buckets.length; i++) {
                for (Node node : buckets[i]) {
                    sb.append(node.key).append("=").append(node.value).append(", ");
                }
            }

            if (sb.length() > 1) {
                sb.setLength(sb.length() - 2); // Remove last comma and space
            }
            sb.append("}");
            return sb.toString();
        }

    }

    public static void main(String[] args) {
        // not using collection framework
        HashMap<String, Integer> map = new HashMap<>();
        System.out.println("is the set empty ? : "+map.isEmpty());

        map.put("india", 190);
        map.put("usa", 234);
        map.put("germany", 543);
        map.put("france", 876);
        map.put("canada", 109);
        map.put("japan", 385);
        map.put("china", 679);
        map.put("brazil", 432);
        map.put("australia", 251);
        map.put("Nigeria",123);
        map.put("india", 725); // Repeating "india"    

        System.out.println(map);
        System.out.println("is the set empty ? : "+map.isEmpty());

        System.out.println(map.get("india"));
        System.out.println(map.get("italy"));

        System.out.println("the country exists: "+ map.containsKey("india"));
        System.out.println("the country exists: "+ map.containsKey("italy"));

        System.out.println(map.remove("india"));
        System.out.println(map.remove("italy"));

        System.out.println(map);

        ArrayList<String> keys = map.keyset();
            for (int i = 0; i < keys.size(); i++) {
                System.out.println(keys.get(i) +" = " + map.get(keys.get(i)));
            }
        }
}
