class Questions{
   private int id;
  private String question;
    private String opt1;
   private String opt2;
   private String opt3;
   private String opt4;
   private String answer;
   public  Questions(int id,String question,String opt1,String opt2,String opt3,String opt4,String answer){
       this.id=id;
       this.question=question;
       this.opt1=opt1;
       this.opt2=opt2;
       this.opt3=opt3;
       this.opt4=opt4;
       this.answer=answer;
   }

   public int getId(){
       return id;
   }
   public  void setId(int id){
       this.id=id;
   }
   public String getQuestion(){
       return question;
   }
   public  void setQuestion(String question){
       this.question=question;
   }
    public String getOpt1(){
        return opt1;
    }
    public  void setOpt1(String opt1){
        this.opt1=opt1;
    }
    public String getOpt2(){
        return opt2;
    }
    public  void setOpt2(String opt2){
        this.opt2=opt2;
    }
    public String getOpt3(){
        return opt3;
    }
    public  void setOpt3(String opt3){
        this.opt3=opt3;
    }
    public String getOpt4(){
        return opt4;
    }
    public  void setOpt4(String opt4){
        this.opt4=opt4;
    }
    public String getAnswer(){
        return answer;
    }
    public  void setAnswer(String answer){
        this.answer=answer;
    }
    @Override
    public String toString(){
       return "Question [id+"+id+"question="+question+" ,opt1: "+opt1+" ,opt2: "+opt2+" ,opt3: "+opt3+" ,opt4: "+opt4+" answer "+answer+" ]";
    }
}
class QuestionService{
    Questions[] questions=new Questions[5];
    public QuestionService(){
        questions[0] = new Questions(1, "Size of int in Java?",
                "2 bytes", "6 bytes", "8 bytes", "4 bytes", "4 bytes");

        questions[1] = new Questions(2, "Which keyword is used to inherit a class in Java?",
                "this", "super", "extends", "implements", "extends");

        questions[2] = new Questions(3, "Which method is the entry point of a Java program?",
                "start()", "run()", "main()", "init()", "main()");

        questions[3] = new Questions(4, "Which of these is not a primitive data type in Java?",
                "int", "float", "String", "boolean", "String");

        questions[4] = new Questions(5, "Which OOP concept allows method overriding?",
                "Encapsulation", "Abstraction", "Polymorphism", "Inheritance", "Polymorphism");
    }
    public  void playQuiz(){
        for(Questions q:questions){
            System.out.println("Question No. "+q.getId());
        }

    }


}
public class QuizProject {
    public static void main(String[] args){
 QuestionService service=new QuestionService();
 service.playQuiz();

    }
}
