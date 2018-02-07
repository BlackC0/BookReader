package hyx.com.bookreader.network.model;

import java.util.List;

/**
 * Created by Black.C on 2018/2/2.
 */

public class BookData {

    private String coverUrl;
    private String bookName;
    private String type;
    private String about;
    private String author;
    private String lastUpdateChapter;
    private String lastUpdateChapterUrl;
    private String txtDownloadUrl;
    private List<String> catalogueText;
    private List<String> catalogueUrl;


    public BookData() {
    }

    public BookData(String coverUrl, String bookName, String type, String about, String author, String lastUpdateChapter, String lastUpdateChapterUrl, String txtDownloadUrl, List<String> catalogueText, List<String> catalogueUrl) {
        this.coverUrl = coverUrl;
        this.bookName = bookName;
        this.type = type;
        this.about = about;
        this.author = author;
        this.lastUpdateChapter = lastUpdateChapter;
        this.lastUpdateChapterUrl = lastUpdateChapterUrl;
        this.txtDownloadUrl = txtDownloadUrl;
        this.catalogueText = catalogueText;
        this.catalogueUrl = catalogueUrl;
    }

    public String getCoverUrl() {
        return coverUrl;
    }

    public void setCoverUrl(String coverUrl) {
        this.coverUrl = coverUrl;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getLastUpdateChapter() {
        return lastUpdateChapter;
    }

    public void setLastUpdateChapter(String lastUpdateChapter) {
        this.lastUpdateChapter = lastUpdateChapter;
    }

    public String getLastUpdateChapterUrl() {
        return lastUpdateChapterUrl;
    }

    public void setLastUpdateChapterUrl(String lastUpdateChapterUrl) {
        this.lastUpdateChapterUrl = lastUpdateChapterUrl;
    }

    public String getTxtDownloadUrl() {
        return txtDownloadUrl;
    }

    public void setTxtDownloadUrl(String txtDownloadUrl) {
        this.txtDownloadUrl = txtDownloadUrl;
    }

    public List<String> getCatalogueText() {
        return catalogueText;
    }

    public void setCatalogueText(List<String> catalogueText) {
        this.catalogueText = catalogueText;
    }

    public List<String> getCatalogueUrl() {
        return catalogueUrl;
    }

    public void setCatalogueUrl(List<String> catalogueUrl) {
        this.catalogueUrl = catalogueUrl;
    }
}
