package sonia.ac.za.factory;

import sonia

public class RecyclingCompanyFactory {

    public static RecyclingCompanyFactory getRecyclingCompany(String companyCode, String companyName,) {
        return new RecyclingCompanyFactory.Builder()
                .companyCode(companyCode)
                .companyName(companyName)

                .build();
}
