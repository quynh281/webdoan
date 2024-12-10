package model;

import java.sql.Timestamp;
import java.util.List;

public class activities {
    private int id;                // ID của hoạt động
    private String title;          // Tiêu đề
    private String description;    // Mô tả ngắn
    private String imageUrl;       // URL của ảnh đại diện
    private String category;       // Loại hoạt động (vd: Hoạt động sinh viên)
    private Timestamp createdAt;   // Thời gian tạo
	
    // Constructor mặc định
    public activities() {
    }

    // Constructor đầy đủ
    public activities(int id, String title, String description, String imageUrl, String category, Timestamp createdAt) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.imageUrl = imageUrl;
        this.category = category;
        this.createdAt = createdAt;
    }

    // Getter và Setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    @Override
    public String toString() {
        return "Activity{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                ", category='" + category + '\'' +
                ", createdAt=" + createdAt +
                '}';
    }

	
}
