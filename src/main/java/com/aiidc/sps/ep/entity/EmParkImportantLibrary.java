package com.aiidc.sps.ep.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "SPSUSER.EM_PARK_IMPORTANT_LIBRARY")
public class EmParkImportantLibrary {
    @Id
    @Column(name = "FILE_ID")
    private Integer fileId;

    @Column(name = "FILE_NAME")
    private String fileName;

    @Column(name = "FILE_SIZE")
    private Long fileSize;

    @Column(name = "UPLOADER")
    private String uploader;

    @Column(name = "UPLOAD_DATE")
    private Date uploadDate;

    @Column(name = "CONTENT")
    private byte[] content;

    /**
     * @return FILE_ID
     */
    public Integer getFileId() {
        return fileId;
    }

    /**
     * @param fileId
     */
    public void setFileId(Integer fileId) {
        this.fileId = fileId;
    }

    /**
     * @return FILE_NAME
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * @param fileName
     */
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    /**
     * @return FILE_SIZE
     */
    public Long getFileSize() {
        return fileSize;
    }

    /**
     * @param fileSize
     */
    public void setFileSize(Long fileSize) {
        this.fileSize = fileSize;
    }

    /**
     * @return UPLOADER
     */
    public String getUploader() {
        return uploader;
    }

    /**
     * @param uploader
     */
    public void setUploader(String uploader) {
        this.uploader = uploader;
    }

    /**
     * @return UPLOAD_DATE
     */
    public Date getUploadDate() {
        return uploadDate;
    }

    /**
     * @param uploadDate
     */
    public void setUploadDate(Date uploadDate) {
        this.uploadDate = uploadDate;
    }

    /**
     * @return CONTENT
     */
    public byte[] getContent() {
        return content;
    }

    /**
     * @param content
     */
    public void setContent(byte[] content) {
        this.content = content;
    }
}