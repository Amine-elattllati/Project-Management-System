package com.amine.service;

import com.amine.modal.Chat;
import com.amine.modal.Project;
import com.amine.modal.User;
import com.amine.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProjectServiceImpl implements ProjectService{
    @Autowired
    private ProjectRepository projectRepository;

    @Autowired
    private UserService userService;

    @Autowired
    private ChatService chatService;
    @Override
    public Project createProject(Project project, User user) throws Exception {
        Project createdProject = new Project();

        createdProject.setOwner(user);
        createdProject.setTags(project.getTags());
        createdProject.setName(project.getName());
        createdProject.setCategory(project.getCategory());
        createdProject.setDescription(project.getDescription());
        createdProject.getTeam().add(user);

        Project savedProject = projectRepository.save(createdProject);

        Chat chat = new Chat();
        chat.setProject(savedProject);

        Chat projectChat = chatService.createChat(chat);
        savedProject.setChat(projectChat);

        return savedProject;
    }

    @Override
    public List<Project> getProjectByTeam(User user, String category, String tag) throws Exception {
        return null;
    }

    @Override
    public Project getProjectbyId(Long projectID) throws Exception {
        return null;
    }

    @Override
    public void deleteProject(Long projectId, Long userId) throws Exception {

    }

    @Override
    public Project updateProject(Project updateProject, Long id) throws Exception {
        return null;
    }

    @Override
    public void addUserToProject(Long projectID, Long userId) throws Exception {

    }

    @Override
    public void removeUserFromProject(Long projectId, Long userId) throws Exception {

    }

    @Override
    public Chat getChatByProjectId(Long projectId) throws Exception {
        return null;
    }
}
