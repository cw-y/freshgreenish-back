package com.sidenow.freshgreenish.domain.question.entity;

import com.sidenow.freshgreenish.global.utils.Auditable;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@SQLDelete(sql = "UPDATE question SET deleted = true WHERE id = ?")
@Where(clause = "deleted = false")
public class Question extends Auditable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "QUESTION_ID")
    private Long questionId;

    @Column(length = 2000)
    private String questionTitle;

    @Column(length = 2000)
    private String questionContent;

    private Long answerId;

    @Builder
    public Question(Long questionId, String questionTitle, String questionContent, Long answerId) {
        this.questionId = questionId;
        this.questionTitle = questionTitle;
        this.questionContent = questionContent;
        this.answerId = answerId;
    }
}
