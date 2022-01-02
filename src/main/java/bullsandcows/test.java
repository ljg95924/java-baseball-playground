package bullsandcows;

public class test {
    String name;
    int age;


    private void Tes(){
        System.out.println(test.this.name);
        System.out.println(test.this.age);
    }
    test(String name, int age) {
        this.name = name;
        this.age = age;

    }

    public static void main(String[] args) {
        test Test= new test("LEE",20);
        System.out.println(Test.name);
        System.out.println(Test.age);
        Test.Tes();
    }


}
