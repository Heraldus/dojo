package com.mercadolibre.dojos.dto;


import com.google.gson.annotations.SerializedName;

/**
 * Created by glevy on 3/31/16.
 */
public class ItemShippingDto {

    private String mode;
    @SerializedName("local_pick_up")
    private boolean localPickUp;
    @SerializedName("free_shipping")
    private boolean freeShipping;

    public ItemShippingDto() {
        // default constructor
    }

    /**
     * Getter method for {@link #mode}.
     */
    public String getMode() {
        return mode;
    }

    /**
     * Setter method for {@link #mode}.
     */
    public void setMode(String mode) {
        this.mode = mode;
    }

    /**
     * Getter method for {@link #localPickUp}.
     */
    public boolean isLocalPickUp() {
        return localPickUp;
    }

    /**
     * Setter method for {@link #localPickUp}.
     */
    public void setLocalPickUp(boolean localPickUp) {
        this.localPickUp = localPickUp;
    }

    /**
     * Getter method for {@link #freeShipping}.
     */
    public boolean isFreeShipping() {
        return freeShipping;
    }

    /**
     * Setter method for {@link #freeShipping}.
     */
    public void setFreeShipping(boolean freeShipping) {
        this.freeShipping = freeShipping;
    }


}
