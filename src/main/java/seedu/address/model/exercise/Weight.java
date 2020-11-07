package seedu.address.model.exercise;

import static java.util.Objects.requireNonNull;
import static seedu.address.commons.util.AppUtil.checkArgument;

public class Weight {
    public static final Double CaloriePerKg = 7000.0;
    public final Double weight;

    /**
     * Constructs a {@code Weight}.
     *
     * @param calories A valid input.
     */
    public Weight(Calories calories) {
        requireNonNull(calories);
        weight = convertCalorieToWeight(calories);
    }

    @Override
    public String toString() {
        return String.valueOf(weight);
    }

    private Double convertCalorieToWeight (Calories calories) {
        return Double.valueOf(calories.toString())/CaloriePerKg;
    }

    @Override
    public boolean equals(Object other) {
        return other == this // short circuit if same object
                || (other instanceof seedu.address.model.exercise.Weight // instanceof handles nulls
                && weight.equals(((Weight) other).weight)); // state check
    }

    @Override
    public int hashCode() {
        return weight.hashCode();
    }
}
