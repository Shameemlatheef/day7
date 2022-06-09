package com.day7ass;

public class Dayscholar extends Student {
double transprtfee;
@Override
public  double payfee() {
	  //System.out.println(transprtfee+Examfee);
	  return transprtfee+Examfee;
  }
}
