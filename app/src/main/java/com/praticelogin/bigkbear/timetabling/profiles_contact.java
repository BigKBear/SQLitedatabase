package com.praticelogin.bigkbear.timetabling;

/**
 * Created by BigKBear on 7/28/15.
 */
public class profiles_contact {
    int profiles_id, house_number, cell_number, role_role_id;
    String first_name, middle_name, last_name, address, gender, username, password;


    //INTEGERS BELOW
    //profile_id
    public void setProfiles_id(int profiles_id)
    {
        this.profiles_id = profiles_id;
    }


    public int getProfiles_id()
    {
        return this.profiles_id;
    }

    //house number
    public void setHouse_number(int house_number)
    {
        this.house_number = house_number;
    }

    public int getHouse_number()
    {
        return this.house_number;
    }

    //cell number
    public void setCell_number(int cell_number)
    {
        this.cell_number = cell_number;
    }

    public int getCell_number()
    {
        return this.cell_number;
    }

    //role
    public void setRole_role_id(int role_role_id)
    {
        this.role_role_id = role_role_id;
    }

    public int getRole_role_id()
    {
        return this.role_role_id;
    }

    //STRINGS BELOW

    //first name
    public void setFirst_name(String first_name)
    {
        this.first_name = first_name;
    }
    public String getFirst_name()
    {
        return this.first_name;
    }

    //middle name
    public void setMiddle_name(String middle_name)
    {
        this.middle_name = middle_name;
    }
    public String getMiddle_name()
    {
        return this.middle_name;
    }

    //last name
    public void setLast_name(String last_name)
    {
        this.last_name = last_name;
    }
    public String getLast_name()
    {
        return this.last_name;
    }

    //address
    public void setAddress(String address)
    {
        this.address = address;
    }
    public String getAddress()
    {
        return this.address;
    }

    //gender
    public void setGender(String gender)
    {
        this.gender = gender;
    }
    public String getGender()
    {
        return this.gender;
    }


    //username
    public void setUsername(String username)
    {
        this.username = username;
    }
    public String getUsername()
    {
        return this.username;
    }

    //password
    public void setPassword(String password)
    {
        this.password = password;
    }
    public String getPassword()
    {
        return this.password;
    }


}
