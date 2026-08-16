package com.kaushik.videohosting.dto;

import lombok.Data;

@Data
public class VideoStatusResponse {

    private Long videoId;
    private String fileName;
    private String status;
    private String transcodeObjectKey;
}
