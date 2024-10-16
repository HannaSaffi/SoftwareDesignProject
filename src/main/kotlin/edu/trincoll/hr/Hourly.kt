package edu.trincoll.hr

// Hourly class extending Employee
class Hourly(
    name: String,      // Employee's name
    id: Int,           // Employee's ID
    val rate: Double,  // Hourly rate of pay
    val hours: Double = 80.0  // Number of hours worked, default is 80.0
) : Employee(name, id) {

    // Override the abstract pay() method to return rate * hours
    override fun pay(): Double {
        return rate * hours
    }

    // Override the toString method to include name, id, rate, and hours
    override fun toString(): String {
        return "Hourly(name=$name, id=$id, rate=$rate, hours=$hours)"
    }
}
