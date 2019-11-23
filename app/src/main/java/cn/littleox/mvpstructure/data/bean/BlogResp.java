package cn.littleox.mvpstructure.data.bean;

import android.support.annotation.NonNull;

import java.util.List;

public class BlogResp extends BaseResponseBean {
    String status_code;

    String message;

    List<Blog> data;

    public String getStatus_code() {
        return status_code;
    }

    public void setStatus_code(String status_code) {
        this.status_code = status_code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<Blog> getData() {
        return data;
    }

    public void setData(List<Blog> data) {
        this.data = data;
    }

    @NonNull
    @Override
    public String toString() {
        return message + "\t" + data.size();
    }

    static class Blog {
        String title;
        String description;
        String author;
        String img_url;
        String blog_url;
        int likes;
        int rank;
        int category;
        int external;
        String published_at;

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getAuthor() {
            return author;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        public String getImg_url() {
            return img_url;
        }

        public void setImg_url(String img_url) {
            this.img_url = img_url;
        }

        public String getBlog_url() {
            return blog_url;
        }

        public void setBlog_url(String blog_url) {
            this.blog_url = blog_url;
        }

        public int getLikes() {
            return likes;
        }

        public void setLikes(int likes) {
            this.likes = likes;
        }

        public int getRank() {
            return rank;
        }

        public void setRank(int rank) {
            this.rank = rank;
        }

        public int getCategory() {
            return category;
        }

        public void setCategory(int category) {
            this.category = category;
        }

        public int getExternal() {
            return external;
        }

        public void setExternal(int external) {
            this.external = external;
        }

        public String getPublished_at() {
            return published_at;
        }

        public void setPublished_at(String published_at) {
            this.published_at = published_at;
        }

        @NonNull
        @Override
        public String toString() {
            return title + "\t" + author;
        }
    }
}
