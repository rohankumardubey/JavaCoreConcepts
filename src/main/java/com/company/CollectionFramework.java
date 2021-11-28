package com.company;

import java.util.*;

public class CollectionFramework {
    public static void main(String[] args) {

        System.out.println("------------------------------------");
        System.out.println();
        System.out.println("Collection framework Usage: ");
        System.out.println();


        //creating a sample list
        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(4);
        list.add(4);
        list.add(1);
        list.add(2);


        //using the collection framework to find the minimum element in an array
        System.out.print("minimum element is:");
        System.out.println(Collections.min(list));
        System.out.println();
        //using the collection framework to find the maximum element in an array
        System.out.print("maximum element is:");
        System.out.println(Collections.max(list));
        System.out.println();
        //using the collection framework to find the frequency of the element
        System.out.print("frequency of element 4 is:");
        System.out.println(Collections.frequency(list,4));
        System.out.println();

        //using the Collection framework to  sort the array in ascending order
        System.out.print("sorted element in ascending order is: ");
        Collections.sort(list);
        System.out.println(list);

        //using the Collection framework to  sort the array in descending order
        System.out.print("sorted element in descending order is: ");
        Collections.sort(list,Comparator.reverseOrder());
        System.out.println(list);


//        System.out.println("------------------------------------");
//        System.out.println();
//        System.out.println("Array Usage: ");
//        System.out.println();
//
//        //intitializing an array
//        int array[] ={1,2,3,4,0};
//
//        //using inbuilt binary search algorithm
//        int index = Arrays.binarySearch(array,2);
//        System.out.println(index);
//        System.out.println();
//
//        //sorting the array using the inbuilt sort array
//        Arrays.sort(array);
//        System.out.println(Arrays.toString(array));
//        System.out.println();
//
//        //used to fill all the elements with the same values
//        Arrays.fill(array,3);
//        System.out.println(Arrays.toString(array));
//        System.out.println();
//
//        //looping each element in the array
//        for(int i : array){
//            System.out.println(i);
//        }

//        System.out.println("------------------------------------");
//        System.out.println("Arraylist usage::");
//        ArrayList<Integer> arr = new ArrayList<>();
//        arr.add(1);
//        arr.add(2);
//        arr.add(3);
//        arr.add(4);
//
//        System.out.println("print all elements");
//        System.out.println(arr);
//        System.out.println();
//
//        System.out.println("all data cleared");
//        arr.clear();
//
//        System.out.println(arr);
//        System.out.println();
//
//        arr.add(1);
//        arr.add(2);
//        arr.add(3);
//        arr.add(4);
//        arr.add(5);
//        arr.add(6);
//        arr.add(7);
//
//        arr.remove(2);
//        System.out.println(arr);
//        System.out.println();
//
//        arr.remove(Integer.valueOf(7));
//        System.out.println(arr);
//        System.out.println();
//
//        arr.set(2,5);
//        System.out.println("data changed");
//        System.out.println(arr);
//        System.out.println();
//
//        System.out.println("iterate over elements ");
//        for (int i = 0; i < arr.size(); i++) {
//            System.out.println(arr.get(i));
//
//        }
//
//        System.out.println();
//
//        for(Integer e : arr){
//            System.out.println(e);
//        }
//
//        System.out.println();
//        Iterator<Integer> it = arr.iterator();
//        while(it.hasNext()){
//            System.out.println(it.next());
//        }

//        System.out.println("------------------------------------");
//
//        System.out.println();
//        System.out.println("stack usage::");
//        Stack<String> animals = new Stack<>();
//
//        animals.push("hen");
//        animals.push("cat");
//        animals.push("dog");
//        animals.push("elephant");
//
//        System.out.println(animals);
//        System.out.println(animals.peek());
//        animals.pop();
//        System.out.println(animals);


//        System.out.println("------------------------------------");
//
//        System.out.println();
//        System.out.println("Linkedlist usage using List::");
//        List<Integer> Linkedlist = new LinkedList<>();
//        Linkedlist.add(1);
//        Linkedlist.add(2);
//        Linkedlist.add(3);
//        Linkedlist.add(4);
//
//        System.out.println("print all elements");
//        System.out.println(Linkedlist);
//        System.out.println();
//
//        System.out.println("all data cleared");
//        Linkedlist.clear();
//
//        System.out.println(Linkedlist);
//        System.out.println();
//
//        Linkedlist.add(1);
//        Linkedlist.add(2);
//        Linkedlist.add(3);
//        Linkedlist.add(4);
//        Linkedlist.add(5);
//        Linkedlist.add(6);
//        Linkedlist.add(7);
//
//        Linkedlist.remove(2);
//        System.out.println(Linkedlist);
//        System.out.println();
//
//        Linkedlist.remove(Integer.valueOf(7));
//        System.out.println(Linkedlist);
//        System.out.println();
//
//        Linkedlist.set(2,5);
//        System.out.println("data changed");
//        System.out.println(Linkedlist);
//        System.out.println();


//        System.out.println("------------------------------------");
//
//        System.out.println();
//        System.out.println("Linkedlist usage using queue::");
//
//        Queue<Integer> linkedList = new LinkedList<>();
//
//        linkedList.offer(1);
//        linkedList.offer(2);
//        linkedList.offer(3);
//        linkedList.offer(4);
//
//        System.out.println(linkedList);
//        System.out.println();
//
//        System.out.println("removing element first");
//        linkedList.poll();
//        System.out.println(linkedList);
//
//        System.out.println();
//        System.out.println("watching the first element");
//        System.out.println(linkedList.peek());
//
//
//        System.out.println();
//        System.out.println("alternative for offer method is add if element is not added it throws an exception");
//        linkedList.add(5);
//        linkedList.add(6);
//        System.out.println(linkedList);
//        System.out.println();
//
//        System.out.println("alternative for poll method is remove if element is not deleted it throws an exception");
//        linkedList.remove();
//        System.out.println(linkedList);
//        System.out.println();
//
//        System.out.println("alternative for peek method is element if element is not shown it throws an exception");
//        System.out.println(linkedList.element());
//        System.out.println();
//


//        System.out.println("------------------------------------");
//        System.out.println();
//        System.out.println("PriorityQueue usage (min value ):");
//
//        Queue<Integer> pq = new PriorityQueue<>();
//        pq.offer(6);
//        pq.offer(1);
//        pq.offer(2);
//        pq.offer(3);
//        pq.offer(4);
//        pq.offer(5);
//
//        System.out.println(pq);
//        System.out.println();
//
//        System.out.println("return the minimum element");
//        System.out.println(pq.peek());
//        System.out.println();
//
//        System.out.println("removes the minimum element");
//        pq.poll();
//        System.out.println(pq);

//        System.out.println("------------------------------------");
//        System.out.println();
//        System.out.println("PriorityQueue usage (min value ):");
//
//        Queue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
//
//        pq.offer(1);
//        pq.offer(2);
//        pq.offer(3);
//        pq.offer(4);
//        pq.offer(5);
//        pq.offer(6);
//        System.out.println(pq);
//        System.out.println();
//
//        System.out.println("return the maximum element");
//        System.out.println(pq.peek());
//        System.out.println();
//
//        System.out.println("removes the maximum element");
//        pq.poll();
//        System.out.println(pq);

//        System.out.println("------------------------------------");
//        System.out.println();
//        System.out.println("ArrayDeque usage :");
//
//
//        ArrayDeque<Integer> ad = new ArrayDeque<>();
//
//        ad.offer(1);
//        ad.offer(2);
//        ad.offer(3);
//        ad.offer(4);
//        ad.offer(5);
//        ad.offer(6);
//
//
//
//
//        System.out.println(ad);
//        System.out.println();
//
//        System.out.println("add to first ");
//        ad.offerFirst(-1);
//        System.out.println(ad);
//        System.out.println();
//
//        System.out.println("add to last ");
//        ad.offerLast(7);
//        System.out.println(ad);
//        System.out.println();
//
//
//        System.out.println("looks for the first element");
//        System.out.println(ad.peek());
//        System.out.println();
//
//        System.out.println("looks for the first element using peekfirst");
//        System.out.println(ad.peekFirst());
//        System.out.println();
//
//        System.out.println("looks for the first element using peeklast");
//        System.out.println(ad.peekLast());
//        System.out.println();
//
//        System.out.println("delete  the first element");
//        ad.poll();
//        System.out.println(ad);
//        System.out.println();
//
//        System.out.println("delete the first element using pollFirst");
//        ad.pollFirst();
//        System.out.println(ad);
//        System.out.println();
//
//        System.out.println("delete the last element using pollLast");
//        ad.pollLast();
//        System.out.println(ad);
//        System.out.println();



//        System.out.println("------------------------------------");
//        System.out.println();
//        System.out.println("HashSet  usage (hash set randomly inserts the elements there is no order) :");
//          // all operations takes place in O(1) optimized data structure
//        Set<Integer> has = new HashSet<>();
//
//        has.add(1);
//        has.add(2);
//        has.add(3);
//        has.add(4);
//        has.add(5);
//
//        System.out.println("print elements");
//        System.out.println(has);
//        System.out.println();
//
//        System.out.println("remove element");
//        has.remove(5);
//        System.out.println();
//
//        System.out.println("check if element is present");
//        System.out.println(has.contains(4));
//        System.out.println();
//
//        System.out.println("check if set is empty or not");
//        System.out.println(has.isEmpty());
//        System.out.println();
//
//        System.out.println("check size of element");
//        System.out.println(has.size());
//        System.out.println();
//
//        System.out.println("clear all elements in set");
//        has.clear();
//        System.out.println(has);
//        System.out.println();



//        System.out.println("------------------------------------");
//        System.out.println();
//        System.out.println("LinkedHashSet  usage (LinkedHashSet inserts the elements in which it is inserted) :");
//
//        Set<Integer> has = new LinkedHashSet<>();
//
//        has.add(1);
//        has.add(2);
//        has.add(3);
//        has.add(4);
//        has.add(5);
//
//        System.out.println("print elements");
//        System.out.println(has);
//        System.out.println();
//
//        System.out.println("remove element");
//        has.remove(5);
//        System.out.println();
//
//        System.out.println("check if element is present");
//        System.out.println(has.contains(4));
//        System.out.println();
//
//        System.out.println("check if set is empty or not");
//        System.out.println(has.isEmpty());
//        System.out.println();
//
//        System.out.println("check size of element");
//        System.out.println(has.size());
//        System.out.println();
//
//        System.out.println("clear all elements in set");
//        has.clear();
//        System.out.println(has);
//        System.out.println();


//        System.out.println("------------------------------------");
//        System.out.println();
//        System.out.println("Treeset  usage (Treeset inserts the elements in ascending order and implements binary search tree ) :");
//        // all operations takes place in O(log n) as it implements binary search tree
//
//        Set<Integer> has = new TreeSet<>();
//
//        has.add(1);
//        has.add(2);
//        has.add(3);
//        has.add(4);
//        has.add(5);
//
//        System.out.println("print elements");
//        System.out.println(has);
//        System.out.println();
//
//        System.out.println("remove element");
//        has.remove(5);
//        System.out.println();
//
//        System.out.println("check if element is present");
//        System.out.println(has.contains(4));
//        System.out.println();
//
//        System.out.println("check if set is empty or not");
//        System.out.println(has.isEmpty());
//        System.out.println();
//
//        System.out.println("check size of element");
//        System.out.println(has.size());
//        System.out.println();
//
//        System.out.println("clear all elements in set");
//        has.clear();
//        System.out.println(has);


//        System.out.println("------------------------------------");
//        System.out.println();
//        System.out.println("hashmap  usage (all the operations in hash map occur in O(N)):");
//
//        System.out.println();
//
//
//        Map<String,Integer> map = new HashMap<>();
//
//        //is used to clear the elements in map
//        map.clear();
//
//        map.put("one",1);
//        map.put("two",2);
//        map.put("three",3);
//
//        //is used to check if the value is present so if it is present then the value is updated with
//        //new value
//        if(map.containsKey("three")){
//            map.put("three",4);
//        }
//
//        //is used to put the updated value if the value is present else add the new value
//        map.putIfAbsent("three",4);
//
//
//        //iterate over the hashmap values key and value pair
//
//        for(Map.Entry<String,Integer> e:map.entrySet()){
//            System.out.println(e.getKey() +":"+e.getValue());
//        }
//        System.out.println();
//
//        //get key values as set
//        System.out.println(map.keySet());
//        System.out.println();
//
//        //get values as set
//        System.out.println(map.values());
//        System.out.println();
//
//        //used to check if map is empty or not
//        System.out.println(map.isEmpty());

//        System.out.println("------------------------------------");
//        System.out.println();
//        System.out.println("TreeMap  usage (all the operations in treemap map occur in O(Log N) as under the hood there is binary search tree):");
//
//        System.out.println();
//
//
//        Map<String,Integer> map = new TreeMap<>();
//
//        //is used to clear the elements in map
//        map.clear();
//
//        map.put("one",1);
//        map.put("two",2);
//        map.put("three",3);
//
//        //is used to check if the value is present so if it is present then the value is updated with
//        //new value
//        if(map.containsKey("three")){
//            map.put("three",4);
//        }
//
//        //is used to put the updated value if the value is present else add the new value
//        map.putIfAbsent("three",4);
//
//        //used to remove the element that is present in the data
//        map.remove("three");
//
//
//        //iterate over the hashmap values key and value pair
//
//        for(Map.Entry<String,Integer> e:map.entrySet()){
//            System.out.println(e.getKey() +":"+e.getValue());
//        }
//        System.out.println();
//
//        //get key values as set
//        System.out.println(map.keySet());
//        System.out.println();
//
//        //get values as set
//        System.out.println(map.values());
//        System.out.println();
//
//        //used to check if map is empty or not
//        System.out.println(map.isEmpty());

    }
}
