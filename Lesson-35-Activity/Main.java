class Main {
  public static void main(String[] args)throws Exception {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init()throws Exception{

    CreateList list=new CreateList("CR101.csv");
    Student[] students = list.getStudentArray();

    // add your code below here
 \\Challenge 1   
    let passing = 0;
    let failing = 0;

    for(let i = 0; i < student.length; i++){
      if(students[i].isPassing()){
        passing++;
      } else{
        failing++;
      }
    }
\\Challenge 2
    let failCount = 0;



    for (let i = 0; i < students.length; i++){
      if(students[i].isPassing()){
        failCount++;
      }
    }
    
    let percentFailing = (failCOunt / students.length) * 100;
  
  }

\\Challenge 3
  let count = 0;

\\Challenge 5
  for(let i = 0; i < students.length; i++){
    if (students[i].isPassing() && students.[i].getTeacher() == "castro r"){
      count ++;
    }
  }
    let count = 0;


\\challenge 4
  for(let i = 0; i < students.length; i++){
    if {
      students[i].isPassing() && students[i].getCourse().startWith("UL")
    }
    count ++;

    let count = 0;



  for(let i = 0; i < students.length; i++){
    let grade = students.[i].getGradeLevel();
    let gpa = students[i].getGPA();

    if (grade == "freshman" || grade == "sophomore") && gpa > 90) {
      count++;
    }




  
  int randInt(int lower, int upper){
    int range = upper - lower;
    return (int)(Math.random()*range+lower);
  }

}