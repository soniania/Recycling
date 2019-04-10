package sonia.ac.za.domain;

public class RecyclingCompany {

    private String companyCode, companyName;


    private RecyclingCompany() {
    }

    private RecyclingCompany(Builder builder) {
        this.companyCode = builder.companyCode;
        this.companyName = builder.companyName;

    }

    public String getCompanyCode() {
        return companyCode;
    }

    public String getCompanyName() {
        return companyName;
    }


    public static class Builder {

        private String companyCode, companyName;

        public Builder companyCode(String companyCode) {
            this.companyCode = companyCode;
            return this;
        }

        public Builder companyName(String companyName) {
            this.companyName = companyName;
            return this;
        }


        public RecyclingCompany build() {
            return new RecyclingCompany(this);
        }

    }
}
