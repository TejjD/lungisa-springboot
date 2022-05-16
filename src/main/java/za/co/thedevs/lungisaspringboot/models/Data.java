package za.co.thedevs.lungisaspringboot.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@JsonIgnoreProperties(value = {"hibernateLazyInitializer", "handler"})
@Table(name = "data")
public class Data {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "issue", length = 45)
    private String issue;

    @Column(name = "severity", length = 45)
    private String severity;

    @Column(name = "datetime", length = 45)
    private String datetime;

    @Column(name = "image_url")
    private String imageUrl;

    @Column(name = "datacol", length = 45)
    private String datacol;

    @Column(name = "comment", length = 45)
    private String comment;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIssue() {
        return issue;
    }

    public void setIssue(String issue) {
        this.issue = issue;
    }

    public String getSeverity() {
        return severity;
    }

    public void setSeverity(String severity) {
        this.severity = severity;
    }

    public String getDatetime() {
        return datetime;
    }

    public void setDatetime(String datetime) {
        this.datetime = datetime;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getDatacol() {
        return datacol;
    }

    public void setDatacol(String datacol) {
        this.datacol = datacol;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

}