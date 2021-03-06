package com.ctgu.service;

import com.ctgu.pojo.Activity;

import java.util.List;

/**
 * @Author : 张华厂
 * @Description :
 * @Date : 18:20 2018/4/23 0023
 */
public interface ActivityService {

    /*获取所有活动*/
    List<Activity> getAllActivityList();

    /*保存活动信息*/
    void saveActivity(Activity activity);

    /*已经举办过的活动，即status为1*/
    List<Activity> getActivityList();

    /*根据a_id更新活动状态*/
    void updateStatus(int a_id, String a_status);

    /*根据id查找活动*/
    Activity getActivity(int a_id);

    /*查找某个时间段的活动*/
    List<Activity> searchActivity(String start_time, String end_time);

}
