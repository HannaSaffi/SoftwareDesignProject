abstract class Employee(
    val name: String,
    val id: Int
) : Comparable<Employee> {

    // Abstract method to be implemented by subclasses
    abstract fun pay(): Double

    // Implement the compareTo method from Comparable interface
    // First compare by pay, then by name, and finally by id
    override fun compareTo(other: Employee): Int {
        // Compare by pay first
        val payComparison = this.pay().compareTo(other.pay())
        if (payComparison != 0) return payComparison

        // If pay is the same, compare by name
        val nameComparison = this.name.compareTo(other.name)
        if (nameComparison != 0) return nameComparison

        // If name is also the same, compare by id
        return this.id.compareTo(other.id)
    }

    override fun toString(): String {
        return "Employee(name=$name, id=$id)"
    }
}
