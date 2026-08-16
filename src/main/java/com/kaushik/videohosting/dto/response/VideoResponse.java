package com.kaushik.videohosting.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class VideoResponse {

    private Long id;
    private String title;
    private String description;
    private String originalFileName;
    private String objectKey;
    private Long fileSize;
    private String contentType;
    private String status;
    private Long uploadedBy;
    private LocalDateTime uploadedAt;
    private String transcodeObjectKey;

}
