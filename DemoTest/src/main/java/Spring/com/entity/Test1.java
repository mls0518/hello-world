package Spring.com.entity;

import java.util.*;

public class Test1 {

    private String[] myStrs;
    private List<String> myList;
    private Set<String> mySet;
    private Map<String,String> myMap;
    private Properties myProps;


    public void setMyStrs(String[] myStrs) {
        this.myStrs = myStrs;
    }

    public void setMyList(List<String> myList) {
        this.myList = myList;
    }

    public void setMySet(Set<String> mySet) {
        this.mySet = mySet;
    }

    public void setMyMap(Map<String, String> myMap) {
        this.myMap = myMap;
    }

    public void setMyProps(Properties myProps) {
        this.myProps = myProps;
    }

    public Test1(String[] myStrs, List<String> myList, Set<String> mySet, Map<String, String> myMap, Properties myProps) {
        this.myStrs = myStrs;
        this.myList = myList;
        this.mySet = mySet;
        this.myMap = myMap;
        this.myProps = myProps;
    }

    public Test1() {}

    public void test1(){
        System.out.println(Arrays.toString(myStrs));
        System.out.println(myList);
        System.out.println(mySet);
        System.out.println(myMap);
        System.out.println(myProps);

    }
}
