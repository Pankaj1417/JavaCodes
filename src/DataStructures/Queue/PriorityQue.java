package DataStructures.Queue;

import java.util.ArrayList;
import java.util.List;

class PriorityQueMinHeap {
    // using min heap
   public List<Integer> minHeap;
    public PriorityQueMinHeap(){
        minHeap = new ArrayList<>();
    }
    public void add(int x){
        minHeap.add(x);
        upheapify(minHeap.size()-1);
    }
    private void upheapify(int cur){
        if(cur == 0){
            return;
        }
        int par = (cur-1)/2;
        if(minHeap.get(cur) < minHeap.get(par)){
            swap(cur,par);
            upheapify(par);
        }
    }
    public void swap(int i,int j){
        int ith = minHeap.get(i);
        int jth = minHeap.get(j);
        minHeap.set(i,jth);
        minHeap.set(j,ith);
    }
    public int remove(){
        if(minHeap.isEmpty()){
            return -1;
        }
        swap(0,minHeap.size()-1);
        int val = minHeap.get(size()-1);
        minHeap.remove(minHeap.size()-1);
        downHeapify(0);
        return val;
    }
    private void downHeapify(int pi){
        int min = pi;
        int left = pi*2+1;
        int right = pi*2+2;
        if(left<minHeap.size() && minHeap.get(left) < minHeap.get(min)){
            min = left;
        }
        if(right<minHeap.size() && minHeap.get(right) < minHeap.get(min)){
            min = right;
        }
        if(pi != min){
            swap(pi,min);
            downHeapify(min);
        }
    }
    public int peek(){
        if(minHeap.size() == 0){
            return -1;
        }
        return minHeap.get(0);
    }
    public int size(){
        return minHeap.size();
    }
}
class PriorityQueueMaxHeap{
   public List<Integer> data ;
    public PriorityQueueMaxHeap(){
        data = new ArrayList<>();
    }

                                                             //add

    public void add(int x){
        data.add(x);
       upHeapify(data.size()-1);
    }
    private void upHeapify(int ci){
        if(ci == 0) {
            return;
        }
        int pi = (ci-1)/2;
        if(data.get(pi) < data.get(ci)){
            swap(ci,pi);
            upHeapify(pi);
        }
    }
    private void swap(int i ,int j){
        int ith = data.get(i);
        int jth = data.get(j);
        data.set(i,jth);
        data.set(j,ith);
    }

                                                                //size

    public int size(){
        return data.size();
    }
                                                    //get max priority element

    public int peek(){
        if(data.isEmpty()){
            return -1;
        }
        return data.get(0);
    }

                                                    //remove
    public int remove(){
        int val = data.get(0);
        swap(0,data.size()-1);
        data.remove(data.size()-1);
        downHeapify(0);
        return val;
    }
    private void downHeapify(int pi){
        int max = pi;
        int left = pi*2+1;
        int right = pi*2+2;
        if(left<data.size() && data.get(left) > data.get(max)){
            max = left;
        }
        if(right < data.size() && data.get(right) > data.get(max)){
            max = right;
        }
        if(pi != max){
            swap(pi,max);
            downHeapify(max);
        }
    }
}

class Main{
    public static void main (String[] args)
    {

        // min heap

        PriorityQueMinHeap q = new PriorityQueMinHeap();
        for(int i=1;i<=10;i++){
            q.minHeap.add(i);
        }
        int x =  q.remove();
        System.out.println(x);
        x = q.size();
        System.out.println(x);
        x = q.peek();
        System.out.println(x);
        q.add(20);
        for(int x1 : q.minHeap){
            System.out.print(x1+" ");
        }
        System.out.println();
        System.out.println();
        System.out.println();

        //max heap

        PriorityQueueMaxHeap qMax = new PriorityQueueMaxHeap();
        for(int i =1; i<=10 ;i++){
            qMax.add(i);
        }
        for(int x1 : qMax.data){
            System.out.print(x1+" ");
        }
        System.out.println();
       int val =  qMax.remove();
        System.out.println(val);
        for(int x1 : qMax.data){
            System.out.print(x1+" ");
        }
        System.out.println();
        val = qMax.size();
        System.out.println(val);
        val = qMax.peek();
        System.out.println(val);
        qMax.add(20);
        for(int x1 : qMax.data){
            System.out.print(x1+" ");
        }
    }
}
