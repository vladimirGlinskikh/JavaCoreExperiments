package javaRushAnswers.task0824;

import java.io.IOException;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        Human child1 = new Human("Игорь", true, 25, null);
        Human child2 = new Human("Артем", true, 20, null);
        Human child3 = new Human("Петя", true, 10, null);

        ArrayList<Human> child = new ArrayList<>();
        child.add(child1);
        child.add(child2);
        child.add(child3);

        Human father = new Human("Валерий", true, 45, child);
        Human mother = new Human("Елена", false, 40, child);

        ArrayList<Human> parent1 = new ArrayList<>();
        parent1.add(father);
        ArrayList<Human> parent2 = new ArrayList<>();
        parent2.add(mother);


        Human grandFather1 = new Human("Василий", true, 70, parent1);
        Human grandMother1 = new Human("Мария", false, 65, parent1);

        Human grandMother2 = new Human("Люся", false, 80, parent2);
        Human grandFather2 = new Human("Николай", true, 85, parent2);

        System.out.println(grandFather1);
        System.out.println(grandFather2);
        System.out.println(grandMother1);
        System.out.println(grandMother2);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(child1);
        System.out.println(child2);
        System.out.println(child3);
    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children;

        public Human(String name, boolean sex, int age, ArrayList<Human> children) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }

        //напишите тут ваш код
        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;
            if (this.children == null)
                return text;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }
}
