package net.springboot.javaguides.repo;

import net.springboot.javaguides.model.exam.Question;
import net.springboot.javaguides.model.exam.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Set;

public interface QuestionRepository extends JpaRepository<Question, Long> {
    Set<Question> findByQuiz(Quiz quiz);
}
