package com.attend.routes;

import com.attend.Models;
import com.attend.utils.Constants;
import com.attend.utils.VolleyHandler;
import com.attend.utils.VolleyHandler.ApiResponse;
import com.attend.utils.VolleyHandler.ApiResult;
import com.google.gson.Gson;

import org.json.JSONObject;

/**
 * Created by Ankit Joshi on 05-11-2017.
 */

public class StudentRoutes {

    VolleyHandler volleyHandler = new VolleyHandler();

    public void getDetails(String rollno, final ApiResponse<Models.Student> completion) {

        String url = Constants.URL_GET_STUDENT_DETAILS + rollno;
        final Models.Student student = new Models.Student();

        volleyHandler.RequestApi(url, new ApiResponse<ApiResult>() {
            @Override
            public void onCompletion(ApiResult res) {
                if (res.success == 200 && res.dataIsObject()) {
                    JSONObject userObj = res.getDataAsObject();
                    Models.Student student = new Gson().fromJson(userObj.toString(), Models.Student.class);
                    student.message = res.message;
                    completion.onCompletion(student);
                } else {
                    completion.onCompletion(student);
                }
            }
        });

    }

    public void getSubjectAttendanceSummary(String rollno, String subject, final VolleyHandler.ApiResponse<Models.SubjectAttendanceSummary> completion) {

        String url = Constants.URL_GET_SUBJECT_ATTENDANCE_SUMMARY + rollno + "/" + subject;
        final Models.SubjectAttendanceSummary subjectAttendanceSummary = new Models.SubjectAttendanceSummary();

        volleyHandler.RequestApi(url, new VolleyHandler.ApiResponse<VolleyHandler.ApiResult>() {
            @Override
            public void onCompletion(VolleyHandler.ApiResult res) {
                if (res.success == 200 && res.dataIsObject()) {
                    JSONObject userObj = res.getDataAsObject();
                    Models.SubjectAttendanceSummary subjectAttendanceSummary = new Gson().fromJson(userObj.toString(), Models.SubjectAttendanceSummary.class);
                    subjectAttendanceSummary.message = res.message;
                    completion.onCompletion(subjectAttendanceSummary);
                } else {
                    completion.onCompletion(subjectAttendanceSummary);
                }
            }
        });

    }

    public void getClassesOfDay(String rollno, final VolleyHandler.ApiResponse<Models.ClassesOfDay> completion) {

        String url = Constants.URL_GET_CLASSES_OF_DAY + rollno;
        final Models.ClassesOfDay classesOfDay = new Models.ClassesOfDay();

        volleyHandler.RequestApi(url, new VolleyHandler.ApiResponse<VolleyHandler.ApiResult>() {
            @Override
            public void onCompletion(VolleyHandler.ApiResult res) {
                if (res.success == 200 && res.dataIsObject()) {
                    JSONObject userObj = res.getDataAsObject();
                    Models.ClassesOfDay classesOfDay = new Gson().fromJson(userObj.toString(), Models.ClassesOfDay.class);
                    classesOfDay.message = res.message;
                    completion.onCompletion(classesOfDay);
                } else {
                    completion.onCompletion(classesOfDay);
                }
            }
        });

    }

    public void getAttendanceSummaryAllSubjects(String rollno, final VolleyHandler.ApiResponse<Models.AttendanceSummaryAllSubjects> completion) {

        String url = Constants.URL_GET_ATTENDANCE_SUMMARYY_ALL_SUBJECTS + rollno;
        final Models.AttendanceSummaryAllSubjects attendanceSummaryAllSubjects = new Models.AttendanceSummaryAllSubjects();

        volleyHandler.RequestApi(url, new VolleyHandler.ApiResponse<VolleyHandler.ApiResult>() {
            @Override
            public void onCompletion(VolleyHandler.ApiResult res) {
                if (res.success == 200 && res.dataIsObject()) {
                    JSONObject userObj = res.getDataAsObject();
                    Models.AttendanceSummaryAllSubjects attendanceSummaryAllSubjects = new Gson().fromJson(userObj.toString(), Models.AttendanceSummaryAllSubjects.class);
                    attendanceSummaryAllSubjects.message = res.message;
                    completion.onCompletion(attendanceSummaryAllSubjects);
                } else {
                    completion.onCompletion(attendanceSummaryAllSubjects);
                }
            }
        });

    }

    public void getSubjectAttendanceDatewise(String rollno, String subject, final VolleyHandler.ApiResponse<Models.SubjectAttendanceDatewise> completion) {

        String url = Constants.URL_GET_SUBJECT_ATTENDANCE_DATEWISE + rollno + "/" + subject;
        final Models.SubjectAttendanceDatewise subjectAttendanceDatewise = new Models.SubjectAttendanceDatewise();

        volleyHandler.RequestApi(url, new VolleyHandler.ApiResponse<VolleyHandler.ApiResult>() {
            @Override
            public void onCompletion(VolleyHandler.ApiResult res) {
                if (res.success == 200 && res.dataIsObject()) {
                    JSONObject userObj = res.getDataAsObject();
                    Models.SubjectAttendanceDatewise subjectAttendanceDatewise = new Gson().fromJson(userObj.toString(), Models.SubjectAttendanceDatewise.class);
                    subjectAttendanceDatewise.message = res.message;
                    completion.onCompletion(subjectAttendanceDatewise);
                } else {
                    completion.onCompletion(subjectAttendanceDatewise);
                }
            }
        });

    }
}
