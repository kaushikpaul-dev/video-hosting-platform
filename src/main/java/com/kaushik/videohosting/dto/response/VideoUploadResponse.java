package com.kaushik.videohosting.dto;

import lombok.Data;

@Data
public class VideoUploadResponse {

    private Long videoId;
    private String status;
    private String message;
}
