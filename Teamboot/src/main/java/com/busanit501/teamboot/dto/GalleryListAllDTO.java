package com.busanit501.teamboot.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class GalleryListAllDTO {
    private Long galleryId;
    private String content;
    private String writer;
    private LocalDateTime regDate;
    //댓글 갯수 표기 하기 위한 용도.
    private Long replyCount;
    // 첨부 이미지들
    private List<GalleryImageDTO> galleryImages;
}