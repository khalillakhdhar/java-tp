/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package todo;
import java.util.ArrayList;

/**
 *
 * @author pro
 */
public class Users {
  private ArrayList<User> userlist=new ArrayList<User>(); 

    public Users() {
    }
  void adduser(User us)
  {
 userlist.add(us);
  
  
  }
  int usernb()
  {
  return userlist.size();
  
  }

    public ArrayList<User> getUserlist() {
        return userlist;
    }
  
  public boolean connexion(User us)
  {
  for(User use : userlist)
  {
  if(use.getLogin().equals(us.getLogin())&&use.getMdp().equals(us.getMdp()))
  {
  return true;
  
  }
  }
  return false;
  
  
  }
  public void lister()
  {
  System.out.println("liste des utilisateurs");
  for(User u: userlist)
  {
  System.out.println(u.toString());
  
  }
  
  }
}
