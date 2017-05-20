package com.aiidc.sps.ep.entity;

import javax.persistence.Column;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "SPSUSER.EM_RESOURCE_MATERIAL")
public class EmResourceMaterial {
    @Column(name = "COMPANY_ID")
    private String companyId;

    @Column(name = "MATERIAL_ID")
    private String materialId;

    @Column(name = "MATERIAL_NAME")
    private String materialName;

    @Column(name = "TEAM_ID")
    private String teamId;

    @Column(name = "AREA_ID")
    private String areaId;

    @Column(name = "MATERIAL_CLASSIFY_ID")
    private String materialClassifyId;

    @Column(name = "MATERIAL_TYPE_ID")
    private String materialTypeId;

    @Column(name = "MATERIAL_SOURCE_ID")
    private String materialSourceId;

    @Column(name = "NUM")
    private Integer num;

    @Column(name = "TYPE")
    private String type;

    @Column(name = "SPEC")
    private String spec;

    @Column(name = "UNIT")
    private String unit;

    @Column(name = "CURRENT_STATUS")
    private String currentStatus;

    @Column(name = "STORAGE_PLACE")
    private String storagePlace;

    @Column(name = "MANUFACTURER")
    private String manufacturer;

    @Column(name = "PURCHASE_DATE")
    private Date purchaseDate;

    @Column(name = "PRODUCT_DATE")
    private Date productDate;

    @Column(name = "EXPIRY_DATE")
    private Date expiryDate;

    @Column(name = "USEFUL_LIFE")
    private Short usefulLife;

    @Column(name = "PERFORMANCE")
    private String performance;

    @Column(name = "PURPOSE")
    private String purpose;

    @Column(name = "CREATE_TIME")
    private Date createTime;

    @Column(name = "CHANGE_TIME")
    private Date changeTime;

    /**
     * @return COMPANY_ID
     */
    public String getCompanyId() {
        return companyId;
    }

    /**
     * @param companyId
     */
    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    /**
     * @return MATERIAL_ID
     */
    public String getMaterialId() {
        return materialId;
    }

    /**
     * @param materialId
     */
    public void setMaterialId(String materialId) {
        this.materialId = materialId;
    }

    /**
     * @return MATERIAL_NAME
     */
    public String getMaterialName() {
        return materialName;
    }

    /**
     * @param materialName
     */
    public void setMaterialName(String materialName) {
        this.materialName = materialName;
    }

    /**
     * @return TEAM_ID
     */
    public String getTeamId() {
        return teamId;
    }

    /**
     * @param teamId
     */
    public void setTeamId(String teamId) {
        this.teamId = teamId;
    }

    /**
     * @return AREA_ID
     */
    public String getAreaId() {
        return areaId;
    }

    /**
     * @param areaId
     */
    public void setAreaId(String areaId) {
        this.areaId = areaId;
    }

    /**
     * @return MATERIAL_CLASSIFY_ID
     */
    public String getMaterialClassifyId() {
        return materialClassifyId;
    }

    /**
     * @param materialClassifyId
     */
    public void setMaterialClassifyId(String materialClassifyId) {
        this.materialClassifyId = materialClassifyId;
    }

    /**
     * @return MATERIAL_TYPE_ID
     */
    public String getMaterialTypeId() {
        return materialTypeId;
    }

    /**
     * @param materialTypeId
     */
    public void setMaterialTypeId(String materialTypeId) {
        this.materialTypeId = materialTypeId;
    }

    /**
     * @return MATERIAL_SOURCE_ID
     */
    public String getMaterialSourceId() {
        return materialSourceId;
    }

    /**
     * @param materialSourceId
     */
    public void setMaterialSourceId(String materialSourceId) {
        this.materialSourceId = materialSourceId;
    }

    /**
     * @return NUM
     */
    public Integer getNum() {
        return num;
    }

    /**
     * @param num
     */
    public void setNum(Integer num) {
        this.num = num;
    }

    /**
     * @return TYPE
     */
    public String getType() {
        return type;
    }

    /**
     * @param type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return SPEC
     */
    public String getSpec() {
        return spec;
    }

    /**
     * @param spec
     */
    public void setSpec(String spec) {
        this.spec = spec;
    }

    /**
     * @return UNIT
     */
    public String getUnit() {
        return unit;
    }

    /**
     * @param unit
     */
    public void setUnit(String unit) {
        this.unit = unit;
    }

    /**
     * @return CURRENT_STATUS
     */
    public String getCurrentStatus() {
        return currentStatus;
    }

    /**
     * @param currentStatus
     */
    public void setCurrentStatus(String currentStatus) {
        this.currentStatus = currentStatus;
    }

    /**
     * @return STORAGE_PLACE
     */
    public String getStoragePlace() {
        return storagePlace;
    }

    /**
     * @param storagePlace
     */
    public void setStoragePlace(String storagePlace) {
        this.storagePlace = storagePlace;
    }

    /**
     * @return MANUFACTURER
     */
    public String getManufacturer() {
        return manufacturer;
    }

    /**
     * @param manufacturer
     */
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    /**
     * @return PURCHASE_DATE
     */
    public Date getPurchaseDate() {
        return purchaseDate;
    }

    /**
     * @param purchaseDate
     */
    public void setPurchaseDate(Date purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    /**
     * @return PRODUCT_DATE
     */
    public Date getProductDate() {
        return productDate;
    }

    /**
     * @param productDate
     */
    public void setProductDate(Date productDate) {
        this.productDate = productDate;
    }

    /**
     * @return EXPIRY_DATE
     */
    public Date getExpiryDate() {
        return expiryDate;
    }

    /**
     * @param expiryDate
     */
    public void setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
    }

    /**
     * @return USEFUL_LIFE
     */
    public Short getUsefulLife() {
        return usefulLife;
    }

    /**
     * @param usefulLife
     */
    public void setUsefulLife(Short usefulLife) {
        this.usefulLife = usefulLife;
    }

    /**
     * @return PERFORMANCE
     */
    public String getPerformance() {
        return performance;
    }

    /**
     * @param performance
     */
    public void setPerformance(String performance) {
        this.performance = performance;
    }

    /**
     * @return PURPOSE
     */
    public String getPurpose() {
        return purpose;
    }

    /**
     * @param purpose
     */
    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    /**
     * @return CREATE_TIME
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * @param createTime
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * @return CHANGE_TIME
     */
    public Date getChangeTime() {
        return changeTime;
    }

    /**
     * @param changeTime
     */
    public void setChangeTime(Date changeTime) {
        this.changeTime = changeTime;
    }
}