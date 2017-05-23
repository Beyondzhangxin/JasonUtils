package com.aiidc.sps.ep.entity;

import javax.persistence.*;

@Table(name = "SPSUSER.EM_PARK_MEDICAL_INST_TYPE")
public class EmParkMedicalInstType {
    @Column(name = "MEDICAL_INSTITUTION_ID")
    private Short medicalInstitutionId;

    @Column(name = "MEDICAL_INSTITUTION_NAME")
    private String medicalInstitutionName;

    /**
     * @return MEDICAL_INSTITUTION_ID
     */
    public Short getMedicalInstitutionId() {
        return medicalInstitutionId;
    }

    /**
     * @param medicalInstitutionId
     */
    public void setMedicalInstitutionId(Short medicalInstitutionId) {
        this.medicalInstitutionId = medicalInstitutionId;
    }

    /**
     * @return MEDICAL_INSTITUTION_NAME
     */
    public String getMedicalInstitutionName() {
        return medicalInstitutionName;
    }

    /**
     * @param medicalInstitutionName
     */
    public void setMedicalInstitutionName(String medicalInstitutionName) {
        this.medicalInstitutionName = medicalInstitutionName;
    }
}