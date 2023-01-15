package hello.hellospring.domain;

public class Member {
    private Long id;    //시스템이 정해주는 값
    private String name; //사용자가 입력하는 값

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
