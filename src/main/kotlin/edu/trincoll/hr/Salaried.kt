package edu.trincoll.hr

// Salaried class extending Employee
class Salaried(
    name: String,       // Employee's name
    id: Int,            // Employee's ID
    val salary: Double  // Annual salary
) : Employee(name, id) {

    // Override the pay() method to return salary divided by 26
    override fun pay(): Double {
        return salary / 26.0  // Bi-weekly pay
    }

    // Override the toString method to include name, id, and salary
    override fun toString(): String {
        return "Salaried(name=$name, id=$id, salary=$salary)"
    }
}
