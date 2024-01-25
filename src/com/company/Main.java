package com.company;

public class Main {

    public static void main(String[] args) throws VersionException, CommentException, ArticleException {
        Version ver = new Version("Sasha", "Popik");
        Article arc = new Article("Sasha", "Popik", "Pukikaki","Pipi pupu pu puuuuu pipi pupu pupu puuuu");
        Comment[] commArr = {
                new Comment("Puki", "Puki", "Super puper"),
                new Comment("Puki", "Puki", "Super duper"),
                new Comment("Puki", "Puki", "Super tuper"),
                new Comment("Puki", "Puki", "Super iuper")};
        arc.setComArr(commArr);

        System.out.print(ver.getCreatedBy() + "\t");
        System.out.println(ver.getModifiedBy());

        System.out.println(arc.getTitle());
        System.out.println(arc.getContent());

        StringBuffer strBuff = new StringBuffer();
        for(int i = 0; i < arc.getComArr().length; i++){
            //System.out.println((i+1)+"." + " "+ commArr[i].getCreatedBy() +" " + " " + commArr[i].getModifiedBy() + " " + commArr[i].getComm());
            System.out.println(strBuff.append(i+1 + ". ").append(commArr[i].getCreatedBy() + " ").append(commArr[i].getModifiedBy() + " ").append(commArr[i].getComm()));
            strBuff.delete(0, strBuff.length());
        }
    }
}
