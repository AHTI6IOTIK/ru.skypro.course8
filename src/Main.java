public class Main {
    public static void main(String[] args) {
        Student st1 = new Student("st1", 10);
        Student st2 = new Student("st2", 11);
        Student st3 = new Student("st1", 10);


        System.out.print("st1.equals(st2) = " + st1.equals(st2));
        System.out.print(" st1.hachCode = " + st1.hashCode());
        System.out.println(" st2.hachCode = " + st2.hashCode());

        System.out.print("st2.equals(st3) = " + st2.equals(st3));
        System.out.print(" st2.hashCode = " + st2.hashCode());
        System.out.println(" st3.hashCode = " + st3.hashCode());

        System.out.print("st1.equals(st3) = " + st1.equals(st3));
        System.out.print(" st1.hashCode = " + st1.hashCode());
        System.out.println(" st3.hashCode = " + st3.hashCode());

    }
}