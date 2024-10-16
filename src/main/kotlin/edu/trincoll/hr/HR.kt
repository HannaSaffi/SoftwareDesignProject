package edu.trincoll.hr

class HR(private val employees: List<Employee> = emptyList()) {

    // Method to hire an employee (returns a new HR object with the added employee)
    fun hire(employee: Employee): HR {
        // Create a new list by adding the employee to the current list
        val updatedEmployees = employees + employee
        return HR(updatedEmployees)  // Return a new HR object with the updated list
    }

    // Method to fire an employee by ID (returns a new HR object without the employee)
    fun fire(id: Int): HR {
        // Create a new list by filtering out the employee with the given id
        val updatedEmployees = employees.filter { it.id != id }
        return HR(updatedEmployees)  // Return a new HR object with the updated list
    }

    // Method to pay all employees (returns the total pay)
    fun payEmployees(): Double {
        // Sum up the pay of all employees
        return employees.sumOf { it.pay() }
    }

    // Optional: Override the toString method to display the list of employees
    override fun toString(): String {
        return employees.joinToString(separator = "\n") { it.toString() }
    }
}
