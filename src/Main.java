public class Main {
    public static void main(String[] args) {

        MyKenquist<Integer> arrayList = new MyKenquist<>();
        arrayList.add(5);
        arrayList.add(3);
        arrayList.sort();
        System.out.println(arrayList.get(0));


        MyKelandist<String> linkedList = new MyKelandist<>();
        linkedList.add("Banana");
        linkedList.add("Apple");
        linkedList.sort();
        System.out.println(linkedList.get(0));


        MyStools<String> stack = new MyStools<>();
        stack.push("Apple");
        stack.push("Strawberry ");
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}