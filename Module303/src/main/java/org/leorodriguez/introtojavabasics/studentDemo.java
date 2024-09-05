package org.leorodriguez.introtojavabasics;

class StudentDemo {
    public static void main(String[] args) {
        PracticeStudent s1 = new PracticeStudent();//no-args constructor
        PracticeStudent s2 = new PracticeStudent("Justice","A","Davila",25,"123 ABC Lane",
                123456, 100,"Mrs. Justice");
        PracticeStudent s3;
        s3=new PracticeStudent("Takeisha","LR","White");
        //Norstar:
        //Since the Student objects' arguments are private they can't be directly changed
        //If it was public, I could use s1.middleName = "!@#$.
        //If it's private, I have to use setters and getters
        s1.setFirstName("Norstar");
        s1.setMiddleName("NMN");
        s1.setLastName("LN");
        s1.setAge(20);
        System.out.println(s1.getFirstName());
        System.out.println(s1.getMiddleName());
        System.out.println(s1.getLastName());
        System.out.println(s1.getAge());

    }
}