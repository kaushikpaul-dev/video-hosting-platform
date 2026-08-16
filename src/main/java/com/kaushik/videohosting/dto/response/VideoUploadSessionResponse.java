package com.kaushik.videohosting.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class VideoUploadSessionResponse {

    private Long id;
    private String fileName;
    private String contentType;
    private Long fileSize;
    private Integer totalChunks;
    private Integer uploadedChunks;
    private String status;
    private LocalDateTime createdAt;
    private Long uploadedBy;
}
