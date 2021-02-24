package eci.arsw.covidanalyzer.model;

import java.util.UUID;

public class Result {

    public UUID id;
    public String firstName;
    public String lastName;
    public String gender;
    public String email;
    public String birthString;
    
    public String testString;
    public boolean result;
    public double testSpecifity;
    public ResultType resultType;

@Override
public String toString(){
    return this.id.toString() + " - " + this.firstName + " - " + this.lastName;
}
   
}
