package javarecord2;

import java.util.List;

public record Student(String name, int id, List<Integer> grades) {

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return null;
	}
	 public double getAverageGrade() {
	        if (grades.isEmpty()) {
	            return 0;
	        }
	        double sum = 0;
	        for (int grade : grades) {
	            sum += grade;
	        }
	        return sum / grades.size();
	    }
	    
	    public boolean hasPassingGrade() {
	        for (int grade : grades) {
	            if (grade >= 60) {
	                return true;
	            }
	        }
	        return false;
	    }
	}
