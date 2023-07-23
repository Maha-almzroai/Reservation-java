/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelbooking;

import java.io.Serializable;
import java.util.ArrayList;

class  Singleroom implements Serializable {
    String name;
    String contact;
    String gender;   
    ArrayList<Food> food =new ArrayList<>();

   
    Singleroom()
    {
        this.name="";
    }
    Singleroom(String name,String contact,String gender)
    {
        this.name=name;
        this.contact=contact;
        this.gender=gender;
    }
}

