package com.amara.palikala.jain;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App {

    public static void main(String[] args) {

        Person person = Person.builder()
                .setFathersName("father")
                .setFirstName("name")
                .setAge(22)
                .setHeight(25)
                .setLastName("lastName")
                .setMiddleName("middle Name")
                .setMothersName("mother")
                .setWeight(55)
                .build();

        System.out.println(person.toString());

    }

    private static void mapReturn() {
        Map<Integer, String> testMap = new HashMap<Integer, String>();
        testMap.put(10, "a");
        testMap.put(20, "b");
        testMap.put(30, "c");
        testMap.put(40, "d");

        Optional<Integer> value =  testMap.entrySet().stream().filter(e->e.getValue().equalsIgnoreCase("c"))
                  .map(Map.Entry::getKey).findFirst();

        System.out.println(value.get());
    }

    public static void map(){
            Map<String,String> m = new HashMap<>();
            m.put("FB","one");
            m.put("Ea","two");
            m.put(null,"258");

            Iterator ie = m.entrySet().iterator();
            while (ie.hasNext()){
                Map.Entry<String, String> item= (Map.Entry<String, String>)ie.next();
                System.out.println(item.getKey());
                System.out.println(item.getValue());
            }

            for(Map.Entry<String, String> item: m.entrySet()){
                System.out.println(item.getKey());
                System.out.println(item.getValue());
            }
            System.out.println(m.values());
            System.out.println(m);

        /*System.out.println("Using comparable");

        List<Fruit> fruitList = Arrays.asList(new Fruit("Apple","found in winter",35),new Fruit("Citrus","found in Summer",28),new Fruit("Mango","king of fruits",30));
        Collections.sort(fruitList);
        for (Fruit item:fruitList){
            System.out.println(item);
        }
        System.out.println();
        System.out.println("using comaparator");

        List<SameFruit> fruitNamecomparator = Arrays.asList(new SameFruit("Apple","found in winter",35),new SameFruit("Citrus","found in Summer",28),new SameFruit("Mango","king of fruits",30));
        Collections.sort(fruitNamecomparator,new FruitNameComparator());
        for (SameFruit item:fruitNamecomparator){
            System.out.println(item);
        }
        System.out.println("comaparing by fruit Name");
        System.out.println();
        System.out.println("comparing by Size");
        Collections.sort(fruitNamecomparator, new FruitSizeComparator());
        for (SameFruit item:fruitNamecomparator){
            System.out.println(item);
        }*/
    }

    public static void sortNumbers(int arr[]){
        //1,2,3,5,4,8,9,6,7
        int temp = 0;
        for(int i=0;i<arr.length;i++){
            for(int j=1;j<=i;j++){
                if(arr[j]>arr[i]){
                    temp = arr[i];
                    arr[j] = arr[i];
                    arr[j]=temp;
                }
            }
            for (int k=0;k<arr.length;k++){
                System.out.println(arr[k]);
            }
        }
    }
}
