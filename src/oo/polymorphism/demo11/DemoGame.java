package oo.polymorphism.demo11;

public class DemoGame {
    public static void main(String[] args) {
        Hero hero=new Hero();
        hero.setName("艾希");

//        hero.setSkill(new SkillImpl());//使用单独定义的实现类
        //也可以改成使用匿名内部类
//        Skill skill=new Skill() {
//            @Override
//            public void use() {
//                System.out.println("biu biu");
//            }
//        };
//        hero.setSkill(skill);
        //同时使用匿名对象和匿名类
        hero.setSkill(new Skill() {
            @Override
            public void use() {
                System.out.println("biu biu");
            }
        });
        hero.attack();
    }
}
