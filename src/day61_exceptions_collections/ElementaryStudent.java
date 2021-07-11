package day61_exceptions_collections;

/**
 *
 -> name, age
 -> encapsulate the data.

 in the setter classes:
 setName(String name) :
 if name is empty
 throw illegalArgument Exception
 with message: "Name cannot be empty"
 else
 this.name = name;

 setAge(int age)
 if age is < 5 or more than 12
 throw new illegalArgumentException
 with message: Age cannot be < 5 or > 12
 else
 this.age = age
 */

public class ElementaryStudent {
    private String name;
    private int age;

    public ElementaryStudent(){}

    public ElementaryStudent(String name, int age) {
        setName(name);
        setAge(age);
    }

    @Override
    public String toString() {
        return "ElementaryStudent{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty or null");
        } else {
            this.name = name;
        }
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age) {
            if (age<5 || age>12){
                throw new IllegalArgumentException("Age cannot be < 5 or > 12");
            }else{
                this.age = age;
            }
        }
}

