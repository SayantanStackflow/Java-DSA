abstract class Person{
    abstract void Read( int a, String n);
    abstract void Print();
}
    class Student extends Person{
        int age;
        String name;
        void Read(int a, String n){
            age= a;
            name= n;
        }
        void Print(){
            System.out.println("-----STUDENT-----");
            System.out.println("Name: "+name);                
            System.out.println("Age: "+age);
        }
        
    }

    class Teacher extends Person{
        int age;
        String name;
        void Read(int a, String n){
            age= a;
            name= n;
        }
            void Print(){
                System.out.println("-----TEACHER-----");
                System.out.println("Name: "+name);
                System.out.println("Age: "+age);
            }
        
    }

class Records{
    public static void main(String[] args) {
        Person s= new Student();
        s.Read(20, "Alex");
        s.Print();
        Person t= new Teacher();
        t.Read(21, "Alice");
        t.Print();
    }
}

