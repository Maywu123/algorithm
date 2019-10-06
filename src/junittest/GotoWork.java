package junittest;

import java.util.Arrays;

public class GotoWork {

    public String[] prepareSkills() {

        String[] skill = { "Java", "MySQL", "JSP" };
        System.out.println("My skills include : " + Arrays.toString(skill));
        return skill;
    }

    public String[] addSkills() {
        String[] skill = { "Java", "MySQL", "JSP", "JUnit" };
        System.out.println("Look, my skills include : " + Arrays.toString(skill));
        return skill;
    }

    public int add(int x ,int y){

        return x + y;

    }

    public int division(int a, int b){

        return a / b;

    }


    public Boolean Prime(int n) {
        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

}
