package hello;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class HelloLombok {

    private String name;
    private int age;

    public static void main(String[] args) {
       HelloLombok helloLombok = new HelloLombok();
        helloLombok.setName("asas");
        helloLombok.setAge(123);

        String nn = helloLombok.getName();
        System.out.println("nn = " + nn);

        System.out.println("helloLombok = " + helloLombok);
    }
}
