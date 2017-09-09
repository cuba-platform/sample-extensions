package com.company.sample.web.screens;

import com.company.sample.entity.Department;
import com.company.sample.entity.ExtUser;
import com.haulmont.cuba.core.global.DataManager;
import com.haulmont.cuba.gui.components.Label;
import com.haulmont.cuba.security.entity.User;
import com.haulmont.cuba.security.global.UserSession;
import com.haulmont.cuba.web.app.mainwindow.AppMainWindow;

import javax.inject.Inject;

public class ExtAppMainWindow extends AppMainWindow {

    @Inject
    private Label deptLab;

    @Inject
    private UserSession userSession;

    @Inject
    private DataManager dataManager;

    @Override
    public void ready() {
        // Reload user to ensure the department is fetched
        User user = dataManager.reload(userSession.getUser(), "user.browse");
        // User can be safely cast to ExtUser everywhere
        Department department = ((ExtUser) user).getDepartment();
        if (department != null)
            deptLab.setValue("Department: " + department.getName());
    }
}