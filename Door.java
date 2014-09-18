
public class Door
{
    
    private boolean isOpen;
    private boolean isLocked;
    private String name;

    
    public Door(boolean isOpen, boolean isLocked, String name)
    {
        this.isOpen = isOpen;
        this.isLocked = isLocked;
        this.name = name;
    }

    
    public void openDoor()
    {
        if (this.checkIsLocked()){
            this.isOpen = this.isOpen;
        }else{
            this.isOpen=true;
        }
    }
    public void closeDoor()
    {
       this.isOpen = false;
    }
    public boolean checkIsOpen()
    {
       if (isOpen){       
           return true;
       }
       else {
           return false;
        }
        
       
    }
    public boolean checkIsLocked()
    {
        if (isLocked){
            return true;
        } else {
            return false;
        }
    }
    public String getName()
    {
        return this.name;
    }
    public void lock()
    {
        this.isLocked = true;
    }
    public void unlock()
    {
        this.isLocked = false;
    }
    public void changeName(String newName)
    {
        name = newName;
    }
        
}
