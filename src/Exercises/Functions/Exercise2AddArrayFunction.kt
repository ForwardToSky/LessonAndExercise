package Exercises.Functions

import Exercises.Model.Student

open class Exercise2AddArrayFunction
{
    // todo: you are required to create an Array of `Student` with a minimum of 3 student.
    open fun CreateAndGetStudents(): List<Student> {
        val student1 = Student(1,"Siti",21,"Female",3.8,true,"0122222222","IT")
        val student2 = Student(2,"Ali",20,"Male",3.2,true,"0121111111","CS")
        val student3 = Student(3,"Ahmad",22,"Male",3.5,true,"0123333333","SE")
        val student4 = Student(4,"Nurul",21,"Female",3.9,true,"0124444444","IT")
        val student5 = Student(5,"Jason",23,"Male",3.1,false,"0125555555","CS")
        val student6 = Student(6,"Mei Ling",20,"Female",3.7,true,"0126666666","SE")
        val student7 = Student(7,"Kumar",24,"Male",2.9,false,"0127777777","IT")
        val student8 = Student(8,"Aisyah",22,"Female",3.6,true,"0128888888","CS")
        val student9 = Student(9,"Daniel",21,"Male",3.3,true,"0129999999","SE")
        val student10 = Student(10,"Farah",23,"Female",3.4,true,"0110000000","IT")

        return listOf(
            student1,
            student2,
            student3,
            student4,
            student5,
            student6,
            student7,
            student8,
            student9,
            student10
        )
    }
}