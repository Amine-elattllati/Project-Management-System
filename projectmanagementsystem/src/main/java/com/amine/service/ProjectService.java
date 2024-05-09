package com.amine.service;

import com.amine.modal.Chat;
import com.amine.modal.Project;
import com.amine.modal.User;

import java.util.List;

public interface ProjectService {

    Project createProject(Project project, User user) throws Exception;

    List<Project> getProjectByTeam(User user, String category, String tag)throws Exception;

    Project getProjectbyId(Long projectID)throws Exception;

    void deleteProject(Long projectId, Long userId)throws Exception;

    Project updateProject(Project updateProject, Long id)throws Exception;
    void addUserToProject(Long projectID,Long userId)throws Exception;
    void removeUserFromProject(Long projectId,Long userId)throws Exception;
    Chat getChatByProjectId(Long projectId)throws Exception;
}