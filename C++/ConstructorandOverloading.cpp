#include <iostream>
#include <string>
using namespace std;

class Student {
private:
    string firstName;
    string middleName;
    string lastName;
    float cgpa;

public:
    Student(string fName, string mName,string lName, float gpa) 
        : firstName(fName), middleName(mName), lastName(lName), cgpa(gpa) {}
    Student(string fName, string lName, float gpa) 
        : firstName(fName), lastName(lName), cgpa(gpa) {}

    string getFirstName() {
        return firstName;
    }

    void printRecord() {
        cout << "Name: " << firstName;
        if (!middleName.empty()) {
            cout << " " << middleName;
        }
        cout << " " << lastName << "\nCGPA: " << cgpa << std::endl;
    }
    bool hasHigherCGPA(Student other) {
        return cgpa > other.cgpa;
    }
};