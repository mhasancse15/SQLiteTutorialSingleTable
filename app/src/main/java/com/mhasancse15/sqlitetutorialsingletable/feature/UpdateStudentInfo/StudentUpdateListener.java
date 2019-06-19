package com.mhasancse15.sqlitetutorialsingletable.feature.UpdateStudentInfo;


import com.mhasancse15.sqlitetutorialsingletable.feature.creatStudent.Student;

public interface StudentUpdateListener {
    void onStudentInfoUpdated(Student student, int position);
}