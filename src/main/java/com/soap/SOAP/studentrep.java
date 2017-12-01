package com.soap.SOAP;

import https.www_enicarthage_com.xml.school.Student;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;

/**
 * Created by oussa on 28/11/2017.
 */


    @Component
    public class studentrep {
        private ArrayList<Student> students ;
        private ArrayList<Student> b ;

        public ArrayList<Student> getstudents() {
            return students;
        }

        public ArrayList<Student> getB() {
            return b;
        }

        @PostConstruct
        public void initData() {
            students = new ArrayList<Student>();


            Student student = new Student();
            student.setName("Oussama");
            student.setClasse("SIA");
            student.setMoy(12.3);
            student.setNiveau(3);
            students.add(student);

             student = new Student();
            student.setName("Oussama");
            student.setClasse("SIA");
            student.setMoy(12.3);
            student.setNiveau(3);
            students.add(student);

            student = new Student();
            student.setName("Oussama");
            student.setClasse("SIA");
            student.setMoy(12.3);
            student.setNiveau(3);
            students.add(student);


        }

        public ArrayList<Student> findstudent(String name) {
            this.b= new ArrayList<Student>();
            Student s=new Student();
            for (int i=0;i<this.students.size();i++ )
            {       Student sa =students.get(i);
                if (sa.getName().equals(name)  )

                    b.add(sa);


            }


            return this.b;
        }
    }
