package com.codingninja.flowchart;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class FindGCD {
	static Map<Integer,TreeSet<Integer>> uniqueFactor = new HashMap<Integer,TreeSet<Integer>>();
	public static void factors(Integer number) {
		for(int index=2; index <= number /2; index++) {
			if(number % index == 0) {
				if(uniqueFactor.containsKey(number)) {
					TreeSet<Integer> set = uniqueFactor.get(number);
					set.add(index);
					uniqueFactor.put(number, set);
				}
				else {
					TreeSet<Integer> set = new TreeSet<Integer>();
					set.add(index);
					uniqueFactor.put(number, set);
				}
			}
		}
	}
	public static void main(String [] cp) {
		TreeSet<Integer> factorSet = new TreeSet<Integer>();
		TreeSet<Integer> commonSet = new TreeSet<Integer>();

		factors(12);
		factors(15);
		Integer gcd = Integer.MIN_VALUE;
		Set<Integer> keySet = uniqueFactor.keySet();
		for(int i=0; i< keySet.size(); i++) {
			TreeSet<Integer> values = uniqueFactor.get(keySet.toArray()[i]);
			Iterator<Integer> itr = values.iterator();
			while(itr.hasNext()) {
				Integer value = itr.next();
				if(i == 0) factorSet.add(value);
				if(i > 0) {
					if(factorSet.contains(value)) {
						commonSet.add(value);
					}
				}
			}
		}

		Iterator<Integer> itr = commonSet.iterator();
		while(itr.hasNext()) {
			Integer val = itr.next();
			if(val > gcd) {
				gcd = val;
			}
		}
	
		System.out.println("GCD is:" + gcd);
	}
	 
}
