package com.apust.comparable;

public class Man  {

    private int rost;
    private int ves;

    public Man(int rost, int ves) {
        this.rost = rost;
        this.ves = ves;
    }

    public int getRost() {
        return rost;
    }

    public int getVes() {
        return ves;
    }

    public Man() {

    }

//	@Override
//	public int compareTo(Man arg0) {
//		if (rost > arg0.rost) {
//			return 1;
//		} else if (rost < arg0.rost){
//			return -1;
//		} else {
//			return 0;
//		}
//	}

    @Override
    public String toString() {

        return rost + " : " + ves;
    }
    @Override
    public int hashCode() {
        int hash = 31*rost + 32*ves;
        return hash;
    }

    @Override
    public boolean equals(Object arg0) {
        if ((rost+ves) == ((Man)arg0).getRost()+((Man)arg0).getVes()){
            return true;

        }
        return false;
    }

}
