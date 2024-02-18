package com.ehrazjava.companyms.company;

import java.util.List;

public interface CompanyService {
    List<Company> getAllCompanies();

    Boolean updateCompany(Company company,Long id);

    void createCompany(Company company);

    Boolean deleteCompanyById(Long id);

    Company getCompanyById(Long id);
}
