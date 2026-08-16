package com.kaushik.videohosting.dto;

import lombok.Data;

@Data
public class InitializeUploadRequest {

    private String fileName;
    private String title;
    private String description;
    private String contentType;
    private Long fileSize;
    private Integer totalChunks;
}
