package com.nepse.model;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import java.time.LocalDateTime;

@Entity
public class Article {
	
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    @NotBlank(message = "Title is required")
	    @Size(max = 150, message = "Title can be up to 150 characters")
	    private String title;

	    @NotBlank(message = "Slug is required")
	    @Column(unique = true)
	    private String slug;  // e.g., "breaking-news-nepal-budget-2025"

	    @NotBlank(message = "Content is required")
	    @Lob
	    private String content;

	    private String author;

	    private String category;

	    private String imageUrl;

	    private boolean published = false;

	    private LocalDateTime createdAt;

	    private LocalDateTime updatedAt;

	    @PrePersist
	    protected void onCreate() {
	        createdAt = LocalDateTime.now();
	        updatedAt = createdAt;
	    }

	    @PreUpdate
	    protected void onUpdate() {
	        updatedAt = LocalDateTime.now();
	    }

	    // Constructors
	    public Article() {}

	    public Article(String title, String slug, String content, String author, String category, String imageUrl, boolean published) {
	        this.title = title;
	        this.slug = slug;
	        this.content = content;
	        this.author = author;
	        this.category = category;
	        this.imageUrl = imageUrl;
	        this.published = published;
	    }

	    // Getters & Setters
	    public Long getId() { return id; }
	    public void setId(Long id) { this.id = id; }

	    public String getTitle() { return title; }
	    public void setTitle(String title) { this.title = title; }

	    public String getSlug() { return slug; }
	    public void setSlug(String slug) { this.slug = slug; }

	    public String getContent() { return content; }
	    public void setContent(String content) { this.content = content; }

	    public String getAuthor() { return author; }
	    public void setAuthor(String author) { this.author = author; }

	    public String getCategory() { return category; }
	    public void setCategory(String category) { this.category = category; }

	    public String getImageUrl() { return imageUrl; }
	    public void setImageUrl(String imageUrl) { this.imageUrl = imageUrl; }

	    public boolean isPublished() { return published; }
	    public void setPublished(boolean published) { this.published = published; }

	    public LocalDateTime getCreatedAt() { return createdAt; }
	    public LocalDateTime getUpdatedAt() { return updatedAt; }

}
