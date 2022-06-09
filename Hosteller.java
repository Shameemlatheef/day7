package com.day7ass;

public class Hosteller extends Student {
double hostelfee;
@Override
public  double payfee() {
	  //System.out.println(hostelfee+Examfee);

    return hostelfee+Examfee;

}

}
