package main.domain;

import com.google.gson.annotations.SerializedName;

/**
 * @author Andre Perkins (Fuzz).
 *
 * Represents the total list of stops that are available on the PATH train.
 */
public enum TrainStop {
    @SerializedName("33 St")
    STREET_33("33 St"),

    @SerializedName("23 St")
    STREET_23("23 St"),

    @SerializedName("14 St")
    STREET_14("14 St"),

    @SerializedName("9 St")
    STREET_9("9 St"),

    @SerializedName("Chris St")
    STREET_CHRISTOPHER("Chris St"),

    @SerializedName("Exchange")
    EXCHANGE_PLACE("23 St"),

    @SerializedName("Grove St")
    STREET_GROVE("Grove St"),

    @SerializedName("Harrison")
    HARRISON("Harrison"),

    @SerializedName("Hoboken")
    HOBOKEN("Hoboken"),

    @SerializedName("JSQ")
    JOURNAL_SQUARE("JSQ"),

    @SerializedName("Newport")
    NEWPORT("Newport"),

    @SerializedName("Newark")
    NEWARK("Newark"),

    @SerializedName("WTC")
    WTC("WTC");

    final private String serializedName;

    TrainStop(String serializedName) {
        this.serializedName = serializedName;
    }

    /**
     *
     * Finds the {@link TrainStop} that is associated with the {@code stopString} that is passed in. Throws
     * {@link IllegalArgumentException} if the string is not associated with any stops.
     */
    public static TrainStop convert(String stopString) {
        for(TrainStop stop: values()){
            if(stopString.equalsIgnoreCase(stop.serializedName)){
                return stop;
            }
        }
        throw new IllegalArgumentException(String.format("There was not a Trainstop associated with string=%s", stopString));
    }
}
