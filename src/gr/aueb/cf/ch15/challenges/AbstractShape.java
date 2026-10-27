package gr.aueb.cf.ch15.challenges;

public abstract class AbstractShape implements IShape{

    private Long id;

    public void setId (Long id){
        this.id = id;
    }

    @Override
    public Long getId() {
        return id;
    }
}
