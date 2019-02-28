package by.javatr.task1.util;

import java.util.Arrays;

public class IntegerArrayWrapper {
    private int[] values;

    /**
     * @param values []
     */
    public IntegerArrayWrapper(int[] values) {
        this.values = values;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null) {
            return false;
        }
        if (getClass() != o.getClass()) {
            return false;
        }
        IntegerArrayWrapper that = (IntegerArrayWrapper) o;

        return Arrays.equals(values, that.values);
    }

    @Override
    public String toString() {
        return "IntegerArrayWrapper{" +
                "values=" + Arrays.toString(values) +
                '}';
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(values);
    }

    public int[] getValues() {
        return values;
    }

    public void setValues(int[] values) {
        this.values = values;
    }
}
