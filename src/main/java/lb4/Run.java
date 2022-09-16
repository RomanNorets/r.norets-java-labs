package lb4;

import lb4.controller.UniversityCreator;
import lb4.model.University;

public class Run {

    public static void main(String[] args) {
        UniversityCreator universityCreator = new UniversityCreator();
        University university = universityCreator.createTypicalUniversity();
        System.out.println(university.toString());
    }

}

