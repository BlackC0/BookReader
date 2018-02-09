package hyx.com.bookreader.database.baen;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.NotNull;
import org.greenrobot.greendao.annotation.Generated;

@Entity
public class Book {

    @Id(autoincrement = true)
    private Long id;
    //书本名称
    @NotNull
    private String name;
    //类型
    private String type;
    //简介
    private String about;
    //作者
    private String author;
    //封面url
    private String coverUrl;
    //书本url
    private String bookUrl;
    @Generated(hash = 258854352)
    public Book(Long id, @NotNull String name, String type, String about,
            String author, String coverUrl, String bookUrl) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.about = about;
        this.author = author;
        this.coverUrl = coverUrl;
        this.bookUrl = bookUrl;
    }
    @Generated(hash = 1839243756)
    public Book() {
    }
    public Long getId() {
        return this.id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getType() {
        return this.type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public String getAbout() {
        return this.about;
    }
    public void setAbout(String about) {
        this.about = about;
    }
    public String getAuthor() {
        return this.author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public String getCoverUrl() {
        return this.coverUrl;
    }
    public void setCoverUrl(String coverUrl) {
        this.coverUrl = coverUrl;
    }
    public String getBookUrl() {
        return this.bookUrl;
    }
    public void setBookUrl(String bookUrl) {
        this.bookUrl = bookUrl;
    }
}