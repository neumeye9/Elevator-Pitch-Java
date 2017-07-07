class ElevatorPitch{
    private String name;
    private String description;

    public ElevatorPitch(){
        name = name;
        description = description;
    }

    public ElevatorPitch(String name){
        this.name = name;
        description = description;
    }

    public ElevatorPitch(String name, String description){
        this.name = name;
        this.description = description;
    }

    public String getName(){
        return name;
    }
    public void setName(String projectName){
        name = projectName;
    }
    public String getDescription(){
        return description;
    }
    public void setDescription(String pDescription){
        description = pDescription;
    }
}