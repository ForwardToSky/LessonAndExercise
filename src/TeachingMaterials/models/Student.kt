package TeachingMaterials.models

class Student(
    name: String,
    age: Int,
    val major: String
) : Person(
    name,
    age
)
