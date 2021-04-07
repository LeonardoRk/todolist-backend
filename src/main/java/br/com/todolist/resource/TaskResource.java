package br.com.todolist.resource;

import br.com.todolist.domain.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import br.com.todolist.repository.TaskRepository;

import javax.websocket.server.PathParam;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/task")
public class TaskResource {

    @Autowired
    TaskRepository taskRepository;

    @GetMapping("")
    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }

    @GetMapping("/{id}")
    public Task getTask(@PathParam("id") Long id) {
        try {
            Optional<Task> task = taskRepository.findById(id);
            System.out.println(task.get());
            return task.get();

        }catch (Exception e) {
            return null;
        }
    }
}
