//package java1702.javase.basic.reflect;
//import java.lang.reflect.Field;
///**
// * Created by heishuai.china.cn
// * 2017/5/4 9:09
// * JAVASE
// */
//public class AccessibleTest {
//    public static void main(String[] args) {
//            public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
//            Person person = new Person(29);
//
//                    System.out.println(person.age);
//                    Field age = Class.forName("java1702.javase.reflect.Person").getDeclaredField("age");
//                    age.setAccessible(true);
//                    System.out.println(age.get(person));
//        }
//    }
//
//    class Person {
//        private int age;
//
//        public Person(int age) {
//            this.age = age;
//        }
//    }
