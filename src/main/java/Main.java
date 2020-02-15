public class Main {
    public static void main(String[] args) {
        GenericMethod genericMethod = new GenericMethod();
        genericMethod.print();

        GenericsClass<Integer> q = new GenericsClass<>();
        q.setT(1000);
        q.getT();

        GenericsClass<String> integerInstance = new GenericsClass<>();
        integerInstance.setT("Test");
        integerInstance.getT();

        System.out.println(q.getT() + "\n" + integerInstance.getT());
    }
}
