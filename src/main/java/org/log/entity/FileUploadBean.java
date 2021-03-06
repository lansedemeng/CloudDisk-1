package org.log.entity;


/**
 * Created by Admin on 2016/4/26.
 */
public class FileUploadBean {

    private String fileName;
    private long fileSize;
    private String updateTime;
    private String fileType;
    private String username;
    private String filePath;

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public long getFileSize() {
        return fileSize;
    }

    public void setFileSize(long fileSize) {
        this.fileSize = fileSize;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        return "FileUploadBean{" +
                "fileName='" + fileName + '\'' +
                ", fileSize=" + fileSize +
                ", updateTime='" + updateTime + '\'' +
                ", fileType='" + fileType + '\'' +
                ", username='" + username + '\'' +
                ", filePath='" + filePath + '\'' +
                '}';
    }
}
