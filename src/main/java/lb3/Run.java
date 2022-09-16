package lb3;

import lb3.controller.UniversityCreator;
import lb3.model.University;

public class Run {

    public static void main(String[] args) {
        UniversityCreator universityCreator = new UniversityCreator();
        University university = universityCreator.createTypicalUniversity();
        System.out.println(university.toString());
    }

}

