package org.example;

import java.util.*;

public class WorkintechList<T> extends ArrayList<T> {
    private List<T> repeatList;

    public WorkintechList(){
        this.repeatList = new ArrayList<>();
    }
    public int size(){
        return this.repeatList.size();
    }
    public T get(int index){
        return this.repeatList.get(index);
    }
    public boolean add(T element){
        if (!repeatList.contains(element)){
            repeatList.add(element);
            return true;
        }
        return false;
    }
    public void sort(){
        if (repeatList.isEmpty() || repeatList.size() == 1) {
            return;
        }
        if (repeatList.get(0) instanceof String) {
            Collections.sort((List<String>) repeatList); // String sıralama
        } else if (repeatList.get(0) instanceof Number) {
            Collections.sort((List<Number>) repeatList, Comparator.comparingDouble(Number::doubleValue)); // Sayısal sıralama
        } else {
            System.out.println("Desteklenmeyen veri tipi!!!"); // Desteklenmeyen tip uyarısı
        }
    }
    public boolean remove(Object element){
        if(repeatList.remove(element)){
            sort();
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        WorkintechList<String> stringList = new WorkintechList<>();
        stringList.add("elma");
        stringList.add("armut");
        stringList.add("kiraz");
        stringList.add("elma");//eklenmeyecek
        stringList.sort();
        System.out.println(stringList.get(0));//armut
        System.out.println(stringList.get(1));//elma
        System.out.println(stringList.get(2));//kiraz
        stringList.remove("elma");
        System.out.println(stringList.get(0));//armut
        System.out.println(stringList.get(1));//kiraz
    }

}
