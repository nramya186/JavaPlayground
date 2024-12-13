package org.section9.class_object;

class Subject {
    private String subId;
    private String subName;
    private Double maxMarks;
    private Double marksObtain;

    //constructor
    public Subject(String subId, String subName, double maxMarks, double marksObtain) {
        this.subId = subId;
        this.subName = subName;
        this.maxMarks = maxMarks;
        this.marksObtain = marksObtain;
    }

    public String getSubId() {
        return subId;
    }

    public void setSubId(String subId) {
        this.subId = subId;
    }

    public String getSubName() {
        return subName;
    }

    public void setSubName(String subName) {
        this.subName = subName;
    }

    public Double getMaxMarks() {
        return maxMarks;
    }

    public void setMaxMarks(Double maxMarks) {
        this.maxMarks = maxMarks;
    }

    public Double getMarksObtain() {
        return marksObtain;
    }

    public void setMarksObtain(double marksObtain) {
        this.marksObtain = marksObtain;
    }

    boolean isQualified(double m) {
        return marksObtain >= maxMarks / 10 * 4;
    }

    public String toString() {
        return "\nsubId: " + getSubId() + "\nSuName: " + getSubName() + "Max marks:" + getMaxMarks() + "obtain max: " + getMarksObtain();
    }
}

class Student {
    private String rollNo;
    private String name;
    private String ddept;
    private String[] subjects;

    public String rollNo() {
        return rollNo;
    }

    public Student setRollNo(String rollNo) {
        this.rollNo = rollNo;
        return this;
    }

    public String name() {
        return name;
    }

    public Student setName(String name) {
        this.name = name;
        return this;
    }

    public String ddept() {
        return ddept;
    }

    public Student setDdept(String ddept) {
        this.ddept = ddept;
        return this;
    }


    public String[] subjects() {
        return subjects;
    }

    public Student setSubjects(String[] subjects) {
        this.subjects= subjects;
        return this;
    }

    public Student(String rollNo,String name,String ddept,String[] subjects){
        this.rollNo =rollNo;
        this.name=name;
        this.ddept =ddept;
        this.subjects=subjects;
    }


}

public class C4_Array_of_Obj_Challenge {
    public static void main(String[] args) {
        Subject subs[] = new Subject[3];
        subs[0] = new Subject("s101", "ds", 100, 80);
        subs[1] = new Subject("s102", "algo", 100, 70);
        subs[2] = new Subject("s103", "os", 100, 30);

        for (Subject s : subs) {
            System.out.println(s);
            System.out.println(s.isQualified(s.getMarksObtain()));
        }
String[] studentSub={"s101","s102","s103"};

        Student s= new Student("s1","ram","cs",studentSub);
//Using String.format()
        System.out.println(String.format("\nStudent Details: \n Rollno: %s,\n Name: %s, \n Department: %s,\n Subjects: %s\"",s.rollNo(),s.name(),s.ddept(),String.join(",",s.subjects())));
    }
}
