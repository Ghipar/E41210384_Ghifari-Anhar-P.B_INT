/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wsi;

/**
 *
 * @author REHAN
 */
public class ManagingPeople {

    public static void main(String[] args) {
        Person p1 = new Person("Arial", 31);
        Person p2 = new Person("Joseph", 16);

        if (p1.getAge() == p2.getAge()) {
            System.out.println(p1.getName() + " is the same age as " + p2.getName());
        } else {
            System.out.println(p1.getName() + " is not the same age as " + p2.getName());
        }
    }


}
