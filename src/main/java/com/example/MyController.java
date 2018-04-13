package com.example;

import java.util.concurrent.ForkJoinPool;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController
{
  public MyController() {}
  
  @org.springframework.web.bind.annotation.RequestMapping({"/forkjoin"})
  @ResponseBody
  String forkJoin()
  {
	  NewTask task = new NewTask();
    task.invoke();
    


    ForkJoinPool pool = new ForkJoinPool();
    pool.execute(new NewTask());
    pool.invoke(new NewTask());
    
    return "Shubham!";
  }
}