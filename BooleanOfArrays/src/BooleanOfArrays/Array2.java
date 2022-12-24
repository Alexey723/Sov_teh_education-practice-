package BooleanOfArrays;

import java.util.ArrayList;
import java.util.Objects;

public class Array2 {
    private Integer number;


    @Override
    public int hashCode() {
        return Objects.hash(number);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Array2 other = (Array2) obj;
        return Objects.equals(number, other.number);
    }

    public Array2 (Integer number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return number + "";
    }


}

