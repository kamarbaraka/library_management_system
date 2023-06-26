package live;

import java.util.ArrayList;

public class ClassOfStudents
        extends ArrayList<Student> {
    private double highestMark;

    public Grade getHighestGrade(){
        var classOfStudents = this;
        var marks = new ArrayList<Double>();
        classOfStudents.forEach(eachStudent -> marks.add(eachStudent.getMarks()));

        this.highestMark = (double) marks.stream().reduce(Math::max).stream().toArray()[0];

        return switch ((int)this.highestMark / 10){
            case 10, 9, 8 -> Grade.A;
            case 7 -> Grade.B;
            case 6 -> Grade.C;
            case 5 -> Grade.D;
            default -> Grade.F;
        };
    }

    public double getHighestMark(){
        return this.highestMark;
    }
}

