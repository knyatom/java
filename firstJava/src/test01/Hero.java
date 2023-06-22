package test01;

public class Hero extends Person{

    public Hero(String name) {
        this.setName(name);
    }

    public void attack(Hero hero) {
        System.out.println(hero.getName()+"과 " + this.getName()+"이 싸움을 했다.");
    }
}
