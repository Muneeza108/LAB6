/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

/**
 *
 * @author natas
 */
public interface StudentCollection {

    void addStudent(Student student);

    void removeStudent(int id);

    Student findStudent(int id);

    int getSize();

    boolean isEmpty();
}