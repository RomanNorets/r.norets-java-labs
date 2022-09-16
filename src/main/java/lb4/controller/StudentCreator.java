package lb4.controller;

import lb4.model.Human;
import lb4.model.Student;

public class StudentCreator {


    public Student createStudent(Human human, int recordBookNumber) {


        Student student = new Student();
        student.setName(human.getName());
        student.setSurname(human.getSurname());
        student.setPatronymic(human.getPatronymic());

        student.recordBookNumber(recordBookNumber);
        student.setSex(human.getSex());

        return student;
    }

    public Student createTypicalStudent() {
        HumanCreator humanCreator = new HumanCreator();
        Human typicalHuman = humanCreator.createTypicalHuman();
        Student typicalStudent = createStudent(typicalHuman, 777);
        return typicalStudent;
    }

}

