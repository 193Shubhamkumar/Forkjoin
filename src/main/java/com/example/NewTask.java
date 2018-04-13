package com.example;

import java.util.concurrent.RecursiveAction;

class NewTask
  extends RecursiveAction
{
  NewTask() {}
  
  protected void compute()
  {
	  Printdata data = new Printdata();
    data.printingSomething();
  }
}
