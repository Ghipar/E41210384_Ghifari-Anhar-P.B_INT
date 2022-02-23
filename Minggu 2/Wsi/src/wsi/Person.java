/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wsi;

import java.util.Scanner;

/**
 *
 * @author REHAN
 */
public class Person {

    String PersonsName;
    int PersonsAge;

    public Person(String PersonsName, int PersonsAge) {
        this.PersonsName = PersonsName;
        this.PersonsAge = PersonsAge;
    }

    public String getName() {
        return PersonsName;
    }

    public int getAge() {
        return PersonsAge;
    }

    public void setAge() {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan umur : ");
        PersonsAge = input.nextInt();
    }
}
