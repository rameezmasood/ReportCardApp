package com.example.muhammad.reportapp;

public class ReportCard {

    private static final String SCHOOL_NAME = "Saylani Mass Training";
    public static final double TOTAL_SUB = 5.0d;

    private String studentName;
    private int rollNumber;

    private int englishMarks;
    private int mathMarks;
    private int physicsMarks;
    private int chemistryMarks;
    private int computerMarks;

    private int sum;
    private double percentage;

    public ReportCard(int computerMarks,
                      int chemistryMarks,
                      int physicsMarks,
                      int mathMarks,
                      int englishMarks,
                      String studentName,
                      int rollNumber) {
        this.computerMarks = computerMarks;
        this.chemistryMarks = chemistryMarks;
        this.physicsMarks = physicsMarks;
        this.mathMarks = mathMarks;
        this.englishMarks = englishMarks;
        this.studentName = studentName;
        this.rollNumber = rollNumber;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public int getEnglishMarks() {
        return englishMarks;
    }

    public void setEnglishMarks(int englishMarks) {
        this.englishMarks = englishMarks;
    }

    public int getMathMarks() {
        return mathMarks;
    }

    public void setMathMarks(int mathMarks) {
        this.mathMarks = mathMarks;
    }

    public int getPhysicsMarks() {
        return physicsMarks;
    }

    public void setPhysicsMarks(int physicsMarks) {
        this.physicsMarks = physicsMarks;
    }

    public int getChemistryMarks() {
        return chemistryMarks;
    }

    public void setChemistryMarks(int chemistryMarks) {
        this.chemistryMarks = chemistryMarks;
    }

    public int getComputerMarks() {
        return computerMarks;
    }

    public void setComputerMarks(int computerMarks) {
        this.computerMarks = computerMarks;
    }

    public static String getSchoolName() {
        return SCHOOL_NAME;
    }

    private String getGrade(int eng,
                            int math,
                            int phy,
                            int chem,
                            int social) {
        String grade;
        sum = eng + math + phy + chem + social;
        percentage = sum / TOTAL_SUB;

        if (percentage >= 90.0) {
            grade = "A+1";
        } else if (percentage < 90.0 && percentage >= 80.0) {
            grade = "A";
        } else if (percentage < 80.0 && percentage >= 70.0) {
            grade = "B";
        } else if (percentage < 70.0 && percentage >= 60.0) {
            grade = "C";
        } else if (percentage < 60.0 && percentage >= 50.0) {
            grade = "D";
        } else {
            grade = "Fail";
        }
        return grade;
    }

    public String displayResult() {
        return "University: " + getSchoolName() + '\n' +
                "Student Name: " + studentName + '\n' +
                "Roll Number: " + rollNumber + '\n' +
                "English Marks: " + englishMarks + '\n' +
                "Math Marks: " + mathMarks + '\n' +
                "Physics Marks: " + physicsMarks + '\n' +
                "Chemistry Marks: " + chemistryMarks + '\n' +
                "Computer Marks: " + computerMarks + '\n' +
                "Grade: " + getGrade(englishMarks, mathMarks, physicsMarks, chemistryMarks, computerMarks);
    }

    @Override
    public String toString() {
        return "ReportCard{" +
                "studentName='" + studentName + '\'' +
                ", rollNumber=" + rollNumber +
                ", englishMarks=" + englishMarks +
                ", mathMarks=" + mathMarks +
                ", physicsMarks=" + physicsMarks +
                ", chemistryMarks=" + chemistryMarks +
                ", computerMarks=" + computerMarks +
                ", grade='" + getGrade(englishMarks, mathMarks, physicsMarks, chemistryMarks, computerMarks) + '\'' +
                '}';
    }
}
