package Exercises.Functions

import Exercises.Model.Student

class Exercise3ConditionalAndLoopsFunction(
    private val addArrayFunction: Exercise2AddArrayFunction
) {
    // todo: check whether is active or assigned and throw exception accordingly, IllegalArgumentException
    private var students = addArrayFunction.CreateAndGetStudents()

    fun enterNewCourse(student: Student): Boolean {
        if(canEnrollInNewCourse(student.studentId)) {
            return true
        }
        return false
    }

    // this part seems like have issue on the throwing error part
    fun canEnrollInNewCourse(studentId: Int): Boolean {
        for(student in students) {
            if (student.studentId == studentId){
                return true
            }
        }
        return false
    }
}