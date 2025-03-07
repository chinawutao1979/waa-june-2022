package edu.miu.rest.service;


import edu.miu.rest.entity.Course;

import java.util.List;

public interface CourseService {
    List<Course> findAll();

    void create(Course entity);
    void delete(int id);
    void update(Course entity, int id);

}
