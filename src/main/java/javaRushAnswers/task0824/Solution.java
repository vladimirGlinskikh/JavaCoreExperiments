package javaRushAnswers.task0824;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) throws IOException {
        Human child = new Human("Игорь", true, 25, null);
        Human child1 = new Human("Артем", true, 20, null);
        Human child2 = new Human("Петя", true, 10, null);
        Human father = new Human("Валерий", true, 45, new ArrayList<>(Arrays.asList(child, child1, child2)));
        Human mother = new Human("Елена", false, 40, new ArrayList<>(Arrays.asList(child, child1, child2)));
        Human grandFather1 = new Human("Василий", true, 70, new ArrayList<>(Arrays.asList(mother)));
        Human grandMother1 = new Human("Мария", false, 65, new ArrayList<>(Arrays.asList(mother)));
        Human grandFather2 = new Human("Николай", true, 85, new ArrayList<>(Arrays.asList(father)));
        Human grandMother2 = new Human("Люся", false, 80, new ArrayList<>(Arrays.asList(father)));
        System.out.println(child);
        System.out.println(child1);
        System.out.println(child2);
        System.out.println(mother);
        System.out.println(father);
        System.out.println(grandFather1);
        System.out.println(grandMother1);
        System.out.println(grandFather2);
        System.out.println(grandMother2);
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
