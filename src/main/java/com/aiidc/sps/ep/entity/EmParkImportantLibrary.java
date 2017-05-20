package com.aiidc.sps.ep.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "SPSUSER.EM_PARK_IMPORTANT_LIBRARY")
public class EmParkImportantLibrary {
    @Column(name = "NAME")
    private String name;

    @Column(name = "FILE_SIZE")
    private Long fileSize;

    @Column(name = "UPLOADER")
    private String uploader;

    @Column(name = "UPLOAD_DATE")
    private Date uploadDate;

    @Column(name = "PATH")
    private String path;

    @Column(name = "URL")
    private String url;

    /**
     * @return NAME
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name;
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
     * @return PATH
     */
    public String getPath() {
        return path;
    }

    /**
     * @param path
     */
    public void setPath(String path) {
        this.path = path;
    }

    /**
     * @return URL
     */
    public String getUrl() {
        return url;
    }

    /**
     * @param url
     */
    public void setUrl(String url) {
        this.url = url;
    }
}