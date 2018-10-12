package com.company.builderdesignpattern.builder;

public class Address {

    private final int houseNumber;
    private final String city;
    private final String zipCode;

    public Address(final Builder builder) {
        this.houseNumber = builder.houseNumber;
        this.city = builder.city;
        this.zipCode = builder.zipCode;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public String getCity() {
        return city;
    }

    public String getZipCode() {
        return zipCode;
    }

    public static class Builder {
        private int houseNumber;
        private String city;
        private String zipCode;

        public Builder houseNumber(final int houseNumber) {
            this.houseNumber = houseNumber;
            return this;
        }

        public Builder city(final String city) {
            this.city = city;
            return this;
        }

        public Builder zipCode(final String zipCode) {
            this.zipCode = zipCode;
            return this;
        }

        public Address build() {
            return new Address(this);
        }
    }


}
