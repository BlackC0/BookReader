package hyx.com.bookreader.network.model;

/**
 * Created by Black.C on 2018/1/30.
 */

public class SearchData {

    private String name;
    private String type;
    private String author;
    private String lastUpdateTime;
    private String lastUpdateChapter;
    private String lastUpdateChapterUrl;

    public SearchData() {
    }

    public SearchData(String name, String type, String author, String lastUpdateTime, String lastUpdateChapter, String lastUpdateChapterUrl) {
        this.name = name;
        this.type = type;
        this.author = author;
        this.lastUpdateTime = lastUpdateTime;
        this.lastUpdateChapter = lastUpdateChapter;
        this.lastUpdateChapterUrl = lastUpdateChapterUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(String lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
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
}
