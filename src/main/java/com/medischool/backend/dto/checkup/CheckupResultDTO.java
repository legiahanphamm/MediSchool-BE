package com.medischool.backend.dto.checkup;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CheckupResultDTO {
    private Long resultId;
    private String eventTitle;
    private String academicYear;
    private String createdDate;
    private String startDate;
    private String endDate;
    private String eventDate;

    private String studentName;
    private String studentCode;
    private String classCode;
    private String gender;
    private String dob;

    private String parentName;
    private String parentEmail;
    private String parentPhone;

    private List<CheckupResultItemDTO> categoryResults;

    private String status;
    private String note;
}
